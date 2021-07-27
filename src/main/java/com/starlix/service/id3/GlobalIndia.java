
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalIndia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalIndia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PANIndia" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIndiaPAN" minOccurs="0"/&gt;
 *         &lt;element name="DrivingLicenceIndia" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIndiaDrivingLicence" minOccurs="0"/&gt;
 *         &lt;element name="EpicIndia" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalIndiaEpic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalIndia", propOrder = {
    "panIndia",
    "drivingLicenceIndia",
    "epicIndia"
})
public class GlobalIndia {

    @XmlElementRef(name = "PANIndia", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIndiaPAN> panIndia;
    @XmlElementRef(name = "DrivingLicenceIndia", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIndiaDrivingLicence> drivingLicenceIndia;
    @XmlElementRef(name = "EpicIndia", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalIndiaEpic> epicIndia;

    /**
     * Gets the value of the panIndia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaPAN }{@code >}
     *     
     */
    public JAXBElement<GlobalIndiaPAN> getPANIndia() {
        return panIndia;
    }

    /**
     * Sets the value of the panIndia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaPAN }{@code >}
     *     
     */
    public void setPANIndia(JAXBElement<GlobalIndiaPAN> value) {
        this.panIndia = value;
    }

    /**
     * Gets the value of the drivingLicenceIndia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaDrivingLicence }{@code >}
     *     
     */
    public JAXBElement<GlobalIndiaDrivingLicence> getDrivingLicenceIndia() {
        return drivingLicenceIndia;
    }

    /**
     * Sets the value of the drivingLicenceIndia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaDrivingLicence }{@code >}
     *     
     */
    public void setDrivingLicenceIndia(JAXBElement<GlobalIndiaDrivingLicence> value) {
        this.drivingLicenceIndia = value;
    }

    /**
     * Gets the value of the epicIndia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaEpic }{@code >}
     *     
     */
    public JAXBElement<GlobalIndiaEpic> getEpicIndia() {
        return epicIndia;
    }

    /**
     * Sets the value of the epicIndia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalIndiaEpic }{@code >}
     *     
     */
    public void setEpicIndia(JAXBElement<GlobalIndiaEpic> value) {
        this.epicIndia = value;
    }

}
