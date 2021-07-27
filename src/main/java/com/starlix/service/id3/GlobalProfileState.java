
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalProfileState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalProfileState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Test"/&gt;
 *     &lt;enumeration value="PreEffective"/&gt;
 *     &lt;enumeration value="Effective"/&gt;
 *     &lt;enumeration value="Retired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalProfileState")
@XmlEnum
public enum GlobalProfileState {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("PreEffective")
    PRE_EFFECTIVE("PreEffective"),
    @XmlEnumValue("Effective")
    EFFECTIVE("Effective"),
    @XmlEnumValue("Retired")
    RETIRED("Retired");
    private final String value;

    GlobalProfileState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalProfileState fromValue(String v) {
        for (GlobalProfileState c: GlobalProfileState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
