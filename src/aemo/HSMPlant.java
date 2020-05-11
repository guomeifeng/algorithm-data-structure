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
 * &lt;p&gt;Java class for HSMPlant.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="HSMPlant"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="Bus"/&amp;gt;
 *     &amp;lt;enumeration value="Generator"/&amp;gt;
 *     &amp;lt;enumeration value="Load"/&amp;gt;
 *     &amp;lt;enumeration value="Region"/&amp;gt;
 *     &amp;lt;enumeration value="Shunt"/&amp;gt;
 *     &amp;lt;enumeration value="Station"/&amp;gt;
 *     &amp;lt;enumeration value="Static VAR Compensator"/&amp;gt;
 *     &amp;lt;enumeration value="Switch"/&amp;gt;
 *     &amp;lt;enumeration value="Transformer"/&amp;gt;
 *     &amp;lt;enumeration value="Transmission Line"/&amp;gt;
 *     &amp;lt;enumeration value="Zero Impedance Branch"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "HSMPlant")
@XmlEnum
public enum HSMPlant {

    @XmlEnumValue("Bus")
    BUS("Bus"),
    @XmlEnumValue("Generator")
    GENERATOR("Generator"),
    @XmlEnumValue("Load")
    LOAD("Load"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("Shunt")
    SHUNT("Shunt"),
    @XmlEnumValue("Station")
    STATION("Station"),
    @XmlEnumValue("Static VAR Compensator")
    STATIC_VAR_COMPENSATOR("Static VAR Compensator"),
    @XmlEnumValue("Switch")
    SWITCH("Switch"),
    @XmlEnumValue("Transformer")
    TRANSFORMER("Transformer"),
    @XmlEnumValue("Transmission Line")
    TRANSMISSION_LINE("Transmission Line"),
    @XmlEnumValue("Zero Impedance Branch")
    ZERO_IMPEDANCE_BRANCH("Zero Impedance Branch");
    private final String value;

    HSMPlant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HSMPlant fromValue(String v) {
        for (HSMPlant c: HSMPlant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
