
package com.starlix.service.id3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseDocumentReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseDocumentReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Profile" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileIDVersion" minOccurs="0"/&gt;
 *         &lt;element name="ValidationID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatrixResult" minOccurs="0"/&gt;
 *         &lt;element name="DocumentType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDocumentType" minOccurs="0"/&gt;
 *         &lt;element name="LastChecked" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDIVData.GlobalDocumentExtractedStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseDocumentReport", propOrder = {
    "profile",
    "validationID",
    "authenticationID",
    "result",
    "documentType",
    "lastChecked",
    "status"
})
public class GlobalCaseDocumentReport {

    @XmlElementRef(name = "Profile", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalProfileIDVersion> profile;
    @XmlElement(name = "ValidationID")
    protected String validationID;
    @XmlElementRef(name = "AuthenticationID", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationID;
    @XmlElementRef(name = "Result", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMatrixResult> result;
    @XmlElement(name = "DocumentType")
    @XmlSchemaType(name = "string")
    protected GlobalDocumentType documentType;
    @XmlElement(name = "LastChecked")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChecked;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected GlobalDIVDataGlobalDocumentExtractedStatus status;

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
     * Gets the value of the validationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationID() {
        return validationID;
    }

    /**
     * Sets the value of the validationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationID(String value) {
        this.validationID = value;
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

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDocumentType }
     *     
     */
    public GlobalDocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDocumentType }
     *     
     */
    public void setDocumentType(GlobalDocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the lastChecked property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChecked() {
        return lastChecked;
    }

    /**
     * Sets the value of the lastChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChecked(XMLGregorianCalendar value) {
        this.lastChecked = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDIVDataGlobalDocumentExtractedStatus }
     *     
     */
    public GlobalDIVDataGlobalDocumentExtractedStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDIVDataGlobalDocumentExtractedStatus }
     *     
     */
    public void setStatus(GlobalDIVDataGlobalDocumentExtractedStatus value) {
        this.status = value;
    }

}
