//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Define the structure of Instrument transformer details.
 * 
 * &lt;p&gt;Java class for InstrumentTransformer complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="InstrumentTransformer"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TransformerNumber" type="{urn:aseXML:r38}InstrumentTransformerSerialNumber" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransformerType" type="{urn:aseXML:r38}InstrumentTransformerType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TransformerRatio" type="{urn:aseXML:r38}MeterTransformerRatio" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentTransformer", propOrder = {
    "transformerNumber",
    "transformerType",
    "transformerRatio"
})
public class InstrumentTransformer {

    @XmlElement(name = "TransformerNumber")
    protected String transformerNumber;
    @XmlElement(name = "TransformerType")
    @XmlSchemaType(name = "string")
    protected InstrumentTransformerType transformerType;
    @XmlElement(name = "TransformerRatio")
    protected String transformerRatio;

    /**
     * Gets the value of the transformerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerNumber() {
        return transformerNumber;
    }

    /**
     * Sets the value of the transformerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerNumber(String value) {
        this.transformerNumber = value;
    }

    /**
     * Gets the value of the transformerType property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentTransformerType }
     *     
     */
    public InstrumentTransformerType getTransformerType() {
        return transformerType;
    }

    /**
     * Sets the value of the transformerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentTransformerType }
     *     
     */
    public void setTransformerType(InstrumentTransformerType value) {
        this.transformerType = value;
    }

    /**
     * Gets the value of the transformerRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformerRatio() {
        return transformerRatio;
    }

    /**
     * Sets the value of the transformerRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformerRatio(String value) {
        this.transformerRatio = value;
    }

}
