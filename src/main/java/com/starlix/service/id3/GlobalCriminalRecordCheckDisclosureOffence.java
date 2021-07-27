
package com.starlix.service.id3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCriminalRecordCheckDisclosureOffence complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCriminalRecordCheckDisclosureOffence"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffenceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OffenceType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCriminalRecordCheckDisclosureOffenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCriminalRecordCheckDisclosureOffence", propOrder = {
    "location",
    "description",
    "offenceDate",
    "offenceType"
})
public class GlobalCriminalRecordCheckDisclosureOffence {

    @XmlElementRef(name = "Location", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "Description", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "OffenceDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar offenceDate;
    @XmlElement(name = "OffenceType")
    @XmlSchemaType(name = "string")
    protected GlobalCriminalRecordCheckDisclosureOffenceType offenceType;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the offenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOffenceDate() {
        return offenceDate;
    }

    /**
     * Sets the value of the offenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOffenceDate(XMLGregorianCalendar value) {
        this.offenceDate = value;
    }

    /**
     * Gets the value of the offenceType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalCriminalRecordCheckDisclosureOffenceType }
     *     
     */
    public GlobalCriminalRecordCheckDisclosureOffenceType getOffenceType() {
        return offenceType;
    }

    /**
     * Sets the value of the offenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalCriminalRecordCheckDisclosureOffenceType }
     *     
     */
    public void setOffenceType(GlobalCriminalRecordCheckDisclosureOffenceType value) {
        this.offenceType = value;
    }

}
