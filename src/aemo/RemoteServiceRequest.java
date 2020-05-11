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
 * Prior to commencing the use of the Remote Service Process the Initiator and Recipient must agree the scope of the service(s) and the format of the response to the service request.
 * 			
 * 
 * &lt;p&gt;Java class for RemoteServiceRequest complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RemoteServiceRequest"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="RemoteServiceData" type="{urn:aseXML:r38}RemoteServiceData"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="version" type="{urn:aseXML:r38}r36" default="r36" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteServiceRequest", propOrder = {
    "remoteServiceData"
})
public class RemoteServiceRequest {

    @XmlElement(name = "RemoteServiceData", required = true)
    protected RemoteServiceData remoteServiceData;
    @XmlAttribute(name = "version")
    protected R36 version;

    /**
     * Gets the value of the remoteServiceData property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteServiceData }
     *     
     */
    public RemoteServiceData getRemoteServiceData() {
        return remoteServiceData;
    }

    /**
     * Sets the value of the remoteServiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteServiceData }
     *     
     */
    public void setRemoteServiceData(RemoteServiceData value) {
        this.remoteServiceData = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link R36 }
     *     
     */
    public R36 getVersion() {
        if (version == null) {
            return R36 .R_36;
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link R36 }
     *     
     */
    public void setVersion(R36 value) {
        this.version = value;
    }

}
