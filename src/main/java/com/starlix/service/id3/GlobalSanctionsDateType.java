
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSanctionsDateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalSanctionsDateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Birth"/&gt;
 *     &lt;enumeration value="Death"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalSanctionsDateType")
@XmlEnum
public enum GlobalSanctionsDateType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Birth")
    BIRTH("Birth"),
    @XmlEnumValue("Death")
    DEATH("Death");
    private final String value;

    GlobalSanctionsDateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalSanctionsDateType fromValue(String v) {
        for (GlobalSanctionsDateType c: GlobalSanctionsDateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
