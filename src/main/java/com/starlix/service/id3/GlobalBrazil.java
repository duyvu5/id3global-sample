
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalBrazil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalBrazil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPFNumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalBrazilCPFNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalBrazil", propOrder = {
    "cpfNumber2"
})
public class GlobalBrazil {

    @XmlElementRef(name = "CPFNumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalBrazilCPFNumber> cpfNumber2;

    /**
     * Gets the value of the cpfNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalBrazilCPFNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalBrazilCPFNumber> getCPFNumber2() {
        return cpfNumber2;
    }

    /**
     * Sets the value of the cpfNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalBrazilCPFNumber }{@code >}
     *     
     */
    public void setCPFNumber2(JAXBElement<GlobalBrazilCPFNumber> value) {
        this.cpfNumber2 = value;
    }

}
