
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSupportedFields complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSupportedFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressFormat" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddressFormat" minOccurs="0"/&gt;
 *         &lt;element name="AddressLookupCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentImageStorage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DocumentImageValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PowerSearchEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SupportedFields" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalSupportedField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSupportedFields", propOrder = {
    "addressFormat",
    "addressLookupCountry",
    "documentImageStorage",
    "documentImageValidation",
    "powerSearchEnabled",
    "supportedFields"
})
public class GlobalSupportedFields {

    @XmlElement(name = "AddressFormat")
    @XmlSchemaType(name = "string")
    protected GlobalAddressFormat addressFormat;
    @XmlElementRef(name = "AddressLookupCountry", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLookupCountry;
    @XmlElement(name = "DocumentImageStorage")
    protected Boolean documentImageStorage;
    @XmlElement(name = "DocumentImageValidation")
    protected Boolean documentImageValidation;
    @XmlElement(name = "PowerSearchEnabled")
    protected Boolean powerSearchEnabled;
    @XmlElementRef(name = "SupportedFields", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalSupportedField> supportedFields;

    /**
     * Gets the value of the addressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalAddressFormat }
     *     
     */
    public GlobalAddressFormat getAddressFormat() {
        return addressFormat;
    }

    /**
     * Sets the value of the addressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalAddressFormat }
     *     
     */
    public void setAddressFormat(GlobalAddressFormat value) {
        this.addressFormat = value;
    }

    /**
     * Gets the value of the addressLookupCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLookupCountry() {
        return addressLookupCountry;
    }

    /**
     * Sets the value of the addressLookupCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLookupCountry(JAXBElement<String> value) {
        this.addressLookupCountry = value;
    }

    /**
     * Gets the value of the documentImageStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentImageStorage() {
        return documentImageStorage;
    }

    /**
     * Sets the value of the documentImageStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentImageStorage(Boolean value) {
        this.documentImageStorage = value;
    }

    /**
     * Gets the value of the documentImageValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDocumentImageValidation() {
        return documentImageValidation;
    }

    /**
     * Sets the value of the documentImageValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDocumentImageValidation(Boolean value) {
        this.documentImageValidation = value;
    }

    /**
     * Gets the value of the powerSearchEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerSearchEnabled() {
        return powerSearchEnabled;
    }

    /**
     * Sets the value of the powerSearchEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerSearchEnabled(Boolean value) {
        this.powerSearchEnabled = value;
    }

    /**
     * Gets the value of the supportedFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupportedField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalSupportedField> getSupportedFields() {
        return supportedFields;
    }

    /**
     * Sets the value of the supportedFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupportedField }{@code >}
     *     
     */
    public void setSupportedFields(JAXBElement<ArrayOfGlobalSupportedField> value) {
        this.supportedFields = value;
    }

}
