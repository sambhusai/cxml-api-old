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
    "email",
    "urlPost"
})
@XmlRootElement(name = "Notification")
public class Notification {

    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "URLPost")
    protected URLPost urlPost;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the urlPost property.
     * 
     * @return
     *     possible object is
     *     {@link URLPost }
     *     
     */
    public URLPost getURLPost() {
        return urlPost;
    }

    /**
     * Sets the value of the urlPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link URLPost }
     *     
     */
    public void setURLPost(URLPost value) {
        this.urlPost = value;
    }

}
