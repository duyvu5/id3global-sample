
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
 *         &lt;element name="GetDataExtractResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "getDataExtractResult"
})
@XmlRootElement(name = "GetDataExtractResponse")
public class GetDataExtractResponse {

    @XmlElement(name = "GetDataExtractResult", required = true)
    protected byte[] getDataExtractResult;

    /**
     * Gets the value of the getDataExtractResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetDataExtractResult() {
        return getDataExtractResult;
    }

    /**
     * Sets the value of the getDataExtractResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetDataExtractResult(byte[] value) {
        this.getDataExtractResult = value;
    }

}
