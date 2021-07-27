
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalMatch"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="Match"/&gt;
 *     &lt;enumeration value="Mismatch"/&gt;
 *     &lt;enumeration value="Nomatch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalMatch")
@XmlEnum
public enum GlobalMatch {

    NA("NA"),
    @XmlEnumValue("Match")
    MATCH("Match"),
    @XmlEnumValue("Mismatch")
    MISMATCH("Mismatch"),
    @XmlEnumValue("Nomatch")
    NOMATCH("Nomatch");
    private final String value;

    GlobalMatch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalMatch fromValue(String v) {
        for (GlobalMatch c: GlobalMatch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
