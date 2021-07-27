
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatrixResultField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalMatrixResultField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatrixMatchType" minOccurs="0"/&gt;
 *         &lt;element name="ResourceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalMatrixResultField", propOrder = {
    "matchType",
    "resourceKey"
})
public class GlobalMatrixResultField {

    @XmlElement(name = "MatchType")
    @XmlSchemaType(name = "string")
    protected GlobalMatrixMatchType matchType;
    @XmlElementRef(name = "ResourceKey", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resourceKey;

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatrixMatchType }
     *     
     */
    public GlobalMatrixMatchType getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatrixMatchType }
     *     
     */
    public void setMatchType(GlobalMatrixMatchType value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the resourceKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResourceKey() {
        return resourceKey;
    }

    /**
     * Sets the value of the resourceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResourceKey(JAXBElement<String> value) {
        this.resourceKey = value;
    }

}
