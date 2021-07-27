
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDocumentCheckResultCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDocumentCheckResultCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalItemCheckResultCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrivingLicenceFraudDocumentReferences" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="PassportFraudDocumentReferences" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDocumentCheckResultCodes", propOrder = {
    "drivingLicenceFraudDocumentReferences",
    "passportFraudDocumentReferences"
})
public class GlobalDocumentCheckResultCodes
    extends GlobalItemCheckResultCodes
{

    @XmlElementRef(name = "DrivingLicenceFraudDocumentReferences", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> drivingLicenceFraudDocumentReferences;
    @XmlElementRef(name = "PassportFraudDocumentReferences", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> passportFraudDocumentReferences;

    /**
     * Gets the value of the drivingLicenceFraudDocumentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDrivingLicenceFraudDocumentReferences() {
        return drivingLicenceFraudDocumentReferences;
    }

    /**
     * Sets the value of the drivingLicenceFraudDocumentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDrivingLicenceFraudDocumentReferences(JAXBElement<ArrayOfstring> value) {
        this.drivingLicenceFraudDocumentReferences = value;
    }

    /**
     * Gets the value of the passportFraudDocumentReferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPassportFraudDocumentReferences() {
        return passportFraudDocumentReferences;
    }

    /**
     * Sets the value of the passportFraudDocumentReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPassportFraudDocumentReferences(JAXBElement<ArrayOfstring> value) {
        this.passportFraudDocumentReferences = value;
    }

}
