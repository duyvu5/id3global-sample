
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUKData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUKData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Passport" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUKPassport" minOccurs="0"/&gt;
 *         &lt;element name="DrivingLicenceUK" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUKDrivingLicence" minOccurs="0"/&gt;
 *         &lt;element name="NationalInsuranceNumber" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUKNationalInsuranceNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalUKData", propOrder = {
    "passport",
    "drivingLicenceUK",
    "nationalInsuranceNumber"
})
public class GlobalUKData {

    @XmlElementRef(name = "Passport", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUKPassport> passport;
    @XmlElementRef(name = "DrivingLicenceUK", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUKDrivingLicence> drivingLicenceUK;
    @XmlElementRef(name = "NationalInsuranceNumber", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUKNationalInsuranceNumber> nationalInsuranceNumber;

    /**
     * Gets the value of the passport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKPassport }{@code >}
     *     
     */
    public JAXBElement<GlobalUKPassport> getPassport() {
        return passport;
    }

    /**
     * Sets the value of the passport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKPassport }{@code >}
     *     
     */
    public void setPassport(JAXBElement<GlobalUKPassport> value) {
        this.passport = value;
    }

    /**
     * Gets the value of the drivingLicenceUK property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKDrivingLicence }{@code >}
     *     
     */
    public JAXBElement<GlobalUKDrivingLicence> getDrivingLicenceUK() {
        return drivingLicenceUK;
    }

    /**
     * Sets the value of the drivingLicenceUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKDrivingLicence }{@code >}
     *     
     */
    public void setDrivingLicenceUK(JAXBElement<GlobalUKDrivingLicence> value) {
        this.drivingLicenceUK = value;
    }

    /**
     * Gets the value of the nationalInsuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKNationalInsuranceNumber }{@code >}
     *     
     */
    public JAXBElement<GlobalUKNationalInsuranceNumber> getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    /**
     * Sets the value of the nationalInsuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKNationalInsuranceNumber }{@code >}
     *     
     */
    public void setNationalInsuranceNumber(JAXBElement<GlobalUKNationalInsuranceNumber> value) {
        this.nationalInsuranceNumber = value;
    }

}
