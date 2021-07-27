
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalConditionDecision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalConditionDecision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalConditionDecision" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalConditionDecision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalConditionDecision", propOrder = {
    "globalConditionDecision"
})
public class ArrayOfGlobalConditionDecision {

    @XmlElement(name = "GlobalConditionDecision", nillable = true)
    protected List<GlobalConditionDecision> globalConditionDecision;

    /**
     * Gets the value of the globalConditionDecision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalConditionDecision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalConditionDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalConditionDecision }
     * 
     * 
     */
    public List<GlobalConditionDecision> getGlobalConditionDecision() {
        if (globalConditionDecision == null) {
            globalConditionDecision = new ArrayList<GlobalConditionDecision>();
        }
        return this.globalConditionDecision;
    }

}
