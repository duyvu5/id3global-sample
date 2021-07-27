
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="GetFCRAMatchDetailsResult" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalFCRAMatchDetails" minOccurs="0"/&gt;
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
    "getFCRAMatchDetailsResult"
})
@XmlRootElement(name = "GetFCRAMatchDetailsResponse")
public class GetFCRAMatchDetailsResponse {

    @XmlElementRef(name = "GetFCRAMatchDetailsResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalFCRAMatchDetails> getFCRAMatchDetailsResult;

    /**
     * Gets the value of the getFCRAMatchDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalFCRAMatchDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalFCRAMatchDetails> getGetFCRAMatchDetailsResult() {
        return getFCRAMatchDetailsResult;
    }

    /**
     * Sets the value of the getFCRAMatchDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalFCRAMatchDetails }{@code >}
     *     
     */
    public void setGetFCRAMatchDetailsResult(JAXBElement<ArrayOfGlobalFCRAMatchDetails> value) {
        this.getFCRAMatchDetailsResult = value;
    }

}
