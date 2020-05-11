//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Parameters for a CATS Snapshot Report. Report Name 
 * Snapshot MSATS Report 
 * 			
 * 
 * &lt;p&gt;Java class for CATSSnapshotReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CATSSnapshotReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Participant" type="{urn:aseXML:r38}PartyIdentifier"/&amp;gt;
 *         &amp;lt;element name="AsAtDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&amp;gt;
 *         &amp;lt;element name="Tables" type="{urn:aseXML:r38}Tables"/&amp;gt;
 *         &amp;lt;element name="LastSequenceNumber" type="{urn:aseXML:r38}ReplicationSequenceNumber"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATSSnapshotReportParameters", propOrder = {
    "participant",
    "asAtDateTime",
    "tables",
    "lastSequenceNumber"
})
public class CATSSnapshotReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "Participant", required = true)
    protected PartyIdentifier participant;
    @XmlElement(name = "AsAtDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar asAtDateTime;
    @XmlElement(name = "Tables", required = true)
    protected Tables tables;
    @XmlElement(name = "LastSequenceNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lastSequenceNumber;

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
     * Gets the value of the asAtDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsAtDateTime() {
        return asAtDateTime;
    }

    /**
     * Sets the value of the asAtDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsAtDateTime(XMLGregorianCalendar value) {
        this.asAtDateTime = value;
    }

    /**
     * Gets the value of the tables property.
     * 
     * @return
     *     possible object is
     *     {@link Tables }
     *     
     */
    public Tables getTables() {
        return tables;
    }

    /**
     * Sets the value of the tables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tables }
     *     
     */
    public void setTables(Tables value) {
        this.tables = value;
    }

    /**
     * Gets the value of the lastSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastSequenceNumber() {
        return lastSequenceNumber;
    }

    /**
     * Sets the value of the lastSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastSequenceNumber(BigInteger value) {
        this.lastSequenceNumber = value;
    }

}
