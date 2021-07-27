
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDispatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDispatchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DVLADrivingLicenceReport" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDVLADrivingLicenceReport" minOccurs="0"/&gt;
 *         &lt;element name="CriminalRecordCheckDisclosure" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCriminalRecordCheckDisclosure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDispatchResult", propOrder = {
    "dvlaDrivingLicenceReport",
    "criminalRecordCheckDisclosure"
})
public class GlobalDispatchResult {

    @XmlElementRef(name = "DVLADrivingLicenceReport", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalDVLADrivingLicenceReport> dvlaDrivingLicenceReport;
    @XmlElementRef(name = "CriminalRecordCheckDisclosure", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCriminalRecordCheckDisclosure> criminalRecordCheckDisclosure;

    /**
     * Gets the value of the dvlaDrivingLicenceReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalDVLADrivingLicenceReport }{@code >}
     *     
     */
    public JAXBElement<GlobalDVLADrivingLicenceReport> getDVLADrivingLicenceReport() {
        return dvlaDrivingLicenceReport;
    }

    /**
     * Sets the value of the dvlaDrivingLicenceReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalDVLADrivingLicenceReport }{@code >}
     *     
     */
    public void setDVLADrivingLicenceReport(JAXBElement<GlobalDVLADrivingLicenceReport> value) {
        this.dvlaDrivingLicenceReport = value;
    }

    /**
     * Gets the value of the criminalRecordCheckDisclosure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCriminalRecordCheckDisclosure }{@code >}
     *     
     */
    public JAXBElement<GlobalCriminalRecordCheckDisclosure> getCriminalRecordCheckDisclosure() {
        return criminalRecordCheckDisclosure;
    }

    /**
     * Sets the value of the criminalRecordCheckDisclosure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCriminalRecordCheckDisclosure }{@code >}
     *     
     */
    public void setCriminalRecordCheckDisclosure(JAXBElement<GlobalCriminalRecordCheckDisclosure> value) {
        this.criminalRecordCheckDisclosure = value;
    }

}
