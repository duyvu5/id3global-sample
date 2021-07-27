
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalItemCheckBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalItemCheckBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalItemCheckBand" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalItemCheckBand" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalItemCheckBand", propOrder = {
    "globalItemCheckBand"
})
public class ArrayOfGlobalItemCheckBand {

    @XmlElement(name = "GlobalItemCheckBand", nillable = true)
    protected List<GlobalItemCheckBand> globalItemCheckBand;

    /**
     * Gets the value of the globalItemCheckBand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalItemCheckBand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalItemCheckBand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalItemCheckBand }
     * 
     * 
     */
    public List<GlobalItemCheckBand> getGlobalItemCheckBand() {
        if (globalItemCheckBand == null) {
            globalItemCheckBand = new ArrayList<GlobalItemCheckBand>();
        }
        return this.globalItemCheckBand;
    }

}
