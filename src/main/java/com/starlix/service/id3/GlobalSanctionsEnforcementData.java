
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSanctionsEnforcementData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSanctionsEnforcementData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SanctionsBodies" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Aliases" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="SanctionsAddresses" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalSanctionsAddress" minOccurs="0"/&gt;
 *         &lt;element name="SanctionsDates" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalSanctionsDate" minOccurs="0"/&gt;
 *         &lt;element name="IdentityInformation" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSanctionsEnforcementData", propOrder = {
    "fullname",
    "sanctionsBodies",
    "aliases",
    "sanctionsAddresses",
    "sanctionsDates",
    "identityInformation"
})
public class GlobalSanctionsEnforcementData {

    @XmlElementRef(name = "Fullname", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullname;
    @XmlElementRef(name = "SanctionsBodies", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> sanctionsBodies;
    @XmlElementRef(name = "Aliases", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> aliases;
    @XmlElementRef(name = "SanctionsAddresses", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalSanctionsAddress> sanctionsAddresses;
    @XmlElementRef(name = "SanctionsDates", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalSanctionsDate> sanctionsDates;
    @XmlElementRef(name = "IdentityInformation", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> identityInformation;

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullname(JAXBElement<String> value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the sanctionsBodies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSanctionsBodies() {
        return sanctionsBodies;
    }

    /**
     * Sets the value of the sanctionsBodies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSanctionsBodies(JAXBElement<ArrayOfstring> value) {
        this.sanctionsBodies = value;
    }

    /**
     * Gets the value of the aliases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getAliases() {
        return aliases;
    }

    /**
     * Sets the value of the aliases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setAliases(JAXBElement<ArrayOfstring> value) {
        this.aliases = value;
    }

    /**
     * Gets the value of the sanctionsAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSanctionsAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalSanctionsAddress> getSanctionsAddresses() {
        return sanctionsAddresses;
    }

    /**
     * Sets the value of the sanctionsAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSanctionsAddress }{@code >}
     *     
     */
    public void setSanctionsAddresses(JAXBElement<ArrayOfGlobalSanctionsAddress> value) {
        this.sanctionsAddresses = value;
    }

    /**
     * Gets the value of the sanctionsDates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSanctionsDate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalSanctionsDate> getSanctionsDates() {
        return sanctionsDates;
    }

    /**
     * Sets the value of the sanctionsDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSanctionsDate }{@code >}
     *     
     */
    public void setSanctionsDates(JAXBElement<ArrayOfGlobalSanctionsDate> value) {
        this.sanctionsDates = value;
    }

    /**
     * Gets the value of the identityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getIdentityInformation() {
        return identityInformation;
    }

    /**
     * Sets the value of the identityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setIdentityInformation(JAXBElement<ArrayOfstring> value) {
        this.identityInformation = value;
    }

}
