
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalItemCheckConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalItemCheckConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ItemCheckIcon" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIconImage" minOccurs="0"/&gt;
 *         &lt;element name="CountryIcon" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIconImage" minOccurs="0"/&gt;
 *         &lt;element name="InputFields" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckInputField" minOccurs="0"/&gt;
 *         &lt;element name="AddressLookupCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalItemCheckConfig", propOrder = {
    "id",
    "itemCheckIcon",
    "countryIcon",
    "inputFields",
    "addressLookupCountry"
})
public class GlobalItemCheckConfig {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "ItemCheckIcon", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIconImage> itemCheckIcon;
    @XmlElementRef(name = "CountryIcon", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIconImage> countryIcon;
    @XmlElementRef(name = "InputFields", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckInputField> inputFields;
    @XmlElementRef(name = "AddressLookupCountry", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLookupCountry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the itemCheckIcon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIconImage }{@code >}
     *     
     */
    public JAXBElement<GlobalIconImage> getItemCheckIcon() {
        return itemCheckIcon;
    }

    /**
     * Sets the value of the itemCheckIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIconImage }{@code >}
     *     
     */
    public void setItemCheckIcon(JAXBElement<GlobalIconImage> value) {
        this.itemCheckIcon = value;
    }

    /**
     * Gets the value of the countryIcon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIconImage }{@code >}
     *     
     */
    public JAXBElement<GlobalIconImage> getCountryIcon() {
        return countryIcon;
    }

    /**
     * Sets the value of the countryIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIconImage }{@code >}
     *     
     */
    public void setCountryIcon(JAXBElement<GlobalIconImage> value) {
        this.countryIcon = value;
    }

    /**
     * Gets the value of the inputFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckInputField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckInputField> getInputFields() {
        return inputFields;
    }

    /**
     * Sets the value of the inputFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckInputField }{@code >}
     *     
     */
    public void setInputFields(JAXBElement<ArrayOfGlobalItemCheckInputField> value) {
        this.inputFields = value;
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

}
