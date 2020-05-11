//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Basic standing data associated with an gas NMI.
 * 
 * &lt;p&gt;Java class for GasMasterStandingData complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasMasterStandingData"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AustralianPostCode" type="{urn:aseXML:r38}AustralianPostCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PrimaryCustodyTransferMeter" type="{urn:aseXML:r38}NMIWithChecksum" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BaseLoad" type="{urn:aseXML:r38}BaseLoad" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TemperatureSensitivityFactor" type="{urn:aseXML:r38}TemperatureSensitivityFactor" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="DistributionTariff" type="{urn:aseXML:r38}DistributionTariff" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransmissionZone" type="{urn:aseXML:r38}TransmissionZone" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="HeatingValueZone" type="{urn:aseXML:r38}HeatingValueZone" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CustomerCharacterisation" type="{urn:aseXML:r38}CustomerCharacterisation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CustomerClassificationCode" type="{urn:aseXML:r38}CustomerClassificationCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CustomerThresholdCode" type="{urn:aseXML:r38}CustomerThresholdCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MIRNAssignmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MIRNStatus" type="{urn:aseXML:r38}MIRNStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AnticipatedAnnualConsumption" type="{urn:aseXML:r38}AnticipatedAnnualConsumption" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MIRNCommissionedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SmallUseCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NetworkID" type="{urn:aseXML:r38}NetworkID" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMasterStandingData", propOrder = {
    "australianPostCode",
    "primaryCustodyTransferMeter",
    "baseLoad",
    "temperatureSensitivityFactor",
    "distributionTariff",
    "transmissionZone",
    "heatingValueZone",
    "customerCharacterisation",
    "customerClassificationCode",
    "customerThresholdCode",
    "mirnAssignmentDate",
    "mirnStatus",
    "anticipatedAnnualConsumption",
    "mirnCommissionedDate",
    "smallUseCustomer",
    "networkID"
})
public class GasMasterStandingData {

