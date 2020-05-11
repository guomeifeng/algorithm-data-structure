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
 * Purpose - Definition for IAITParticipantImbalanceAmountRpt
 * Report Details - Notification of Allocated Participant Imbalance Amount.
 * 			
 * 
 * &lt;p&gt;Java class for ParticipantImbalanceAmountRpt complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ParticipantImbalanceAmountRpt"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportFormat"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ParticipantImbalanceAmountData"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="ParticipantImbalanceAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *                 &amp;lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *                 &amp;lt;attribute name="networkID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantImbalanceAmountRpt", propOrder = {
    "participantImbalanceAmountData"
})
public class ParticipantImbalanceAmountRpt
    extends BaseReportFormat
{

    @XmlElement(name = "ParticipantImbalanceAmountData", required = true)
    protected ParticipantImbalanceAmountRpt.ParticipantImbalanceAmountData participantImbalanceAmountData;

    /**
     * Gets the value of the participantImbalanceAmountData property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantImbalanceAmountRpt.ParticipantImbalanceAmountData }
     *     
     */
    public ParticipantImbalanceAmountRpt.ParticipantImbalanceAmountData getParticipantImbalanceAmountData() {
        return participantImbalanceAmountData;
    }

    /**
     * Sets the value of the participantImbalanceAmountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantImbalanceAmountRpt.ParticipantImbalanceAmountData }
     *     
     */
    public void setParticipantImbalanceAmountData(ParticipantImbalanceAmountRpt.ParticipantImbalanceAmountData value) {
        this.participantImbalanceAmountData = value;
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
     *         &amp;lt;element name="ParticipantImbalanceAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *       &amp;lt;attribute name="gasDate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
     *       &amp;lt;attribute name="networkID" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "participantImbalanceAmount"
    })
    public static class ParticipantImbalanceAmountData {

        @XmlElement(name = "ParticipantImbalanceAmount", required = true)
        protected Object participantImbalanceAmount;
        @XmlAttribute(name = "gasDate", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String gasDate;
        @XmlAttribute(name = "networkID", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String networkID;

        /**
         * Gets the value of the participantImbalanceAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getParticipantImbalanceAmount() {
            return participantImbalanceAmount;
        }

        /**
         * Sets the value of the participantImbalanceAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setParticipantImbalanceAmount(Object value) {
            this.participantImbalanceAmount = value;
        }

        /**
         * Gets the value of the gasDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGasDate() {
            return gasDate;
        }

        /**
         * Sets the value of the gasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGasDate(String value) {
            this.gasDate = value;
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

}
