//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "originalPrice",
    "additionalDeductionOrAdditionalCost",
    "tax",
    "modificationDetail"
})
@XmlRootElement(name = "Modification")
public class Modification {

    @XmlAttribute(name = "level")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String level;
    @XmlElement(name = "OriginalPrice")
    protected OriginalPrice originalPrice;
    @XmlElements({
        @XmlElement(name = "AdditionalDeduction", required = true, type = AdditionalDeduction.class),
        @XmlElement(name = "AdditionalCost", required = true, type = AdditionalCost.class)
    })
    protected List<Object> additionalDeductionOrAdditionalCost;
    @XmlElement(name = "Tax")
    protected Tax tax;
    @XmlElement(name = "ModificationDetail")
    protected ModificationDetail modificationDetail;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the originalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalPrice }
     *     
     */
    public OriginalPrice getOriginalPrice() {
        return originalPrice;
    }

    /**
     * Sets the value of the originalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalPrice }
     *     
     */
    public void setOriginalPrice(OriginalPrice value) {
        this.originalPrice = value;
    }

    /**
     * Gets the value of the additionalDeductionOrAdditionalCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDeductionOrAdditionalCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDeductionOrAdditionalCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalDeduction }
     * {@link AdditionalCost }
     * 
     * 
     */
    public List<Object> getAdditionalDeductionOrAdditionalCost() {
        if (additionalDeductionOrAdditionalCost == null) {
            additionalDeductionOrAdditionalCost = new ArrayList<Object>();
        }
        return this.additionalDeductionOrAdditionalCost;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link Tax }
     *     
     */
    public Tax getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax }
     *     
     */
    public void setTax(Tax value) {
        this.tax = value;
    }

    /**
     * Gets the value of the modificationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationDetail }
     *     
     */
    public ModificationDetail getModificationDetail() {
        return modificationDetail;
    }

    /**
     * Sets the value of the modificationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationDetail }
     *     
     */
    public void setModificationDetail(ModificationDetail value) {
        this.modificationDetail = value;
    }

}
