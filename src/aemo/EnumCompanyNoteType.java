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
 * &lt;p&gt;Java class for EnumCompanyNoteType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EnumCompanyNoteType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="40"/&amp;gt;
 *     &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *     &amp;lt;enumeration value="Effect On System / Work Details"/&amp;gt;
 *     &amp;lt;enumeration value="Contingency Plan"/&amp;gt;
 *     &amp;lt;enumeration value="Issue Response"/&amp;gt;
 *     &amp;lt;enumeration value="Pre-Requisite Switching"/&amp;gt;
 *     &amp;lt;enumeration value="Limit Equation Data"/&amp;gt;
 *     &amp;lt;enumeration value="Isolation Points"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EnumCompanyNoteType")
@XmlEnum
public enum EnumCompanyNoteType {

    @XmlEnumValue("Effect On System / Work Details")
    EFFECT_ON_SYSTEM_WORK_DETAILS("Effect On System / Work Details"),
    @XmlEnumValue("Contingency Plan")
    CONTINGENCY_PLAN("Contingency Plan"),
    @XmlEnumValue("Issue Response")
    ISSUE_RESPONSE("Issue Response"),
    @XmlEnumValue("Pre-Requisite Switching")
    PRE_REQUISITE_SWITCHING("Pre-Requisite Switching"),
    @XmlEnumValue("Limit Equation Data")
    LIMIT_EQUATION_DATA("Limit Equation Data"),
    @XmlEnumValue("Isolation Points")
    ISOLATION_POINTS("Isolation Points");
    private final String value;

    EnumCompanyNoteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumCompanyNoteType fromValue(String v) {
        for (EnumCompanyNoteType c: EnumCompanyNoteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
