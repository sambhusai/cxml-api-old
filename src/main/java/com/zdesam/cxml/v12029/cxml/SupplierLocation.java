//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.v12029.cxml;

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
    "address",
    "orderMethods"
})
@XmlRootElement(name = "SupplierLocation")
public class SupplierLocation {

    @XmlElement(name = "Address", required = true)
    protected Address address;
    @XmlElement(name = "OrderMethods", required = true)
    protected OrderMethods orderMethods;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the orderMethods property.
     * 
     * @return
     *     possible object is
     *     {@link OrderMethods }
     *     
     */
    public OrderMethods getOrderMethods() {
        return orderMethods;
    }

    /**
     * Sets the value of the orderMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderMethods }
     *     
     */
    public void setOrderMethods(OrderMethods value) {
        this.orderMethods = value;
    }

}
