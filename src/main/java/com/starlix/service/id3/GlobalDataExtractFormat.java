
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDataExtractFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDataExtractFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSV"/&gt;
 *     &lt;enumeration value="TSV"/&gt;
 *     &lt;enumeration value="EXCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDataExtractFormat")
@XmlEnum
public enum GlobalDataExtractFormat {

    CSV,
    TSV,
    EXCEL;

    public String value() {
        return name();
    }

    public static GlobalDataExtractFormat fromValue(String v) {
        return valueOf(v);
    }

}
