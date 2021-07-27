
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
 *         &lt;element name="GetSupplierExtendedStatusInformationResult" type="{http://schemas.datacontract.org/2004/07/GlobalCheck.DataLib}ArrayOfGlobalStatus" minOccurs="0"/&gt;
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
    "getSupplierExtendedStatusInformationResult"
})
@XmlRootElement(name = "GetSupplierExtendedStatusInformationResponse")
public class GetSupplierExtendedStatusInformationResponse {

    @XmlElementRef(name = "GetSupplierExtendedStatusInformationResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalStatus> getSupplierExtendedStatusInformationResult;

    /**
     * Gets the value of the getSupplierExtendedStatusInformationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalStatus }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalStatus> getGetSupplierExtendedStatusInformationResult() {
        return getSupplierExtendedStatusInformationResult;
    }

    /**
     * Sets the value of the getSupplierExtendedStatusInformationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalStatus }{@code >}
     *     
     */
    public void setGetSupplierExtendedStatusInformationResult(JAXBElement<ArrayOfGlobalStatus> value) {
        this.getSupplierExtendedStatusInformationResult = value;
    }

}
