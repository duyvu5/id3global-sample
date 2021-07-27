
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalNewZealand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalNewZealand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrivingLicenceNewZealand" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalNewZealandDrivingLicence" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalNewZealand", propOrder = {
    "drivingLicenceNewZealand"
})
public class GlobalNewZealand {

    @XmlElementRef(name = "DrivingLicenceNewZealand", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalNewZealandDrivingLicence> drivingLicenceNewZealand;

    /**
     * Gets the value of the drivingLicenceNewZealand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalNewZealandDrivingLicence }{@code >}
     *     
     */
    public JAXBElement<GlobalNewZealandDrivingLicence> getDrivingLicenceNewZealand() {
        return drivingLicenceNewZealand;
    }

    /**
     * Sets the value of the drivingLicenceNewZealand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalNewZealandDrivingLicence }{@code >}
     *     
     */
    public void setDrivingLicenceNewZealand(JAXBElement<GlobalNewZealandDrivingLicence> value) {
        this.drivingLicenceNewZealand = value;
    }

}
