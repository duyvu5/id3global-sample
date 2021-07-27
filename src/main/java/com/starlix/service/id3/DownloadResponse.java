
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
 *         &lt;element name="DownloadResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "downloadResult"
})
@XmlRootElement(name = "DownloadResponse")
public class DownloadResponse {

    @XmlElement(name = "DownloadResult", required = true)
    protected byte[] downloadResult;

    /**
     * Gets the value of the downloadResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDownloadResult() {
        return downloadResult;
    }

    /**
     * Sets the value of the downloadResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDownloadResult(byte[] value) {
        this.downloadResult = value;
    }

}
