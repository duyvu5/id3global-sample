
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
 *         &lt;element name="UploadAndProcessResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDIVData" minOccurs="0"/&gt;
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
    "uploadAndProcessResult"
})
@XmlRootElement(name = "UploadAndProcessResponse")
public class UploadAndProcessResponse {

    @XmlElementRef(name = "UploadAndProcessResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalDIVData> uploadAndProcessResult;

    /**
     * Gets the value of the uploadAndProcessResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalDIVData }{@code >}
     *     
     */
    public JAXBElement<GlobalDIVData> getUploadAndProcessResult() {
        return uploadAndProcessResult;
    }

    /**
     * Sets the value of the uploadAndProcessResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalDIVData }{@code >}
     *     
     */
    public void setUploadAndProcessResult(JAXBElement<GlobalDIVData> value) {
        this.uploadAndProcessResult = value;
    }

}
