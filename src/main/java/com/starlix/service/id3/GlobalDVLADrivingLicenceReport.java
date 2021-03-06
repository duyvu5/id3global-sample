
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
 * <p>Java class for GlobalDVLADrivingLicenceReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDVLADrivingLicenceReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Forenames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalGender" minOccurs="0"/&gt;
 *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LicenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TypeLiteral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disqualified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDispatchReportStatus" minOccurs="0"/&gt;
 *         &lt;element name="IssueNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Categories" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalDVLADrivingLicenceReportCategory" minOccurs="0"/&gt;
 *         &lt;element name="Endorsements" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalDVLADrivingLicenceReportEndorsement" minOccurs="0"/&gt;
 *         &lt;element name="DisqualifiedUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="NilReturn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDVLADrivingLicenceReport", propOrder = {
    "surname",
    "licenceNumber",
    "forenames",
    "gender",
    "dateOfBirth",
    "licenseType",
    "typeLiteral",
    "disqualified",
    "expiryDate",
    "status",
    "issueNumber",
    "postcode",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressRegion",
    "addressCity",
    "categories",
    "endorsements",
    "disqualifiedUntil",
    "nilReturn"
})
public class GlobalDVLADrivingLicenceReport {

    @XmlElementRef(name = "Surname", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "LicenceNumber", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenceNumber;
    @XmlElementRef(name = "Forenames", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forenames;
    @XmlElement(name = "Gender")
    @XmlSchemaType(name = "string")
    protected GlobalGender gender;
    @XmlElementRef(name = "DateOfBirth", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
    @XmlElementRef(name = "LicenseType", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseType;
    @XmlElementRef(name = "TypeLiteral", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeLiteral;
    @XmlElement(name = "Disqualified")
    protected Boolean disqualified;
    @XmlElementRef(name = "ExpiryDate", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> expiryDate;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected GlobalDispatchReportStatus status;
    @XmlElementRef(name = "IssueNumber", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> issueNumber;
    @XmlElementRef(name = "Postcode", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postcode;
    @XmlElementRef(name = "AddressLine1", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "AddressRegion", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressRegion;
    @XmlElementRef(name = "AddressCity", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressCity;
    @XmlElementRef(name = "Categories", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportCategory> categories;
    @XmlElementRef(name = "Endorsements", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportEndorsement> endorsements;
    @XmlElementRef(name = "DisqualifiedUntil", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> disqualifiedUntil;
    @XmlElement(name = "NilReturn")
    protected Integer nilReturn;

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the licenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenceNumber() {
        return licenceNumber;
    }

    /**
     * Sets the value of the licenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenceNumber(JAXBElement<String> value) {
        this.licenceNumber = value;
    }

    /**
     * Gets the value of the forenames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getForenames() {
        return forenames;
    }

    /**
     * Sets the value of the forenames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setForenames(JAXBElement<String> value) {
        this.forenames = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalGender }
     *     
     */
    public GlobalGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalGender }
     *     
     */
    public void setGender(GlobalGender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseType(JAXBElement<String> value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the typeLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeLiteral() {
        return typeLiteral;
    }

    /**
     * Sets the value of the typeLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeLiteral(JAXBElement<String> value) {
        this.typeLiteral = value;
    }

    /**
     * Gets the value of the disqualified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisqualified() {
        return disqualified;
    }

    /**
     * Sets the value of the disqualified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisqualified(Boolean value) {
        this.disqualified = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDispatchReportStatus }
     *     
     */
    public GlobalDispatchReportStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDispatchReportStatus }
     *     
     */
    public void setStatus(GlobalDispatchReportStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIssueNumber(JAXBElement<Integer> value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostcode(JAXBElement<String> value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressRegion() {
        return addressRegion;
    }

    /**
     * Sets the value of the addressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressRegion(JAXBElement<String> value) {
        this.addressRegion = value;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressCity(JAXBElement<String> value) {
        this.addressCity = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDVLADrivingLicenceReportCategory }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportCategory> getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDVLADrivingLicenceReportCategory }{@code >}
     *     
     */
    public void setCategories(JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportCategory> value) {
        this.categories = value;
    }

    /**
     * Gets the value of the endorsements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDVLADrivingLicenceReportEndorsement }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportEndorsement> getEndorsements() {
        return endorsements;
    }

    /**
     * Sets the value of the endorsements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalDVLADrivingLicenceReportEndorsement }{@code >}
     *     
     */
    public void setEndorsements(JAXBElement<ArrayOfGlobalDVLADrivingLicenceReportEndorsement> value) {
        this.endorsements = value;
    }

    /**
     * Gets the value of the disqualifiedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDisqualifiedUntil() {
        return disqualifiedUntil;
    }

    /**
     * Sets the value of the disqualifiedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDisqualifiedUntil(JAXBElement<XMLGregorianCalendar> value) {
        this.disqualifiedUntil = value;
    }

    /**
     * Gets the value of the nilReturn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNilReturn() {
        return nilReturn;
    }

    /**
     * Sets the value of the nilReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNilReturn(Integer value) {
        this.nilReturn = value;
    }

}
