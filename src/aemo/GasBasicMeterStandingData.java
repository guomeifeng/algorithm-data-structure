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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Schema - Gas
 * 
 * &lt;p&gt;Java class for GasBasicMeterStandingData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasBasicMeterStandingData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NextScheduledReadDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ScheduledReadingDayNumber" type="{urn:aseXML:r38}MeterReadingDayNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterReadFrequency" type="{urn:aseXML:r38}GasMeterReadFrequency" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NextScheduledSpecialRead" type="{urn:aseXML:r38}AppointmentDetail" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasBasicMeterStandingData", propOrder = {
    "nextScheduledReadDate",
    "scheduledReadingDayNumber",
    "meterReadFrequency",
    "nextScheduledSpecialRead"
})
public class GasBasicMeterStandingData {

    @XmlElement(name = "NextScheduledReadDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextScheduledReadDate;
    @XmlElement(name = "ScheduledReadingDayNumber")
    protected String scheduledReadingDayNumber;
    @XmlElement(name = "MeterReadFrequency")
    @XmlSchemaType(name = "string")
    protected GasMeterReadFrequency meterReadFrequency;
    @XmlElement(name = "NextScheduledSpecialRead")
    protected AppointmentDetail nextScheduledSpecialRead;

    /**
     * Gets the value of the nextScheduledReadDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextScheduledReadDate() {
        return nextScheduledReadDate;
    }

    /**
     * Sets the value of the nextScheduledReadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextScheduledReadDate(XMLGregorianCalendar value) {
        this.nextScheduledReadDate = value;
    }

    /**
     * Gets the value of the scheduledReadingDayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduledReadingDayNumber() {
        return scheduledReadingDayNumber;
    }

    /**
     * Sets the value of the scheduledReadingDayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledReadingDayNumber(String value) {
        this.scheduledReadingDayNumber = value;
    }

    /**
     * Gets the value of the meterReadFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterReadFrequency }
     *     
     */
    public GasMeterReadFrequency getMeterReadFrequency() {
        return meterReadFrequency;
    }

    /**
     * Sets the value of the meterReadFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterReadFrequency }
     *     
     */
    public void setMeterReadFrequency(GasMeterReadFrequency value) {
        this.meterReadFrequency = value;
    }

    /**
     * Gets the value of the nextScheduledSpecialRead property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentDetail }
     *     
     */
    public AppointmentDetail getNextScheduledSpecialRead() {
        return nextScheduledSpecialRead;
    }

    /**
     * Sets the value of the nextScheduledSpecialRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentDetail }
     *     
     */
    public void setNextScheduledSpecialRead(AppointmentDetail value) {
        this.nextScheduledSpecialRead = value;
    }

}
