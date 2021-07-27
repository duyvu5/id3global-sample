
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DownloadDataExtractResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "downloadDataExtractResult"
})
@XmlRootElement(name = "DownloadDataExtractResponse")
public class DownloadDataExtractResponse {

    @XmlElement(name = "DownloadDataExtractResult", required = true)
    protected byte[] downloadDataExtractResult;

    /**
     * Gets the value of the downloadDataExtractResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDownloadDataExtractResult() {
        return downloadDataExtractResult;
    }

    /**
     * Sets the value of the downloadDataExtractResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDownloadDataExtractResult(byte[] value) {
        this.downloadDataExtractResult = value;
    }

}
