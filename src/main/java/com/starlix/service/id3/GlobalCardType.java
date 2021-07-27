
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCardType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalCardType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="MASTERCARD"/&gt;
 *     &lt;enumeration value="DELTA"/&gt;
 *     &lt;enumeration value="SWITCH"/&gt;
 *     &lt;enumeration value="AMEX"/&gt;
 *     &lt;enumeration value="JCB"/&gt;
 *     &lt;enumeration value="MAESTRO"/&gt;
 *     &lt;enumeration value="DINERS"/&gt;
 *     &lt;enumeration value="ELECTRON"/&gt;
 *     &lt;enumeration value="SOLO"/&gt;
 *     &lt;enumeration value="CARTEBANCAIRE"/&gt;
 *     &lt;enumeration value="CARTEBLEUE"/&gt;
 *     &lt;enumeration value="LASER"/&gt;
 *     &lt;enumeration value="DISCOVER"/&gt;
 *     &lt;enumeration value="DANKORT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalCardType")
@XmlEnum
public enum GlobalCardType {

    VISA,
    MASTERCARD,
    DELTA,
    SWITCH,
    AMEX,
    JCB,
    MAESTRO,
    DINERS,
    ELECTRON,
    SOLO,
    CARTEBANCAIRE,
    CARTEBLEUE,
    LASER,
    DISCOVER,
    DANKORT;

    public String value() {
        return name();
    }

    public static GlobalCardType fromValue(String v) {
        return valueOf(v);
    }

}
