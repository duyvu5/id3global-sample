
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalChina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalChina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResidentIdentityCard2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalChinaResidentIdentityCard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalChina", propOrder = {
    "residentIdentityCard2"
})
public class GlobalChina {

    @XmlElementRef(name = "ResidentIdentityCard2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalChinaResidentIdentityCard> residentIdentityCard2;

    /**
     * Gets the value of the residentIdentityCard2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaResidentIdentityCard }{@code >}
     *     
     */
    public JAXBElement<GlobalChinaResidentIdentityCard> getResidentIdentityCard2() {
        return residentIdentityCard2;
    }

    /**
     * Sets the value of the residentIdentityCard2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaResidentIdentityCard }{@code >}
     *     
     */
    public void setResidentIdentityCard2(JAXBElement<GlobalChinaResidentIdentityCard> value) {
        this.residentIdentityCard2 = value;
    }

}
