
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profile" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileIDVersion" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatrixResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseReport", propOrder = {
    "profile",
    "authenticationID",
    "result"
})
public class GlobalCaseReport {

    @XmlElementRef(name = "Profile", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalProfileIDVersion> profile;
    @XmlElementRef(name = "AuthenticationID", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationID;
    @XmlElementRef(name = "Result", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMatrixResult> result;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileIDVersion }{@code >}
     *     
     */
    public JAXBElement<GlobalProfileIDVersion> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalProfileIDVersion }{@code >}
     *     
     */
    public void setProfile(JAXBElement<GlobalProfileIDVersion> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the authenticationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationID() {
        return authenticationID;
    }

    /**
     * Sets the value of the authenticationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationID(JAXBElement<String> value) {
        this.authenticationID = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMatrixResult }{@code >}
     *     
     */
    public JAXBElement<GlobalMatrixResult> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMatrixResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<GlobalMatrixResult> value) {
        this.result = value;
    }

}
