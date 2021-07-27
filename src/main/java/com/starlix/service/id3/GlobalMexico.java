
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMexico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalMexico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxIdentificationNumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMexicoTaxIdentificationNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalMexico", propOrder = {
    "taxIdentificationNumber2"
})
public class GlobalMexico {

    @XmlElementRef(name = "TaxIdentificationNumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMexicoTaxIdentificationNumber> taxIdentificationNumber2;

    /**
     * Gets the value of the taxIdentificationNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMexicoTaxIdentificationNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalMexicoTaxIdentificationNumber> getTaxIdentificationNumber2() {
        return taxIdentificationNumber2;
    }

    /**
     * Sets the value of the taxIdentificationNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMexicoTaxIdentificationNumber }{@code >}
     *     
     */
    public void setTaxIdentificationNumber2(JAXBElement<GlobalMexicoTaxIdentificationNumber> value) {
        this.taxIdentificationNumber2 = value;
    }

}
