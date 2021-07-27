
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAuthentications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAuthentications"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authentications" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalAuthentication" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="TotalAuthentications" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAuthentications", propOrder = {
    "authentications",
    "pageSize",
    "totalPages",
    "totalAuthentications"
})
public class GlobalAuthentications {

    @XmlElementRef(name = "Authentications", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalAuthentication> authentications;
    @XmlElement(name = "PageSize")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pageSize;
    @XmlElement(name = "TotalPages")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalPages;
    @XmlElement(name = "TotalAuthentications")
    @XmlSchemaType(name = "unsignedInt")
    protected Long totalAuthentications;

    /**
     * Gets the value of the authentications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAuthentication }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalAuthentication> getAuthentications() {
        return authentications;
    }

    /**
     * Sets the value of the authentications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalAuthentication }{@code >}
     *     
     */
    public void setAuthentications(JAXBElement<ArrayOfGlobalAuthentication> value) {
        this.authentications = value;
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
     * Gets the value of the totalAuthentications property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalAuthentications() {
        return totalAuthentications;
    }

    /**
     * Sets the value of the totalAuthentications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalAuthentications(Long value) {
        this.totalAuthentications = value;
    }

}
