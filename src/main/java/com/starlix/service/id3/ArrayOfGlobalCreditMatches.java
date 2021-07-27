
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalCreditMatches complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalCreditMatches"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalCreditMatches" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCreditMatches" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalCreditMatches", propOrder = {
    "globalCreditMatches"
})
public class ArrayOfGlobalCreditMatches {

    @XmlElement(name = "GlobalCreditMatches", nillable = true)
    protected List<GlobalCreditMatches> globalCreditMatches;

    /**
     * Gets the value of the globalCreditMatches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalCreditMatches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalCreditMatches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalCreditMatches }
     * 
     * 
     */
    public List<GlobalCreditMatches> getGlobalCreditMatches() {
        if (globalCreditMatches == null) {
            globalCreditMatches = new ArrayList<GlobalCreditMatches>();
        }
        return this.globalCreditMatches;
    }

}
