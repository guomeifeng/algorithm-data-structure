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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * &lt;p&gt;Java class for QuantityType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="QuantityType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="Subnets"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Pipeline" type="{urn:aseXML:r38}PipelineIdentifier" minOccurs="0"/&amp;gt;
 *                   &amp;lt;element name="SubnetQty" type="{urn:aseXML:r38}SubnetQuantityType" maxOccurs="unbounded"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="gasDay" type="{http://www.w3.org/2001/XMLSchema}date" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "subnets"
})
public class QuantityType {

    @XmlElement(name = "Subnets", required = true)
    protected QuantityType.Subnets subnets;
    @XmlAttribute(name = "gasDay")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gasDay;

    /**
     * Gets the value of the subnets property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType.Subnets }
     *     
     */
    public QuantityType.Subnets getSubnets() {
        return subnets;
    }

    /**
     * Sets the value of the subnets property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType.Subnets }
     *     
     */
    public void setSubnets(QuantityType.Subnets value) {
        this.subnets = value;
    }

    /**
     * Gets the value of the gasDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGasDay() {
        return gasDay;
    }

    /**
     * Sets the value of the gasDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGasDay(XMLGregorianCalendar value) {
        this.gasDay = value;
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
     *         &amp;lt;element name="Pipeline" type="{urn:aseXML:r38}PipelineIdentifier" minOccurs="0"/&amp;gt;
     *         &amp;lt;element name="SubnetQty" type="{urn:aseXML:r38}SubnetQuantityType" maxOccurs="unbounded"/&amp;gt;
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
        "pipeline",
        "subnetQty"
    })
    public static class Subnets {

        @XmlElement(name = "Pipeline")
        protected String pipeline;
        @XmlElement(name = "SubnetQty", required = true)
        protected List<SubnetQuantityType> subnetQty;

        /**
         * Gets the value of the pipeline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPipeline() {
            return pipeline;
        }

        /**
         * Sets the value of the pipeline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPipeline(String value) {
            this.pipeline = value;
        }

        /**
         * Gets the value of the subnetQty property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the subnetQty property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getSubnetQty().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link SubnetQuantityType }
         * 
         * 
         */
        public List<SubnetQuantityType> getSubnetQty() {
            if (subnetQty == null) {
                subnetQty = new ArrayList<SubnetQuantityType>();
            }
            return this.subnetQty;
        }

    }

}
