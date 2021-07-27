
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalDocumentCategorySubmissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalDocumentCategorySubmissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalDocumentCategorySubmissionType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDocumentCategorySubmissionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalDocumentCategorySubmissionType", propOrder = {
    "globalDocumentCategorySubmissionType"
})
public class ArrayOfGlobalDocumentCategorySubmissionType {

    @XmlElement(name = "GlobalDocumentCategorySubmissionType", nillable = true)
    protected List<GlobalDocumentCategorySubmissionType> globalDocumentCategorySubmissionType;

    /**
     * Gets the value of the globalDocumentCategorySubmissionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalDocumentCategorySubmissionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalDocumentCategorySubmissionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalDocumentCategorySubmissionType }
     * 
     * 
     */
    public List<GlobalDocumentCategorySubmissionType> getGlobalDocumentCategorySubmissionType() {
        if (globalDocumentCategorySubmissionType == null) {
            globalDocumentCategorySubmissionType = new ArrayList<GlobalDocumentCategorySubmissionType>();
        }
        return this.globalDocumentCategorySubmissionType;
    }

}
