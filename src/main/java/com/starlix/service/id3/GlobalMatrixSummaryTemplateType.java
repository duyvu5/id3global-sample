
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatrixSummaryTemplateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalMatrixSummaryTemplateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Address"/&gt;
 *     &lt;enumeration value="Cells"/&gt;
 *     &lt;enumeration value="Filter"/&gt;
 *     &lt;enumeration value="Disclosure"/&gt;
 *     &lt;enumeration value="Licence"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalMatrixSummaryTemplateType")
@XmlEnum
public enum GlobalMatrixSummaryTemplateType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("Cells")
    CELLS("Cells"),
    @XmlEnumValue("Filter")
    FILTER("Filter"),
    @XmlEnumValue("Disclosure")
    DISCLOSURE("Disclosure"),
    @XmlEnumValue("Licence")
    LICENCE("Licence");
    private final String value;

    GlobalMatrixSummaryTemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalMatrixSummaryTemplateType fromValue(String v) {
        for (GlobalMatrixSummaryTemplateType c: GlobalMatrixSummaryTemplateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
