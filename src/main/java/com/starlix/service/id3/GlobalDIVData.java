
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDIVData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDIVData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticationID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="ExtractedData" type="{http://www.id3global.com/ID3gWS/2013/04}ExtractedData" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{http://www.id3global.com/ID3gWS/2013/04}DocumentDetails" minOccurs="0"/&gt;
 *         &lt;element name="TestResults" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfDocumentForgeryTests" minOccurs="0"/&gt;
 *         &lt;element name="Checks" type="{http://www.id3global.com/ID3gWS/2013/04}ImageChecks" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.id3global.com/ID3gWS/2013/04}ImageData" minOccurs="0"/&gt;
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
@XmlType(name = "GlobalDIVData", propOrder = {
    "orgID",
    "authenticationID",
    "extractedData",
    "document",
    "testResults",
    "checks",
    "image",
    "status"
})
public class GlobalDIVData {

    @XmlElement(name = "OrgID")
    protected String orgID;
    @XmlElement(name = "AuthenticationID")
    protected String authenticationID;
    @XmlElementRef(name = "ExtractedData", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ExtractedData> extractedData;
    @XmlElementRef(name = "Document", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentDetails> document;
    @XmlElementRef(name = "TestResults", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumentForgeryTests> testResults;
    @XmlElementRef(name = "Checks", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ImageChecks> checks;
    @XmlElementRef(name = "Image", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ImageData> image;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected GlobalDIVDataGlobalDocumentExtractedStatus status;

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the authenticationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationID() {
        return authenticationID;
    }

    /**
     * Sets the value of the authenticationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationID(String value) {
        this.authenticationID = value;
    }

    /**
     * Gets the value of the extractedData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExtractedData }{@code >}
     *     
     */
    public JAXBElement<ExtractedData> getExtractedData() {
        return extractedData;
    }

    /**
     * Sets the value of the extractedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExtractedData }{@code >}
     *     
     */
    public void setExtractedData(JAXBElement<ExtractedData> value) {
        this.extractedData = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentDetails }{@code >}
     *     
     */
    public JAXBElement<DocumentDetails> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentDetails }{@code >}
     *     
     */
    public void setDocument(JAXBElement<DocumentDetails> value) {
        this.document = value;
    }

    /**
     * Gets the value of the testResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentForgeryTests }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumentForgeryTests> getTestResults() {
        return testResults;
    }

    /**
     * Sets the value of the testResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumentForgeryTests }{@code >}
     *     
     */
    public void setTestResults(JAXBElement<ArrayOfDocumentForgeryTests> value) {
        this.testResults = value;
    }

    /**
     * Gets the value of the checks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageChecks }{@code >}
     *     
     */
    public JAXBElement<ImageChecks> getChecks() {
        return checks;
    }

    /**
     * Sets the value of the checks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageChecks }{@code >}
     *     
     */
    public void setChecks(JAXBElement<ImageChecks> value) {
        this.checks = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageData }{@code >}
     *     
     */
    public JAXBElement<ImageData> getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageData }{@code >}
     *     
     */
    public void setImage(JAXBElement<ImageData> value) {
        this.image = value;
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
