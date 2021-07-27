
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalHome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalHome"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupportContact" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupportContact" minOccurs="0"/&gt;
 *         &lt;element name="Resources" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalResource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalHome", propOrder = {
    "orgName",
    "supportContact",
    "resources"
})
public class GlobalHome {

    @XmlElementRef(name = "OrgName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orgName;
    @XmlElementRef(name = "SupportContact", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSupportContact> supportContact;
    @XmlElementRef(name = "Resources", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalResource> resources;

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgName(JAXBElement<String> value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the supportContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupportContact }{@code >}
     *     
     */
    public JAXBElement<GlobalSupportContact> getSupportContact() {
        return supportContact;
    }

    /**
     * Sets the value of the supportContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSupportContact }{@code >}
     *     
     */
    public void setSupportContact(JAXBElement<GlobalSupportContact> value) {
        this.supportContact = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalResource }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalResource> getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalResource }{@code >}
     *     
     */
    public void setResources(JAXBElement<ArrayOfGlobalResource> value) {
        this.resources = value;
    }

}
