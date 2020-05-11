//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SpecialReadReasonCode.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="SpecialReadReasonCode"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Account Investigation"/&amp;gt;
 *     &amp;lt;enumeration value="Final Read"/&amp;gt;
 *     &amp;lt;enumeration value="Final Read for Disconnection on Non-Payment"/&amp;gt;
 *     &amp;lt;enumeration value="Final and Opening Read"/&amp;gt;
 *     &amp;lt;enumeration value="Opening Read"/&amp;gt;
 *     &amp;lt;enumeration value="Change of Retailer"/&amp;gt;
 *     &amp;lt;enumeration value="Change of Customer"/&amp;gt;
 *     &amp;lt;enumeration value="Check Read"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *     &amp;lt;enumeration value="Sticker Removed"/&amp;gt;
 *     &amp;lt;enumeration value="Final Read Stickered"/&amp;gt;
 *     &amp;lt;enumeration value="Read Following Disconnection for Non-Payment"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "SpecialReadReasonCode")
@XmlEnum
public enum SpecialReadReasonCode {

    @XmlEnumValue("Account Investigation")
    ACCOUNT_INVESTIGATION("Account Investigation"),
    @XmlEnumValue("Final Read")
    FINAL_READ("Final Read"),
    @XmlEnumValue("Final Read for Disconnection on Non-Payment")
    FINAL_READ_FOR_DISCONNECTION_ON_NON_PAYMENT("Final Read for Disconnection on Non-Payment"),
    @XmlEnumValue("Final and Opening Read")
    FINAL_AND_OPENING_READ("Final and Opening Read"),
    @XmlEnumValue("Opening Read")
    OPENING_READ("Opening Read"),
    @XmlEnumValue("Change of Retailer")
    CHANGE_OF_RETAILER("Change of Retailer"),
    @XmlEnumValue("Change of Customer")
    CHANGE_OF_CUSTOMER("Change of Customer"),
    @XmlEnumValue("Check Read")
    CHECK_READ("Check Read"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Sticker Removed")
    STICKER_REMOVED("Sticker Removed"),
    @XmlEnumValue("Final Read Stickered")
    FINAL_READ_STICKERED("Final Read Stickered"),
    @XmlEnumValue("Read Following Disconnection for Non-Payment")
    READ_FOLLOWING_DISCONNECTION_FOR_NON_PAYMENT("Read Following Disconnection for Non-Payment");
    private final String value;

    SpecialReadReasonCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialReadReasonCode fromValue(String v) {
        for (SpecialReadReasonCode c: SpecialReadReasonCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
