
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalCaseDocumentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalCaseDocumentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalCaseDocumentData" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCaseDocumentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalCaseDocumentData", propOrder = {
    "globalCaseDocumentData"
})
public class ArrayOfGlobalCaseDocumentData {

    @XmlElement(name = "GlobalCaseDocumentData", nillable = true)
    protected List<GlobalCaseDocumentData> globalCaseDocumentData;

    /**
     * Gets the value of the globalCaseDocumentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalCaseDocumentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalCaseDocumentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalCaseDocumentData }
     * 
     * 
     */
    public List<GlobalCaseDocumentData> getGlobalCaseDocumentData() {
        if (globalCaseDocumentData == null) {
            globalCaseDocumentData = new ArrayList<GlobalCaseDocumentData>();
        }
        return this.globalCaseDocumentData;
    }

}
