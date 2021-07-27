
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDocumentSubmissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDocumentSubmissionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Author"/&gt;
 *     &lt;enumeration value="Applicant"/&gt;
 *     &lt;enumeration value="InPossesion"/&gt;
 *     &lt;enumeration value="PostOffice"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDocumentSubmissionType")
@XmlEnum
public enum GlobalDocumentSubmissionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Author")
    AUTHOR("Author"),
    @XmlEnumValue("Applicant")
    APPLICANT("Applicant"),
    @XmlEnumValue("InPossesion")
    IN_POSSESION("InPossesion"),
    @XmlEnumValue("PostOffice")
    POST_OFFICE("PostOffice");
    private final String value;

    GlobalDocumentSubmissionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDocumentSubmissionType fromValue(String v) {
        for (GlobalDocumentSubmissionType c: GlobalDocumentSubmissionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
