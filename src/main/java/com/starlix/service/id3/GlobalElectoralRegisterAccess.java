
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalElectoralRegisterAccess.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalElectoralRegisterAccess"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Edited"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalElectoralRegisterAccess")
@XmlEnum
public enum GlobalElectoralRegisterAccess {

    @XmlEnumValue("Edited")
    EDITED("Edited"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    GlobalElectoralRegisterAccess(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalElectoralRegisterAccess fromValue(String v) {
        for (GlobalElectoralRegisterAccess c: GlobalElectoralRegisterAccess.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
