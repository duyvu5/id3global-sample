
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalDocumentCategorySubmissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalDocumentCategorySubmissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubmissionType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDocumentSubmissionType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalDocumentCategorySubmissionType", propOrder = {
    "submissionType",
    "type"
})
public class GlobalDocumentCategorySubmissionType {

    @XmlElement(name = "SubmissionType")
    @XmlSchemaType(name = "string")
    protected GlobalDocumentSubmissionType submissionType;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "unsignedInt")
    protected Long type;

    /**
     * Gets the value of the submissionType property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDocumentSubmissionType }
     *     
     */
    public GlobalDocumentSubmissionType getSubmissionType() {
        return submissionType;
    }

    /**
     * Sets the value of the submissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDocumentSubmissionType }
     *     
     */
    public void setSubmissionType(GlobalDocumentSubmissionType value) {
        this.submissionType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setType(Long value) {
        this.type = value;
    }

}
