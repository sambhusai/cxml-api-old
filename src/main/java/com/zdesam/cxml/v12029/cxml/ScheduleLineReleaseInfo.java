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
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unitOfMeasure"
})
@XmlRootElement(name = "ScheduleLineReleaseInfo")
public class ScheduleLineReleaseInfo {

    @XmlAttribute(name = "commitmentCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String commitmentCode;
    @XmlAttribute(name = "cumulativeScheduledQuantity", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cumulativeScheduledQuantity;
    @XmlElement(name = "UnitOfMeasure", required = true)
    protected String unitOfMeasure;

    /**
     * Gets the value of the commitmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitmentCode() {
        return commitmentCode;
    }

    /**
     * Sets the value of the commitmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitmentCode(String value) {
        this.commitmentCode = value;
    }

    /**
     * Gets the value of the cumulativeScheduledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCumulativeScheduledQuantity() {
        return cumulativeScheduledQuantity;
    }

    /**
     * Sets the value of the cumulativeScheduledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCumulativeScheduledQuantity(String value) {
        this.cumulativeScheduledQuantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasure(String value) {
        this.unitOfMeasure = value;
    }

}
