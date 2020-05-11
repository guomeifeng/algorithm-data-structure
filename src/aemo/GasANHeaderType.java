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
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GasANHeaderType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="GasANHeaderType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CloseProximityPoint" type="{urn:aseXML:r38}NMI"/&amp;gt;
 *         &amp;lt;element name="Period" type="{urn:aseXML:r38}Period"/&amp;gt;
 *         &amp;lt;element name="HeaderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CompanyId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="AvailableAMDQGJ" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastModifiedBy" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GasANHeaderType", propOrder = {
    "closeProximityPoint",
    "period",
    "headerId",
    "companyId",
    "availableAMDQGJ",
    "lastModifiedBy",
    "lastModifiedDate"
})
public class GasANHeaderType {

    @XmlElement(name = "CloseProximityPoint", required = true)
    protected NMI closeProximityPoint;
    @XmlElement(name = "Period", required = true)
    protected Period period;
    @XmlElement(name = "HeaderId")
    protected Long headerId;
    @XmlElement(name = "CompanyId")
    protected Integer companyId;
    @XmlElement(name = "AvailableAMDQGJ")
    protected Float availableAMDQGJ;
    @XmlElement(name = "LastModifiedBy")
    protected Object lastModifiedBy;
    @XmlElement(name = "LastModifiedDate")
    protected Object lastModifiedDate;

    /**
     * Gets the value of the closeProximityPoint property.
     * 
     * @return
     *     possible object is
     *     {@link NMI }
     *     
     */
    public NMI getCloseProximityPoint() {
        return closeProximityPoint;
    }

    /**
     * Sets the value of the closeProximityPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMI }
     *     
     */
    public void setCloseProximityPoint(NMI value) {
        this.closeProximityPoint = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setPeriod(Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the headerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeaderId() {
        return headerId;
    }

    /**
     * Sets the value of the headerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeaderId(Long value) {
        this.headerId = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the availableAMDQGJ property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailableAMDQGJ() {
        return availableAMDQGJ;
    }

    /**
     * Sets the value of the availableAMDQGJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailableAMDQGJ(Float value) {
        this.availableAMDQGJ = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedBy(Object value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLastModifiedDate(Object value) {
        this.lastModifiedDate = value;
    }

}