    @XmlElementRef(name = "AustralianPostCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> australianPostCode;
    @XmlElement(name = "PrimaryCustodyTransferMeter")
    protected NMIWithChecksum primaryCustodyTransferMeter;
    @XmlElementRef(name = "BaseLoad", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> baseLoad;
    @XmlElementRef(name = "TemperatureSensitivityFactor", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> temperatureSensitivityFactor;
    @XmlElement(name = "DistributionTariff")
    protected String distributionTariff;
    @XmlElement(name = "TransmissionZone")
    protected BigInteger transmissionZone;
    @XmlElement(name = "HeatingValueZone")
    protected String heatingValueZone;
    @XmlElement(name = "CustomerCharacterisation")
    @XmlSchemaType(name = "string")
    protected CustomerCharacterisation customerCharacterisation;
    @XmlElementRef(name = "CustomerClassificationCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerClassificationCode;
    @XmlElementRef(name = "CustomerThresholdCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerThresholdCode;
    @XmlElementRef(name = "MIRNAssignmentDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> mirnAssignmentDate;
    @XmlElement(name = "MIRNStatus")
    @XmlSchemaType(name = "string")
    protected MIRNStatus mirnStatus;
    @XmlElement(name = "AnticipatedAnnualConsumption")
    protected BigInteger anticipatedAnnualConsumption;
    @XmlElement(name = "MIRNCommissionedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mirnCommissionedDate;
    @XmlElement(name = "SmallUseCustomer")
    protected Boolean smallUseCustomer;
    @XmlElement(name = "NetworkID")
    protected String networkID;

    /**
     * Gets the value of the australianPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAustralianPostCode() {
        return australianPostCode;
    }

    /**
     * Sets the value of the australianPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAustralianPostCode(JAXBElement<String> value) {
        this.australianPostCode = value;
    }

    /**
     * Gets the value of the primaryCustodyTransferMeter property.
     * 
     * @return
     *     possible object is
     *     {@link NMIWithChecksum }
     *     
     */
    public NMIWithChecksum getPrimaryCustodyTransferMeter() {
        return primaryCustodyTransferMeter;
    }

    /**
     * Sets the value of the primaryCustodyTransferMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIWithChecksum }
     *     
     */
    public void setPrimaryCustodyTransferMeter(NMIWithChecksum value) {
        this.primaryCustodyTransferMeter = value;
    }

    /**
     * Gets the value of the baseLoad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBaseLoad() {
        return baseLoad;
    }

    /**
     * Sets the value of the baseLoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBaseLoad(JAXBElement<BigDecimal> value) {
        this.baseLoad = value;
    }

    /**
     * Gets the value of the temperatureSensitivityFactor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTemperatureSensitivityFactor() {
        return temperatureSensitivityFactor;
    }

    /**
     * Sets the value of the temperatureSensitivityFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTemperatureSensitivityFactor(JAXBElement<BigDecimal> value) {
        this.temperatureSensitivityFactor = value;
    }

    /**
     * Gets the value of the distributionTariff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionTariff() {
        return distributionTariff;
    }

    /**
     * Sets the value of the distributionTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionTariff(String value) {
        this.distributionTariff = value;
    }

    /**
     * Gets the value of the transmissionZone property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransmissionZone() {
        return transmissionZone;
    }

    /**
     * Sets the value of the transmissionZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransmissionZone(BigInteger value) {
        this.transmissionZone = value;
    }

    /**
     * Gets the value of the heatingValueZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatingValueZone() {
        return heatingValueZone;
    }

    /**
     * Sets the value of the heatingValueZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatingValueZone(String value) {
        this.heatingValueZone = value;
    }

    /**
     * Gets the value of the customerCharacterisation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCharacterisation }
     *     
     */
    public CustomerCharacterisation getCustomerCharacterisation() {
        return customerCharacterisation;
    }

    /**
     * Sets the value of the customerCharacterisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCharacterisation }
     *     
     */
    public void setCustomerCharacterisation(CustomerCharacterisation value) {
        this.customerCharacterisation = value;
    }

    /**
     * Gets the value of the customerClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerClassificationCode() {
        return customerClassificationCode;
    }

    /**
     * Sets the value of the customerClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerClassificationCode(JAXBElement<String> value) {
        this.customerClassificationCode = value;
    }

    /**
     * Gets the value of the customerThresholdCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerThresholdCode() {
        return customerThresholdCode;
    }

    /**
     * Sets the value of the customerThresholdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerThresholdCode(JAXBElement<String> value) {
        this.customerThresholdCode = value;
    }

    /**
     * Gets the value of the mirnAssignmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMIRNAssignmentDate() {
        return mirnAssignmentDate;
    }

    /**
     * Sets the value of the mirnAssignmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMIRNAssignmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.mirnAssignmentDate = value;
    }

    /**
     * Gets the value of the mirnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MIRNStatus }
     *     
     */
    public MIRNStatus getMIRNStatus() {
        return mirnStatus;
    }

    /**
     * Sets the value of the mirnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIRNStatus }
     *     
     */
    public void setMIRNStatus(MIRNStatus value) {
        this.mirnStatus = value;
    }

    /**
     * Gets the value of the anticipatedAnnualConsumption property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnticipatedAnnualConsumption() {
        return anticipatedAnnualConsumption;
    }

    /**
     * Sets the value of the anticipatedAnnualConsumption property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnticipatedAnnualConsumption(BigInteger value) {
        this.anticipatedAnnualConsumption = value;
    }

    /**
     * Gets the value of the mirnCommissionedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMIRNCommissionedDate() {
        return mirnCommissionedDate;
    }

    /**
     * Sets the value of the mirnCommissionedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMIRNCommissionedDate(XMLGregorianCalendar value) {
        this.mirnCommissionedDate = value;
    }

    /**
     * Gets the value of the smallUseCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallUseCustomer() {
        return smallUseCustomer;
    }

    /**
     * Sets the value of the smallUseCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallUseCustomer(Boolean value) {
        this.smallUseCustomer = value;
    }

    /**
     * Gets the value of the networkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Sets the value of the networkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

}
