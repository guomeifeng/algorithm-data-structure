//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Standing data associated with a NSW/ACT Gas NMI (DPI).
 * 
 * &lt;p&gt;Java class for GasMultiMeterStandingDataType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasMultiMeterStandingDataType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="AdjustmentReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="BillingMethod" type="{urn:aseXML:r38}BillingMethodType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="KPAValue" type="{urn:aseXML:r38}KPAValueType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterInstallationType" type="{urn:aseXML:r38}MeterInstallationType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterMeasurementUnit" type="{urn:aseXML:r38}MeterMeasurementUnitType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterMultiplier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterPosition" type="{urn:aseXML:r38}GasMeterPosition" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterRead" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Current" type="{urn:aseXML:r38}BaseMultiMeterReadDataType" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="Previous" type="{urn:aseXML:r38}BaseMultiMeterReadDataType" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="MeterReadFrequency" type="{urn:aseXML:r38}GasMeterReadFrequency" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterReadFrequencyType" type="{urn:aseXML:r38}MeterReadingFrequencyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterSerialNumber" type="{urn:aseXML:r38}MeterSerialNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterStatus" type="{urn:aseXML:r38}GasMeterStatus" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterType" type="{urn:aseXML:r38}MeterType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterTypeSizeCode" type="{urn:aseXML:r38}GasMeterTypeSizeCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MeterUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="NumberOfDialsOnDevice" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *               &amp;lt;totalDigits value="2"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ScheduledReadingDayNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyPointCode" type="{urn:aseXML:r38}SupplyPointCode" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="SupplyPointID" type="{urn:aseXML:r38}SupplyPointID" minOccurs="0"/&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;element name="BasicMeter" type="{urn:aseXML:r38}GasBasicMultiMeterStandingData" minOccurs="0"/&amp;gt;
 *           &amp;lt;element name="IntervalMeter" type="{urn:aseXML:r38}GasIntervalMeterStandingData" minOccurs="0"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasMultiMeterStandingDataType", propOrder = {
    "adjustmentReasonCode",
    "billingMethod",
    "kpaValue",
    "meterInstallationType",
    "meterMeasurementUnit",
    "meterMultiplier",
    "meterPosition",
    "meterRead",
    "meterReadFrequency",
    "meterReadFrequencyType",
    "meterSerialNumber",
    "meterStatus",
    "meterType",
    "meterTypeSizeCode",
    "meterUnits",
    "numberOfDialsOnDevice",
    "scheduledReadingDayNumber",
    "supplyPointCode",
    "supplyPointID",
    "basicMeter",
    "intervalMeter"
})
public class GasMultiMeterStandingDataType {

    @XmlElement(name = "AdjustmentReasonCode")
    protected String adjustmentReasonCode;
    @XmlElement(name = "BillingMethod")
    @XmlSchemaType(name = "string")
    protected BillingMethodType billingMethod;
    @XmlElement(name = "KPAValue")
    protected BigDecimal kpaValue;
    @XmlElement(name = "MeterInstallationType")
    @XmlSchemaType(name = "string")
    protected MeterInstallationType meterInstallationType;
    @XmlElement(name = "MeterMeasurementUnit")
    @XmlSchemaType(name = "string")
    protected MeterMeasurementUnitType meterMeasurementUnit;
    @XmlElement(name = "MeterMultiplier")
    protected String meterMultiplier;
    @XmlElement(name = "MeterPosition")
    @XmlSchemaType(name = "string")
    protected GasMeterPosition meterPosition;
    @XmlElement(name = "MeterRead")
    protected GasMultiMeterStandingDataType.MeterRead meterRead;
    @XmlElement(name = "MeterReadFrequency")
    @XmlSchemaType(name = "string")
    protected GasMeterReadFrequency meterReadFrequency;
    @XmlElement(name = "MeterReadFrequencyType")
    protected MeterReadingFrequencyType meterReadFrequencyType;
    @XmlElement(name = "MeterSerialNumber")
    protected String meterSerialNumber;
    @XmlElement(name = "MeterStatus")
    @XmlSchemaType(name = "string")
    protected GasMeterStatus meterStatus;
    @XmlElement(name = "MeterType")
    @XmlSchemaType(name = "string")
    protected MeterType meterType;
    @XmlElement(name = "MeterTypeSizeCode")
    protected String meterTypeSizeCode;
    @XmlElement(name = "MeterUnits")
    protected String meterUnits;
    @XmlElement(name = "NumberOfDialsOnDevice")
    protected Integer numberOfDialsOnDevice;
    @XmlElement(name = "ScheduledReadingDayNumber")
    protected Integer scheduledReadingDayNumber;
    @XmlElement(name = "SupplyPointCode")
    @XmlSchemaType(name = "string")
    protected SupplyPointCode supplyPointCode;
    @XmlElement(name = "SupplyPointID")
    protected String supplyPointID;
    @XmlElement(name = "BasicMeter")
    protected GasBasicMultiMeterStandingData basicMeter;
    @XmlElement(name = "IntervalMeter")
    protected GasIntervalMeterStandingData intervalMeter;

