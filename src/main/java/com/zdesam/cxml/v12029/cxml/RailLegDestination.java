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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airportOrAddress"
})
@XmlRootElement(name = "RailLegDestination")
public class RailLegDestination {

    @XmlElements({
        @XmlElement(name = "Airport", required = true, type = Airport.class),
        @XmlElement(name = "Address", required = true, type = Address.class)
    })
    protected List<Object> airportOrAddress;

    /**
     * Gets the value of the airportOrAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportOrAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportOrAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Airport }
     * {@link Address }
     * 
     * 
     */
    public List<Object> getAirportOrAddress() {
        if (airportOrAddress == null) {
            airportOrAddress = new ArrayList<Object>();
        }
        return this.airportOrAddress;
    }

}
