
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSpain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSpain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxIDNumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSpainTaxIDNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSpain", propOrder = {
    "taxIDNumber2"
})
public class GlobalSpain {

    @XmlElementRef(name = "TaxIDNumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSpainTaxIDNumber> taxIDNumber2;

    /**
     * Gets the value of the taxIDNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSpainTaxIDNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalSpainTaxIDNumber> getTaxIDNumber2() {
        return taxIDNumber2;
    }

    /**
     * Sets the value of the taxIDNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSpainTaxIDNumber }{@code >}
     *     
     */
    public void setTaxIDNumber2(JAXBElement<GlobalSpainTaxIDNumber> value) {
        this.taxIDNumber2 = value;
    }

}
