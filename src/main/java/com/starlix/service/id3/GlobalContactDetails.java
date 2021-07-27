
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalContactDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalContactDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LandTelephone" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalLandTelephone" minOccurs="0"/&gt;
 *         &lt;element name="MobileTelephone" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMobileTelephone" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkTelephone" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalWorkTelephone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalContactDetails", propOrder = {
    "landTelephone",
    "mobileTelephone",
    "email",
    "workTelephone"
})
public class GlobalContactDetails {

    @XmlElementRef(name = "LandTelephone", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalLandTelephone> landTelephone;
    @XmlElementRef(name = "MobileTelephone", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMobileTelephone> mobileTelephone;
    @XmlElementRef(name = "Email", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "WorkTelephone", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalWorkTelephone> workTelephone;

    /**
     * Gets the value of the landTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalLandTelephone }{@code >}
     *     
     */
    public JAXBElement<GlobalLandTelephone> getLandTelephone() {
        return landTelephone;
    }

    /**
     * Sets the value of the landTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalLandTelephone }{@code >}
     *     
     */
    public void setLandTelephone(JAXBElement<GlobalLandTelephone> value) {
        this.landTelephone = value;
    }

    /**
     * Gets the value of the mobileTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMobileTelephone }{@code >}
     *     
     */
    public JAXBElement<GlobalMobileTelephone> getMobileTelephone() {
        return mobileTelephone;
    }

    /**
     * Sets the value of the mobileTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMobileTelephone }{@code >}
     *     
     */
    public void setMobileTelephone(JAXBElement<GlobalMobileTelephone> value) {
        this.mobileTelephone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the workTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalWorkTelephone }{@code >}
     *     
     */
    public JAXBElement<GlobalWorkTelephone> getWorkTelephone() {
        return workTelephone;
    }

    /**
     * Sets the value of the workTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalWorkTelephone }{@code >}
     *     
     */
    public void setWorkTelephone(JAXBElement<GlobalWorkTelephone> value) {
        this.workTelephone = value;
    }

}
