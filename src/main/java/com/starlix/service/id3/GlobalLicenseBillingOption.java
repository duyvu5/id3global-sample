
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalLicenseBillingOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalLicenseBillingOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Enterprise"/&gt;
 *     &lt;enumeration value="Evaluation"/&gt;
 *     &lt;enumeration value="MidMarket"/&gt;
 *     &lt;enumeration value="NewStart"/&gt;
 *     &lt;enumeration value="TrialFee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalLicenseBillingOption")
@XmlEnum
public enum GlobalLicenseBillingOption {

    @XmlEnumValue("Enterprise")
    ENTERPRISE("Enterprise"),
    @XmlEnumValue("Evaluation")
    EVALUATION("Evaluation"),
    @XmlEnumValue("MidMarket")
    MID_MARKET("MidMarket"),
    @XmlEnumValue("NewStart")
    NEW_START("NewStart"),
    @XmlEnumValue("TrialFee")
    TRIAL_FEE("TrialFee");
    private final String value;

    GlobalLicenseBillingOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalLicenseBillingOption fromValue(String v) {
        for (GlobalLicenseBillingOption c: GlobalLicenseBillingOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
