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
 * &lt;p&gt;Java class for AustralianFlatOrUnitType.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="AustralianFlatOrUnitType"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;maxLength value="4"/&amp;gt;
 *     &amp;lt;enumeration value="ANT"/&amp;gt;
 *     &amp;lt;enumeration value="APT"/&amp;gt;
 *     &amp;lt;enumeration value="ATM"/&amp;gt;
 *     &amp;lt;enumeration value="BBQ"/&amp;gt;
 *     &amp;lt;enumeration value="BLCK"/&amp;gt;
 *     &amp;lt;enumeration value="BTSD"/&amp;gt;
 *     &amp;lt;enumeration value="BLDG"/&amp;gt;
 *     &amp;lt;enumeration value="BNGW"/&amp;gt;
 *     &amp;lt;enumeration value="CAGE"/&amp;gt;
 *     &amp;lt;enumeration value="CARP"/&amp;gt;
 *     &amp;lt;enumeration value="CARS"/&amp;gt;
 *     &amp;lt;enumeration value="CLUB"/&amp;gt;
 *     &amp;lt;enumeration value="COOL"/&amp;gt;
 *     &amp;lt;enumeration value="CTGE"/&amp;gt;
 *     &amp;lt;enumeration value="DUP"/&amp;gt;
 *     &amp;lt;enumeration value="F"/&amp;gt;
 *     &amp;lt;enumeration value="FY"/&amp;gt;
 *     &amp;lt;enumeration value="GRGE"/&amp;gt;
 *     &amp;lt;enumeration value="HALL"/&amp;gt;
 *     &amp;lt;enumeration value="HSE"/&amp;gt;
 *     &amp;lt;enumeration value="KSK"/&amp;gt;
 *     &amp;lt;enumeration value="LBBY"/&amp;gt;
 *     &amp;lt;enumeration value="LOFT"/&amp;gt;
 *     &amp;lt;enumeration value="LOT"/&amp;gt;
 *     &amp;lt;enumeration value="LSE"/&amp;gt;
 *     &amp;lt;enumeration value="MSNT"/&amp;gt;
 *     &amp;lt;enumeration value="MB"/&amp;gt;
 *     &amp;lt;enumeration value="OFF"/&amp;gt;
 *     &amp;lt;enumeration value="PTHS"/&amp;gt;
 *     &amp;lt;enumeration value="REAR"/&amp;gt;
 *     &amp;lt;enumeration value="RESV"/&amp;gt;
 *     &amp;lt;enumeration value="RM"/&amp;gt;
 *     &amp;lt;enumeration value="SE"/&amp;gt;
 *     &amp;lt;enumeration value="SEC"/&amp;gt;
 *     &amp;lt;enumeration value="SHED"/&amp;gt;
 *     &amp;lt;enumeration value="SHOP"/&amp;gt;
 *     &amp;lt;enumeration value="SHRM"/&amp;gt;
 *     &amp;lt;enumeration value="SIGN"/&amp;gt;
 *     &amp;lt;enumeration value="SITE"/&amp;gt;
 *     &amp;lt;enumeration value="SL"/&amp;gt;
 *     &amp;lt;enumeration value="STOR"/&amp;gt;
 *     &amp;lt;enumeration value="STR"/&amp;gt;
 *     &amp;lt;enumeration value="STU"/&amp;gt;
 *     &amp;lt;enumeration value="SUBS"/&amp;gt;
 *     &amp;lt;enumeration value="TNCY"/&amp;gt;
 *     &amp;lt;enumeration value="TNHS"/&amp;gt;
 *     &amp;lt;enumeration value="TWR"/&amp;gt;
 *     &amp;lt;enumeration value="U"/&amp;gt;
 *     &amp;lt;enumeration value="VLLA"/&amp;gt;
 *     &amp;lt;enumeration value="VLT"/&amp;gt;
 *     &amp;lt;enumeration value="WARD"/&amp;gt;
 *     &amp;lt;enumeration value="WE"/&amp;gt;
 *     &amp;lt;enumeration value="WKSH"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "AustralianFlatOrUnitType")
@XmlEnum
public enum AustralianFlatOrUnitType {

    ANT,
    APT,
    ATM,
    BBQ,
    BLCK,
    BTSD,
    BLDG,
    BNGW,
    CAGE,
    CARP,
    CARS,
    CLUB,
    COOL,
    CTGE,
    DUP,
    F,
    FY,
    GRGE,
    HALL,
    HSE,
    KSK,
    LBBY,
    LOFT,
    LOT,
    LSE,
    MSNT,
    MB,
    OFF,
    PTHS,
    REAR,
    RESV,
    RM,
    SE,
    SEC,
    SHED,
    SHOP,
    SHRM,
    SIGN,
    SITE,
    SL,
    STOR,
    STR,
    STU,
    SUBS,
    TNCY,
    TNHS,
    TWR,
    U,
    VLLA,
    VLT,
    WARD,
    WE,
    WKSH;

    public String value() {
        return name();
    }

    public static AustralianFlatOrUnitType fromValue(String v) {
        return valueOf(v);
    }

}
