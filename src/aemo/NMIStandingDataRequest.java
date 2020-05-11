//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Application - NMI Data Access
 * TransactionExchange - NMI Standing Data
 * TransactionGroup - NMID
 * Priority - High
 * Purpose - Request the current standing data for a particular NMI
 * Detail - The checksum should be provided with the NMI.
 * 
 * 
 * &lt;p&gt;Java class for NMIStandingDataRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="NMIStandingDataRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMIWithChecksum"/&amp;gt;
 *         &amp;lt;element name="Type" type="{urn:aseXML:r38}NMIStandingDataRequestType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{urn:aseXML:r38}NMIStandingDataRequestReason" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r31" default="r31" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMIStandingDataRequest", propOrder = {
    "nmi",
    "type",
    "reason"
})
public class NMIStandingDataRequest {

    @XmlElement(name = "NMI", required = true)
    protected NMIWithChecksum nmi;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlAttribute(name = "version")
    protected R31 version;

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMIWithChecksum }
     *     
     */
    public NMIWithChecksum getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIWithChecksum }
     *     
     */
    public void setNMI(NMIWithChecksum value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R31 }
     *     
     */
    public R31 getVersion() {
        if (version == null) {
            return R31 .R_31;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R31 }
     *     
     */
    public void setVersion(R31 value) {
        this.version = value;
    }

}
