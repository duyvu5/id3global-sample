
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
 *         &lt;element name="GetDocumentExtractResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getDocumentExtractResult"
})
@XmlRootElement(name = "GetDocumentExtractResponse")
public class GetDocumentExtractResponse {

    @XmlElement(name = "GetDocumentExtractResult", required = true)
    protected byte[] getDocumentExtractResult;

    /**
     * Gets the value of the getDocumentExtractResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetDocumentExtractResult() {
        return getDocumentExtractResult;
    }

    /**
     * Sets the value of the getDocumentExtractResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetDocumentExtractResult(byte[] value) {
        this.getDocumentExtractResult = value;
    }

}
