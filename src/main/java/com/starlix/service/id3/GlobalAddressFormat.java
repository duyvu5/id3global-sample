
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAddressFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalAddressFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FixedOnly"/&gt;
 *     &lt;enumeration value="FreeOnly"/&gt;
 *     &lt;enumeration value="FixedThenFree"/&gt;
 *     &lt;enumeration value="FreeThenFixed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalAddressFormat")
@XmlEnum
public enum GlobalAddressFormat {

    @XmlEnumValue("FixedOnly")
    FIXED_ONLY("FixedOnly"),
    @XmlEnumValue("FreeOnly")
    FREE_ONLY("FreeOnly"),
    @XmlEnumValue("FixedThenFree")
    FIXED_THEN_FREE("FixedThenFree"),
    @XmlEnumValue("FreeThenFixed")
    FREE_THEN_FIXED("FreeThenFixed");
    private final String value;

    GlobalAddressFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalAddressFormat fromValue(String v) {
        for (GlobalAddressFormat c: GlobalAddressFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
