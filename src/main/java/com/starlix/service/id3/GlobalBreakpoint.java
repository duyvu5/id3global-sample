
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalBreakpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalBreakpoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalItem"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsNoRetry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalBreakpoint", propOrder = {
    "isNoRetry"
})
public class GlobalBreakpoint
    extends GlobalItem
{

    @XmlElement(name = "IsNoRetry")
    protected Boolean isNoRetry;

    /**
     * Gets the value of the isNoRetry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNoRetry() {
        return isNoRetry;
    }

    /**
     * Sets the value of the isNoRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNoRetry(Boolean value) {
        this.isNoRetry = value;
    }

}
