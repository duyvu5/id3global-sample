
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalItemCheckDecisionBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalItemCheckDecisionBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemCheckId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionScore" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Bands" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckBand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalItemCheckDecisionBand", propOrder = {
    "itemCheckId",
    "exceptionScore",
    "bands"
})
public class GlobalItemCheckDecisionBand {

    @XmlElement(name = "ItemCheckId")
    @XmlSchemaType(name = "unsignedInt")
    protected Long itemCheckId;
    @XmlElementRef(name = "ExceptionScore", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> exceptionScore;
    @XmlElementRef(name = "Bands", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckBand> bands;

    /**
     * Gets the value of the itemCheckId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getItemCheckId() {
        return itemCheckId;
    }

    /**
     * Sets the value of the itemCheckId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setItemCheckId(Long value) {
        this.itemCheckId = value;
    }

    /**
     * Gets the value of the exceptionScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getExceptionScore() {
        return exceptionScore;
    }

    /**
     * Sets the value of the exceptionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setExceptionScore(JAXBElement<Long> value) {
        this.exceptionScore = value;
    }

    /**
     * Gets the value of the bands property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckBand }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckBand> getBands() {
        return bands;
    }

    /**
     * Sets the value of the bands property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckBand }{@code >}
     *     
     */
    public void setBands(JAXBElement<ArrayOfGlobalItemCheckBand> value) {
        this.bands = value;
    }

}
