
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
 *         &lt;element name="ProfileIDVersion" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileIDVersion" minOccurs="0"/&gt;
 *         &lt;element name="CustomerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputData" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalInputData" minOccurs="0"/&gt;
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
    "profileIDVersion",
    "customerReference",
    "inputData"
})
@XmlRootElement(name = "AuthenticateSP")
public class AuthenticateSP {

    @XmlElementRef(name = "ProfileIDVersion", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalProfileIDVersion> profileIDVersion;
    @XmlElementRef(name = "CustomerReference", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerReference;
    @XmlElementRef(name = "InputData", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalInputData> inputData;

    /**
     * Gets the value of the profileIDVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileIDVersion }{@code >}
     *     
     */
    public JAXBElement<GlobalProfileIDVersion> getProfileIDVersion() {
        return profileIDVersion;
    }

    /**
     * Sets the value of the profileIDVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileIDVersion }{@code >}
     *     
     */
    public void setProfileIDVersion(JAXBElement<GlobalProfileIDVersion> value) {
        this.profileIDVersion = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerReference(JAXBElement<String> value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the inputData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalInputData }{@code >}
     *     
     */
    public JAXBElement<GlobalInputData> getInputData() {
        return inputData;
    }

    /**
     * Sets the value of the inputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalInputData }{@code >}
     *     
     */
    public void setInputData(JAXBElement<GlobalInputData> value) {
        this.inputData = value;
    }

}
