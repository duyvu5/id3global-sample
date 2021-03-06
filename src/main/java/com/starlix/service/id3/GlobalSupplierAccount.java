
package com.starlix.service.id3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSupplierAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSupplierAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierAccountID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Tested" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanInherit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OwningOrg" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierAccountOrg" minOccurs="0"/&gt;
 *         &lt;element name="ParentOrg" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierAccountOrg" minOccurs="0"/&gt;
 *         &lt;element name="SharedByOrgs" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalSupplierAccountOrg" minOccurs="0"/&gt;
 *         &lt;element name="SupplierID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="PendingOrg" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierAccountOrg" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PasswordChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSupplierAccount", propOrder = {
    "supplierAccountID",
    "created",
    "tested",
    "success",
    "status",
    "canInherit",
    "owningOrg",
    "parentOrg",
    "sharedByOrgs",
    "supplierID",
    "pendingOrg",
    "active",
    "passwordChange"
})
@XmlSeeAlso({
    GlobalGlobalDataConsortiumAccount.class,
    GlobalAddressLookupAccount.class,
    GlobalAustraliaAccount.class,
    GlobalCanadaAccount.class,
    GlobalCardPreAccount.class,
    GlobalCreditHeaderAccount.class,
    GlobalDeviceAccount.class,
    GlobalFraudAccount.class,
    GlobalGermanAccount.class,
    GlobalGermanAccount2 .class,
    GlobalIPVerificationAccount.class,
    GlobalPaymentPredictorAccount.class,
    GlobalSouthAfricaAccount.class,
    GlobalBankingAccount.class,
    GlobalStandardAccount.class,
    GlobalCreditReportAccount.class,
    GlobalSanctionsAccount.class,
    GlobalLifestyleAccount.class,
    GlobalHongKongAccount.class,
    GlobalBelgiumAccount.class,
    GlobalUnitedStatesAccount.class,
    GlobalCIFASAccount.class,
    GlobalMobileAccount.class,
    GlobalMalaysiaAccount.class,
    GlobalNetherlandsAccount.class,
    GlobalTrustopiaAccount.class,
    GlobalSouthAfricaCPBAccount.class,
    GlobalAustriaArvatoAccount.class,
    GlobalBrazilAccount.class,
    GlobalArgentinaFidelitasAccount.class,
    GlobalSupplierAccountDto.class,
    GlobalCreditAffordabilityAccount.class,
    GlobalExperianAccount.class
})
public class GlobalSupplierAccount {

    @XmlElementRef(name = "SupplierAccountID", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supplierAccountID;
    @XmlElement(name = "Created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Tested")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tested;
    @XmlElement(name = "Success")
    protected Boolean success;
    @XmlElementRef(name = "Status", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "CanInherit")
    protected Boolean canInherit;
    @XmlElementRef(name = "OwningOrg", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSupplierAccountOrg> owningOrg;
    @XmlElementRef(name = "ParentOrg", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSupplierAccountOrg> parentOrg;
    @XmlElementRef(name = "SharedByOrgs", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalSupplierAccountOrg> sharedByOrgs;
    @XmlElement(name = "SupplierID")
    protected String supplierID;
    @XmlElementRef(name = "PendingOrg", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSupplierAccountOrg> pendingOrg;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "PasswordChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passwordChange;

    /**
     * Gets the value of the supplierAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupplierAccountID() {
        return supplierAccountID;
    }

    /**
     * Sets the value of the supplierAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupplierAccountID(JAXBElement<String> value) {
        this.supplierAccountID = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the tested property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTested() {
        return tested;
    }

    /**
     * Sets the value of the tested property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTested(XMLGregorianCalendar value) {
        this.tested = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the canInherit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanInherit() {
        return canInherit;
    }

    /**
     * Sets the value of the canInherit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanInherit(Boolean value) {
        this.canInherit = value;
    }

    /**
     * Gets the value of the owningOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public JAXBElement<GlobalSupplierAccountOrg> getOwningOrg() {
        return owningOrg;
    }

    /**
     * Sets the value of the owningOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public void setOwningOrg(JAXBElement<GlobalSupplierAccountOrg> value) {
        this.owningOrg = value;
    }

    /**
     * Gets the value of the parentOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public JAXBElement<GlobalSupplierAccountOrg> getParentOrg() {
        return parentOrg;
    }

    /**
     * Sets the value of the parentOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public void setParentOrg(JAXBElement<GlobalSupplierAccountOrg> value) {
        this.parentOrg = value;
    }

    /**
     * Gets the value of the sharedByOrgs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupplierAccountOrg }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalSupplierAccountOrg> getSharedByOrgs() {
        return sharedByOrgs;
    }

    /**
     * Sets the value of the sharedByOrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupplierAccountOrg }{@code >}
     *     
     */
    public void setSharedByOrgs(JAXBElement<ArrayOfGlobalSupplierAccountOrg> value) {
        this.sharedByOrgs = value;
    }

    /**
     * Gets the value of the supplierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * Sets the value of the supplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * Gets the value of the pendingOrg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public JAXBElement<GlobalSupplierAccountOrg> getPendingOrg() {
        return pendingOrg;
    }

    /**
     * Sets the value of the pendingOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupplierAccountOrg }{@code >}
     *     
     */
    public void setPendingOrg(JAXBElement<GlobalSupplierAccountOrg> value) {
        this.pendingOrg = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the passwordChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPasswordChange() {
        return passwordChange;
    }

    /**
     * Sets the value of the passwordChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPasswordChange(XMLGregorianCalendar value) {
        this.passwordChange = value;
    }

}
