
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
 *         &lt;element name="OrgID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="AddRolePermissions" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalRolePermission" minOccurs="0"/&gt;
 *         &lt;element name="RemoveRolePermissions" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalRolePermission" minOccurs="0"/&gt;
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
    "orgID",
    "resourceID",
    "addRolePermissions",
    "removeRolePermissions"
})
@XmlRootElement(name = "UpdatePermissions")
public class UpdatePermissions {

    @XmlElement(name = "OrgID")
    protected String orgID;
    @XmlElement(name = "ResourceID")
    protected String resourceID;
    @XmlElementRef(name = "AddRolePermissions", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalRolePermission> addRolePermissions;
    @XmlElementRef(name = "RemoveRolePermissions", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalRolePermission> removeRolePermissions;

    /**
     * Gets the value of the orgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgID() {
        return orgID;
    }

    /**
     * Sets the value of the orgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgID(String value) {
        this.orgID = value;
    }

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceID() {
        return resourceID;
    }

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceID(String value) {
        this.resourceID = value;
    }

    /**
     * Gets the value of the addRolePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalRolePermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalRolePermission> getAddRolePermissions() {
        return addRolePermissions;
    }

    /**
     * Sets the value of the addRolePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalRolePermission }{@code >}
     *     
     */
    public void setAddRolePermissions(JAXBElement<ArrayOfGlobalRolePermission> value) {
        this.addRolePermissions = value;
    }

    /**
     * Gets the value of the removeRolePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalRolePermission }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalRolePermission> getRemoveRolePermissions() {
        return removeRolePermissions;
    }

    /**
     * Sets the value of the removeRolePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalRolePermission }{@code >}
     *     
     */
    public void setRemoveRolePermissions(JAXBElement<ArrayOfGlobalRolePermission> value) {
        this.removeRolePermissions = value;
    }

}
