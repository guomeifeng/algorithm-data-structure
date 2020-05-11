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
 * 
 * Purpose - Parameter definition for reports requiring only the settlement case identifier
 * Report Names - SettlementAggregatedData, SettlementNonAggregatedData, SettlementProfileShape
 * MSATS Reports - RM23, RM24, RM25 
 * Detail - Note that the same report parameters type can be used for several reports since they all use the
 * same parameters. It is thus the report name that will indicate what output will be produced.
 * 			
 * 
 * &lt;p&gt;Java class for MDMTSettlementCaseDataReportParameters complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MDMTSettlementCaseDataReportParameters"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{urn:aseXML:r38}BaseReportParameters"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="SettlementCase" type="{urn:aseXML:r38}MDMSettlementCaseIdentifier"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDMTSettlementCaseDataReportParameters", propOrder = {
    "settlementCase"
})
public class MDMTSettlementCaseDataReportParameters
    extends BaseReportParameters
{

    @XmlElement(name = "SettlementCase", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger settlementCase;

    /**
     * Gets the value of the settlementCase property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSettlementCase() {
        return settlementCase;
    }

    /**
     * Sets the value of the settlementCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSettlementCase(BigInteger value) {
        this.settlementCase = value;
    }

}
