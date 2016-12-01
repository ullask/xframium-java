/*******************************************************************************
 * xFramium
 *
 * Copyright 2016 by Moreland Labs, Ltd. (http://www.morelandlabs.com)
 *
 * Some open source application is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or (at your option) any later version.
 *  
 * Some open source application is distributed in the hope that it will 
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with xFramium.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @license GPL-3.0+ <http://spdx.org/licenses/GPL-3.0+>
 *******************************************************************************/
package org.xframium.page.keyWord.step.spi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.xframium.container.SuiteContainer;
import org.xframium.page.BY;
import org.xframium.page.Page;
import org.xframium.page.data.PageData;
import org.xframium.page.element.Element;
import org.xframium.page.keyWord.step.AbstractKeyWordStep;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class KWSValue.
 */
public class KWSMouse extends AbstractKeyWordStep
{
    public KWSMouse()
    {
        kwName = "Mouse Action";
        kwDescription = "Allows the script to move the pointer to a specific locations and press/release it";
        kwHelp = "https://www.xframium.org/keyword.html#kw-mouse";
    }
    
	/* (non-Javadoc)
	 * @see com.perfectoMobile.page.keyWord.step.AbstractKeyWordStep#_executeStep(com.perfectoMobile.page.Page, org.openqa.selenium.WebDriver, java.util.Map, java.util.Map)
	 */
	@Override
	public boolean _executeStep( Page pageObject, WebDriver webDriver, Map<String, Object> contextMap, Map<String, PageData> dataMap, Map<String, Page> pageMap, SuiteContainer sC )
	{
	    String mouseAction = getParameterValue( getParameterList().get( 0 ), contextMap, dataMap ) + "";
	    
	    switch( mouseAction.toUpperCase() )
	    {
	        case "MOVE_TO":
	            return getElement( pageObject, contextMap, webDriver, dataMap ).moveTo();

			case "MOVE_TO_MAC":
				return moveToElementWithJS(webDriver, getElement( pageObject, contextMap, webDriver, dataMap ));
	            
	        case "PRESS":
                return getElement( pageObject, contextMap, webDriver, dataMap ).press();
                
	        case "CLICK_AT":
	            return getElement( pageObject, contextMap, webDriver, dataMap ).clickAt( Integer.parseInt( getParameterValue( getParameterList().get( 1 ), contextMap, dataMap ) + "" ), Integer.parseInt( getParameterValue( getParameterList().get( 2 ), contextMap, dataMap ) + "" ) );
                        
	        case "RELEASE":
                return getElement( pageObject, contextMap, webDriver, dataMap ).release();
	            
	    }
		
		return true;
	}

	// Safari desktop browser does not support the moveTo API so must use JS equivalent
	private boolean moveToElementWithJS(WebDriver driver, Element locator) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String elem = "var elem = document;";
			if (locator.getBy() == BY.ID) {
                elem = "var elem = document.getElementById(\""+locator.getKey()+"\");";
            }
            else if (locator.getBy() == BY.XPATH) {
                String snippet = "document.getElementByXPath = function(sValue) { var a = this.evaluate(sValue, this, null, XPathResult.ORDERED_NODE_SNAPSHOT_TYPE, null); if (a.snapshotLength > 0) { return a.snapshotItem(0); } }; ";
                js.executeScript(snippet);
                elem = "var elem = document.getElementByXPath(\"" + locator.getKey() + "\");";
            }
            else if (locator.getBy() == BY.CLASS) {
                elem = "var elem = document.getElementsByClassName(\""+locator.getKey()+"\")[0];";
            }
			String mouseOverScript = elem + " if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false);" +
                " elem.dispatchEvent(evObj);} else if(document.createEventObject) { elem.fireEvent('onmouseover');}";
			js.executeScript(mouseOverScript);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
