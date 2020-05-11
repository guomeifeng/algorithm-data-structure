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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Application - Customer Transfer
 * TransactionExchange - CATS Notification
 * TransactionGroup - CATS
 * Priority - Medium
 * Purpose - Provide details of an accepted change request or objection
 * 			
 * 
 * &lt;p&gt;Java class for CATSNotification complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSNotification"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Role" type="{urn:aseXML:r38}RoleIdentifier"/&amp;gt;
 *         &amp;lt;element name="RoleStatus" type="{urn:aseXML:r38}CATSRoleStatus"/&amp;gt;
 *         &amp;lt;element name="ChangeRequest" type="{urn:aseXML:r38}CATSChangeRequestNotificationData"/&amp;gt;
 *         &amp;lt;element name="Objection" type="{urn:aseXML:r38}CATSObjectionNotificationData" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="JurisdictionCode" type="{urn:aseXML:r38}JurisdictionCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMIClassificationCode" type="{urn:aseXML:r38}NMIClassificationCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NMIStatus" type="{urn:aseXML:r38}NMIStatusCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ObjectionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r29" default="r29" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSNotification", propOrder = {
    "role",
    "roleStatus",
    "changeRequest",
    "objection",
    "jurisdictionCode",
    "nmiClassificationCode",
    "nmiStatus",
    "objectionEndDate"
})
public class CATSNotification {

    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "RoleStatus", required = true)
    @XmlSchemaType(name = "string")
    protected CATSRoleStatus roleStatus;
    @XmlElement(name = "ChangeRequest", required = true)
    protected CATSChangeRequestNotificationData changeRequest;
    @XmlElement(name = "Objection")
    protected CATSObjectionNotificationData objection;
    @XmlElement(name = "JurisdictionCode")
    protected String jurisdictionCode;
    @XmlElement(name = "NMIClassificationCode")
    protected String nmiClassificationCode;
    @XmlElement(name = "NMIStatus")
    protected String nmiStatus;
    @XmlElement(name = "ObjectionEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar objectionEndDate;
    @XmlAttribute(name = "version")
    protected R29 version;

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
     * Gets the value of the roleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CATSRoleStatus }
     *     
     */
    public CATSRoleStatus getRoleStatus() {
        return roleStatus;
    }

    /**
     * Sets the value of the roleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSRoleStatus }
     *     
     */
    public void setRoleStatus(CATSRoleStatus value) {
        this.roleStatus = value;
    }

    /**
     * Gets the value of the changeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CATSChangeRequestNotificationData }
     *     
     */
    public CATSChangeRequestNotificationData getChangeRequest() {
        return changeRequest;
    }

    /**
     * Sets the value of the changeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSChangeRequestNotificationData }
     *     
     */
    public void setChangeRequest(CATSChangeRequestNotificationData value) {
        this.changeRequest = value;
    }

    /**
     * Gets the value of the objection property.
     * 
     * @return
     *     possible object is
     *     {@link CATSObjectionNotificationData }
     *     
     */
    public CATSObjectionNotificationData getObjection() {
        return objection;
    }

    /**
     * Sets the value of the objection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATSObjectionNotificationData }
     *     
     */
    public void setObjection(CATSObjectionNotificationData value) {
        this.objection = value;
    }

    /**
     * Gets the value of the jurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionCode(String value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the nmiClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMIClassificationCode() {
        return nmiClassificationCode;
    }

    /**
     * Sets the value of the nmiClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMIClassificationCode(String value) {
        this.nmiClassificationCode = value;
    }

    /**
     * Gets the value of the nmiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNMIStatus() {
        return nmiStatus;
    }

    /**
     * Sets the value of the nmiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNMIStatus(String value) {
        this.nmiStatus = value;
    }

    /**
     * Gets the value of the objectionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObjectionEndDate() {
        return objectionEndDate;
    }

    /**
     * Sets the value of the objectionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObjectionEndDate(XMLGregorianCalendar value) {
        this.objectionEndDate = value;
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
