
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUKAddressDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUKAddressDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ElectricitySupplier" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalElectricitySupplier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalUKAddressDocuments", propOrder = {
    "electricitySupplier"
})
public class GlobalUKAddressDocuments {

    @XmlElementRef(name = "ElectricitySupplier", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalElectricitySupplier> electricitySupplier;

    /**
     * Gets the value of the electricitySupplier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalElectricitySupplier }{@code >}
     *     
     */
    public JAXBElement<GlobalElectricitySupplier> getElectricitySupplier() {
        return electricitySupplier;
    }

    /**
     * Sets the value of the electricitySupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalElectricitySupplier }{@code >}
     *     
     */
    public void setElectricitySupplier(JAXBElement<GlobalElectricitySupplier> value) {
        this.electricitySupplier = value;
    }

}
