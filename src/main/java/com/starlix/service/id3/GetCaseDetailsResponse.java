
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
 *         &lt;element name="GetCaseDetailsResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCaseDetails" minOccurs="0"/&gt;
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
    "getCaseDetailsResult"
})
@XmlRootElement(name = "GetCaseDetailsResponse")
public class GetCaseDetailsResponse {

    @XmlElementRef(name = "GetCaseDetailsResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCaseDetails> getCaseDetailsResult;

    /**
     * Gets the value of the getCaseDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCaseDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalCaseDetails> getGetCaseDetailsResult() {
        return getCaseDetailsResult;
    }

    /**
     * Sets the value of the getCaseDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCaseDetails }{@code >}
     *     
     */
    public void setGetCaseDetailsResult(JAXBElement<GlobalCaseDetails> value) {
        this.getCaseDetailsResult = value;
    }

}
