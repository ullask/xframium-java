//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.31 at 05:27:32 PM IST 
//


package org.xframium.driver.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xFramiumRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xFramiumRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cloud" type="{http://www.xframium.org/xFramiumDriver}xCloud"/>
 *         &lt;element name="application" type="{http://www.xframium.org/xFramiumDriver}xApplication"/>
 *         &lt;element name="devices" type="{http://www.xframium.org/xFramiumDriver}xDevices"/>
 *         &lt;element name="driver" type="{http://www.xframium.org/xFramiumDriver}xDriver"/>
 *         &lt;element name="model" type="{http://www.xframium.org/xFramiumDriver}xModel"/>
 *         &lt;element name="suite" type="{http://www.xframium.org/xFramiumDriver}xSuite"/>
 *         &lt;element name="content" type="{http://www.xframium.org/xFramiumDriver}xContent" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.xframium.org/xFramiumDriver}xData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xFramiumRoot", propOrder = {
    "cloud",
    "application",
    "devices",
    "driver",
    "model",
    "suite",
    "content",
    "data"
})
public class XFramiumRoot {

    @XmlElement(required = true)
    protected XCloud cloud;
    @XmlElement(required = true)
    protected XApplication application;
    @XmlElement(required = true)
    protected XDevices devices;
    @XmlElement(required = true)
    protected XDriver driver;
    @XmlElement(required = true)
    protected XModel model;
    @XmlElement(required = true)
    protected XSuite suite;
    protected XContent content;
    protected XData data;

    /**
     * Gets the value of the cloud property.
     * 
     * @return
     *     possible object is
     *     {@link XCloud }
     *     
     */
    public XCloud getCloud() {
        return cloud;
    }

    /**
     * Sets the value of the cloud property.
     * 
     * @param value
     *     allowed object is
     *     {@link XCloud }
     *     
     */
    public void setCloud(XCloud value) {
        this.cloud = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link XApplication }
     *     
     */
    public XApplication getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link XApplication }
     *     
     */
    public void setApplication(XApplication value) {
        this.application = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link XDevices }
     *     
     */
    public XDevices getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDevices }
     *     
     */
    public void setDevices(XDevices value) {
        this.devices = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link XDriver }
     *     
     */
    public XDriver getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDriver }
     *     
     */
    public void setDriver(XDriver value) {
        this.driver = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link XModel }
     *     
     */
    public XModel getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link XModel }
     *     
     */
    public void setModel(XModel value) {
        this.model = value;
    }

    /**
     * Gets the value of the suite property.
     * 
     * @return
     *     possible object is
     *     {@link XSuite }
     *     
     */
    public XSuite getSuite() {
        return suite;
    }

    /**
     * Sets the value of the suite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSuite }
     *     
     */
    public void setSuite(XSuite value) {
        this.suite = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link XContent }
     *     
     */
    public XContent getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link XContent }
     *     
     */
    public void setContent(XContent value) {
        this.content = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link XData }
     *     
     */
    public XData getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link XData }
     *     
     */
    public void setData(XData value) {
        this.data = value;
    }

}
