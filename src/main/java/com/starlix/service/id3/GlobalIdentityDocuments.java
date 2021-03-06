
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIdentityDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalIdentityDocuments"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="China" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalChina" minOccurs="0"/&gt;
 *         &lt;element name="India" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIndia" minOccurs="0"/&gt;
 *         &lt;element name="NewZealand" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalNewZealand" minOccurs="0"/&gt;
 *         &lt;element name="InternationalPassport" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalInternationalPassport" minOccurs="0"/&gt;
 *         &lt;element name="EuropeanIdentityCard" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalEuropeanIdentityCard" minOccurs="0"/&gt;
 *         &lt;element name="UK" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUKData" minOccurs="0"/&gt;
 *         &lt;element name="Australia" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalAustralia" minOccurs="0"/&gt;
 *         &lt;element name="US" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalUS" minOccurs="0"/&gt;
 *         &lt;element name="IdentityCard" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIdentityCard" minOccurs="0"/&gt;
 *         &lt;element name="Canada" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCanada" minOccurs="0"/&gt;
 *         &lt;element name="Mexico" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMexico" minOccurs="0"/&gt;
 *         &lt;element name="Brazil" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalBrazil" minOccurs="0"/&gt;
 *         &lt;element name="Spain" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSpain" minOccurs="0"/&gt;
 *         &lt;element name="Argentina" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalArgentina" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalIdentityDocuments", propOrder = {
    "china",
    "india",
    "newZealand",
    "internationalPassport",
    "europeanIdentityCard",
    "uk",
    "australia",
    "us",
    "identityCard",
    "canada",
    "mexico",
    "brazil",
    "spain",
    "argentina"
})
public class GlobalIdentityDocuments {

