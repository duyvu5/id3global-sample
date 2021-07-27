
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatrixMatchReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalMatrixMatchReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="InsufficientDataMatches"/&gt;
 *     &lt;enumeration value="InvalidDetails"/&gt;
 *     &lt;enumeration value="DataMatchAlert"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalMatrixMatchReason")
@XmlEnum
public enum GlobalMatrixMatchReason {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("InsufficientDataMatches")
    INSUFFICIENT_DATA_MATCHES("InsufficientDataMatches"),
    @XmlEnumValue("InvalidDetails")
    INVALID_DETAILS("InvalidDetails"),
    @XmlEnumValue("DataMatchAlert")
    DATA_MATCH_ALERT("DataMatchAlert");
    private final String value;

    GlobalMatrixMatchReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalMatrixMatchReason fromValue(String v) {
        for (GlobalMatrixMatchReason c: GlobalMatrixMatchReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
