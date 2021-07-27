
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCurrentTime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalCurrentTime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Years5Plus"/&gt;
 *     &lt;enumeration value="Years2to5"/&gt;
 *     &lt;enumeration value="Years0to2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalCurrentTime")
@XmlEnum
public enum GlobalCurrentTime {

    @XmlEnumValue("Years5Plus")
    YEARS_5_PLUS("Years5Plus"),
    @XmlEnumValue("Years2to5")
    YEARS_2_TO_5("Years2to5"),
    @XmlEnumValue("Years0to2")
    YEARS_0_TO_2("Years0to2");
    private final String value;

    GlobalCurrentTime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalCurrentTime fromValue(String v) {
        for (GlobalCurrentTime c: GlobalCurrentTime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
