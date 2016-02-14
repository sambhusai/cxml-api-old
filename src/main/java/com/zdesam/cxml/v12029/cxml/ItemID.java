//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.14 at 12:38:52 AM EST 
//


package com.zdesam.cxml.v12029.cxml;

import java.util.ArrayList;
import java.util.List;
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
    "supplierPartID",
    "supplierPartAuxiliaryID",
    "buyerPartID",
    "idReference"
})
@XmlRootElement(name = "ItemID")
public class ItemID {

    @XmlElement(name = "SupplierPartID", required = true)
    protected SupplierPartID supplierPartID;
    @XmlElement(name = "SupplierPartAuxiliaryID")
    protected SupplierPartAuxiliaryID supplierPartAuxiliaryID;
    @XmlElement(name = "BuyerPartID")
    protected String buyerPartID;
    @XmlElement(name = "IdReference")
    protected List<IdReference> idReference;

    /**
     * Gets the value of the supplierPartID property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartID }
     *     
     */
    public SupplierPartID getSupplierPartID() {
        return supplierPartID;
    }

    /**
     * Sets the value of the supplierPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartID }
     *     
     */
    public void setSupplierPartID(SupplierPartID value) {
        this.supplierPartID = value;
    }

    /**
     * Gets the value of the supplierPartAuxiliaryID property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartAuxiliaryID }
     *     
     */
    public SupplierPartAuxiliaryID getSupplierPartAuxiliaryID() {
        return supplierPartAuxiliaryID;
    }

    /**
     * Sets the value of the supplierPartAuxiliaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartAuxiliaryID }
     *     
     */
    public void setSupplierPartAuxiliaryID(SupplierPartAuxiliaryID value) {
        this.supplierPartAuxiliaryID = value;
    }

    /**
     * Gets the value of the buyerPartID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPartID() {
        return buyerPartID;
    }

    /**
     * Sets the value of the buyerPartID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPartID(String value) {
        this.buyerPartID = value;
    }

    /**
     * Gets the value of the idReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdReference }
     * 
     * 
     */
    public List<IdReference> getIdReference() {
        if (idReference == null) {
            idReference = new ArrayList<IdReference>();
        }
        return this.idReference;
    }

}
