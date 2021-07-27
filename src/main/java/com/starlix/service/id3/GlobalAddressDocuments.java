
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAddressDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAddressDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UKAddressDocuments" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUKAddressDocuments" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAddressDocuments", propOrder = {
    "ukAddressDocuments"
})
public class GlobalAddressDocuments {

    @XmlElementRef(name = "UKAddressDocuments", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUKAddressDocuments> ukAddressDocuments;

    /**
     * Gets the value of the ukAddressDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKAddressDocuments }{@code >}
     *     
     */
    public JAXBElement<GlobalUKAddressDocuments> getUKAddressDocuments() {
        return ukAddressDocuments;
    }

    /**
     * Sets the value of the ukAddressDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKAddressDocuments }{@code >}
     *     
     */
    public void setUKAddressDocuments(JAXBElement<GlobalUKAddressDocuments> value) {
        this.ukAddressDocuments = value;
    }

}
