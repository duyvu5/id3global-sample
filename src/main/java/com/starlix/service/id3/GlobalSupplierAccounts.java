
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSupplierAccounts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSupplierAccounts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierAccounts" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalSupplierAccount" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalAccounts" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalActive" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalPending" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSupplierAccounts", propOrder = {
    "supplierAccounts",
    "pageSize",
    "totalPages",
    "totalAccounts",
    "totalActive",
    "totalPending"
})
public class GlobalSupplierAccounts {

    @XmlElementRef(name = "SupplierAccounts", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalSupplierAccount> supplierAccounts;
    @XmlElement(name = "PageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pageSize;
    @XmlElement(name = "TotalPages")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalPages;
    @XmlElement(name = "TotalAccounts")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalAccounts;
    @XmlElement(name = "TotalActive")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalActive;
    @XmlElement(name = "TotalPending")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalPending;

    /**
     * Gets the value of the supplierAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupplierAccount }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalSupplierAccount> getSupplierAccounts() {
        return supplierAccounts;
    }

    /**
     * Sets the value of the supplierAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalSupplierAccount }{@code >}
     *     
     */
    public void setSupplierAccounts(JAXBElement<ArrayOfGlobalSupplierAccount> value) {
        this.supplierAccounts = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageSize(Long value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalPages property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPages() {
        return totalPages;
    }

    /**
     * Sets the value of the totalPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPages(Long value) {
        this.totalPages = value;
    }

    /**
     * Gets the value of the totalAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAccounts() {
        return totalAccounts;
    }

    /**
     * Sets the value of the totalAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAccounts(Long value) {
        this.totalAccounts = value;
    }

    /**
     * Gets the value of the totalActive property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalActive() {
        return totalActive;
    }

    /**
     * Sets the value of the totalActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalActive(Long value) {
        this.totalActive = value;
    }

    /**
     * Gets the value of the totalPending property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPending() {
        return totalPending;
    }

    /**
     * Sets the value of the totalPending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPending(Long value) {
        this.totalPending = value;
    }

}
