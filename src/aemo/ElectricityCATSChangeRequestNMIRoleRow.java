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
 * 
 * Purpose - Row of the Electricity CATS Change Request NMI Role Assignment table
 * MSATS Data Model Table - CATS_Inbound_NMI_Participant_Relations
 * Replication Table Name - ElectricityCATSChangeRequestNMIRoles
 * 			
 * 
 * &lt;p&gt;Java class for ElectricityCATSChangeRequestNMIRoleRow complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityCATSChangeRequestNMIRoleRow"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationBaseRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RequestID" type="{urn:aseXML:r38}CATSRequestIdentifier"/&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}ElectricityNMIRoleGroup"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityCATSChangeRequestNMIRoleRow", propOrder = {
    "requestID",
    "party",
    "role"
})
public class ElectricityCATSChangeRequestNMIRoleRow
    extends ReplicationBaseRow
{

    @XmlElement(name = "RequestID")
    @XmlSchemaType(name = "positiveInteger")
    protected long requestID;
    @XmlElement(name = "Party", required = true, nillable = true)
    protected PartyIdentifier party;
    @XmlElement(name = "Role", required = true)
    protected String role;

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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifier }
     *     
     */
    public PartyIdentifier getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifier }
     *     
     */
    public void setParty(PartyIdentifier value) {
        this.party = value;
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

}
