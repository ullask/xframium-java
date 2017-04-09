/*******************************************************************************
 * xFramium
 *
 * Copyright 2017 by Moreland Labs LTD (http://www.morelandlabs.com)
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
package org.xframium.examples.java.page.spi;

import org.xframium.examples.java.page.WebHomePage;
import org.xframium.page.AbstractPage;

public class WebHomePageImpl extends AbstractPage implements WebHomePage
{

    public void initializePage()
    {
        // TODO Auto-generated method stub

    }
    
    public void testKeyword()
    {
        try
        {
            executeStep( "COMPARE2", "page", "element", new String[ 0 ] );
            
        }
        catch( Exception e )
        {
            
        }
        
        
        
    }

}
