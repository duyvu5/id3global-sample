
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalArgentina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalArgentina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DNINumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalArgentinaDNINumber" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdentificationNumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalArgentinaTaxIdentificationNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalArgentina", propOrder = {
    "dniNumber2",
    "taxIdentificationNumber2"
})
public class GlobalArgentina {

    @XmlElementRef(name = "DNINumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalArgentinaDNINumber> dniNumber2;
    @XmlElementRef(name = "TaxIdentificationNumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalArgentinaTaxIdentificationNumber> taxIdentificationNumber2;

    /**
     * Gets the value of the dniNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentinaDNINumber }{@code >}
     *     
     */
    public JAXBElement<GlobalArgentinaDNINumber> getDNINumber2() {
        return dniNumber2;
    }

    /**
     * Sets the value of the dniNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentinaDNINumber }{@code >}
     *     
     */
    public void setDNINumber2(JAXBElement<GlobalArgentinaDNINumber> value) {
        this.dniNumber2 = value;
    }

    /**
     * Gets the value of the taxIdentificationNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentinaTaxIdentificationNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalArgentinaTaxIdentificationNumber> getTaxIdentificationNumber2() {
        return taxIdentificationNumber2;
    }

    /**
     * Sets the value of the taxIdentificationNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentinaTaxIdentificationNumber }{@code >}
     *     
     */
    public void setTaxIdentificationNumber2(JAXBElement<GlobalArgentinaTaxIdentificationNumber> value) {
        this.taxIdentificationNumber2 = value;
    }

}
