
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetAccountPermissionResult" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalPermission" minOccurs="0"/&gt;
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
    "getAccountPermissionResult"
})
@XmlRootElement(name = "GetAccountPermissionResponse")
public class GetAccountPermissionResponse {

    @XmlElement(name = "GetAccountPermissionResult")
    @XmlSchemaType(name = "string")
    protected GlobalPermission getAccountPermissionResult;

    /**
     * Gets the value of the getAccountPermissionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalPermission }
     *     
     */
    public GlobalPermission getGetAccountPermissionResult() {
        return getAccountPermissionResult;
    }

    /**
     * Sets the value of the getAccountPermissionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalPermission }
     *     
     */
    public void setGetAccountPermissionResult(GlobalPermission value) {
        this.getAccountPermissionResult = value;
    }

}
