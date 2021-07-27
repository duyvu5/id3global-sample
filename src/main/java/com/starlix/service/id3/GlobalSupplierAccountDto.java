
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSupplierAccountDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSupplierAccountDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierAccount"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Domain1Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Username1Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password1Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Domain2Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Username2Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password2Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Misc1Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Misc2Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Misc3Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Misc4Override" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSupplierAccountDto", propOrder = {
    "domain1Override",
    "username1Override",
    "password1Override",
    "domain2Override",
    "username2Override",
    "password2Override",
    "misc1Override",
    "misc2Override",
    "misc3Override",
    "misc4Override"
})
public class GlobalSupplierAccountDto
    extends GlobalSupplierAccount
{

    @XmlElementRef(name = "Domain1Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domain1Override;
    @XmlElementRef(name = "Username1Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username1Override;
    @XmlElementRef(name = "Password1Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password1Override;
    @XmlElementRef(name = "Domain2Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domain2Override;
    @XmlElementRef(name = "Username2Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username2Override;
    @XmlElementRef(name = "Password2Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password2Override;
    @XmlElementRef(name = "Misc1Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misc1Override;
    @XmlElementRef(name = "Misc2Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misc2Override;
    @XmlElementRef(name = "Misc3Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misc3Override;
    @XmlElementRef(name = "Misc4Override", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> misc4Override;

    /**
     * Gets the value of the domain1Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomain1Override() {
        return domain1Override;
    }

    /**
     * Sets the value of the domain1Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomain1Override(JAXBElement<String> value) {
        this.domain1Override = value;
    }

    /**
     * Gets the value of the username1Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername1Override() {
        return username1Override;
    }

    /**
     * Sets the value of the username1Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername1Override(JAXBElement<String> value) {
        this.username1Override = value;
    }

    /**
     * Gets the value of the password1Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword1Override() {
        return password1Override;
    }

    /**
     * Sets the value of the password1Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword1Override(JAXBElement<String> value) {
        this.password1Override = value;
    }

    /**
     * Gets the value of the domain2Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomain2Override() {
        return domain2Override;
    }

    /**
     * Sets the value of the domain2Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomain2Override(JAXBElement<String> value) {
        this.domain2Override = value;
    }

    /**
     * Gets the value of the username2Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername2Override() {
        return username2Override;
    }

    /**
     * Sets the value of the username2Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername2Override(JAXBElement<String> value) {
        this.username2Override = value;
    }

    /**
     * Gets the value of the password2Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword2Override() {
        return password2Override;
    }

    /**
     * Sets the value of the password2Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword2Override(JAXBElement<String> value) {
        this.password2Override = value;
    }

    /**
     * Gets the value of the misc1Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisc1Override() {
        return misc1Override;
    }

    /**
     * Sets the value of the misc1Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisc1Override(JAXBElement<String> value) {
        this.misc1Override = value;
    }

    /**
     * Gets the value of the misc2Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisc2Override() {
        return misc2Override;
    }

    /**
     * Sets the value of the misc2Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisc2Override(JAXBElement<String> value) {
        this.misc2Override = value;
    }

    /**
     * Gets the value of the misc3Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisc3Override() {
        return misc3Override;
    }

    /**
     * Sets the value of the misc3Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisc3Override(JAXBElement<String> value) {
        this.misc3Override = value;
    }

    /**
     * Gets the value of the misc4Override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMisc4Override() {
        return misc4Override;
    }

    /**
     * Sets the value of the misc4Override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMisc4Override(JAXBElement<String> value) {
        this.misc4Override = value;
    }

}
