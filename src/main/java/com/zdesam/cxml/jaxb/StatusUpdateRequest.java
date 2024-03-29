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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentReference",
    "status",
    "paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus",
    "extrinsic"
})
@XmlRootElement(name = "StatusUpdateRequest")
public class StatusUpdateRequest {

    @XmlElement(name = "DocumentReference")
    protected DocumentReference documentReference;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElements({
        @XmlElement(name = "PaymentStatus", type = PaymentStatus.class),
        @XmlElement(name = "SourcingStatus", type = SourcingStatus.class),
        @XmlElement(name = "InvoiceStatus", type = InvoiceStatus.class),
        @XmlElement(name = "DocumentStatus", type = DocumentStatus.class)
    })
    protected List<Object> paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus;
    @XmlElement(name = "Extrinsic")
    protected List<Extrinsic> extrinsic;

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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentStatus }
     * {@link SourcingStatus }
     * {@link InvoiceStatus }
     * {@link DocumentStatus }
     * 
     * 
     */
    public List<Object> getPaymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus() {
        if (paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus == null) {
            paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus = new ArrayList<Object>();
        }
        return this.paymentStatusOrSourcingStatusOrInvoiceStatusOrDocumentStatus;
    }

    /**
     * Gets the value of the extrinsic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extrinsic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtrinsic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extrinsic }
     * 
     * 
     */
    public List<Extrinsic> getExtrinsic() {
        if (extrinsic == null) {
            extrinsic = new ArrayList<Extrinsic>();
        }
        return this.extrinsic;
    }

}
