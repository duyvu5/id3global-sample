
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseCustomerSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseCustomerSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrespondanceEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicantIsContact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProviderIsVerifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="References" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseCustomerReference" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsNilReturnConfirmationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SupportEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupportTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCustomerCreateNewChecksDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseCustomerSettings", propOrder = {
    "correspondanceEmail",
    "applicantIsContact",
    "providerIsVerifier",
    "references",
    "name",
    "isNilReturnConfirmationRequired",
    "supportEmail",
    "supportTelephone",
    "isCustomerCreateNewChecksDisabled"
})
public class GlobalCaseCustomerSettings {

    @XmlElementRef(name = "CorrespondanceEmail", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondanceEmail;
    @XmlElement(name = "ApplicantIsContact")
    protected Boolean applicantIsContact;
    @XmlElement(name = "ProviderIsVerifier")
    protected Boolean providerIsVerifier;
    @XmlElementRef(name = "References", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseCustomerReference> references;
    @XmlElementRef(name = "Name", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "IsNilReturnConfirmationRequired")
    protected Boolean isNilReturnConfirmationRequired;
    @XmlElementRef(name = "SupportEmail", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportEmail;
    @XmlElementRef(name = "SupportTelephone", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportTelephone;
    @XmlElement(name = "IsCustomerCreateNewChecksDisabled")
    protected Boolean isCustomerCreateNewChecksDisabled;

    /**
     * Gets the value of the correspondanceEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondanceEmail() {
        return correspondanceEmail;
    }

    /**
     * Sets the value of the correspondanceEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondanceEmail(JAXBElement<String> value) {
        this.correspondanceEmail = value;
    }

    /**
     * Gets the value of the applicantIsContact property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicantIsContact() {
        return applicantIsContact;
    }

    /**
     * Sets the value of the applicantIsContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicantIsContact(Boolean value) {
        this.applicantIsContact = value;
    }

    /**
     * Gets the value of the providerIsVerifier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProviderIsVerifier() {
        return providerIsVerifier;
    }

    /**
     * Sets the value of the providerIsVerifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProviderIsVerifier(Boolean value) {
        this.providerIsVerifier = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseCustomerReference }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseCustomerReference> getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseCustomerReference }{@code >}
     *     
     */
    public void setReferences(JAXBElement<ArrayOfGlobalCaseCustomerReference> value) {
        this.references = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the isNilReturnConfirmationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNilReturnConfirmationRequired() {
        return isNilReturnConfirmationRequired;
    }

    /**
     * Sets the value of the isNilReturnConfirmationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNilReturnConfirmationRequired(Boolean value) {
        this.isNilReturnConfirmationRequired = value;
    }

    /**
     * Gets the value of the supportEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportEmail() {
        return supportEmail;
    }

    /**
     * Sets the value of the supportEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportEmail(JAXBElement<String> value) {
        this.supportEmail = value;
    }

    /**
     * Gets the value of the supportTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportTelephone() {
        return supportTelephone;
    }

    /**
     * Sets the value of the supportTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportTelephone(JAXBElement<String> value) {
        this.supportTelephone = value;
    }

    /**
     * Gets the value of the isCustomerCreateNewChecksDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerCreateNewChecksDisabled() {
        return isCustomerCreateNewChecksDisabled;
    }

    /**
     * Sets the value of the isCustomerCreateNewChecksDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerCreateNewChecksDisabled(Boolean value) {
        this.isCustomerCreateNewChecksDisabled = value;
    }

}
