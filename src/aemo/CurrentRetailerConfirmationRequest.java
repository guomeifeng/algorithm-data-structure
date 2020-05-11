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
 * Schema - MeterDataManagement
 * 
 * &lt;p&gt;Java class for CurrentRetailerConfirmationRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CurrentRetailerConfirmationRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CSVCurrentRetailerData" type="{urn:aseXML:r38}CSVRequestFormat"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r9" default="r9" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentRetailerConfirmationRequest", propOrder = {
    "csvCurrentRetailerData"
})
public class CurrentRetailerConfirmationRequest {

    @XmlElement(name = "CSVCurrentRetailerData", required = true)
    protected CSVRequestFormat csvCurrentRetailerData;
    @XmlAttribute(name = "version")
    protected R9 version;

    /**
     * Gets the value of the csvCurrentRetailerData property.
     * 
     * @return
     *     possible object is
     *     {@link CSVRequestFormat }
     *     
     */
    public CSVRequestFormat getCSVCurrentRetailerData() {
        return csvCurrentRetailerData;
    }

    /**
     * Sets the value of the csvCurrentRetailerData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRequestFormat }
     *     
     */
    public void setCSVCurrentRetailerData(CSVRequestFormat value) {
        this.csvCurrentRetailerData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R9 }
     *     
     */
    public R9 getVersion() {
        if (version == null) {
            return R9 .R_9;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R9 }
     *     
     */
    public void setVersion(R9 value) {
        this.version = value;
    }

}
