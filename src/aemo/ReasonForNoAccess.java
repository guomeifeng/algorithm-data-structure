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
 * &lt;p&gt;Java class for ReasonForNoAccess.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="ReasonForNoAccess"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Access Overgrown"/&amp;gt;
 *     &amp;lt;enumeration value="Can't Locate Meter"/&amp;gt;
 *     &amp;lt;enumeration value="Damaged Meter"/&amp;gt;
 *     &amp;lt;enumeration value="Dial Out of Alignment"/&amp;gt;
 *     &amp;lt;enumeration value="Dirty Dial"/&amp;gt;
 *     &amp;lt;enumeration value="Gate Locked"/&amp;gt;
 *     &amp;lt;enumeration value="Key Required"/&amp;gt;
 *     &amp;lt;enumeration value="Locked and No Answer"/&amp;gt;
 *     &amp;lt;enumeration value="Meter Changed"/&amp;gt;
 *     &amp;lt;enumeration value="Meter Obstructed"/&amp;gt;
 *     &amp;lt;enumeration value="Meter Removed"/&amp;gt;
 *     &amp;lt;enumeration value="Other"/&amp;gt;
 *     &amp;lt;enumeration value="Refused Access"/&amp;gt;
 *     &amp;lt;enumeration value="Savage Dog"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "ReasonForNoAccess")
@XmlEnum
public enum ReasonForNoAccess {

    @XmlEnumValue("Access Overgrown")
    ACCESS_OVERGROWN("Access Overgrown"),
    @XmlEnumValue("Can't Locate Meter")
    CAN_T_LOCATE_METER("Can't Locate Meter"),
    @XmlEnumValue("Damaged Meter")
    DAMAGED_METER("Damaged Meter"),
    @XmlEnumValue("Dial Out of Alignment")
    DIAL_OUT_OF_ALIGNMENT("Dial Out of Alignment"),
    @XmlEnumValue("Dirty Dial")
    DIRTY_DIAL("Dirty Dial"),
    @XmlEnumValue("Gate Locked")
    GATE_LOCKED("Gate Locked"),
    @XmlEnumValue("Key Required")
    KEY_REQUIRED("Key Required"),
    @XmlEnumValue("Locked and No Answer")
    LOCKED_AND_NO_ANSWER("Locked and No Answer"),
    @XmlEnumValue("Meter Changed")
    METER_CHANGED("Meter Changed"),
    @XmlEnumValue("Meter Obstructed")
    METER_OBSTRUCTED("Meter Obstructed"),
    @XmlEnumValue("Meter Removed")
    METER_REMOVED("Meter Removed"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Refused Access")
    REFUSED_ACCESS("Refused Access"),
    @XmlEnumValue("Savage Dog")
    SAVAGE_DOG("Savage Dog");
    private final String value;

    ReasonForNoAccess(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonForNoAccess fromValue(String v) {
        for (ReasonForNoAccess c: ReasonForNoAccess.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