    /**
     * Gets the value of the adjustmentReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjustmentReasonCode() {
        return adjustmentReasonCode;
    }

    /**
     * Sets the value of the adjustmentReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjustmentReasonCode(String value) {
        this.adjustmentReasonCode = value;
    }

    /**
     * Gets the value of the billingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link BillingMethodType }
     *     
     */
    public BillingMethodType getBillingMethod() {
        return billingMethod;
    }

    /**
     * Sets the value of the billingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingMethodType }
     *     
     */
    public void setBillingMethod(BillingMethodType value) {
        this.billingMethod = value;
    }

    /**
     * Gets the value of the kpaValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKPAValue() {
        return kpaValue;
    }

    /**
     * Sets the value of the kpaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKPAValue(BigDecimal value) {
        this.kpaValue = value;
    }

    /**
     * Gets the value of the meterInstallationType property.
     * 
     * @return
     *     possible object is
     *     {@link MeterInstallationType }
     *     
     */
    public MeterInstallationType getMeterInstallationType() {
        return meterInstallationType;
    }

    /**
     * Sets the value of the meterInstallationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterInstallationType }
     *     
     */
    public void setMeterInstallationType(MeterInstallationType value) {
        this.meterInstallationType = value;
    }

    /**
     * Gets the value of the meterMeasurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MeterMeasurementUnitType }
     *     
     */
    public MeterMeasurementUnitType getMeterMeasurementUnit() {
        return meterMeasurementUnit;
    }

    /**
     * Sets the value of the meterMeasurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterMeasurementUnitType }
     *     
     */
    public void setMeterMeasurementUnit(MeterMeasurementUnitType value) {
        this.meterMeasurementUnit = value;
    }

    /**
     * Gets the value of the meterMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterMultiplier() {
        return meterMultiplier;
    }

    /**
     * Sets the value of the meterMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterMultiplier(String value) {
        this.meterMultiplier = value;
    }

    /**
     * Gets the value of the meterPosition property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterPosition }
     *     
     */
    public GasMeterPosition getMeterPosition() {
        return meterPosition;
    }

    /**
     * Sets the value of the meterPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterPosition }
     *     
     */
    public void setMeterPosition(GasMeterPosition value) {
        this.meterPosition = value;
    }

    /**
     * Gets the value of the meterRead property.
     * 
     * @return
     *     possible object is
     *     {@link GasMultiMeterStandingDataType.MeterRead }
     *     
     */
    public GasMultiMeterStandingDataType.MeterRead getMeterRead() {
        return meterRead;
    }

    /**
     * Sets the value of the meterRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMultiMeterStandingDataType.MeterRead }
     *     
     */
    public void setMeterRead(GasMultiMeterStandingDataType.MeterRead value) {
        this.meterRead = value;
    }

    /**
     * Gets the value of the meterReadFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterReadFrequency }
     *     
     */
    public GasMeterReadFrequency getMeterReadFrequency() {
        return meterReadFrequency;
    }

    /**
     * Sets the value of the meterReadFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterReadFrequency }
     *     
     */
    public void setMeterReadFrequency(GasMeterReadFrequency value) {
        this.meterReadFrequency = value;
    }

    /**
     * Gets the value of the meterReadFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link MeterReadingFrequencyType }
     *     
     */
    public MeterReadingFrequencyType getMeterReadFrequencyType() {
        return meterReadFrequencyType;
    }

    /**
     * Sets the value of the meterReadFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterReadingFrequencyType }
     *     
     */
    public void setMeterReadFrequencyType(MeterReadingFrequencyType value) {
        this.meterReadFrequencyType = value;
    }

    /**
     * Gets the value of the meterSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterSerialNumber() {
        return meterSerialNumber;
    }

    /**
     * Sets the value of the meterSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterSerialNumber(String value) {
        this.meterSerialNumber = value;
    }

    /**
     * Gets the value of the meterStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GasMeterStatus }
     *     
     */
    public GasMeterStatus getMeterStatus() {
        return meterStatus;
    }

