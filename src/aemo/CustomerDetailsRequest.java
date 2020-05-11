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
 * NEM - B2B Electricity: Transaction Group:  CUST; Purpose: Request Customer Details- National Electricity B2B Process - Tranche 1 Build Pack; VicGas:  Not Used.			
 * 
 * &lt;p&gt;Java class for CustomerDetailsRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CustomerDetailsRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{urn:aseXML:r38}RequestReason"/&amp;gt;
 *         &amp;lt;element name="Comments" type="{urn:aseXML:r38}SpecialComments" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r32" default="r32" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDetailsRequest", propOrder = {
    "nmi",
    "reason",
    "comments"
})
public class CustomerDetailsRequest {

    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "Reason", required = true)
    @XmlSchemaType(name = "string")
    protected RequestReason reason;
    @XmlElement(name = "Comments")
    protected SpecialComments comments;
    @XmlAttribute(name = "version")
    protected R32 version;

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMI }
     *     
     */
    public NMI getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMI }
     *     
     */
    public void setNMI(NMI value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RequestReason }
     *     
     */
    public RequestReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestReason }
     *     
     */
    public void setReason(RequestReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialComments }
     *     
     */
    public SpecialComments getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialComments }
     *     
     */
    public void setComments(SpecialComments value) {
        this.comments = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R32 }
     *     
     */
    public R32 getVersion() {
        if (version == null) {
            return R32 .R_32;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R32 }
     *     
     */
    public void setVersion(R32 value) {
        this.version = value;
    }

}
