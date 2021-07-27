
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalScoringMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalScoringMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Enhanced"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalScoringMethod")
@XmlEnum
public enum GlobalScoringMethod {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Enhanced")
    ENHANCED("Enhanced");
    private final String value;

    GlobalScoringMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalScoringMethod fromValue(String v) {
        for (GlobalScoringMethod c: GlobalScoringMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