    /**
     * Sets the value of the meterStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasMeterStatus }
     *     
     */
    public void setMeterStatus(GasMeterStatus value) {
        this.meterStatus = value;
    }

    /**
     * Gets the value of the meterType property.
     * 
     * @return
     *     possible object is
     *     {@link MeterType }
     *     
     */
    public MeterType getMeterType() {
        return meterType;
    }

    /**
     * Sets the value of the meterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterType }
     *     
     */
    public void setMeterType(MeterType value) {
        this.meterType = value;
    }

    /**
     * Gets the value of the meterTypeSizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterTypeSizeCode() {
        return meterTypeSizeCode;
    }

    /**
     * Sets the value of the meterTypeSizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterTypeSizeCode(String value) {
        this.meterTypeSizeCode = value;
    }

    /**
     * Gets the value of the meterUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterUnits() {
        return meterUnits;
    }

    /**
     * Sets the value of the meterUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterUnits(String value) {
        this.meterUnits = value;
    }

    /**
     * Gets the value of the numberOfDialsOnDevice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfDialsOnDevice() {
        return numberOfDialsOnDevice;
    }

    /**
     * Sets the value of the numberOfDialsOnDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfDialsOnDevice(Integer value) {
        this.numberOfDialsOnDevice = value;
    }

    /**
     * Gets the value of the scheduledReadingDayNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduledReadingDayNumber() {
        return scheduledReadingDayNumber;
    }

    /**
     * Sets the value of the scheduledReadingDayNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduledReadingDayNumber(Integer value) {
        this.scheduledReadingDayNumber = value;
    }

    /**
     * Gets the value of the supplyPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyPointCode }
     *     
     */
    public SupplyPointCode getSupplyPointCode() {
        return supplyPointCode;
    }

    /**
     * Sets the value of the supplyPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyPointCode }
     *     
     */
    public void setSupplyPointCode(SupplyPointCode value) {
        this.supplyPointCode = value;
    }

    /**
     * Gets the value of the supplyPointID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyPointID() {
        return supplyPointID;
    }

    /**
     * Sets the value of the supplyPointID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyPointID(String value) {
        this.supplyPointID = value;
    }

    /**
     * Gets the value of the basicMeter property.
     * 
     * @return
     *     possible object is
     *     {@link GasBasicMultiMeterStandingData }
     *     
     */
    public GasBasicMultiMeterStandingData getBasicMeter() {
        return basicMeter;
    }

    /**
     * Sets the value of the basicMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasBasicMultiMeterStandingData }
     *     
     */
    public void setBasicMeter(GasBasicMultiMeterStandingData value) {
        this.basicMeter = value;
    }

    /**
     * Gets the value of the intervalMeter property.
     * 
     * @return
     *     possible object is
     *     {@link GasIntervalMeterStandingData }
     *     
     */
    public GasIntervalMeterStandingData getIntervalMeter() {
        return intervalMeter;
    }

    /**
     * Sets the value of the intervalMeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GasIntervalMeterStandingData }
     *     
     */
    public void setIntervalMeter(GasIntervalMeterStandingData value) {
        this.intervalMeter = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Current" type="{urn:aseXML:r38}BaseMultiMeterReadDataType" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="Previous" type="{urn:aseXML:r38}BaseMultiMeterReadDataType" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "current",
        "previous"
    })
    public static class MeterRead {

        @XmlElement(name = "Current")
        protected BaseMultiMeterReadDataType current;
        @XmlElement(name = "Previous")
        protected BaseMultiMeterReadDataType previous;

        /**
         * Gets the value of the current property.
         * 
         * @return
         *     possible object is
         *     {@link BaseMultiMeterReadDataType }
         *     
         */
        public BaseMultiMeterReadDataType getCurrent() {
            return current;
        }

        /**
         * Sets the value of the current property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseMultiMeterReadDataType }
         *     
         */
        public void setCurrent(BaseMultiMeterReadDataType value) {
            this.current = value;
        }

        /**
         * Gets the value of the previous property.
         * 
         * @return
         *     possible object is
         *     {@link BaseMultiMeterReadDataType }
         *     
         */
        public BaseMultiMeterReadDataType getPrevious() {
            return previous;
        }

        /**
         * Sets the value of the previous property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseMultiMeterReadDataType }
         *     
         */
        public void setPrevious(BaseMultiMeterReadDataType value) {
            this.previous = value;
        }

    }

}