    @XmlElementRef(name = "China", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalChina> china;
    @XmlElementRef(name = "India", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIndia> india;
    @XmlElementRef(name = "NewZealand", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalNewZealand> newZealand;
    @XmlElementRef(name = "InternationalPassport", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalInternationalPassport> internationalPassport;
    @XmlElementRef(name = "EuropeanIdentityCard", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEuropeanIdentityCard> europeanIdentityCard;
    @XmlElementRef(name = "UK", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUKData> uk;
    @XmlElementRef(name = "Australia", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalAustralia> australia;
    @XmlElementRef(name = "US", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalUS> us;
    @XmlElementRef(name = "IdentityCard", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIdentityCard> identityCard;
    @XmlElementRef(name = "Canada", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCanada> canada;
    @XmlElementRef(name = "Mexico", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMexico> mexico;
    @XmlElementRef(name = "Brazil", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalBrazil> brazil;
    @XmlElementRef(name = "Spain", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalSpain> spain;
    @XmlElementRef(name = "Argentina", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalArgentina> argentina;

    /**
     * Gets the value of the china property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalChina }{@code >}
     *     
     */
    public JAXBElement<GlobalChina> getChina() {
        return china;
    }

    /**
     * Sets the value of the china property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalChina }{@code >}
     *     
     */
    public void setChina(JAXBElement<GlobalChina> value) {
        this.china = value;
    }

    /**
     * Gets the value of the india property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndia }{@code >}
     *     
     */
    public JAXBElement<GlobalIndia> getIndia() {
        return india;
    }

    /**
     * Sets the value of the india property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndia }{@code >}
     *     
     */
    public void setIndia(JAXBElement<GlobalIndia> value) {
        this.india = value;
    }

    /**
     * Gets the value of the newZealand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalNewZealand }{@code >}
     *     
     */
    public JAXBElement<GlobalNewZealand> getNewZealand() {
        return newZealand;
    }

    /**
     * Sets the value of the newZealand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalNewZealand }{@code >}
     *     
     */
    public void setNewZealand(JAXBElement<GlobalNewZealand> value) {
        this.newZealand = value;
    }

    /**
     * Gets the value of the internationalPassport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalInternationalPassport }{@code >}
     *     
     */
    public JAXBElement<GlobalInternationalPassport> getInternationalPassport() {
        return internationalPassport;
    }

    /**
     * Sets the value of the internationalPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalInternationalPassport }{@code >}
     *     
     */
    public void setInternationalPassport(JAXBElement<GlobalInternationalPassport> value) {
        this.internationalPassport = value;
    }

    /**
     * Gets the value of the europeanIdentityCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEuropeanIdentityCard }{@code >}
     *     
     */
    public JAXBElement<GlobalEuropeanIdentityCard> getEuropeanIdentityCard() {
        return europeanIdentityCard;
    }

    /**
     * Sets the value of the europeanIdentityCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEuropeanIdentityCard }{@code >}
     *     
     */
    public void setEuropeanIdentityCard(JAXBElement<GlobalEuropeanIdentityCard> value) {
        this.europeanIdentityCard = value;
    }

    /**
     * Gets the value of the uk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKData }{@code >}
     *     
     */
    public JAXBElement<GlobalUKData> getUK() {
        return uk;
    }

    /**
     * Sets the value of the uk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUKData }{@code >}
     *     
     */
    public void setUK(JAXBElement<GlobalUKData> value) {
        this.uk = value;
    }

    /**
     * Gets the value of the australia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalAustralia }{@code >}
     *     
     */
    public JAXBElement<GlobalAustralia> getAustralia() {
        return australia;
    }

    /**
     * Sets the value of the australia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalAustralia }{@code >}
     *     
     */
    public void setAustralia(JAXBElement<GlobalAustralia> value) {
        this.australia = value;
    }

    /**
     * Gets the value of the us property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalUS }{@code >}
     *     
     */
    public JAXBElement<GlobalUS> getUS() {
        return us;
    }

    /**
     * Sets the value of the us property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalUS }{@code >}
     *     
     */
    public void setUS(JAXBElement<GlobalUS> value) {
        this.us = value;
    }

    /**
     * Gets the value of the identityCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIdentityCard }{@code >}
     *     
     */
    public JAXBElement<GlobalIdentityCard> getIdentityCard() {
        return identityCard;
    }

    /**
     * Sets the value of the identityCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIdentityCard }{@code >}
     *     
     */
    public void setIdentityCard(JAXBElement<GlobalIdentityCard> value) {
        this.identityCard = value;
    }

    /**
     * Gets the value of the canada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCanada }{@code >}
     *     
     */
    public JAXBElement<GlobalCanada> getCanada() {
        return canada;
    }

    /**
     * Sets the value of the canada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCanada }{@code >}
     *     
     */
    public void setCanada(JAXBElement<GlobalCanada> value) {
        this.canada = value;
    }

    /**
     * Gets the value of the mexico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMexico }{@code >}
     *     
     */
    public JAXBElement<GlobalMexico> getMexico() {
        return mexico;
    }

    /**
     * Sets the value of the mexico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMexico }{@code >}
     *     
     */
    public void setMexico(JAXBElement<GlobalMexico> value) {
        this.mexico = value;
    }

    /**
     * Gets the value of the brazil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalBrazil }{@code >}
     *     
     */
    public JAXBElement<GlobalBrazil> getBrazil() {
        return brazil;
    }

    /**
     * Sets the value of the brazil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalBrazil }{@code >}
     *     
     */
    public void setBrazil(JAXBElement<GlobalBrazil> value) {
        this.brazil = value;
    }

    /**
     * Gets the value of the spain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalSpain }{@code >}
     *     
     */
    public JAXBElement<GlobalSpain> getSpain() {
        return spain;
    }

    /**
     * Sets the value of the spain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalSpain }{@code >}
     *     
     */
    public void setSpain(JAXBElement<GlobalSpain> value) {
        this.spain = value;
    }

    /**
     * Gets the value of the argentina property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentina }{@code >}
     *     
     */
    public JAXBElement<GlobalArgentina> getArgentina() {
        return argentina;
    }

    /**
     * Sets the value of the argentina property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalArgentina }{@code >}
     *     
     */
    public void setArgentina(JAXBElement<GlobalArgentina> value) {
        this.argentina = value;
    }

}
