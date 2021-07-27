
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StoreDocumentImageResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "storeDocumentImageResult"
})
@XmlRootElement(name = "StoreDocumentImageResponse")
public class StoreDocumentImageResponse {

    @XmlElement(name = "StoreDocumentImageResult")
    protected String storeDocumentImageResult;

    /**
     * Gets the value of the storeDocumentImageResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDocumentImageResult() {
        return storeDocumentImageResult;
    }

    /**
     * Sets the value of the storeDocumentImageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDocumentImageResult(String value) {
        this.storeDocumentImageResult = value;
    }

}
