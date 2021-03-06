
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCaseResultParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCaseResultParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProfileID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompleteStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="PendgingStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ChargingPointProfileIDs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/&gt;
 *         &lt;element name="IsUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuccessStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCaseResultParameters", propOrder = {
    "profileID",
    "source",
    "completeStatus",
    "pendgingStatus",
    "chargingPointProfileIDs",
    "isUpdate",
    "successStatus"
})
@XmlSeeAlso({
    GlobalCaseDocumentResultParameters.class,
    GlobalExternalDataResultParameters.class,
    GlobalCaseDispatchParameters.class
})
public class GlobalCaseResultParameters {

    @XmlElement(name = "ProfileID")
    protected String profileID;
    @XmlElementRef(name = "Source", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "CompleteStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> completeStatus;
    @XmlElementRef(name = "PendgingStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> pendgingStatus;
    @XmlElementRef(name = "ChargingPointProfileIDs", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> chargingPointProfileIDs;
    @XmlElement(name = "IsUpdate")
    protected Boolean isUpdate;
    @XmlElementRef(name = "SuccessStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> successStatus;

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Gets the value of the completeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCompleteStatus() {
        return completeStatus;
    }

    /**
     * Sets the value of the completeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCompleteStatus(JAXBElement<Long> value) {
        this.completeStatus = value;
    }

    /**
     * Gets the value of the pendgingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPendgingStatus() {
        return pendgingStatus;
    }

    /**
     * Sets the value of the pendgingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPendgingStatus(JAXBElement<Long> value) {
        this.pendgingStatus = value;
    }

    /**
     * Gets the value of the chargingPointProfileIDs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public JAXBElement<ArrayOfguid> getChargingPointProfileIDs() {
        return chargingPointProfileIDs;
    }

    /**
     * Sets the value of the chargingPointProfileIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    public void setChargingPointProfileIDs(JAXBElement<ArrayOfguid> value) {
        this.chargingPointProfileIDs = value;
    }

    /**
     * Gets the value of the isUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUpdate() {
        return isUpdate;
    }

    /**
     * Sets the value of the isUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUpdate(Boolean value) {
        this.isUpdate = value;
    }

    /**
     * Gets the value of the successStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSuccessStatus() {
        return successStatus;
    }

    /**
     * Sets the value of the successStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSuccessStatus(JAXBElement<Long> value) {
        this.successStatus = value;
    }

}
