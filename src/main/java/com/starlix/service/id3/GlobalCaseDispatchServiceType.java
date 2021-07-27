
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseDispatchServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalCaseDispatchServiceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DVLA"/&gt;
 *     &lt;enumeration value="DisclosureScotland"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalCaseDispatchServiceType")
@XmlEnum
public enum GlobalCaseDispatchServiceType {

    @XmlEnumValue("None")
    NONE("None"),
    DVLA("DVLA"),
    @XmlEnumValue("DisclosureScotland")
    DISCLOSURE_SCOTLAND("DisclosureScotland");
    private final String value;

    GlobalCaseDispatchServiceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalCaseDispatchServiceType fromValue(String v) {
        for (GlobalCaseDispatchServiceType c: GlobalCaseDispatchServiceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
