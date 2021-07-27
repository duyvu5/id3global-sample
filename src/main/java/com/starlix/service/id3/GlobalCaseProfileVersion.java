
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseProfileVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseProfileVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileVersion" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileVersion" minOccurs="0"/&gt;
 *         &lt;element name="ItemIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseProfileVersion", propOrder = {
    "profileVersion",
    "itemIDs"
})
public class GlobalCaseProfileVersion {

    @XmlElementRef(name = "ProfileVersion", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalProfileVersion> profileVersion;
    @XmlElementRef(name = "ItemIDs", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfunsignedInt> itemIDs;

    /**
     * Gets the value of the profileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileVersion }{@code >}
     *     
     */
    public JAXBElement<GlobalProfileVersion> getProfileVersion() {
        return profileVersion;
    }

    /**
     * Sets the value of the profileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileVersion }{@code >}
     *     
     */
    public void setProfileVersion(JAXBElement<GlobalProfileVersion> value) {
        this.profileVersion = value;
    }

    /**
     * Gets the value of the itemIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfunsignedInt> getItemIDs() {
        return itemIDs;
    }

    /**
     * Sets the value of the itemIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfunsignedInt }{@code >}
     *     
     */
    public void setItemIDs(JAXBElement<ArrayOfunsignedInt> value) {
        this.itemIDs = value;
    }

}
