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
    "documentReference"
})
@XmlRootElement(name = "OrderStatusRequestReference")
public class OrderStatusRequestReference {

    @XmlAttribute(name = "orderStatusRequestID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestID;
    @XmlAttribute(name = "orderStatusRequestDate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String orderStatusRequestDate;
    @XmlElement(name = "DocumentReference", required = true)
    protected DocumentReference documentReference;

    /**
     * Gets the value of the orderStatusRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestID() {
        return orderStatusRequestID;
    }

    /**
     * Sets the value of the orderStatusRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestID(String value) {
        this.orderStatusRequestID = value;
    }

    /**
     * Gets the value of the orderStatusRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusRequestDate() {
        return orderStatusRequestDate;
    }

    /**
     * Sets the value of the orderStatusRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusRequestDate(String value) {
        this.orderStatusRequestDate = value;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReference }
     *     
     */
    public DocumentReference getDocumentReference() {
        return documentReference;
    }

    /**
     * Sets the value of the documentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReference }
     *     
     */
    public void setDocumentReference(DocumentReference value) {
        this.documentReference = value;
    }

}
