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
    "orderTarget",
    "orderProtocol"
})
@XmlRootElement(name = "OrderMethod")
public class OrderMethod {

    @XmlElement(name = "OrderTarget", required = true)
    protected OrderTarget orderTarget;
    @XmlElement(name = "OrderProtocol")
    protected String orderProtocol;

    /**
     * Gets the value of the orderTarget property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTarget }
     *     
     */
    public OrderTarget getOrderTarget() {
        return orderTarget;
    }

    /**
     * Sets the value of the orderTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTarget }
     *     
     */
    public void setOrderTarget(OrderTarget value) {
        this.orderTarget = value;
    }

    /**
     * Gets the value of the orderProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderProtocol() {
        return orderProtocol;
    }

    /**
     * Sets the value of the orderProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderProtocol(String value) {
        this.orderProtocol = value;
    }

}
