
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParentOrgID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalOrganisationDetails" minOccurs="0"/&gt;
 *         &lt;element name="AdminName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdminPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parentOrgID",
    "organisationDetails",
    "adminName",
    "adminUsername",
    "adminEmail",
    "adminPassword",
    "adminPIN"
})
@XmlRootElement(name = "CreateOrganisation")
public class CreateOrganisation {

    @XmlElement(name = "ParentOrgID")
    protected String parentOrgID;
    @XmlElementRef(name = "OrganisationDetails", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalOrganisationDetails> organisationDetails;
    @XmlElementRef(name = "AdminName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminName;
    @XmlElementRef(name = "AdminUsername", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminUsername;
    @XmlElementRef(name = "AdminEmail", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminEmail;
    @XmlElementRef(name = "AdminPassword", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminPassword;
    @XmlElementRef(name = "AdminPIN", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adminPIN;

    /**
     * Gets the value of the parentOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentOrgID() {
        return parentOrgID;
    }

    /**
     * Sets the value of the parentOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentOrgID(String value) {
        this.parentOrgID = value;
    }

    /**
     * Gets the value of the organisationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalOrganisationDetails }{@code >}
     *     
     */
    public JAXBElement<GlobalOrganisationDetails> getOrganisationDetails() {
        return organisationDetails;
    }

    /**
     * Sets the value of the organisationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalOrganisationDetails }{@code >}
     *     
     */
    public void setOrganisationDetails(JAXBElement<GlobalOrganisationDetails> value) {
        this.organisationDetails = value;
    }

    /**
     * Gets the value of the adminName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminName() {
        return adminName;
    }

    /**
     * Sets the value of the adminName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminName(JAXBElement<String> value) {
        this.adminName = value;
    }

    /**
     * Gets the value of the adminUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminUsername() {
        return adminUsername;
    }

    /**
     * Sets the value of the adminUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminUsername(JAXBElement<String> value) {
        this.adminUsername = value;
    }

    /**
     * Gets the value of the adminEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminEmail() {
        return adminEmail;
    }

    /**
     * Sets the value of the adminEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminEmail(JAXBElement<String> value) {
        this.adminEmail = value;
    }

    /**
     * Gets the value of the adminPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminPassword() {
        return adminPassword;
    }

    /**
     * Sets the value of the adminPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminPassword(JAXBElement<String> value) {
        this.adminPassword = value;
    }

    /**
     * Gets the value of the adminPIN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdminPIN() {
        return adminPIN;
    }

    /**
     * Sets the value of the adminPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdminPIN(JAXBElement<String> value) {
        this.adminPIN = value;
    }

}
