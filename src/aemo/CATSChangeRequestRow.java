//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Row of the CATS Change Request table
 * MSATS Data Model Table - CATS_Inbound_Change_Request
 * Replication Table Name - CATSChangeRequests
 * 			
 * 
 * &lt;p&gt;Java class for CATSChangeRequestRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSChangeRequestRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/&amp;gt;
 *         &amp;lt;element name="ChangeReasonCode" type="{urn:aseXML:r38}CATSChangeReasonCode"/&amp;gt;
 *         &amp;lt;element name="ChangeStatusCode" type="{urn:aseXML:r38}CATSChangeStatusCode"/&amp;gt;
 *         &amp;lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/&amp;gt;
 *         &amp;lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProposedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualChangeDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterReadTypeCode" type="{urn:aseXML:r38}CATSReadTypeCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ActualEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="InitiatingRequestID" type="{urn:aseXML:r38}CATSRequestIdentifier" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMIBase" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSChangeRequestRow", propOrder = {
    "requestID",
    "changeReasonCode",
    "changeStatusCode",
    "participant",
    "transactionID",
    "transactionDate",
    "proposedDate",
    "actualChangeDate",
    "meterReadTypeCode",
    "actualEndDate",
    "initiatingRequestID",
    "nmi"
})
public class CATSChangeRequestRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long requestID;
    @XmlElement(name = "ChangeReasonCode", required = true)
    protected String changeReasonCode;
    @XmlElement(name = "ChangeStatusCode", required = true)
    protected String changeStatusCode;
    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElementRef(name = "TransactionDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> transactionDate;
    @XmlElementRef(name = "ProposedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> proposedDate;
    @XmlElementRef(name = "ActualChangeDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualChangeDate;
    @XmlElementRef(name = "MeterReadTypeCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> meterReadTypeCode;
    @XmlElementRef(name = "ActualEndDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualEndDate;
    @XmlElementRef(name = "InitiatingRequestID", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> initiatingRequestID;
    @XmlElementRef(name = "NMI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nmi;

    /**
     * Gets the value of the requestID property.
     * 
     */
    public long getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     */
    public void setRequestID(long value) {
        this.requestID = value;
    }

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
     * Gets the value of the changeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStatusCode() {
        return changeStatusCode;
    }

    /**
     * Sets the value of the changeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStatusCode(String value) {
        this.changeStatusCode = value;
    }

    /**
     * Gets the value of the participant property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getParticipant() {
        return participant;
    }

    /**
     * Sets the value of the participant property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setParticipant(PartyIdentifier value) {
        this.participant = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTransactionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the proposedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProposedDate() {
        return proposedDate;
    }

    /**
     * Sets the value of the proposedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProposedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.proposedDate = value;
    }

    /**
     * Gets the value of the actualChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualChangeDate() {
        return actualChangeDate;
    }

    /**
     * Sets the value of the actualChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualChangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualChangeDate = value;
    }

    /**
     * Gets the value of the meterReadTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeterReadTypeCode() {
        return meterReadTypeCode;
    }

    /**
     * Sets the value of the meterReadTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeterReadTypeCode(JAXBElement<String> value) {
        this.meterReadTypeCode = value;
    }

    /**
     * Gets the value of the actualEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualEndDate() {
        return actualEndDate;
    }

    /**
     * Sets the value of the actualEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.actualEndDate = value;
    }

    /**
     * Gets the value of the initiatingRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getInitiatingRequestID() {
        return initiatingRequestID;
    }

    /**
     * Sets the value of the initiatingRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setInitiatingRequestID(JAXBElement<Long> value) {
        this.initiatingRequestID = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNMI(JAXBElement<String> value) {
        this.nmi = value;
    }

}
