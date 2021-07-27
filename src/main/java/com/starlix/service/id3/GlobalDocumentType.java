
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDocumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDocumentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Passport"/&gt;
 *     &lt;enumeration value="DrivingLicence"/&gt;
 *     &lt;enumeration value="IDCard"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDocumentType")
@XmlEnum
public enum GlobalDocumentType {

    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("DrivingLicence")
    DRIVING_LICENCE("DrivingLicence"),
    @XmlEnumValue("IDCard")
    ID_CARD("IDCard"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    GlobalDocumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDocumentType fromValue(String v) {
        for (GlobalDocumentType c: GlobalDocumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
