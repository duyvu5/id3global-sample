
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalSearchPurpose complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalSearchPurpose"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalSearchPurpose" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSearchPurpose" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalSearchPurpose", propOrder = {
    "globalSearchPurpose"
})
public class ArrayOfGlobalSearchPurpose {

    @XmlElement(name = "GlobalSearchPurpose", nillable = true)
    protected List<GlobalSearchPurpose> globalSearchPurpose;

    /**
     * Gets the value of the globalSearchPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalSearchPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalSearchPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalSearchPurpose }
     * 
     * 
     */
    public List<GlobalSearchPurpose> getGlobalSearchPurpose() {
        if (globalSearchPurpose == null) {
            globalSearchPurpose = new ArrayList<GlobalSearchPurpose>();
        }
        return this.globalSearchPurpose;
    }

}
