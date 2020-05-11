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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A Booking submitted by a TNSP
 * 
 * &lt;p&gt;Java class for BookingType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="BookingType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CompanyBookingId" type="{urn:aseXML:r38}CompanyBookingIdType"/&amp;gt;
 *         &amp;lt;element name="TNSPId" type="{urn:aseXML:r38}PartyIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompanyRefCode" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{urn:aseXML:r38}CompanyRefCodeType"&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="InformationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UnplannedOutage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectWork" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NotForPublication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrimaryOut" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{urn:aseXML:r38}EnumReasonType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ScopeOfWork" type="{urn:aseXML:r38}EnumScopeOfWorkType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Certainty" type="{urn:aseXML:r38}EnumCertaintyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BookingElements" type="{urn:aseXML:r38}BookingElements" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Outages" type="{urn:aseXML:r38}Outages" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Notes" type="{urn:aseXML:r38}CompanyNotes" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ResubmitReason" type="{urn:aseXML:r38}EnumResubmitReasonType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="operationType" type="{urn:aseXML:r38}NOSOperationType" /&amp;gt;
 *       &amp;lt;attribute name="changedBy" type="{urn:aseXML:r38}MessageSecurityContext" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingType", propOrder = {
    "companyBookingId",
    "tnspId",
    "companyRefCode",
    "informationOnly",
    "unplannedOutage",
    "projectWork",
    "notForPublication",
    "primaryOut",
    "reason",
    "scopeOfWork",
    "certainty",
    "bookingElements",
    "outages",
    "notes",
    "resubmitReason"
})
public class BookingType {

    @XmlElement(name = "CompanyBookingId", required = true)
    protected String companyBookingId;
    @XmlElement(name = "TNSPId")
    protected PartyIdentifier tnspId;
    @XmlElement(name = "CompanyRefCode")
    protected String companyRefCode;
    @XmlElement(name = "InformationOnly")
    protected Boolean informationOnly;
    @XmlElement(name = "UnplannedOutage")
    protected Boolean unplannedOutage;
    @XmlElement(name = "ProjectWork")
    protected Boolean projectWork;
    @XmlElement(name = "NotForPublication", defaultValue = "false")
    protected Boolean notForPublication;
    @XmlElement(name = "PrimaryOut")
    protected Boolean primaryOut;
    @XmlElement(name = "Reason")
    @XmlSchemaType(name = "string")
    protected EnumReasonType reason;
    @XmlElement(name = "ScopeOfWork")
    @XmlSchemaType(name = "string")
    protected EnumScopeOfWorkType scopeOfWork;
    @XmlElement(name = "Certainty")
    @XmlSchemaType(name = "string")
    protected EnumCertaintyType certainty;
    @XmlElement(name = "BookingElements")
    protected BookingElements bookingElements;
    @XmlElement(name = "Outages")
    protected Outages outages;
    @XmlElement(name = "Notes")
    protected CompanyNotes notes;
    @XmlElement(name = "ResubmitReason")
    @XmlSchemaType(name = "string")
    protected EnumResubmitReasonType resubmitReason;
    @XmlAttribute(name = "operationType")
    protected NOSOperationType operationType;
    @XmlAttribute(name = "changedBy")
    protected String changedBy;

    /**
     * Gets the value of the companyBookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyBookingId() {
        return companyBookingId;
    }

    /**
     * Sets the value of the companyBookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyBookingId(String value) {
        this.companyBookingId = value;
    }

    /**
     * Gets the value of the tnspId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getTNSPId() {
        return tnspId;
    }

    /**
     * Sets the value of the tnspId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setTNSPId(PartyIdentifier value) {
        this.tnspId = value;
    }

    /**
     * Gets the value of the companyRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRefCode() {
        return companyRefCode;
    }

    /**
     * Sets the value of the companyRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRefCode(String value) {
        this.companyRefCode = value;
    }

    /**
     * Gets the value of the informationOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInformationOnly() {
        return informationOnly;
    }

    /**
     * Sets the value of the informationOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInformationOnly(Boolean value) {
        this.informationOnly = value;
    }

    /**
     * Gets the value of the unplannedOutage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplannedOutage() {
        return unplannedOutage;
    }

    /**
     * Sets the value of the unplannedOutage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplannedOutage(Boolean value) {
        this.unplannedOutage = value;
    }

    /**
     * Gets the value of the projectWork property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectWork() {
        return projectWork;
    }

    /**
     * Sets the value of the projectWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectWork(Boolean value) {
        this.projectWork = value;
    }

    /**
     * Gets the value of the notForPublication property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForPublication() {
        return notForPublication;
    }

    /**
     * Sets the value of the notForPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForPublication(Boolean value) {
        this.notForPublication = value;
    }

    /**
     * Gets the value of the primaryOut property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryOut() {
        return primaryOut;
    }

    /**
     * Sets the value of the primaryOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryOut(Boolean value) {
        this.primaryOut = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link EnumReasonType }
     *     
     */
    public EnumReasonType getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumReasonType }
     *     
     */
    public void setReason(EnumReasonType value) {
        this.reason = value;
    }

    /**
     * Gets the value of the scopeOfWork property.
     * 
     * @return
     *     possible object is
     *     {@link EnumScopeOfWorkType }
     *     
     */
    public EnumScopeOfWorkType getScopeOfWork() {
        return scopeOfWork;
    }

    /**
     * Sets the value of the scopeOfWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumScopeOfWorkType }
     *     
     */
    public void setScopeOfWork(EnumScopeOfWorkType value) {
        this.scopeOfWork = value;
    }

    /**
     * Gets the value of the certainty property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCertaintyType }
     *     
     */
    public EnumCertaintyType getCertainty() {
        return certainty;
    }

    /**
     * Sets the value of the certainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCertaintyType }
     *     
     */
    public void setCertainty(EnumCertaintyType value) {
        this.certainty = value;
    }

    /**
     * Gets the value of the bookingElements property.
     * 
     * @return
     *     possible object is
     *     {@link BookingElements }
     *     
     */
    public BookingElements getBookingElements() {
        return bookingElements;
    }

    /**
     * Sets the value of the bookingElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingElements }
     *     
     */
    public void setBookingElements(BookingElements value) {
        this.bookingElements = value;
    }

    /**
     * Gets the value of the outages property.
     * 
     * @return
     *     possible object is
     *     {@link Outages }
     *     
     */
    public Outages getOutages() {
        return outages;
    }

    /**
     * Sets the value of the outages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Outages }
     *     
     */
    public void setOutages(Outages value) {
        this.outages = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyNotes }
     *     
     */
    public CompanyNotes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNotes }
     *     
     */
    public void setNotes(CompanyNotes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the resubmitReason property.
     * 
     * @return
     *     possible object is
     *     {@link EnumResubmitReasonType }
     *     
     */
    public EnumResubmitReasonType getResubmitReason() {
        return resubmitReason;
    }

    /**
     * Sets the value of the resubmitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumResubmitReasonType }
     *     
     */
    public void setResubmitReason(EnumResubmitReasonType value) {
        this.resubmitReason = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link NOSOperationType }
     *     
     */
    public NOSOperationType getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NOSOperationType }
     *     
     */
    public void setOperationType(NOSOperationType value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the changedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * Sets the value of the changedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedBy(String value) {
        this.changedBy = value;
    }

}
