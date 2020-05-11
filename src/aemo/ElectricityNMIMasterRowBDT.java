//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Purpose - Row of the Electricity NMI Master Standing Data table extended by BDTStatus and Event for Bulk Data Tool
 * MSATS Data Model Table - CATS_NMI_Data
 * Replication Table Name - ElectricityNMIMaster
 * 			
 * 
 * &lt;p&gt;Java class for ElectricityNMIMasterRowBDT complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ElectricityNMIMasterRowBDT"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}ReplicationDateRangeRow"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;group ref="{urn:aseXML:r38}ElectricityNMIMasterGroup"/&amp;gt;
 *         &amp;lt;element name="BDTStatus" type="{urn:aseXML:r38}BDTStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Event" type="{urn:aseXML:r38}Event" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r25" default="r25" /&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricityNMIMasterRowBDT", propOrder = {
    "jurisdictionCode",
    "nmiClassificationCode",
    "transmissionNodeIdentifier",
    "distributionLossFactorCode",
    "parentEmbeddedNetworkIdentifier",
    "childEmbeddedNetworkIdentifier",
    "address",
    "aggregate",
    "status",
    "flatOrUnitType",
    "flatOrUnitNumber",
    "floorOrLevelType",
    "floorOrLevelNumber",
    "buildingOrPropertyName",
    "buildingOrPropertyName2",
    "locationDescriptor",
    "houseNumber",
    "houseNumberSuffix",
    "houseNumber2",
    "houseNumber2Suffix",
    "lotNumber",
    "streetName",
    "streetType",
    "streetSuffix",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "suburbOrPlaceOrLocality",
    "stateOrTerritory",
    "postCode",
    "deliveryPointIdentifier",
    "distanceFromSubstation",
    "voltageType",
    "poleNumber",
    "accessDetails",
    "feederClass",
    "customerClassificationCode",
    "customerThresholdCode",
    "bdtStatus",
    "event"
})
public class ElectricityNMIMasterRowBDT
    extends ReplicationDateRangeRow
{

    @XmlElementRef(name = "JurisdictionCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jurisdictionCode;
    @XmlElementRef(name = "NMIClassificationCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nmiClassificationCode;
    @XmlElementRef(name = "TransmissionNodeIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionNodeIdentifier;
    @XmlElementRef(name = "DistributionLossFactorCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distributionLossFactorCode;
    @XmlElementRef(name = "ParentEmbeddedNetworkIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentEmbeddedNetworkIdentifier;
    @XmlElementRef(name = "ChildEmbeddedNetworkIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> childEmbeddedNetworkIdentifier;
    @XmlElementRef(name = "Address", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianPartialAddress> address;
    @XmlElementRef(name = "Aggregate", type = JAXBElement.class, required = false)
    protected JAXBElement<YesNo> aggregate;
    @XmlElementRef(name = "Status", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "FlatOrUnitType", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianFlatOrUnitType> flatOrUnitType;
    @XmlElementRef(name = "FlatOrUnitNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flatOrUnitNumber;
    @XmlElementRef(name = "FloorOrLevelType", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianFloorOrLevelType> floorOrLevelType;
    @XmlElementRef(name = "FloorOrLevelNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> floorOrLevelNumber;
    @XmlElementRef(name = "BuildingOrPropertyName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildingOrPropertyName;
    @XmlElementRef(name = "BuildingOrPropertyName2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> buildingOrPropertyName2;
    @XmlElementRef(name = "LocationDescriptor", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescriptor;
    @XmlElementRef(name = "HouseNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> houseNumber;
    @XmlElementRef(name = "HouseNumberSuffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberSuffix;
    @XmlElementRef(name = "HouseNumber2", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> houseNumber2;
    @XmlElementRef(name = "HouseNumber2Suffix", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber2Suffix;
    @XmlElementRef(name = "LotNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lotNumber;
    @XmlElementRef(name = "StreetName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "StreetType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetType;
    @XmlElementRef(name = "StreetSuffix", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianStreetSuffix> streetSuffix;
    @XmlElementRef(name = "AddressLine1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "SuburbOrPlaceOrLocality", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suburbOrPlaceOrLocality;
    @XmlElementRef(name = "StateOrTerritory", type = JAXBElement.class, required = false)
    protected JAXBElement<AustralianStateOrTerritory> stateOrTerritory;
    @XmlElementRef(name = "PostCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postCode;
    @XmlElementRef(name = "DeliveryPointIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> deliveryPointIdentifier;
    @XmlElementRef(name = "DistanceFromSubstation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> distanceFromSubstation;
    @XmlElementRef(name = "VoltageType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voltageType;
    @XmlElementRef(name = "PoleNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poleNumber;
    @XmlElementRef(name = "AccessDetails", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accessDetails;
    @XmlElementRef(name = "FeederClass", type = JAXBElement.class, required = false)
    protected JAXBElement<String> feederClass;
    @XmlElementRef(name = "CustomerClassificationCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerClassificationCode;
    @XmlElementRef(name = "CustomerThresholdCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerThresholdCode;
    @XmlElement(name = "BDTStatus")
    @XmlSchemaType(name = "string")
    protected BDTStatus bdtStatus;
    @XmlElement(name = "Event")
    protected List<Event> event;
    @XmlAttribute(name = "version")
    protected R25 version;

    /**
     * Gets the value of the jurisdictionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJurisdictionCode() {
        return jurisdictionCode;
    }

    /**
     * Sets the value of the jurisdictionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJurisdictionCode(JAXBElement<String> value) {
        this.jurisdictionCode = value;
    }

    /**
     * Gets the value of the nmiClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNMIClassificationCode() {
        return nmiClassificationCode;
    }

    /**
     * Sets the value of the nmiClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNMIClassificationCode(JAXBElement<String> value) {
        this.nmiClassificationCode = value;
    }

    /**
     * Gets the value of the transmissionNodeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionNodeIdentifier() {
        return transmissionNodeIdentifier;
    }

    /**
     * Sets the value of the transmissionNodeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionNodeIdentifier(JAXBElement<String> value) {
        this.transmissionNodeIdentifier = value;
    }

    /**
     * Gets the value of the distributionLossFactorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistributionLossFactorCode() {
        return distributionLossFactorCode;
    }

    /**
     * Sets the value of the distributionLossFactorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistributionLossFactorCode(JAXBElement<String> value) {
        this.distributionLossFactorCode = value;
    }

    /**
     * Gets the value of the parentEmbeddedNetworkIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentEmbeddedNetworkIdentifier() {
        return parentEmbeddedNetworkIdentifier;
    }

    /**
     * Sets the value of the parentEmbeddedNetworkIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentEmbeddedNetworkIdentifier(JAXBElement<String> value) {
        this.parentEmbeddedNetworkIdentifier = value;
    }

    /**
     * Gets the value of the childEmbeddedNetworkIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChildEmbeddedNetworkIdentifier() {
        return childEmbeddedNetworkIdentifier;
    }

    /**
     * Sets the value of the childEmbeddedNetworkIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChildEmbeddedNetworkIdentifier(JAXBElement<String> value) {
        this.childEmbeddedNetworkIdentifier = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianPartialAddress }{@code >}
     *     
     */
    public JAXBElement<AustralianPartialAddress> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianPartialAddress }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AustralianPartialAddress> value) {
        this.address = value;
    }

    /**
     * Gets the value of the aggregate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public JAXBElement<YesNo> getAggregate() {
        return aggregate;
    }

    /**
     * Sets the value of the aggregate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YesNo }{@code >}
     *     
     */
    public void setAggregate(JAXBElement<YesNo> value) {
        this.aggregate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the flatOrUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianFlatOrUnitType }{@code >}
     *     
     */
    public JAXBElement<AustralianFlatOrUnitType> getFlatOrUnitType() {
        return flatOrUnitType;
    }

    /**
     * Sets the value of the flatOrUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianFlatOrUnitType }{@code >}
     *     
     */
    public void setFlatOrUnitType(JAXBElement<AustralianFlatOrUnitType> value) {
        this.flatOrUnitType = value;
    }

    /**
     * Gets the value of the flatOrUnitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlatOrUnitNumber() {
        return flatOrUnitNumber;
    }

    /**
     * Sets the value of the flatOrUnitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlatOrUnitNumber(JAXBElement<String> value) {
        this.flatOrUnitNumber = value;
    }

    /**
     * Gets the value of the floorOrLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianFloorOrLevelType }{@code >}
     *     
     */
    public JAXBElement<AustralianFloorOrLevelType> getFloorOrLevelType() {
        return floorOrLevelType;
    }

    /**
     * Sets the value of the floorOrLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianFloorOrLevelType }{@code >}
     *     
     */
    public void setFloorOrLevelType(JAXBElement<AustralianFloorOrLevelType> value) {
        this.floorOrLevelType = value;
    }

    /**
     * Gets the value of the floorOrLevelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFloorOrLevelNumber() {
        return floorOrLevelNumber;
    }

    /**
     * Sets the value of the floorOrLevelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFloorOrLevelNumber(JAXBElement<String> value) {
        this.floorOrLevelNumber = value;
    }

    /**
     * Gets the value of the buildingOrPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingOrPropertyName() {
        return buildingOrPropertyName;
    }

    /**
     * Sets the value of the buildingOrPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingOrPropertyName(JAXBElement<String> value) {
        this.buildingOrPropertyName = value;
    }

    /**
     * Gets the value of the buildingOrPropertyName2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBuildingOrPropertyName2() {
        return buildingOrPropertyName2;
    }

    /**
     * Sets the value of the buildingOrPropertyName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBuildingOrPropertyName2(JAXBElement<String> value) {
        this.buildingOrPropertyName2 = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescriptor() {
        return locationDescriptor;
    }

    /**
     * Sets the value of the locationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescriptor(JAXBElement<String> value) {
        this.locationDescriptor = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHouseNumber(JAXBElement<Integer> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumberSuffix() {
        return houseNumberSuffix;
    }

    /**
     * Sets the value of the houseNumberSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumberSuffix(JAXBElement<String> value) {
        this.houseNumberSuffix = value;
    }

    /**
     * Gets the value of the houseNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getHouseNumber2() {
        return houseNumber2;
    }

    /**
     * Sets the value of the houseNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setHouseNumber2(JAXBElement<Integer> value) {
        this.houseNumber2 = value;
    }

    /**
     * Gets the value of the houseNumber2Suffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumber2Suffix() {
        return houseNumber2Suffix;
    }

    /**
     * Sets the value of the houseNumber2Suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumber2Suffix(JAXBElement<String> value) {
        this.houseNumber2Suffix = value;
    }

    /**
     * Gets the value of the lotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLotNumber() {
        return lotNumber;
    }

    /**
     * Sets the value of the lotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLotNumber(JAXBElement<String> value) {
        this.lotNumber = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetType(JAXBElement<String> value) {
        this.streetType = value;
    }

    /**
     * Gets the value of the streetSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianStreetSuffix }{@code >}
     *     
     */
    public JAXBElement<AustralianStreetSuffix> getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * Sets the value of the streetSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianStreetSuffix }{@code >}
     *     
     */
    public void setStreetSuffix(JAXBElement<AustralianStreetSuffix> value) {
        this.streetSuffix = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the suburbOrPlaceOrLocality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuburbOrPlaceOrLocality() {
        return suburbOrPlaceOrLocality;
    }

    /**
     * Sets the value of the suburbOrPlaceOrLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuburbOrPlaceOrLocality(JAXBElement<String> value) {
        this.suburbOrPlaceOrLocality = value;
    }

    /**
     * Gets the value of the stateOrTerritory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AustralianStateOrTerritory }{@code >}
     *     
     */
    public JAXBElement<AustralianStateOrTerritory> getStateOrTerritory() {
        return stateOrTerritory;
    }

    /**
     * Sets the value of the stateOrTerritory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AustralianStateOrTerritory }{@code >}
     *     
     */
    public void setStateOrTerritory(JAXBElement<AustralianStateOrTerritory> value) {
        this.stateOrTerritory = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostCode(JAXBElement<String> value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the deliveryPointIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDeliveryPointIdentifier() {
        return deliveryPointIdentifier;
    }

    /**
     * Sets the value of the deliveryPointIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDeliveryPointIdentifier(JAXBElement<Integer> value) {
        this.deliveryPointIdentifier = value;
    }

    /**
     * Gets the value of the distanceFromSubstation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDistanceFromSubstation() {
        return distanceFromSubstation;
    }

    /**
     * Sets the value of the distanceFromSubstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDistanceFromSubstation(JAXBElement<BigDecimal> value) {
        this.distanceFromSubstation = value;
    }

    /**
     * Gets the value of the voltageType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoltageType() {
        return voltageType;
    }

    /**
     * Sets the value of the voltageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoltageType(JAXBElement<String> value) {
        this.voltageType = value;
    }

    /**
     * Gets the value of the poleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoleNumber() {
        return poleNumber;
    }

    /**
     * Sets the value of the poleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoleNumber(JAXBElement<String> value) {
        this.poleNumber = value;
    }

    /**
     * Gets the value of the accessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessDetails() {
        return accessDetails;
    }

    /**
     * Sets the value of the accessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessDetails(JAXBElement<String> value) {
        this.accessDetails = value;
    }

    /**
     * Gets the value of the feederClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFeederClass() {
        return feederClass;
    }

    /**
     * Sets the value of the feederClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFeederClass(JAXBElement<String> value) {
        this.feederClass = value;
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
     * Gets the value of the bdtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BDTStatus }
     *     
     */
    public BDTStatus getBDTStatus() {
        return bdtStatus;
    }

    /**
     * Sets the value of the bdtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDTStatus }
     *     
     */
    public void setBDTStatus(BDTStatus value) {
        this.bdtStatus = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the event property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getEvent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R25 }
     *     
     */
    public R25 getVersion() {
        if (version == null) {
            return R25 .R_25;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R25 }
     *     
     */
    public void setVersion(R25 value) {
        this.version = value;
    }

}
