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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * Purpose - Parameter definition for reports requiring the settlement case identifier and optionally a date range within it
 * Report Names - Level1SettlementReconciliation, AggregatedActualvsEstimate, DataEstimation
 * MSATS Reports - RM16, RM19, RM22
 * Detail - Note that the same report parameters type can be used for several reports since they all use the
 * same parameters. It is thus the report name that will indicate what output will be produced.
 * 			
 * 
 * &lt;p&gt;Java class for MDMTSettlementCaseDateRangeReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MDMTSettlementCaseDateRangeReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}MDMTSettlementCaseGroup"/&amp;gt;
 *         &amp;lt;element name="SettlementRun" type="{urn:aseXML:r38}MDMSettlementRunType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r10" default="r10" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMTSettlementCaseDateRangeReportParameters", propOrder = {
    "settlementCase",
    "fromDate",
    "toDate",
    "lastSequenceNumber",
    "settlementRun"
})
public class MDMTSettlementCaseDateRangeReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "SettlementCase", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger settlementCase;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "LastSequenceNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lastSequenceNumber;
    @XmlElement(name = "SettlementRun")
    @XmlSchemaType(name = "string")
    protected MDMSettlementRunType settlementRun;
    @XmlAttribute(name = "version")
    protected R10 version;

    /**
     * Gets the value of the settlementCase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlementCase() {
        return settlementCase;
    }

    /**
     * Sets the value of the settlementCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlementCase(BigInteger value) {
        this.settlementCase = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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

    /**
     * Gets the value of the settlementRun property.
     * 
     * @return
     *     possible object is
     *     {@link MDMSettlementRunType }
     *     
     */
    public MDMSettlementRunType getSettlementRun() {
        return settlementRun;
    }

    /**
     * Sets the value of the settlementRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMSettlementRunType }
     *     
     */
    public void setSettlementRun(MDMSettlementRunType value) {
        this.settlementRun = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R10 }
     *     
     */
    public R10 getVersion() {
        if (version == null) {
            return R10 .R_10;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R10 }
     *     
     */
    public void setVersion(R10 value) {
        this.version = value;
    }

}
