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
 * &lt;p&gt;Java class for TransactionPriority.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="TransactionPriority"&amp;gt;
 *   &amp;lt;restriction base="{urn:aseXML:r38}Priority"&amp;gt;
 *     &amp;lt;enumeration value="High"/&amp;gt;
 *     &amp;lt;enumeration value="Medium"/&amp;gt;
 *     &amp;lt;enumeration value="Low"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "TransactionPriority")
@XmlEnum(Priority.class)
public enum TransactionPriority {

    @XmlEnumValue("High")
    HIGH(Priority.HIGH),
    @XmlEnumValue("Medium")
    MEDIUM(Priority.MEDIUM),
    @XmlEnumValue("Low")
    LOW(Priority.LOW);
    private final Priority value;

    TransactionPriority(Priority v) {
        value = v;
    }

    public Priority value() {
        return value;
    }

    public static TransactionPriority fromValue(Priority v) {
        for (TransactionPriority c: TransactionPriority.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
