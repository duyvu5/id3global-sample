
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalConditionResultCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalConditionResultCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalConditionResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Match" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalConditionResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Mismatch" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalConditionResultCode" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalConditionResultCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalConditionResultCodes", propOrder = {
    "id",
    "comment",
    "match",
    "mismatch",
    "warning"
})
public class GlobalConditionResultCodes {

    @XmlElement(name = "ID")
    @XmlSchemaType(name = "unsignedInt")
    protected Long id;
    @XmlElementRef(name = "Comment", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalConditionResultCode> comment;
    @XmlElementRef(name = "Match", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalConditionResultCode> match;
    @XmlElementRef(name = "Mismatch", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalConditionResultCode> mismatch;
    @XmlElementRef(name = "Warning", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalConditionResultCode> warning;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalConditionResultCode> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public void setComment(JAXBElement<ArrayOfGlobalConditionResultCode> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalConditionResultCode> getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public void setMatch(JAXBElement<ArrayOfGlobalConditionResultCode> value) {
        this.match = value;
    }

    /**
     * Gets the value of the mismatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalConditionResultCode> getMismatch() {
        return mismatch;
    }

    /**
     * Sets the value of the mismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public void setMismatch(JAXBElement<ArrayOfGlobalConditionResultCode> value) {
        this.mismatch = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalConditionResultCode> getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalConditionResultCode }{@code >}
     *     
     */
    public void setWarning(JAXBElement<ArrayOfGlobalConditionResultCode> value) {
        this.warning = value;
    }

}
