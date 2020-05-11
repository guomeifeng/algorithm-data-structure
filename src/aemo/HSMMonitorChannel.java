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


/**
 * &lt;p&gt;Java class for HSMMonitorChannel complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="HSMMonitorChannel"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="EID" type="{urn:aseXML:r38}HSMEID"/&amp;gt;
 *         &amp;lt;element name="Index"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger"&amp;gt;
 *               &amp;lt;totalDigits value="10"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="Plant" type="{urn:aseXML:r38}HSMPlant"/&amp;gt;
 *         &amp;lt;element name="Quantity" type="{urn:aseXML:r38}HSMQuantity"/&amp;gt;
 *         &amp;lt;element name="Name" type="{urn:aseXML:r38}HSMID"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMMonitorChannel", propOrder = {
    "eid",
    "index",
    "plant",
    "quantity",
    "name"
})
public class HSMMonitorChannel {

    @XmlElement(name = "EID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger eid;
    @XmlElement(name = "Index", required = true)
    protected BigInteger index;
    @XmlElement(name = "Plant", required = true)
    @XmlSchemaType(name = "string")
    protected HSMPlant plant;
    @XmlElement(name = "Quantity", required = true)
    @XmlSchemaType(name = "string")
    protected HSMQuantity quantity;
    @XmlElement(name = "Name", required = true, nillable = true)
    protected String name;

    /**
     * Gets the value of the eid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEID() {
        return eid;
    }

    /**
     * Sets the value of the eid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEID(BigInteger value) {
        this.eid = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link HSMPlant }
     *     
     */
    public HSMPlant getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMPlant }
     *     
     */
    public void setPlant(HSMPlant value) {
        this.plant = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link HSMQuantity }
     *     
     */
    public HSMQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link HSMQuantity }
     *     
     */
    public void setQuantity(HSMQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
