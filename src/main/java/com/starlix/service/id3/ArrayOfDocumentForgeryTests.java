
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDocumentForgeryTests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDocumentForgeryTests"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentForgeryTests" type="{http://www.id3global.com/ID3gWS/2013/04}DocumentForgeryTests" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDocumentForgeryTests", propOrder = {
    "documentForgeryTests"
})
public class ArrayOfDocumentForgeryTests {

    @XmlElement(name = "DocumentForgeryTests", nillable = true)
    protected List<DocumentForgeryTests> documentForgeryTests;

    /**
     * Gets the value of the documentForgeryTests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the documentForgeryTests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentForgeryTests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentForgeryTests }
     * 
     * 
     */
    public List<DocumentForgeryTests> getDocumentForgeryTests() {
        if (documentForgeryTests == null) {
            documentForgeryTests = new ArrayList<DocumentForgeryTests>();
        }
        return this.documentForgeryTests;
    }

}
