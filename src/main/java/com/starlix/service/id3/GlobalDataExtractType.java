
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDataExtractType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDataExtractType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UserDefined"/&gt;
 *     &lt;enumeration value="Day"/&gt;
 *     &lt;enumeration value="Week"/&gt;
 *     &lt;enumeration value="Fortnight"/&gt;
 *     &lt;enumeration value="Month"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDataExtractType")
@XmlEnum
public enum GlobalDataExtractType {

    @XmlEnumValue("UserDefined")
    USER_DEFINED("UserDefined"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("Fortnight")
    FORTNIGHT("Fortnight"),
    @XmlEnumValue("Month")
    MONTH("Month");
    private final String value;

    GlobalDataExtractType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDataExtractType fromValue(String v) {
        for (GlobalDataExtractType c: GlobalDataExtractType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
