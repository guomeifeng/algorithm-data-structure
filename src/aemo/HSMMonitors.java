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
 * &lt;p&gt;Java class for HSMMonitors.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="HSMMonitors"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="RollCall"/&amp;gt;
 *     &amp;lt;enumeration value="ContinuousCapability"/&amp;gt;
 *     &amp;lt;enumeration value="TriggeredCapability"/&amp;gt;
 *     &amp;lt;enumeration value="WaveformCapability"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "HSMMonitors")
@XmlEnum
public enum HSMMonitors {

    @XmlEnumValue("RollCall")
    ROLL_CALL("RollCall"),
    @XmlEnumValue("ContinuousCapability")
    CONTINUOUS_CAPABILITY("ContinuousCapability"),
    @XmlEnumValue("TriggeredCapability")
    TRIGGERED_CAPABILITY("TriggeredCapability"),
    @XmlEnumValue("WaveformCapability")
    WAVEFORM_CAPABILITY("WaveformCapability");
    private final String value;

    HSMMonitors(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HSMMonitors fromValue(String v) {
        for (HSMMonitors c: HSMMonitors.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
