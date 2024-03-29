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
    "dsPGPKeyIDOrDsPGPKeyPacket"
})
@XmlRootElement(name = "ds:PGPData")
public class DsPGPData {

    @XmlElements({
        @XmlElement(name = "ds:PGPKeyID", required = true, type = DsPGPKeyID.class),
        @XmlElement(name = "ds:PGPKeyPacket", required = true, type = DsPGPKeyPacket.class)
    })
    protected List<Object> dsPGPKeyIDOrDsPGPKeyPacket;

    /**
     * Gets the value of the dsPGPKeyIDOrDsPGPKeyPacket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsPGPKeyIDOrDsPGPKeyPacket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsPGPKeyIDOrDsPGPKeyPacket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DsPGPKeyID }
     * {@link DsPGPKeyPacket }
     * 
     * 
     */
    public List<Object> getDsPGPKeyIDOrDsPGPKeyPacket() {
        if (dsPGPKeyIDOrDsPGPKeyPacket == null) {
            dsPGPKeyIDOrDsPGPKeyPacket = new ArrayList<Object>();
        }
        return this.dsPGPKeyIDOrDsPGPKeyPacket;
    }

}
