
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="CreateRoleResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalRole" minOccurs="0"/&gt;
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
    "createRoleResult"
})
@XmlRootElement(name = "CreateRoleResponse")
public class CreateRoleResponse {

    @XmlElementRef(name = "CreateRoleResult", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalRole> createRoleResult;

    /**
     * Gets the value of the createRoleResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalRole }{@code >}
     *     
     */
    public JAXBElement<GlobalRole> getCreateRoleResult() {
        return createRoleResult;
    }

    /**
     * Sets the value of the createRoleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalRole }{@code >}
     *     
     */
    public void setCreateRoleResult(JAXBElement<GlobalRole> value) {
        this.createRoleResult = value;
    }

}
