//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 12:34:41 PM AEST 
//


package aemo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for GasAgencyApportionmentType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="GasAgencyApportionmentType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="PROR"/&amp;gt;
 *     &amp;lt;enumeration value="PREF"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "GasAgencyApportionmentType")
@XmlEnum
public enum GasAgencyApportionmentType {

    PROR,
    PREF;

    public String value() {
        return name();
    }

    public static GasAgencyApportionmentType fromValue(String v) {
        return valueOf(v);
    }

}
