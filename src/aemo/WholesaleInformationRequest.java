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
 * &lt;p&gt;Java class for WholesaleInformationRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="WholesaleInformationRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InformationRequestData" type="{urn:aseXML:r38}WholesaleInformationRequestData"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r20" default="r20" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WholesaleInformationRequest", propOrder = {
    "informationRequestData"
})
public class WholesaleInformationRequest {

    @XmlElement(name = "InformationRequestData", required = true)
    protected WholesaleInformationRequestData informationRequestData;
    @XmlAttribute(name = "version")
    protected R20 version;

    /**
     * Gets the value of the informationRequestData property.
     * 
     * @return
     *     possible object is
     *     {@link WholesaleInformationRequestData }
     *     
     */
    public WholesaleInformationRequestData getInformationRequestData() {
        return informationRequestData;
    }

    /**
     * Sets the value of the informationRequestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WholesaleInformationRequestData }
     *     
     */
    public void setInformationRequestData(WholesaleInformationRequestData value) {
        this.informationRequestData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R20 }
     *     
     */
    public R20 getVersion() {
        if (version == null) {
            return R20 .R_20;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R20 }
     *     
     */
    public void setVersion(R20 value) {
        this.version = value;
    }

}
