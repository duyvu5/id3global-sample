
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalInputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalInputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Images" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalImage" minOccurs="0"/&gt;
 *         &lt;element name="Personal" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalPersonal" minOccurs="0"/&gt;
 *         &lt;element name="Addresses" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddresses" minOccurs="0"/&gt;
 *         &lt;element name="IdentityDocuments" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIdentityDocuments" minOccurs="0"/&gt;
 *         &lt;element name="AddressDocuments" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddressDocuments" minOccurs="0"/&gt;
 *         &lt;element name="ContactDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="Employment" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalEmployment" minOccurs="0"/&gt;
 *         &lt;element name="BankingDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalBankingDetails" minOccurs="0"/&gt;
 *         &lt;element name="GlobalGeneric" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalGeneric" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalLocation" minOccurs="0"/&gt;
 *         &lt;element name="Consent" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalConsent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalInputData", propOrder = {
    "images",
    "personal",
    "addresses",
    "identityDocuments",
    "addressDocuments",
    "contactDetails",
    "employment",
    "bankingDetails",
    "globalGeneric",
    "location",
    "consent"
})
public class GlobalInputData {

    @XmlElementRef(name = "Images", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalImage> images;
    @XmlElementRef(name = "Personal", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalPersonal> personal;
    @XmlElementRef(name = "Addresses", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddresses> addresses;
    @XmlElementRef(name = "IdentityDocuments", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIdentityDocuments> identityDocuments;
    @XmlElementRef(name = "AddressDocuments", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddressDocuments> addressDocuments;
    @XmlElementRef(name = "ContactDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalContactDetails> contactDetails;
    @XmlElementRef(name = "Employment", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEmployment> employment;
    @XmlElementRef(name = "BankingDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalBankingDetails> bankingDetails;
    @XmlElementRef(name = "GlobalGeneric", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalGeneric> globalGeneric;
    @XmlElementRef(name = "Location", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalLocation> location;
    @XmlElementRef(name = "Consent", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalConsent> consent;

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalImage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalImage> getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalImage }{@code >}
     *     
     */
    public void setImages(JAXBElement<ArrayOfGlobalImage> value) {
        this.images = value;
    }

    /**
     * Gets the value of the personal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalPersonal }{@code >}
     *     
     */
    public JAXBElement<GlobalPersonal> getPersonal() {
        return personal;
    }

    /**
     * Sets the value of the personal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalPersonal }{@code >}
     *     
     */
    public void setPersonal(JAXBElement<GlobalPersonal> value) {
        this.personal = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddresses }{@code >}
     *     
     */
    public JAXBElement<GlobalAddresses> getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddresses }{@code >}
     *     
     */
    public void setAddresses(JAXBElement<GlobalAddresses> value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the identityDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIdentityDocuments }{@code >}
     *     
     */
    public JAXBElement<GlobalIdentityDocuments> getIdentityDocuments() {
        return identityDocuments;
    }

    /**
     * Sets the value of the identityDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIdentityDocuments }{@code >}
     *     
     */
    public void setIdentityDocuments(JAXBElement<GlobalIdentityDocuments> value) {
        this.identityDocuments = value;
    }

    /**
     * Gets the value of the addressDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddressDocuments }{@code >}
     *     
     */
    public JAXBElement<GlobalAddressDocuments> getAddressDocuments() {
        return addressDocuments;
    }

    /**
     * Sets the value of the addressDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddressDocuments }{@code >}
     *     
     */
    public void setAddressDocuments(JAXBElement<GlobalAddressDocuments> value) {
        this.addressDocuments = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalContactDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalContactDetails> getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalContactDetails }{@code >}
     *     
     */
    public void setContactDetails(JAXBElement<GlobalContactDetails> value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployment }{@code >}
     *     
     */
    public JAXBElement<GlobalEmployment> getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmployment }{@code >}
     *     
     */
    public void setEmployment(JAXBElement<GlobalEmployment> value) {
        this.employment = value;
    }

    /**
     * Gets the value of the bankingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalBankingDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalBankingDetails> getBankingDetails() {
        return bankingDetails;
    }

    /**
     * Sets the value of the bankingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalBankingDetails }{@code >}
     *     
     */
    public void setBankingDetails(JAXBElement<GlobalBankingDetails> value) {
        this.bankingDetails = value;
    }

    /**
     * Gets the value of the globalGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalGeneric }{@code >}
     *     
     */
    public JAXBElement<GlobalGeneric> getGlobalGeneric() {
        return globalGeneric;
    }

    /**
     * Sets the value of the globalGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalGeneric }{@code >}
     *     
     */
    public void setGlobalGeneric(JAXBElement<GlobalGeneric> value) {
        this.globalGeneric = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalLocation }{@code >}
     *     
     */
    public JAXBElement<GlobalLocation> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalLocation }{@code >}
     *     
     */
    public void setLocation(JAXBElement<GlobalLocation> value) {
        this.location = value;
    }

    /**
     * Gets the value of the consent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalConsent }{@code >}
     *     
     */
    public JAXBElement<GlobalConsent> getConsent() {
        return consent;
    }

    /**
     * Sets the value of the consent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalConsent }{@code >}
     *     
     */
    public void setConsent(JAXBElement<GlobalConsent> value) {
        this.consent = value;
    }

}
