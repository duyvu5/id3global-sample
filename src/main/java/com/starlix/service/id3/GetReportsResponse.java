
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
 *         &lt;element name="GetReportsResult" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalReportDetails" minOccurs="0"/&gt;
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
    "getReportsResult"
})
@XmlRootElement(name = "GetReportsResponse")
public class GetReportsResponse {

    @XmlElementRef(name = "GetReportsResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalReportDetails> getReportsResult;

    /**
     * Gets the value of the getReportsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalReportDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalReportDetails> getGetReportsResult() {
        return getReportsResult;
    }

    /**
     * Sets the value of the getReportsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalReportDetails }{@code >}
     *     
     */
    public void setGetReportsResult(JAXBElement<ArrayOfGlobalReportDetails> value) {
        this.getReportsResult = value;
    }

}
