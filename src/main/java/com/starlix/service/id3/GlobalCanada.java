
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCanada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCanada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SocialInsuranceNumber2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCanadaSocialInsuranceNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCanada", propOrder = {
    "socialInsuranceNumber2"
})
public class GlobalCanada {

    @XmlElementRef(name = "SocialInsuranceNumber2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCanadaSocialInsuranceNumber> socialInsuranceNumber2;

    /**
     * Gets the value of the socialInsuranceNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCanadaSocialInsuranceNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalCanadaSocialInsuranceNumber> getSocialInsuranceNumber2() {
        return socialInsuranceNumber2;
    }

    /**
     * Sets the value of the socialInsuranceNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCanadaSocialInsuranceNumber }{@code >}
     *     
     */
    public void setSocialInsuranceNumber2(JAXBElement<GlobalCanadaSocialInsuranceNumber> value) {
        this.socialInsuranceNumber2 = value;
    }

}
