
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrivingLicense2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUSDrivingLicense" minOccurs="0"/&gt;
 *         &lt;element name="SocialSecurity2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUSSocialSecurity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalUS", propOrder = {
    "drivingLicense2",
    "socialSecurity2"
})
public class GlobalUS {

    @XmlElementRef(name = "DrivingLicense2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUSDrivingLicense> drivingLicense2;
    @XmlElementRef(name = "SocialSecurity2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUSSocialSecurity> socialSecurity2;

    /**
     * Gets the value of the drivingLicense2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUSDrivingLicense }{@code >}
     *     
     */
    public JAXBElement<GlobalUSDrivingLicense> getDrivingLicense2() {
        return drivingLicense2;
    }

    /**
     * Sets the value of the drivingLicense2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUSDrivingLicense }{@code >}
     *     
     */
    public void setDrivingLicense2(JAXBElement<GlobalUSDrivingLicense> value) {
        this.drivingLicense2 = value;
    }

    /**
     * Gets the value of the socialSecurity2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUSSocialSecurity }{@code >}
     *     
     */
    public JAXBElement<GlobalUSSocialSecurity> getSocialSecurity2() {
        return socialSecurity2;
    }

    /**
     * Sets the value of the socialSecurity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUSSocialSecurity }{@code >}
     *     
     */
    public void setSocialSecurity2(JAXBElement<GlobalUSSocialSecurity> value) {
        this.socialSecurity2 = value;
    }

}
