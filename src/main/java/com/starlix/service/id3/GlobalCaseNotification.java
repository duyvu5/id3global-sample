
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
 * <p>Java class for GlobalCaseNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="CaseID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastRecipientOrgID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedByOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedByUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Jobs" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCaseNotificationJob" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseNotification", propOrder = {
    "id",
    "caseID",
    "name",
    "lastRecipientOrgID",
    "updated",
    "updatedByOrgName",
    "updatedByUserName",
    "jobs"
})
public class GlobalCaseNotification {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "CaseID")
    protected String caseID;
    @XmlElementRef(name = "Name", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "LastRecipientOrgID")
    protected String lastRecipientOrgID;
    @XmlElement(name = "Updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElementRef(name = "UpdatedByOrgName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedByOrgName;
    @XmlElementRef(name = "UpdatedByUserName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedByUserName;
    @XmlElementRef(name = "Jobs", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCaseNotificationJob> jobs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the caseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseID(String value) {
        this.caseID = value;
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
     * Gets the value of the lastRecipientOrgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRecipientOrgID() {
        return lastRecipientOrgID;
    }

    /**
     * Sets the value of the lastRecipientOrgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRecipientOrgID(String value) {
        this.lastRecipientOrgID = value;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdated(XMLGregorianCalendar value) {
        this.updated = value;
    }

    /**
     * Gets the value of the updatedByOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedByOrgName() {
        return updatedByOrgName;
    }

    /**
     * Sets the value of the updatedByOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedByOrgName(JAXBElement<String> value) {
        this.updatedByOrgName = value;
    }

    /**
     * Gets the value of the updatedByUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedByUserName() {
        return updatedByUserName;
    }

    /**
     * Sets the value of the updatedByUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedByUserName(JAXBElement<String> value) {
        this.updatedByUserName = value;
    }

    /**
     * Gets the value of the jobs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseNotificationJob }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCaseNotificationJob> getJobs() {
        return jobs;
    }

    /**
     * Sets the value of the jobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCaseNotificationJob }{@code >}
     *     
     */
    public void setJobs(JAXBElement<ArrayOfGlobalCaseNotificationJob> value) {
        this.jobs = value;
    }

}
