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
 * &lt;p&gt;Java class for EnergyMarket.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="EnergyMarket"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="AATELEC"/&amp;gt;
 *     &amp;lt;enumeration value="ACTELEC"/&amp;gt;
 *     &amp;lt;enumeration value="NEM"/&amp;gt;
 *     &amp;lt;enumeration value="NSWELEC"/&amp;gt;
 *     &amp;lt;enumeration value="NTELEC"/&amp;gt;
 *     &amp;lt;enumeration value="QLDELEC"/&amp;gt;
 *     &amp;lt;enumeration value="SAELEC"/&amp;gt;
 *     &amp;lt;enumeration value="TASELEC"/&amp;gt;
 *     &amp;lt;enumeration value="VICELEC"/&amp;gt;
 *     &amp;lt;enumeration value="WAELEC"/&amp;gt;
 *     &amp;lt;enumeration value="AATGAS"/&amp;gt;
 *     &amp;lt;enumeration value="ACTGAS"/&amp;gt;
 *     &amp;lt;enumeration value="NSWGAS"/&amp;gt;
 *     &amp;lt;enumeration value="NTGAS"/&amp;gt;
 *     &amp;lt;enumeration value="QLDGAS"/&amp;gt;
 *     &amp;lt;enumeration value="SAGAS"/&amp;gt;
 *     &amp;lt;enumeration value="TASGAS"/&amp;gt;
 *     &amp;lt;enumeration value="VICGAS"/&amp;gt;
 *     &amp;lt;enumeration value="WAGAS"/&amp;gt;
 *     &amp;lt;enumeration value="NSWACTGAS"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "EnergyMarket")
@XmlEnum
public enum EnergyMarket {

    AATELEC,
    ACTELEC,
    NEM,
    NSWELEC,
    NTELEC,
    QLDELEC,
    SAELEC,
    TASELEC,
    VICELEC,
    WAELEC,
    AATGAS,
    ACTGAS,
    NSWGAS,
    NTGAS,
    QLDGAS,
    SAGAS,
    TASGAS,
    VICGAS,
    WAGAS,
    NSWACTGAS;

    public String value() {
        return name();
    }

    public static EnergyMarket fromValue(String v) {
        return valueOf(v);
    }

}
