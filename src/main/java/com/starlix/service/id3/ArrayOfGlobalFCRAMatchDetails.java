
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalFCRAMatchDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalFCRAMatchDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalFCRAMatchDetails" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalFCRAMatchDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalFCRAMatchDetails", propOrder = {
    "globalFCRAMatchDetails"
})
public class ArrayOfGlobalFCRAMatchDetails {

    @XmlElement(name = "GlobalFCRAMatchDetails", nillable = true)
    protected List<GlobalFCRAMatchDetails> globalFCRAMatchDetails;

    /**
     * Gets the value of the globalFCRAMatchDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalFCRAMatchDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalFCRAMatchDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalFCRAMatchDetails }
     * 
     * 
     */
    public List<GlobalFCRAMatchDetails> getGlobalFCRAMatchDetails() {
        if (globalFCRAMatchDetails == null) {
            globalFCRAMatchDetails = new ArrayList<GlobalFCRAMatchDetails>();
        }
        return this.globalFCRAMatchDetails;
    }

}
