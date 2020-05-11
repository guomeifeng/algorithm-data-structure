//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Application - NMI Data Access
 * TransactionExchange - NMI Discovery
 * TransactionGroup - NMID
 * Priority - High
 * Purpose - Provide the results of a search of the NMI Standing Data
 * Detail - Usage of the NMIStandingData type allows the transaction to carry variable content according to fuel and jurisdictional requirements. At least one Event element must be present in the response to indicate the success or otherwise of the search.
 * 
 * &lt;p&gt;Java class for NMIDiscoveryResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NMIDiscoveryResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r17" default="r17" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMIDiscoveryResponse", propOrder = {
    "nmiStandingData",
    "event"
})
public class NMIDiscoveryResponse {

    @XmlElement(name = "NMIStandingData")
    protected List<NMIStandingData> nmiStandingData;
    @XmlElement(name = "Event", required = true)
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R17 version;

    /**
     * Gets the value of the nmiStandingData property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the nmiStandingData property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNMIStandingData().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link NMIStandingData }
     * 
     * 
     */
    public List<NMIStandingData> getNMIStandingData() {
        if (nmiStandingData == null) {
            nmiStandingData = new ArrayList<NMIStandingData>();
        }
        return this.nmiStandingData;
    }

    /**
     * Gets the value of the event property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the event property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEvent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R17 }
     *     
     */
    public R17 getVersion() {
        if (version == null) {
            return R17 .R_17;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R17 }
     *     
     */
    public void setVersion(R17 value) {
        this.version = value;
    }

}
