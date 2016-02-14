//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.v12029.cxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalogName",
    "description",
    "attachment",
    "commodities",
    "autoPublish",
    "notification"
})
@XmlRootElement(name = "CatalogUploadRequest")
public class CatalogUploadRequest {

    @XmlAttribute(name = "operation", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operation;
    @XmlElement(name = "CatalogName", required = true)
    protected CatalogName catalogName;
    @XmlElement(name = "Description", required = true)
    protected Description description;
    @XmlElement(name = "Attachment", required = true)
    protected Attachment attachment;
    @XmlElement(name = "Commodities")
    protected Commodities commodities;
    @XmlElement(name = "AutoPublish")
    protected AutoPublish autoPublish;
    @XmlElement(name = "Notification", required = true)
    protected Notification notification;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogName }
     *     
     */
    public CatalogName getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogName }
     *     
     */
    public void setCatalogName(CatalogName value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the commodities property.
     * 
     * @return
     *     possible object is
     *     {@link Commodities }
     *     
     */
    public Commodities getCommodities() {
        return commodities;
    }

    /**
     * Sets the value of the commodities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commodities }
     *     
     */
    public void setCommodities(Commodities value) {
        this.commodities = value;
    }

    /**
     * Gets the value of the autoPublish property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPublish }
     *     
     */
    public AutoPublish getAutoPublish() {
        return autoPublish;
    }

    /**
     * Sets the value of the autoPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPublish }
     *     
     */
    public void setAutoPublish(AutoPublish value) {
        this.autoPublish = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link Notification }
     *     
     */
    public Notification getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notification }
     *     
     */
    public void setNotification(Notification value) {
        this.notification = value;
    }

}
