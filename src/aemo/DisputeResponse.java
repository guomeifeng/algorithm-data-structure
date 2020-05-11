//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Application - Network Billing
 * 				TransactionExchange - 
 * 				TransactionGroup - NETB
 * 				Priority - Medium
 * 				Purpose - Submit dispute resolution details to the Retailer
 * 				
 * 				NEM
 * 					B2B_NB_NSW_IP_v2.3_-_Effective_from_9Dec2002.doc
 * 					B2B_NB_SA_IP_v1-0_-_Effective_13Apr2003.doc
 * 					B2B_NB_Vic_IP_Disputes_v1-2_-_Effective_13Jan2002 .doc
 * 					This complex type defines the transaction "NBDISRESOL"
 * 					This transaction is for use only in SA, NSW and VIC.
 * 			
 * 
 * &lt;p&gt;Java class for DisputeResponse complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DisputeResponse"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice&amp;gt;
 *         &amp;lt;element name="Confirmations"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Confirmation" type="{urn:aseXML:r38}Confirmation" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DisputeStatus" type="{urn:aseXML:r38}DisputeStatusData"/&amp;gt;
 *         &amp;lt;element name="CSVDisputeResponse" type="{urn:aseXML:r38}CSVRequestFormat"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r11" default="r11" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeResponse", propOrder = {
    "confirmations",
    "disputeStatus",
    "csvDisputeResponse"
})
public class DisputeResponse {

    @XmlElement(name = "Confirmations")
    protected DisputeResponse.Confirmations confirmations;
    @XmlElement(name = "DisputeStatus")
    protected DisputeStatusData disputeStatus;
    @XmlElement(name = "CSVDisputeResponse")
    protected CSVRequestFormat csvDisputeResponse;
    @XmlAttribute(name = "version")
    protected R11 version;

    /**
     * Gets the value of the confirmations property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeResponse.Confirmations }
     *     
     */
    public DisputeResponse.Confirmations getConfirmations() {
        return confirmations;
    }

    /**
     * Sets the value of the confirmations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeResponse.Confirmations }
     *     
     */
    public void setConfirmations(DisputeResponse.Confirmations value) {
        this.confirmations = value;
    }

    /**
     * Gets the value of the disputeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeStatusData }
     *     
     */
    public DisputeStatusData getDisputeStatus() {
        return disputeStatus;
    }

    /**
     * Sets the value of the disputeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeStatusData }
     *     
     */
    public void setDisputeStatus(DisputeStatusData value) {
        this.disputeStatus = value;
    }

    /**
     * Gets the value of the csvDisputeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CSVRequestFormat }
     *     
     */
    public CSVRequestFormat getCSVDisputeResponse() {
        return csvDisputeResponse;
    }

    /**
     * Sets the value of the csvDisputeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSVRequestFormat }
     *     
     */
    public void setCSVDisputeResponse(CSVRequestFormat value) {
        this.csvDisputeResponse = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R11 }
     *     
     */
    public R11 getVersion() {
        if (version == null) {
            return R11 .R_11;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R11 }
     *     
     */
    public void setVersion(R11 value) {
        this.version = value;
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
     *         &amp;lt;element name="Confirmation" type="{urn:aseXML:r38}Confirmation" maxOccurs="unbounded"/&amp;gt;
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
        "confirmation"
    })
    public static class Confirmations {

        @XmlElement(name = "Confirmation", required = true)
        protected List<Confirmation> confirmation;

        /**
         * Gets the value of the confirmation property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the confirmation property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getConfirmation().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Confirmation }
         * 
         * 
         */
        public List<Confirmation> getConfirmation() {
            if (confirmation == null) {
                confirmation = new ArrayList<Confirmation>();
            }
            return this.confirmation;
        }

    }

}
