
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDIVData.GlobalDocumentExtractedStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="GlobalDIVData.GlobalDocumentExtractedStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UnknownDocument"/&gt;
 *     &lt;enumeration value="LowQualityImage"/&gt;
 *     &lt;enumeration value="UnableToProcess"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalDIVData.GlobalDocumentExtractedStatus")
@XmlEnum
public enum GlobalDIVDataGlobalDocumentExtractedStatus {

    @XmlEnumValue("UnknownDocument")
    UNKNOWN_DOCUMENT("UnknownDocument"),
    @XmlEnumValue("LowQualityImage")
    LOW_QUALITY_IMAGE("LowQualityImage"),
    @XmlEnumValue("UnableToProcess")
    UNABLE_TO_PROCESS("UnableToProcess"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress");
    private final String value;

    GlobalDIVDataGlobalDocumentExtractedStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalDIVDataGlobalDocumentExtractedStatus fromValue(String v) {
        for (GlobalDIVDataGlobalDocumentExtractedStatus c: GlobalDIVDataGlobalDocumentExtractedStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
