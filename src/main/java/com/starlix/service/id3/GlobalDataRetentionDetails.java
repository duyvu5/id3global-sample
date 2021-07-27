
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
 * <p>Java class for GlobalDataRetentionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDataRetentionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetentionDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedAccountID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedDatetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveFromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDataRetentionDetails", propOrder = {
    "retentionDays",
    "updatedAccountID",
    "updatedUsername",
    "updatedDomainName",
    "updatedDatetime",
    "effectiveFromDateTime"
})
public class GlobalDataRetentionDetails {

    @XmlElementRef(name = "RetentionDays", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> retentionDays;
    @XmlElement(name = "UpdatedAccountID")
    protected String updatedAccountID;
    @XmlElementRef(name = "UpdatedUsername", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedUsername;
    @XmlElementRef(name = "UpdatedDomainName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedDomainName;
    @XmlElement(name = "UpdatedDatetime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDatetime;
    @XmlElementRef(name = "EffectiveFromDateTime", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveFromDateTime;

    /**
     * Gets the value of the retentionDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRetentionDays() {
        return retentionDays;
    }

    /**
     * Sets the value of the retentionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRetentionDays(JAXBElement<Integer> value) {
        this.retentionDays = value;
    }

    /**
     * Gets the value of the updatedAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAccountID() {
        return updatedAccountID;
    }

    /**
     * Sets the value of the updatedAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAccountID(String value) {
        this.updatedAccountID = value;
    }

    /**
     * Gets the value of the updatedUsername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedUsername() {
        return updatedUsername;
    }

    /**
     * Sets the value of the updatedUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedUsername(JAXBElement<String> value) {
        this.updatedUsername = value;
    }

    /**
     * Gets the value of the updatedDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedDomainName() {
        return updatedDomainName;
    }

    /**
     * Sets the value of the updatedDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedDomainName(JAXBElement<String> value) {
        this.updatedDomainName = value;
    }

    /**
     * Gets the value of the updatedDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDatetime() {
        return updatedDatetime;
    }

    /**
     * Sets the value of the updatedDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDatetime(XMLGregorianCalendar value) {
        this.updatedDatetime = value;
    }

    /**
     * Gets the value of the effectiveFromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveFromDateTime() {
        return effectiveFromDateTime;
    }

    /**
     * Sets the value of the effectiveFromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveFromDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveFromDateTime = value;
    }

}
