
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
 * <p>Java class for GlobalCaseDispatchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseDispatchRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DispatchService" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCaseDispatchServiceType" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCaseDispatchRecordStatus" minOccurs="0"/&gt;
 *         &lt;element name="ChargingPointProfileID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfileID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="ResendStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ConsentStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="RejectStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="AccountID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseDispatchRecord", propOrder = {
    "dispatchService",
    "updated",
    "status",
    "chargingPointProfileID",
    "message",
    "profileID",
    "resendStatus",
    "consentStatus",
    "rejectStatus",
    "accountID"
})
public class GlobalCaseDispatchRecord {

    @XmlElement(name = "DispatchService")
    @XmlSchemaType(name = "string")
    protected GlobalCaseDispatchServiceType dispatchService;
    @XmlElement(name = "Updated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updated;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected GlobalCaseDispatchRecordStatus status;
    @XmlElement(name = "ChargingPointProfileID")
    protected String chargingPointProfileID;
    @XmlElementRef(name = "Message", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "ProfileID")
    protected String profileID;
    @XmlElementRef(name = "ResendStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> resendStatus;
    @XmlElementRef(name = "ConsentStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> consentStatus;
    @XmlElementRef(name = "RejectStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> rejectStatus;
    @XmlElement(name = "AccountID")
    protected String accountID;

    /**
     * Gets the value of the dispatchService property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCaseDispatchServiceType }
     *     
     */
    public GlobalCaseDispatchServiceType getDispatchService() {
        return dispatchService;
    }

    /**
     * Sets the value of the dispatchService property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCaseDispatchServiceType }
     *     
     */
    public void setDispatchService(GlobalCaseDispatchServiceType value) {
        this.dispatchService = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCaseDispatchRecordStatus }
     *     
     */
    public GlobalCaseDispatchRecordStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCaseDispatchRecordStatus }
     *     
     */
    public void setStatus(GlobalCaseDispatchRecordStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the chargingPointProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingPointProfileID() {
        return chargingPointProfileID;
    }

    /**
     * Sets the value of the chargingPointProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingPointProfileID(String value) {
        this.chargingPointProfileID = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the resendStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getResendStatus() {
        return resendStatus;
    }

    /**
     * Sets the value of the resendStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setResendStatus(JAXBElement<Long> value) {
        this.resendStatus = value;
    }

    /**
     * Gets the value of the consentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getConsentStatus() {
        return consentStatus;
    }

    /**
     * Sets the value of the consentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setConsentStatus(JAXBElement<Long> value) {
        this.consentStatus = value;
    }

    /**
     * Gets the value of the rejectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRejectStatus() {
        return rejectStatus;
    }

    /**
     * Sets the value of the rejectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRejectStatus(JAXBElement<Long> value) {
        this.rejectStatus = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

}
