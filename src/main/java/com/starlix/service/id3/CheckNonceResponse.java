
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="CheckNonceResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAccount" minOccurs="0"/&gt;
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
    "checkNonceResult"
})
@XmlRootElement(name = "CheckNonceResponse")
public class CheckNonceResponse {

    @XmlElementRef(name = "CheckNonceResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAccount> checkNonceResult;

    /**
     * Gets the value of the checkNonceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAccount }{@code >}
     *     
     */
    public JAXBElement<GlobalAccount> getCheckNonceResult() {
        return checkNonceResult;
    }

    /**
     * Sets the value of the checkNonceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAccount }{@code >}
     *     
     */
    public void setCheckNonceResult(JAXBElement<GlobalAccount> value) {
        this.checkNonceResult = value;
    }

}
