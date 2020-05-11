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
 * &lt;p&gt;Java class for EnumScopeOfWorkType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EnumScopeOfWorkType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="25"/&amp;gt;
 *     &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *     &amp;lt;enumeration value="Line"/&amp;gt;
 *     &amp;lt;enumeration value="Substn"/&amp;gt;
 *     &amp;lt;enumeration value="Line/Substn"/&amp;gt;
 *     &amp;lt;enumeration value="Live Line"/&amp;gt;
 *     &amp;lt;enumeration value="Live Substn"/&amp;gt;
 *     &amp;lt;enumeration value="Live Line/Substn"/&amp;gt;
 *     &amp;lt;enumeration value="Protection"/&amp;gt;
 *     &amp;lt;enumeration value="SCADA"/&amp;gt;
 *     &amp;lt;enumeration value="Communications"/&amp;gt;
 *     &amp;lt;enumeration value="Other secondary equipt"/&amp;gt;
 *     &amp;lt;enumeration value="Auto Control Scheme"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EnumScopeOfWorkType")
@XmlEnum
public enum EnumScopeOfWorkType {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Substn")
    SUBSTN("Substn"),
    @XmlEnumValue("Line/Substn")
    LINE_SUBSTN("Line/Substn"),
    @XmlEnumValue("Live Line")
    LIVE_LINE("Live Line"),
    @XmlEnumValue("Live Substn")
    LIVE_SUBSTN("Live Substn"),
    @XmlEnumValue("Live Line/Substn")
    LIVE_LINE_SUBSTN("Live Line/Substn"),
    @XmlEnumValue("Protection")
    PROTECTION("Protection"),
    SCADA("SCADA"),
    @XmlEnumValue("Communications")
    COMMUNICATIONS("Communications"),
    @XmlEnumValue("Other secondary equipt")
    OTHER_SECONDARY_EQUIPT("Other secondary equipt"),
    @XmlEnumValue("Auto Control Scheme")
    AUTO_CONTROL_SCHEME("Auto Control Scheme"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EnumScopeOfWorkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumScopeOfWorkType fromValue(String v) {
        for (EnumScopeOfWorkType c: EnumScopeOfWorkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
