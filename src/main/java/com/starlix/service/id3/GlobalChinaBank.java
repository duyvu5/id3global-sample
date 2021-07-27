
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalChinaBank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalChinaBank"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChinaBankDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalChinaBankDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalChinaBank", propOrder = {
    "chinaBankDetails"
})
public class GlobalChinaBank {

    @XmlElementRef(name = "ChinaBankDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalChinaBankDetails> chinaBankDetails;

    /**
     * Gets the value of the chinaBankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaBankDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalChinaBankDetails> getChinaBankDetails() {
        return chinaBankDetails;
    }

    /**
     * Sets the value of the chinaBankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaBankDetails }{@code >}
     *     
     */
    public void setChinaBankDetails(JAXBElement<GlobalChinaBankDetails> value) {
        this.chinaBankDetails = value;
    }

}
