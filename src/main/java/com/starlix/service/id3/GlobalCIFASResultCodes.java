
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalCIFASResultCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalCIFASResultCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalItemCheckResultCodes"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CIFASMatches" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalCIFASMatch" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCIFASResultCodes", propOrder = {
    "cifasMatches"
})
public class GlobalCIFASResultCodes
    extends GlobalItemCheckResultCodes
{

    @XmlElementRef(name = "CIFASMatches", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalCIFASMatch> cifasMatches;

    /**
     * Gets the value of the cifasMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCIFASMatch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalCIFASMatch> getCIFASMatches() {
        return cifasMatches;
    }

    /**
     * Sets the value of the cifasMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalCIFASMatch }{@code >}
     *     
     */
    public void setCIFASMatches(JAXBElement<ArrayOfGlobalCIFASMatch> value) {
        this.cifasMatches = value;
    }

}
