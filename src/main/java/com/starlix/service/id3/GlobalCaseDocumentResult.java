
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseDocumentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseDocumentResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentImageID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="DIVData" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDIVData" minOccurs="0"/&gt;
 *         &lt;element name="AuthDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAuthenticationDetails" minOccurs="0"/&gt;
 *         &lt;element name="InputData" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseDocumentData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseDocumentResult", propOrder = {
    "documentImageID",
    "divData",
    "authDetails",
    "inputData"
})
public class GlobalCaseDocumentResult {

    @XmlElement(name = "DocumentImageID")
    protected String documentImageID;
    @XmlElementRef(name = "DIVData", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalDIVData> divData;
    @XmlElementRef(name = "AuthDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAuthenticationDetails> authDetails;
    @XmlElementRef(name = "InputData", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseDocumentData> inputData;

    /**
     * Gets the value of the documentImageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentImageID() {
        return documentImageID;
    }

    /**
     * Sets the value of the documentImageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentImageID(String value) {
        this.documentImageID = value;
    }

    /**
     * Gets the value of the divData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalDIVData }{@code >}
     *     
     */
    public JAXBElement<GlobalDIVData> getDIVData() {
        return divData;
    }

    /**
     * Sets the value of the divData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalDIVData }{@code >}
     *     
     */
    public void setDIVData(JAXBElement<GlobalDIVData> value) {
        this.divData = value;
    }

    /**
     * Gets the value of the authDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAuthenticationDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalAuthenticationDetails> getAuthDetails() {
        return authDetails;
    }

    /**
     * Sets the value of the authDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAuthenticationDetails }{@code >}
     *     
     */
    public void setAuthDetails(JAXBElement<GlobalAuthenticationDetails> value) {
        this.authDetails = value;
    }

    /**
     * Gets the value of the inputData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDocumentData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseDocumentData> getInputData() {
        return inputData;
    }

    /**
     * Sets the value of the inputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDocumentData }{@code >}
     *     
     */
    public void setInputData(JAXBElement<ArrayOfGlobalCaseDocumentData> value) {
        this.inputData = value;
    }

}
