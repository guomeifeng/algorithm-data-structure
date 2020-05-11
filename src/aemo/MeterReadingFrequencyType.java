//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifies a Delivery Point Reading Frequency as Daily or Non Daily
 * 
 * &lt;p&gt;Java class for MeterReadingFrequencyType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MeterReadingFrequencyType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MeterReadingFrequencyTypeCode" type="{urn:aseXML:r38}MeterReadingFrequencyTypeBase"/&amp;gt;
 *         &amp;lt;element name="Description" type="{urn:aseXML:r38}Description" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeterReadingFrequencyType", propOrder = {
    "meterReadingFrequencyTypeCode",
    "description"
})
public class MeterReadingFrequencyType {

    @XmlElement(name = "MeterReadingFrequencyTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected MeterReadingFrequencyTypeBase meterReadingFrequencyTypeCode;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the meterReadingFrequencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingFrequencyTypeBase }
     *     
     */
    public MeterReadingFrequencyTypeBase getMeterReadingFrequencyTypeCode() {
        return meterReadingFrequencyTypeCode;
    }

    /**
     * Sets the value of the meterReadingFrequencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingFrequencyTypeBase }
     *     
     */
    public void setMeterReadingFrequencyTypeCode(MeterReadingFrequencyTypeBase value) {
        this.meterReadingFrequencyTypeCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
