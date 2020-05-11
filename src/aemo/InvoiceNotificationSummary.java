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
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - defines the footer network billing invoice for SA and Victoria
 * 
 * &lt;p&gt;Java class for InvoiceNotificationSummary complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InvoiceNotificationSummary"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NUOS" type="{urn:aseXML:r38}ChargeFooter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="GSL" type="{urn:aseXML:r38}ChargeFooter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ExcludedService" type="{urn:aseXML:r38}ChargeFooter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Interest" type="{urn:aseXML:r38}ChargeFooter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="EventCharge" type="{urn:aseXML:r38}ChargeFooter" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Invoice" type="{urn:aseXML:r38}InvoiceFooter" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceNotificationSummary", propOrder = {
    "nuos",
    "gsl",
    "excludedService",
    "interest",
    "eventCharge",
    "invoice"
})
public class InvoiceNotificationSummary {

    @XmlElement(name = "NUOS")
    protected ChargeFooter nuos;
    @XmlElement(name = "GSL")
    protected ChargeFooter gsl;
    @XmlElement(name = "ExcludedService")
    protected ChargeFooter excludedService;
    @XmlElement(name = "Interest")
    protected ChargeFooter interest;
    @XmlElement(name = "EventCharge")
    protected ChargeFooter eventCharge;
    @XmlElement(name = "Invoice")
    protected InvoiceFooter invoice;

    /**
     * Gets the value of the nuos property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getNUOS() {
        return nuos;
    }

    /**
     * Sets the value of the nuos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setNUOS(ChargeFooter value) {
        this.nuos = value;
    }

    /**
     * Gets the value of the gsl property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getGSL() {
        return gsl;
    }

    /**
     * Sets the value of the gsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setGSL(ChargeFooter value) {
        this.gsl = value;
    }

    /**
     * Gets the value of the excludedService property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getExcludedService() {
        return excludedService;
    }

    /**
     * Sets the value of the excludedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setExcludedService(ChargeFooter value) {
        this.excludedService = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setInterest(ChargeFooter value) {
        this.interest = value;
    }

    /**
     * Gets the value of the eventCharge property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeFooter }
     *     
     */
    public ChargeFooter getEventCharge() {
        return eventCharge;
    }

    /**
     * Sets the value of the eventCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeFooter }
     *     
     */
    public void setEventCharge(ChargeFooter value) {
        this.eventCharge = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFooter }
     *     
     */
    public InvoiceFooter getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFooter }
     *     
     */
    public void setInvoice(InvoiceFooter value) {
        this.invoice = value;
    }

}
