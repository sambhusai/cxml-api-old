//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dsSignature"
})
@XmlRootElement(name = "xades:CounterSignature")
public class XadesCounterSignature {

    @XmlElement(name = "ds:Signature", required = true)
    protected DsSignature dsSignature;

    /**
     * Gets the value of the dsSignature property.
     * 
     * @return
     *     possible object is
     *     {@link DsSignature }
     *     
     */
    public DsSignature getDsSignature() {
        return dsSignature;
    }

    /**
     * Sets the value of the dsSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link DsSignature }
     *     
     */
    public void setDsSignature(DsSignature value) {
        this.dsSignature = value;
    }

}
