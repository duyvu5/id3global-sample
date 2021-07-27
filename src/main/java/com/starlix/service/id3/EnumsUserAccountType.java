
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enums.UserAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Enums.UserAccountType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Expired"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Enums.UserAccountType", namespace = "http://schemas.datacontract.org/2004/07/GlobalCheck.UserAccountLib.Common")
@XmlEnum
public enum EnumsUserAccountType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Expired")
    EXPIRED("Expired");
    private final String value;

    EnumsUserAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumsUserAccountType fromValue(String v) {
        for (EnumsUserAccountType c: EnumsUserAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
