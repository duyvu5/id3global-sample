
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalConditionResultCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalConditionResultCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalConditionResultCode" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalConditionResultCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalConditionResultCode", propOrder = {
    "globalConditionResultCode"
})
public class ArrayOfGlobalConditionResultCode {

    @XmlElement(name = "GlobalConditionResultCode", nillable = true)
    protected List<GlobalConditionResultCode> globalConditionResultCode;

    /**
     * Gets the value of the globalConditionResultCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalConditionResultCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalConditionResultCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalConditionResultCode }
     * 
     * 
     */
    public List<GlobalConditionResultCode> getGlobalConditionResultCode() {
        if (globalConditionResultCode == null) {
            globalConditionResultCode = new ArrayList<GlobalConditionResultCode>();
        }
        return this.globalConditionResultCode;
    }

}
