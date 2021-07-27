
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetDocImageMinSizeKBytesResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
    "getDocImageMinSizeKBytesResult"
})
@XmlRootElement(name = "GetDocImageMinSizeKBytesResponse")
public class GetDocImageMinSizeKBytesResponse {

    @XmlElement(name = "GetDocImageMinSizeKBytesResult")
    @XmlSchemaType(name = "unsignedInt")
    protected Long getDocImageMinSizeKBytesResult;

    /**
     * Gets the value of the getDocImageMinSizeKBytesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGetDocImageMinSizeKBytesResult() {
        return getDocImageMinSizeKBytesResult;
    }

    /**
     * Sets the value of the getDocImageMinSizeKBytesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGetDocImageMinSizeKBytesResult(Long value) {
        this.getDocImageMinSizeKBytesResult = value;
    }

}
