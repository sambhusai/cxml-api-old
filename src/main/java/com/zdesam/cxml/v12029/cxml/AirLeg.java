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
    "vendor",
    "airLegOrigin",
    "airLegDestination",
    "bookingClassCode",
    "rate",
    "meal"
})
@XmlRootElement(name = "AirLeg")
public class AirLeg {

    @XmlAttribute(name = "travelSegment", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String travelSegment;
    @XmlAttribute(name = "departureTime", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String departureTime;
    @XmlAttribute(name = "arrivalTime", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String arrivalTime;
    @XmlAttribute(name = "flightNumber", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String flightNumber;
    @XmlAttribute(name = "seatNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String seatNumber;
    @XmlAttribute(name = "seatType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String seatType;
    @XmlAttribute(name = "upgrade")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String upgrade;
    @XmlAttribute(name = "stops")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stops;
    @XmlAttribute(name = "equipment")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String equipment;
    @XmlElement(name = "Vendor", required = true)
    protected Vendor vendor;
    @XmlElement(name = "AirLegOrigin", required = true)
    protected AirLegOrigin airLegOrigin;
    @XmlElement(name = "AirLegDestination", required = true)
    protected AirLegDestination airLegDestination;
    @XmlElement(name = "BookingClassCode")
    protected BookingClassCode bookingClassCode;
    @XmlElement(name = "Rate")
    protected Rate rate;
    @XmlElement(name = "Meal")
    protected List<Meal> meal;

    /**
     * Gets the value of the travelSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelSegment() {
        return travelSegment;
    }

    /**
     * Sets the value of the travelSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelSegment(String value) {
        this.travelSegment = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the seatNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * Sets the value of the seatNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * Gets the value of the seatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatType() {
        return seatType;
    }

    /**
     * Sets the value of the seatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatType(String value) {
        this.seatType = value;
    }

    /**
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgrade(String value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the stops property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStops() {
        return stops;
    }

    /**
     * Sets the value of the stops property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStops(String value) {
        this.stops = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the airLegOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegOrigin }
     *     
     */
    public AirLegOrigin getAirLegOrigin() {
        return airLegOrigin;
    }

    /**
     * Sets the value of the airLegOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegOrigin }
     *     
     */
    public void setAirLegOrigin(AirLegOrigin value) {
        this.airLegOrigin = value;
    }

    /**
     * Gets the value of the airLegDestination property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegDestination }
     *     
     */
    public AirLegDestination getAirLegDestination() {
        return airLegDestination;
    }

    /**
     * Sets the value of the airLegDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegDestination }
     *     
     */
    public void setAirLegDestination(AirLegDestination value) {
        this.airLegDestination = value;
    }

    /**
     * Gets the value of the bookingClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link BookingClassCode }
     *     
     */
    public BookingClassCode getBookingClassCode() {
        return bookingClassCode;
    }

    /**
     * Sets the value of the bookingClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingClassCode }
     *     
     */
    public void setBookingClassCode(BookingClassCode value) {
        this.bookingClassCode = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate }
     *     
     */
    public Rate getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate }
     *     
     */
    public void setRate(Rate value) {
        this.rate = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meal }
     * 
     * 
     */
    public List<Meal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<Meal>();
        }
        return this.meal;
    }

}
