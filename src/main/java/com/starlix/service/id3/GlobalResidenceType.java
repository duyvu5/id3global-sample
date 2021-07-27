
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalResidenceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalResidenceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HomeOwnerOutright"/&gt;
 *     &lt;enumeration value="HomeOwnerMortgage"/&gt;
 *     &lt;enumeration value="Tenant"/&gt;
 *     &lt;enumeration value="LivingWithRelatives"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalResidenceType")
@XmlEnum
public enum GlobalResidenceType {

    @XmlEnumValue("HomeOwnerOutright")
    HOME_OWNER_OUTRIGHT("HomeOwnerOutright"),
    @XmlEnumValue("HomeOwnerMortgage")
    HOME_OWNER_MORTGAGE("HomeOwnerMortgage"),
    @XmlEnumValue("Tenant")
    TENANT("Tenant"),
    @XmlEnumValue("LivingWithRelatives")
    LIVING_WITH_RELATIVES("LivingWithRelatives");
    private final String value;

    GlobalResidenceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalResidenceType fromValue(String v) {
        for (GlobalResidenceType c: GlobalResidenceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
