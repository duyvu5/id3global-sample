
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDispatchReportStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDispatchReportStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Clear"/&gt;
 *     &lt;enumeration value="Unclear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDispatchReportStatus")
@XmlEnum
public enum GlobalDispatchReportStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Clear")
    CLEAR("Clear"),
    @XmlEnumValue("Unclear")
    UNCLEAR("Unclear");
    private final String value;

    GlobalDispatchReportStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDispatchReportStatus fromValue(String v) {
        for (GlobalDispatchReportStatus c: GlobalDispatchReportStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
