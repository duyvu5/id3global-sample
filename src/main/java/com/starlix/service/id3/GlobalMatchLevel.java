
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatchLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalMatchLevel"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="Level1"/&gt;
 *     &lt;enumeration value="Enhanced"/&gt;
 *     &lt;enumeration value="Advanced"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalMatchLevel")
@XmlEnum
public enum GlobalMatchLevel {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Level1")
    LEVEL_1("Level1"),
    @XmlEnumValue("Enhanced")
    ENHANCED("Enhanced"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced");
    private final String value;

    GlobalMatchLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalMatchLevel fromValue(String v) {
        for (GlobalMatchLevel c: GlobalMatchLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
