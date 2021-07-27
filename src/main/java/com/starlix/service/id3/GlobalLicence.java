
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalLicence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalLicence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemChecks" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalLicenceItem" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalLicenceItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalLicence", propOrder = {
    "itemChecks",
    "options"
})
public class GlobalLicence {

    @XmlElementRef(name = "ItemChecks", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalLicenceItem> itemChecks;
    @XmlElementRef(name = "Options", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalLicenceItem> options;

    /**
     * Gets the value of the itemChecks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalLicenceItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalLicenceItem> getItemChecks() {
        return itemChecks;
    }

    /**
     * Sets the value of the itemChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalLicenceItem }{@code >}
     *     
     */
    public void setItemChecks(JAXBElement<ArrayOfGlobalLicenceItem> value) {
        this.itemChecks = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalLicenceItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalLicenceItem> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalLicenceItem }{@code >}
     *     
     */
    public void setOptions(JAXBElement<ArrayOfGlobalLicenceItem> value) {
        this.options = value;
    }

}
