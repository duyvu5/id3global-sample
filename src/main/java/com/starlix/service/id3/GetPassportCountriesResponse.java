
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
 *         &lt;element name="GetPassportCountriesResult" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCountry" minOccurs="0"/&gt;
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
    "getPassportCountriesResult"
})
@XmlRootElement(name = "GetPassportCountriesResponse")
public class GetPassportCountriesResponse {

    @XmlElementRef(name = "GetPassportCountriesResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCountry> getPassportCountriesResult;

    /**
     * Gets the value of the getPassportCountriesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCountry }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCountry> getGetPassportCountriesResult() {
        return getPassportCountriesResult;
    }

    /**
     * Sets the value of the getPassportCountriesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCountry }{@code >}
     *     
     */
    public void setGetPassportCountriesResult(JAXBElement<ArrayOfGlobalCountry> value) {
        this.getPassportCountriesResult = value;
    }

}
