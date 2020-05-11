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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Data provided via a change request
 * 			
 * 
 * &lt;p&gt;Java class for CATSChangeRequestData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSChangeRequestData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ChangeReasonCode" type="{urn:aseXML:r38}CATSChangeReasonCode"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="ProposedDate" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *           &amp;lt;element name="ActualChangeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;element name="MeterReadTypeCode" type="{urn:aseXML:r38}CATSReadTypeCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InitiatingRequestID" type="{urn:aseXML:r38}CATSRequestIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMIStandingData" type="{urn:aseXML:r38}NMIStandingData"/&amp;gt;
 *         &amp;lt;element name="AccessContract" type="{urn:aseXML:r38}AccessContract" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSChangeRequestData", propOrder = {
    "changeReasonCode",
    "proposedDate",
    "actualChangeDate",
    "meterReadTypeCode",
    "actualEndDate",
    "initiatingRequestID",
    "nmiStandingData",
    "accessContract"
})
@XmlSeeAlso({
    CATSChangeRequest.class
})
public class CATSChangeRequestData {

    @XmlElement(name = "ChangeReasonCode", required = true)
    protected String changeReasonCode;
    @XmlElement(name = "ProposedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar proposedDate;
    @XmlElement(name = "ActualChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualChangeDate;
    @XmlElement(name = "MeterReadTypeCode")
    protected String meterReadTypeCode;
    @XmlElement(name = "ActualEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actualEndDate;
    @XmlElement(name = "InitiatingRequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected Long initiatingRequestID;
    @XmlElement(name = "NMIStandingData", required = true)
    protected NMIStandingData nmiStandingData;
    @XmlElement(name = "AccessContract")
    protected AccessContract accessContract;

    /**
     * Gets the value of the changeReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeReasonCode() {
        return changeReasonCode;
    }

    /**
     * Sets the value of the changeReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeReasonCode(String value) {
        this.changeReasonCode = value;
    }

    /**
     * Gets the value of the proposedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposedDate() {
        return proposedDate;
    }

    /**
     * Sets the value of the proposedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposedDate(XMLGregorianCalendar value) {
        this.proposedDate = value;
    }

    /**
     * Gets the value of the actualChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualChangeDate() {
        return actualChangeDate;
    }

    /**
     * Sets the value of the actualChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualChangeDate(XMLGregorianCalendar value) {
        this.actualChangeDate = value;
    }

    /**
     * Gets the value of the meterReadTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterReadTypeCode() {
        return meterReadTypeCode;
    }

    /**
     * Sets the value of the meterReadTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterReadTypeCode(String value) {
        this.meterReadTypeCode = value;
    }

    /**
     * Gets the value of the actualEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualEndDate() {
        return actualEndDate;
    }

    /**
     * Sets the value of the actualEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualEndDate(XMLGregorianCalendar value) {
        this.actualEndDate = value;
    }

    /**
     * Gets the value of the initiatingRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInitiatingRequestID() {
        return initiatingRequestID;
    }

    /**
     * Sets the value of the initiatingRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInitiatingRequestID(Long value) {
        this.initiatingRequestID = value;
    }

    /**
     * Gets the value of the nmiStandingData property.
     * 
     * @return
     *     possible object is
     *     {@link NMIStandingData }
     *     
     */
    public NMIStandingData getNMIStandingData() {
        return nmiStandingData;
    }

    /**
     * Sets the value of the nmiStandingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIStandingData }
     *     
     */
    public void setNMIStandingData(NMIStandingData value) {
        this.nmiStandingData = value;
    }

    /**
     * Gets the value of the accessContract property.
     * 
     * @return
     *     possible object is
     *     {@link AccessContract }
     *     
     */
    public AccessContract getAccessContract() {
        return accessContract;
    }

    /**
     * Sets the value of the accessContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessContract }
     *     
     */
    public void setAccessContract(AccessContract value) {
        this.accessContract = value;
    }

}
