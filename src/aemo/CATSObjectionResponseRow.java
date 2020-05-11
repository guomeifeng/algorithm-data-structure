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
 * 
 * Purpose - Row of the Electricity Objection Response table
 * MSATS Data Model Table - CATS_Outbound_Objections
 * Replication Table Name - ElectricityObjectionResponses
 * 			
 * 
 * &lt;p&gt;Java class for CATSObjectionResponseRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSObjectionResponseRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ObjectionID" type="{urn:aseXML:r38}CATSObjectionIdentifier"/&amp;gt;
 *         &amp;lt;element name="ObjectionCode" type="{urn:aseXML:r38}CATSObjectionCode"/&amp;gt;
 *         &amp;lt;element name="RequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/&amp;gt;
 *         &amp;lt;element name="Role" type="{urn:aseXML:r38}RoleIdentifier"/&amp;gt;
 *         &amp;lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="InitiatingTransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/&amp;gt;
 *         &amp;lt;element name="TransactionID" type="{urn:aseXML:r38}TransactionIdentifier"/&amp;gt;
 *         &amp;lt;element name="Status" type="{urn:aseXML:r38}AcceptReject"/&amp;gt;
 *         &amp;lt;element name="TransactionTypeCode" type="{urn:aseXML:r38}CATSTransactionTypeCode" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSObjectionResponseRow", propOrder = {
    "objectionID",
    "objectionCode",
    "requestID",
    "role",
    "participant",
    "initiatingTransactionID",
    "transactionID",
    "status",
    "transactionTypeCode"
})
public class CATSObjectionResponseRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "ObjectionID")
    @XmlSchemaType(name = "positiveInteger")
    protected long objectionID;
    @XmlElement(name = "ObjectionCode", required = true)
    protected String objectionCode;
    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long requestID;
    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "InitiatingTransactionID", required = true)
    protected String initiatingTransactionID;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected AcceptReject status;
    @XmlElement(name = "TransactionTypeCode")
    protected String transactionTypeCode;
    @XmlAttribute(name = "version")
    protected R29 version;

    /**
     * Gets the value of the objectionID property.
     * 
     */
    public long getObjectionID() {
        return objectionID;
    }

    /**
     * Sets the value of the objectionID property.
     * 
     */
    public void setObjectionID(long value) {
        this.objectionID = value;
    }

    /**
     * Gets the value of the objectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectionCode() {
        return objectionCode;
    }

    /**
     * Sets the value of the objectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectionCode(String value) {
        this.objectionCode = value;
    }

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
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
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
     * Gets the value of the initiatingTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingTransactionID() {
        return initiatingTransactionID;
    }

    /**
     * Sets the value of the initiatingTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingTransactionID(String value) {
        this.initiatingTransactionID = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptReject }
     *     
     */
    public AcceptReject getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptReject }
     *     
     */
    public void setStatus(AcceptReject value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeCode() {
        return transactionTypeCode;
    }

    /**
     * Sets the value of the transactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeCode(String value) {
        this.transactionTypeCode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R29 }
     *     
     */
    public R29 getVersion() {
        if (version == null) {
            return R29 .R_29;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R29 }
     *     
     */
    public void setVersion(R29 value) {
        this.version = value;
    }

}
