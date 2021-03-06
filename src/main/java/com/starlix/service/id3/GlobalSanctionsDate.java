
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalSanctionsDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalSanctionsDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSanctionsDateType" minOccurs="0"/&gt;
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalSanctionsDate", propOrder = {
    "dateType",
    "day",
    "month",
    "year"
})
public class GlobalSanctionsDate {

    @XmlElement(name = "DateType")
    @XmlSchemaType(name = "string")
    protected GlobalSanctionsDateType dateType;
    @XmlElementRef(name = "Day", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> day;
    @XmlElementRef(name = "Month", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> month;
    @XmlElementRef(name = "Year", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> year;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalSanctionsDateType }
     *     
     */
    public GlobalSanctionsDateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalSanctionsDateType }
     *     
     */
    public void setDateType(GlobalSanctionsDateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDay(JAXBElement<Integer> value) {
        this.day = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMonth(JAXBElement<Integer> value) {
        this.month = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYear(JAXBElement<Integer> value) {
        this.year = value;
    }

}
