
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAustralia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAustralia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShortPassport" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalShortPassport" minOccurs="0"/&gt;
 *         &lt;element name="Medicare" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMedicare" minOccurs="0"/&gt;
 *         &lt;element name="DrivingLicenceAustralia" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAustraliaDrivingLicence" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAustralia", propOrder = {
    "shortPassport",
    "medicare",
    "drivingLicenceAustralia"
})
public class GlobalAustralia {

    @XmlElementRef(name = "ShortPassport", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalShortPassport> shortPassport;
    @XmlElementRef(name = "Medicare", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMedicare> medicare;
    @XmlElementRef(name = "DrivingLicenceAustralia", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAustraliaDrivingLicence> drivingLicenceAustralia;

    /**
     * Gets the value of the shortPassport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalShortPassport }{@code >}
     *     
     */
    public JAXBElement<GlobalShortPassport> getShortPassport() {
        return shortPassport;
    }

    /**
     * Sets the value of the shortPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalShortPassport }{@code >}
     *     
     */
    public void setShortPassport(JAXBElement<GlobalShortPassport> value) {
        this.shortPassport = value;
    }

    /**
     * Gets the value of the medicare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMedicare }{@code >}
     *     
     */
    public JAXBElement<GlobalMedicare> getMedicare() {
        return medicare;
    }

    /**
     * Sets the value of the medicare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMedicare }{@code >}
     *     
     */
    public void setMedicare(JAXBElement<GlobalMedicare> value) {
        this.medicare = value;
    }

    /**
     * Gets the value of the drivingLicenceAustralia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAustraliaDrivingLicence }{@code >}
     *     
     */
    public JAXBElement<GlobalAustraliaDrivingLicence> getDrivingLicenceAustralia() {
        return drivingLicenceAustralia;
    }

    /**
     * Sets the value of the drivingLicenceAustralia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAustraliaDrivingLicence }{@code >}
     *     
     */
    public void setDrivingLicenceAustralia(JAXBElement<GlobalAustraliaDrivingLicence> value) {
        this.drivingLicenceAustralia = value;
    }

}
