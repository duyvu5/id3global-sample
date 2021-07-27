
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalPersonal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalPersonal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonalDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalPersonalDetails" minOccurs="0"/&gt;
 *         &lt;element name="AlternateName" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAlternateName" minOccurs="0"/&gt;
 *         &lt;element name="Aliases" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalAlternateName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalPersonal", propOrder = {
    "personalDetails",
    "alternateName",
    "aliases"
})
public class GlobalPersonal {

    @XmlElementRef(name = "PersonalDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalPersonalDetails> personalDetails;
    @XmlElementRef(name = "AlternateName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAlternateName> alternateName;
    @XmlElementRef(name = "Aliases", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalAlternateName> aliases;

    /**
     * Gets the value of the personalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalPersonalDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalPersonalDetails> getPersonalDetails() {
        return personalDetails;
    }

    /**
     * Sets the value of the personalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalPersonalDetails }{@code >}
     *     
     */
    public void setPersonalDetails(JAXBElement<GlobalPersonalDetails> value) {
        this.personalDetails = value;
    }

    /**
     * Gets the value of the alternateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAlternateName }{@code >}
     *     
     */
    public JAXBElement<GlobalAlternateName> getAlternateName() {
        return alternateName;
    }

    /**
     * Sets the value of the alternateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAlternateName }{@code >}
     *     
     */
    public void setAlternateName(JAXBElement<GlobalAlternateName> value) {
        this.alternateName = value;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAlternateName }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalAlternateName> getAliases() {
        return aliases;
    }

    /**
     * Sets the value of the aliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAlternateName }{@code >}
     *     
     */
    public void setAliases(JAXBElement<ArrayOfGlobalAlternateName> value) {
        this.aliases = value;
    }

}
