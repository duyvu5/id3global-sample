
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalCase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispatchResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDispatchResult" minOccurs="0"/&gt;
 *         &lt;element name="Reports" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseReport" minOccurs="0"/&gt;
 *         &lt;element name="DocumentCategorySubmissionTypes" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalDocumentCategorySubmissionType" minOccurs="0"/&gt;
 *         &lt;element name="Documents" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseDocument" minOccurs="0"/&gt;
 *         &lt;element name="Consents" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseConsent" minOccurs="0"/&gt;
 *         &lt;element name="DispatchRecord" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseDispatchRecord" minOccurs="0"/&gt;
 *         &lt;element name="DisclaimerAccepted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedByAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseDetails", propOrder = {
    "dispatchResult",
    "reports",
    "documentCategorySubmissionTypes",
    "documents",
    "consents",
    "dispatchRecord",
    "disclaimerAccepted",
    "updatedBy",
    "updatedByAccount"
})
public class GlobalCaseDetails
    extends GlobalCase
{

    @XmlElementRef(name = "DispatchResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalDispatchResult> dispatchResult;
    @XmlElementRef(name = "Reports", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseReport> reports;
    @XmlElementRef(name = "DocumentCategorySubmissionTypes", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalDocumentCategorySubmissionType> documentCategorySubmissionTypes;
    @XmlElementRef(name = "Documents", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseDocument> documents;
    @XmlElementRef(name = "Consents", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseConsent> consents;
    @XmlElementRef(name = "DispatchRecord", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseDispatchRecord> dispatchRecord;
    @XmlElement(name = "DisclaimerAccepted")
    protected Boolean disclaimerAccepted;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElementRef(name = "UpdatedByAccount", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedByAccount;

    /**
     * Gets the value of the dispatchResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalDispatchResult }{@code >}
     *     
     */
    public JAXBElement<GlobalDispatchResult> getDispatchResult() {
        return dispatchResult;
    }

    /**
     * Sets the value of the dispatchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalDispatchResult }{@code >}
     *     
     */
    public void setDispatchResult(JAXBElement<GlobalDispatchResult> value) {
        this.dispatchResult = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseReport }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseReport> getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseReport }{@code >}
     *     
     */
    public void setReports(JAXBElement<ArrayOfGlobalCaseReport> value) {
        this.reports = value;
    }

    /**
     * Gets the value of the documentCategorySubmissionTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDocumentCategorySubmissionType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalDocumentCategorySubmissionType> getDocumentCategorySubmissionTypes() {
        return documentCategorySubmissionTypes;
    }

    /**
     * Sets the value of the documentCategorySubmissionTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDocumentCategorySubmissionType }{@code >}
     *     
     */
    public void setDocumentCategorySubmissionTypes(JAXBElement<ArrayOfGlobalDocumentCategorySubmissionType> value) {
        this.documentCategorySubmissionTypes = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDocument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseDocument> getDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDocument }{@code >}
     *     
     */
    public void setDocuments(JAXBElement<ArrayOfGlobalCaseDocument> value) {
        this.documents = value;
    }

    /**
     * Gets the value of the consents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseConsent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseConsent> getConsents() {
        return consents;
    }

    /**
     * Sets the value of the consents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseConsent }{@code >}
     *     
     */
    public void setConsents(JAXBElement<ArrayOfGlobalCaseConsent> value) {
        this.consents = value;
    }

    /**
     * Gets the value of the dispatchRecord property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDispatchRecord }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseDispatchRecord> getDispatchRecord() {
        return dispatchRecord;
    }

    /**
     * Sets the value of the dispatchRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseDispatchRecord }{@code >}
     *     
     */
    public void setDispatchRecord(JAXBElement<ArrayOfGlobalCaseDispatchRecord> value) {
        this.dispatchRecord = value;
    }

    /**
     * Gets the value of the disclaimerAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisclaimerAccepted() {
        return disclaimerAccepted;
    }

    /**
     * Sets the value of the disclaimerAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclaimerAccepted(Boolean value) {
        this.disclaimerAccepted = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the updatedByAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedByAccount() {
        return updatedByAccount;
    }

    /**
     * Sets the value of the updatedByAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedByAccount(JAXBElement<String> value) {
        this.updatedByAccount = value;
    }

}
