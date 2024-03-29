//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xadesDescription",
    "xadesObjectIdentifier",
    "xadesMimeType",
    "xadesEncoding"
})
@XmlRootElement(name = "xades:DataObjectFormat")
public class XadesDataObjectFormat {

    @XmlAttribute(name = "ObjectReference", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String objectReference;
    @XmlElement(name = "xades:Description")
    protected String xadesDescription;
    @XmlElement(name = "xades:ObjectIdentifier")
    protected XadesObjectIdentifier xadesObjectIdentifier;
    @XmlElement(name = "xades:MimeType")
    protected String xadesMimeType;
    @XmlElement(name = "xades:Encoding")
    protected String xadesEncoding;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectReference(String value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the xadesDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesDescription() {
        return xadesDescription;
    }

    /**
     * Sets the value of the xadesDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesDescription(String value) {
        this.xadesDescription = value;
    }

    /**
     * Gets the value of the xadesObjectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link XadesObjectIdentifier }
     *     
     */
    public XadesObjectIdentifier getXadesObjectIdentifier() {
        return xadesObjectIdentifier;
    }

    /**
     * Sets the value of the xadesObjectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link XadesObjectIdentifier }
     *     
     */
    public void setXadesObjectIdentifier(XadesObjectIdentifier value) {
        this.xadesObjectIdentifier = value;
    }

    /**
     * Gets the value of the xadesMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesMimeType() {
        return xadesMimeType;
    }

    /**
     * Sets the value of the xadesMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesMimeType(String value) {
        this.xadesMimeType = value;
    }

    /**
     * Gets the value of the xadesEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXadesEncoding() {
        return xadesEncoding;
    }

    /**
     * Sets the value of the xadesEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXadesEncoding(String value) {
        this.xadesEncoding = value;
    }

}
