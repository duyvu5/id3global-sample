
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDVLADrivingLicenceReportCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDVLADrivingLicenceReportCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Full"/&gt;
 *     &lt;enumeration value="Provisional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDVLADrivingLicenceReportCategoryType")
@XmlEnum
public enum GlobalDVLADrivingLicenceReportCategoryType {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Provisional")
    PROVISIONAL("Provisional");
    private final String value;

    GlobalDVLADrivingLicenceReportCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDVLADrivingLicenceReportCategoryType fromValue(String v) {
        for (GlobalDVLADrivingLicenceReportCategoryType c: GlobalDVLADrivingLicenceReportCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
