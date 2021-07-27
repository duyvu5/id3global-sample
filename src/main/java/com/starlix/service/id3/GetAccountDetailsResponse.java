
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
 *         &lt;element name="GetAccountDetailsResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAccountDetails" minOccurs="0"/&gt;
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
    "getAccountDetailsResult"
})
@XmlRootElement(name = "GetAccountDetailsResponse")
public class GetAccountDetailsResponse {

    @XmlElementRef(name = "GetAccountDetailsResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAccountDetails> getAccountDetailsResult;

    /**
     * Gets the value of the getAccountDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAccountDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalAccountDetails> getGetAccountDetailsResult() {
        return getAccountDetailsResult;
    }

    /**
     * Sets the value of the getAccountDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAccountDetails }{@code >}
     *     
     */
    public void setGetAccountDetailsResult(JAXBElement<GlobalAccountDetails> value) {
        this.getAccountDetailsResult = value;
    }

}
