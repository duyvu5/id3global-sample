
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalPermission.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalPermission"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Read"/&gt;
 *     &lt;enumeration value="Execute"/&gt;
 *     &lt;enumeration value="Manage"/&gt;
 *     &lt;enumeration value="Full"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalPermission")
@XmlEnum
public enum GlobalPermission {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Execute")
    EXECUTE("Execute"),
    @XmlEnumValue("Manage")
    MANAGE("Manage"),
    @XmlEnumValue("Full")
    FULL("Full");
    private final String value;

    GlobalPermission(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalPermission fromValue(String v) {
        for (GlobalPermission c: GlobalPermission.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
