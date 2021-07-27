
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalScoring complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalScoring"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalWeighting" minOccurs="0"/&gt;
 *         &lt;element name="Match" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalWeighting" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalWeighting" minOccurs="0"/&gt;
 *         &lt;element name="Mismatch" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalWeighting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalScoring", propOrder = {
    "comment",
    "match",
    "warning",
    "mismatch"
})
public class GlobalScoring {

    @XmlElementRef(name = "Comment", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalWeighting> comment;
    @XmlElementRef(name = "Match", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalWeighting> match;
    @XmlElementRef(name = "Warning", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalWeighting> warning;
    @XmlElementRef(name = "Mismatch", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalWeighting> mismatch;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalWeighting> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public void setComment(JAXBElement<ArrayOfGlobalWeighting> value) {
        this.comment = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalWeighting> getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public void setMatch(JAXBElement<ArrayOfGlobalWeighting> value) {
        this.match = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalWeighting> getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public void setWarning(JAXBElement<ArrayOfGlobalWeighting> value) {
        this.warning = value;
    }

    /**
     * Gets the value of the mismatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalWeighting> getMismatch() {
        return mismatch;
    }

    /**
     * Sets the value of the mismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalWeighting }{@code >}
     *     
     */
    public void setMismatch(JAXBElement<ArrayOfGlobalWeighting> value) {
        this.mismatch = value;
    }

}
