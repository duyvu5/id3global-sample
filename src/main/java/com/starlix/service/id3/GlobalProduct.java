
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalProduct.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalProduct"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ID3check"/&gt;
 *     &lt;enumeration value="URU"/&gt;
 *     &lt;enumeration value="ID3global"/&gt;
 *     &lt;enumeration value="KYP"/&gt;
 *     &lt;enumeration value="LiteIDV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalProduct")
@XmlEnum
public enum GlobalProduct {

    @XmlEnumValue("ID3check")
    ID_3_CHECK("ID3check"),
    URU("URU"),
    @XmlEnumValue("ID3global")
    ID_3_GLOBAL("ID3global"),
    KYP("KYP"),
    @XmlEnumValue("LiteIDV")
    LITE_IDV("LiteIDV");
    private final String value;

    GlobalProduct(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalProduct fromValue(String v) {
        for (GlobalProduct c: GlobalProduct.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
