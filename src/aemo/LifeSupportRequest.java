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
 * NEM - B2B Electricity - Fully XML tagged; As adopted - B2B Gas - Fully XML tagged; Transaction Group: CUST; Purpose: Request Life support Details- National Electricity B2B Process - Tranche 1 Build Pack	
 * 
 * &lt;p&gt;Java class for LifeSupportRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="LifeSupportRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="Reason" type="{urn:aseXML:r38}LifeSupportRequestReason"/&amp;gt;
 *         &amp;lt;element name="SpecialNotes" type="{urn:aseXML:r38}SpecialComments" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r38" default="r38" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeSupportRequest", propOrder = {
    "nmi",
    "reason",
    "specialNotes"
})
public class LifeSupportRequest {

    @XmlElement(name = "NMI", required = true)
    protected NMI nmi;
    @XmlElement(name = "Reason", required = true)
    @XmlSchemaType(name = "string")
    protected LifeSupportRequestReason reason;
    @XmlElement(name = "SpecialNotes")
    protected SpecialComments specialNotes;
    @XmlAttribute(name = "version")
    protected R38 version;

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
     *     {@link LifeSupportRequestReason }
     *     
     */
    public LifeSupportRequestReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeSupportRequestReason }
     *     
     */
    public void setReason(LifeSupportRequestReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the specialNotes property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialComments }
     *     
     */
    public SpecialComments getSpecialNotes() {
        return specialNotes;
    }

    /**
     * Sets the value of the specialNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialComments }
     *     
     */
    public void setSpecialNotes(SpecialComments value) {
        this.specialNotes = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R38 }
     *     
     */
    public R38 getVersion() {
        if (version == null) {
            return R38 .R_38;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R38 }
     *     
     */
    public void setVersion(R38 value) {
        this.version = value;
    }

}
