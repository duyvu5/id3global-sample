
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCriminalRecordCheckDisclosureOffenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalCriminalRecordCheckDisclosureOffenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Caution"/&gt;
 *     &lt;enumeration value="Conviction"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalCriminalRecordCheckDisclosureOffenceType")
@XmlEnum
public enum GlobalCriminalRecordCheckDisclosureOffenceType {

    @XmlEnumValue("Caution")
    CAUTION("Caution"),
    @XmlEnumValue("Conviction")
    CONVICTION("Conviction");
    private final String value;

    GlobalCriminalRecordCheckDisclosureOffenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalCriminalRecordCheckDisclosureOffenceType fromValue(String v) {
        for (GlobalCriminalRecordCheckDisclosureOffenceType c: GlobalCriminalRecordCheckDisclosureOffenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
