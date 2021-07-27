
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
 *         &lt;element name="GetDocImageMaxSizeKBytesResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
    "getDocImageMaxSizeKBytesResult"
})
@XmlRootElement(name = "GetDocImageMaxSizeKBytesResponse")
public class GetDocImageMaxSizeKBytesResponse {

    @XmlElement(name = "GetDocImageMaxSizeKBytesResult")
    @XmlSchemaType(name = "unsignedInt")
    protected Long getDocImageMaxSizeKBytesResult;

    /**
     * Gets the value of the getDocImageMaxSizeKBytesResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGetDocImageMaxSizeKBytesResult() {
        return getDocImageMaxSizeKBytesResult;
    }

    /**
     * Sets the value of the getDocImageMaxSizeKBytesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGetDocImageMaxSizeKBytesResult(Long value) {
        this.getDocImageMaxSizeKBytesResult = value;
    }

}
