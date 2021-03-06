
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalItemCheckResultCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalItemCheckResultCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Match" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Mismatch" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckResultCode" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pass" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="Forename" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="DOB" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="Alert" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatch" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalItemCheckResultCodes", propOrder = {
    "name",
    "description",
    "comment",
    "match",
    "warning",
    "mismatch",
    "id",
    "pass",
    "address",
    "forename",
    "surname",
    "dob",
    "alert",
    "country"
})
@XmlSeeAlso({
    GlobalTelephoneResultCodes.class,
    GlobalSharedFraudResultCodes.class,
    GlobalSanctionsResultCodes.class,
    GlobalDeviceIDResultCodes.class,
    GlobalCreditReportResultCodes.class,
    Global3DSecureCheckResultCodes.class,
    GlobalDocumentCheckResultCodes.class,
    GlobalLifestyleResultCodes.class,
    GlobalCIFASResultCodes.class,
    GlobalCreditHeaderResultCodes.class,
    GlobalExperianResultCodes.class
})
public class GlobalItemCheckResultCodes {

    @XmlElementRef(name = "Name", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Description", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Comment", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckResultCode> comment;
    @XmlElementRef(name = "Match", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckResultCode> match;
    @XmlElementRef(name = "Warning", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckResultCode> warning;
    @XmlElementRef(name = "Mismatch", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckResultCode> mismatch;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElement(name = "Pass")
    @XmlSchemaType(name = "string")
    protected GlobalMatch pass;
    @XmlElement(name = "Address")
    @XmlSchemaType(name = "string")
    protected GlobalMatch address;
    @XmlElement(name = "Forename")
    @XmlSchemaType(name = "string")
    protected GlobalMatch forename;
    @XmlElement(name = "Surname")
    @XmlSchemaType(name = "string")
    protected GlobalMatch surname;
    @XmlElement(name = "DOB")
    @XmlSchemaType(name = "string")
    protected GlobalMatch dob;
    @XmlElement(name = "Alert")
    @XmlSchemaType(name = "string")
    protected GlobalMatch alert;
    @XmlElementRef(name = "Country", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckResultCode> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public void setComment(JAXBElement<ArrayOfGlobalItemCheckResultCode> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckResultCode> getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public void setMatch(JAXBElement<ArrayOfGlobalItemCheckResultCode> value) {
        this.match = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckResultCode> getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public void setWarning(JAXBElement<ArrayOfGlobalItemCheckResultCode> value) {
        this.warning = value;
    }

    /**
     * Gets the value of the mismatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckResultCode> getMismatch() {
        return mismatch;
    }

    /**
     * Sets the value of the mismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCode }{@code >}
     *     
     */
    public void setMismatch(JAXBElement<ArrayOfGlobalItemCheckResultCode> value) {
        this.mismatch = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the pass property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getPass() {
        return pass;
    }

    /**
     * Sets the value of the pass property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setPass(GlobalMatch value) {
        this.pass = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setAddress(GlobalMatch value) {
        this.address = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setForename(GlobalMatch value) {
        this.forename = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setSurname(GlobalMatch value) {
        this.surname = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setDOB(GlobalMatch value) {
        this.dob = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatch }
     *     
     */
    public GlobalMatch getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatch }
     *     
     */
    public void setAlert(GlobalMatch value) {
        this.alert = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

}
