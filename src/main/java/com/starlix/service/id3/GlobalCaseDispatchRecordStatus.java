
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseDispatchRecordStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalCaseDispatchRecordStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sent"/&gt;
 *     &lt;enumeration value="ResendConfirmationRequired"/&gt;
 *     &lt;enumeration value="ProcessResend"/&gt;
 *     &lt;enumeration value="Resent"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalCaseDispatchRecordStatus")
@XmlEnum
public enum GlobalCaseDispatchRecordStatus {

    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("ResendConfirmationRequired")
    RESEND_CONFIRMATION_REQUIRED("ResendConfirmationRequired"),
    @XmlEnumValue("ProcessResend")
    PROCESS_RESEND("ProcessResend"),
    @XmlEnumValue("Resent")
    RESENT("Resent"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    GlobalCaseDispatchRecordStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalCaseDispatchRecordStatus fromValue(String v) {
        for (GlobalCaseDispatchRecordStatus c: GlobalCaseDispatchRecordStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
