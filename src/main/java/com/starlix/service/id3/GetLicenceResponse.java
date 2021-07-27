
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
 *         &lt;element name="GetLicenceResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalLicence" minOccurs="0"/&gt;
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
    "getLicenceResult"
})
@XmlRootElement(name = "GetLicenceResponse")
public class GetLicenceResponse {

    @XmlElementRef(name = "GetLicenceResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalLicence> getLicenceResult;

    /**
     * Gets the value of the getLicenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalLicence }{@code >}
     *     
     */
    public JAXBElement<GlobalLicence> getGetLicenceResult() {
        return getLicenceResult;
    }

    /**
     * Sets the value of the getLicenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalLicence }{@code >}
     *     
     */
    public void setGetLicenceResult(JAXBElement<GlobalLicence> value) {
        this.getLicenceResult = value;
    }

}
