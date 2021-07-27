
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDataExtractState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDataExtractState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Scheduled"/&gt;
 *     &lt;enumeration value="Ready"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDataExtractState")
@XmlEnum
public enum GlobalDataExtractState {

    @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"),
    @XmlEnumValue("Ready")
    READY("Ready"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled");
    private final String value;

    GlobalDataExtractState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDataExtractState fromValue(String v) {
        for (GlobalDataExtractState c: GlobalDataExtractState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
