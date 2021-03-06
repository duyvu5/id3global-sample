
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAddresses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAddresses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurrentAddress" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddress" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAddress1" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddress" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAddress2" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddress" minOccurs="0"/&gt;
 *         &lt;element name="PreviousAddress3" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAddress" minOccurs="0"/&gt;
 *         &lt;element name="HistoricAddresses" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAddresses", propOrder = {
    "currentAddress",
    "previousAddress1",
    "previousAddress2",
    "previousAddress3",
    "historicAddresses"
})
public class GlobalAddresses {

    @XmlElementRef(name = "CurrentAddress", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddress> currentAddress;
    @XmlElementRef(name = "PreviousAddress1", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddress> previousAddress1;
    @XmlElementRef(name = "PreviousAddress2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddress> previousAddress2;
    @XmlElementRef(name = "PreviousAddress3", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAddress> previousAddress3;
    @XmlElementRef(name = "HistoricAddresses", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalAddress> historicAddresses;

    /**
     * Gets the value of the currentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public JAXBElement<GlobalAddress> getCurrentAddress() {
        return currentAddress;
    }

    /**
     * Sets the value of the currentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public void setCurrentAddress(JAXBElement<GlobalAddress> value) {
        this.currentAddress = value;
    }

    /**
     * Gets the value of the previousAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public JAXBElement<GlobalAddress> getPreviousAddress1() {
        return previousAddress1;
    }

    /**
     * Sets the value of the previousAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public void setPreviousAddress1(JAXBElement<GlobalAddress> value) {
        this.previousAddress1 = value;
    }

    /**
     * Gets the value of the previousAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public JAXBElement<GlobalAddress> getPreviousAddress2() {
        return previousAddress2;
    }

    /**
     * Sets the value of the previousAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public void setPreviousAddress2(JAXBElement<GlobalAddress> value) {
        this.previousAddress2 = value;
    }

    /**
     * Gets the value of the previousAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public JAXBElement<GlobalAddress> getPreviousAddress3() {
        return previousAddress3;
    }

    /**
     * Sets the value of the previousAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAddress }{@code >}
     *     
     */
    public void setPreviousAddress3(JAXBElement<GlobalAddress> value) {
        this.previousAddress3 = value;
    }

    /**
     * Gets the value of the historicAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAddress }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalAddress> getHistoricAddresses() {
        return historicAddresses;
    }

    /**
     * Sets the value of the historicAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAddress }{@code >}
     *     
     */
    public void setHistoricAddresses(JAXBElement<ArrayOfGlobalAddress> value) {
        this.historicAddresses = value;
    }

}
