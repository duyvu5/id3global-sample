
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
 *         &lt;element name="GetDocImageMinWidthResolutionResult" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
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
    "getDocImageMinWidthResolutionResult"
})
@XmlRootElement(name = "GetDocImageMinWidthResolutionResponse")
public class GetDocImageMinWidthResolutionResponse {

    @XmlElement(name = "GetDocImageMinWidthResolutionResult")
    @XmlSchemaType(name = "unsignedInt")
    protected Long getDocImageMinWidthResolutionResult;

    /**
     * Gets the value of the getDocImageMinWidthResolutionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGetDocImageMinWidthResolutionResult() {
        return getDocImageMinWidthResolutionResult;
    }

    /**
     * Sets the value of the getDocImageMinWidthResolutionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGetDocImageMinWidthResolutionResult(Long value) {
        this.getDocImageMinWidthResolutionResult = value;
    }

}
