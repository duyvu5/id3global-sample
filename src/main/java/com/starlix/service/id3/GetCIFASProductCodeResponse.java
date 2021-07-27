
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
 *         &lt;element name="GetCIFASProductCodeResult" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCIFASProductCode" minOccurs="0"/&gt;
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
    "getCIFASProductCodeResult"
})
@XmlRootElement(name = "GetCIFASProductCodeResponse")
public class GetCIFASProductCodeResponse {

    @XmlElementRef(name = "GetCIFASProductCodeResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCIFASProductCode> getCIFASProductCodeResult;

    /**
     * Gets the value of the getCIFASProductCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCIFASProductCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCIFASProductCode> getGetCIFASProductCodeResult() {
        return getCIFASProductCodeResult;
    }

    /**
     * Sets the value of the getCIFASProductCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCIFASProductCode }{@code >}
     *     
     */
    public void setGetCIFASProductCodeResult(JAXBElement<ArrayOfGlobalCIFASProductCode> value) {
        this.getCIFASProductCodeResult = value;
    }

}
