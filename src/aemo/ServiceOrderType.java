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
 * &lt;p&gt;Java class for ServiceOrderType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ServiceOrderType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Re-energisation"/&amp;gt;
 *     &amp;lt;enumeration value="De-energisation"/&amp;gt;
 *     &amp;lt;enumeration value="Special Read"/&amp;gt;
 *     &amp;lt;enumeration value="Miscellaneous"/&amp;gt;
 *     &amp;lt;enumeration value="Metering Service Works"/&amp;gt;
 *     &amp;lt;enumeration value="Supply Service Works"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ServiceOrderType")
@XmlEnum
public enum ServiceOrderType {

    @XmlEnumValue("Re-energisation")
    RE_ENERGISATION("Re-energisation"),
    @XmlEnumValue("De-energisation")
    DE_ENERGISATION("De-energisation"),
    @XmlEnumValue("Special Read")
    SPECIAL_READ("Special Read"),
    @XmlEnumValue("Miscellaneous")
    MISCELLANEOUS("Miscellaneous"),
    @XmlEnumValue("Metering Service Works")
    METERING_SERVICE_WORKS("Metering Service Works"),
    @XmlEnumValue("Supply Service Works")
    SUPPLY_SERVICE_WORKS("Supply Service Works");
    private final String value;

    ServiceOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceOrderType fromValue(String v) {
        for (ServiceOrderType c: ServiceOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
