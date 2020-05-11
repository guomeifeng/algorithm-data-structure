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
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GasSubmitResponseData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasSubmitResponseData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}WholesaleSubmitResponseData"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="BidSet" type="{urn:aseXML:r38}GasBidSetType"/&amp;gt;
 *         &amp;lt;element name="Forecast" type="{urn:aseXML:r38}GasForecastType"/&amp;gt;
 *         &amp;lt;element name="InjectionNomination" type="{urn:aseXML:r38}GasIHNType"/&amp;gt;
 *         &amp;lt;element name="AgencyNomination" type="{urn:aseXML:r38}GasAgencyNomHeaderType"/&amp;gt;
 *         &amp;lt;element name="AgencyNominationWithdraw" type="{urn:aseXML:r38}GasAgencyNomHeaderType"/&amp;gt;
 *         &amp;lt;element name="AgencyNominationConfirmation" type="{urn:aseXML:r38}GasAgencyConfirmationHeaderType"/&amp;gt;
 *         &amp;lt;element name="AgencyWithdrawnNominationConfirmed" type="{urn:aseXML:r38}GasAgencyConfirmationHeaderType"/&amp;gt;
 *         &amp;lt;element name="AmdqNomination" type="{urn:aseXML:r38}GasANType"/&amp;gt;
 *         &amp;lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r31" default="r31" /&amp;gt;
 *       &amp;lt;attribute name="contextType" use="required" type="{urn:aseXML:r38}GasSubmissionTransactionType" /&amp;gt;
 *       &amp;lt;attribute name="applyTo" type="{urn:aseXML:r38}GasSubmissionType" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasSubmitResponseData", propOrder = {
    "bidSet",
    "forecast",
    "injectionNomination",
    "agencyNomination",
    "agencyNominationWithdraw",
    "agencyNominationConfirmation",
    "agencyWithdrawnNominationConfirmed",
    "amdqNomination",
    "success"
})
public class GasSubmitResponseData
    extends WholesaleSubmitResponseData
{

    @XmlElement(name = "BidSet")
    protected GasBidSetType bidSet;
    @XmlElement(name = "Forecast")
    protected GasForecastType forecast;
    @XmlElement(name = "InjectionNomination")
    protected GasIHNType injectionNomination;
    @XmlElement(name = "AgencyNomination")
    protected GasAgencyNomHeaderType agencyNomination;
    @XmlElement(name = "AgencyNominationWithdraw")
    protected GasAgencyNomHeaderType agencyNominationWithdraw;
    @XmlElement(name = "AgencyNominationConfirmation")
    protected GasAgencyConfirmationHeaderType agencyNominationConfirmation;
    @XmlElement(name = "AgencyWithdrawnNominationConfirmed")
    protected GasAgencyConfirmationHeaderType agencyWithdrawnNominationConfirmed;
    @XmlElement(name = "AmdqNomination")
    protected GasANType amdqNomination;
    @XmlElement(name = "Success")
    protected Boolean success;
    @XmlAttribute(name = "version")
    protected R31 version;
    @XmlAttribute(name = "contextType", required = true)
    protected GasSubmissionTransactionType contextType;
    @XmlAttribute(name = "applyTo")
    protected GasSubmissionType applyTo;

    /**
     * Gets the value of the bidSet property.
     * 
     * @return
     *     possible object is
     *     {@link GasBidSetType }
     *     
     */
    public GasBidSetType getBidSet() {
        return bidSet;
    }

    /**
     * Sets the value of the bidSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasBidSetType }
     *     
     */
    public void setBidSet(GasBidSetType value) {
        this.bidSet = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link GasForecastType }
     *     
     */
    public GasForecastType getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasForecastType }
     *     
     */
    public void setForecast(GasForecastType value) {
        this.forecast = value;
    }

    /**
     * Gets the value of the injectionNomination property.
     * 
     * @return
     *     possible object is
     *     {@link GasIHNType }
     *     
     */
    public GasIHNType getInjectionNomination() {
        return injectionNomination;
    }

    /**
     * Sets the value of the injectionNomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIHNType }
     *     
     */
    public void setInjectionNomination(GasIHNType value) {
        this.injectionNomination = value;
    }

    /**
     * Gets the value of the agencyNomination property.
     * 
     * @return
     *     possible object is
     *     {@link GasAgencyNomHeaderType }
     *     
     */
    public GasAgencyNomHeaderType getAgencyNomination() {
        return agencyNomination;
    }

    /**
     * Sets the value of the agencyNomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasAgencyNomHeaderType }
     *     
     */
    public void setAgencyNomination(GasAgencyNomHeaderType value) {
        this.agencyNomination = value;
    }

    /**
     * Gets the value of the agencyNominationWithdraw property.
     * 
     * @return
     *     possible object is
     *     {@link GasAgencyNomHeaderType }
     *     
     */
    public GasAgencyNomHeaderType getAgencyNominationWithdraw() {
        return agencyNominationWithdraw;
    }

    /**
     * Sets the value of the agencyNominationWithdraw property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasAgencyNomHeaderType }
     *     
     */
    public void setAgencyNominationWithdraw(GasAgencyNomHeaderType value) {
        this.agencyNominationWithdraw = value;
    }

    /**
     * Gets the value of the agencyNominationConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link GasAgencyConfirmationHeaderType }
     *     
     */
    public GasAgencyConfirmationHeaderType getAgencyNominationConfirmation() {
        return agencyNominationConfirmation;
    }

    /**
     * Sets the value of the agencyNominationConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasAgencyConfirmationHeaderType }
     *     
     */
    public void setAgencyNominationConfirmation(GasAgencyConfirmationHeaderType value) {
        this.agencyNominationConfirmation = value;
    }

    /**
     * Gets the value of the agencyWithdrawnNominationConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link GasAgencyConfirmationHeaderType }
     *     
     */
    public GasAgencyConfirmationHeaderType getAgencyWithdrawnNominationConfirmed() {
        return agencyWithdrawnNominationConfirmed;
    }

    /**
     * Sets the value of the agencyWithdrawnNominationConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasAgencyConfirmationHeaderType }
     *     
     */
    public void setAgencyWithdrawnNominationConfirmed(GasAgencyConfirmationHeaderType value) {
        this.agencyWithdrawnNominationConfirmed = value;
    }

    /**
     * Gets the value of the amdqNomination property.
     * 
     * @return
     *     possible object is
     *     {@link GasANType }
     *     
     */
    public GasANType getAmdqNomination() {
        return amdqNomination;
    }

    /**
     * Sets the value of the amdqNomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasANType }
     *     
     */
    public void setAmdqNomination(GasANType value) {
        this.amdqNomination = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R31 }
     *     
     */
    public R31 getVersion() {
        if (version == null) {
            return R31 .R_31;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R31 }
     *     
     */
    public void setVersion(R31 value) {
        this.version = value;
    }

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link GasSubmissionTransactionType }
     *     
     */
    public GasSubmissionTransactionType getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasSubmissionTransactionType }
     *     
     */
    public void setContextType(GasSubmissionTransactionType value) {
        this.contextType = value;
    }

    /**
     * Gets the value of the applyTo property.
     * 
     * @return
     *     possible object is
     *     {@link GasSubmissionType }
     *     
     */
    public GasSubmissionType getApplyTo() {
        return applyTo;
    }

    /**
     * Sets the value of the applyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasSubmissionType }
     *     
     */
    public void setApplyTo(GasSubmissionType value) {
        this.applyTo = value;
    }

}
