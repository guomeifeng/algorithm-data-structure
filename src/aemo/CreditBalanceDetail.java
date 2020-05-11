//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose - Network charge record type - "941" - CreditBalanceDetail
 * 
 * &lt;p&gt;Java class for CreditBalanceDetail complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="CreditBalanceDetail"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="InvoiceNumber" type="{urn:aseXML:r38}InvoiceNumber"/&amp;gt;
 *         &amp;lt;element name="NMI" type="{urn:aseXML:r38}NMIWithChecksum"/&amp;gt;
 *         &amp;lt;element name="Amount" type="{urn:aseXML:r38}Amount"/&amp;gt;
 *         &amp;lt;element name="Balance" type="{urn:aseXML:r38}Amount"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditBalanceDetail", propOrder = {
    "invoiceNumber",
    "nmi",
    "amount",
    "balance"
})
public class CreditBalanceDetail {

    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "NMI", required = true)
    protected NMIWithChecksum nmi;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Balance", required = true)
    protected BigDecimal balance;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link NMIWithChecksum }
     *     
     */
    public NMIWithChecksum getNMI() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NMIWithChecksum }
     *     
     */
    public void setNMI(NMIWithChecksum value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

}
