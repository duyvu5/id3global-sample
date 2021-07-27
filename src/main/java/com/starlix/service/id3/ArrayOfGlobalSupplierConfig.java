
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalSupplierConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalSupplierConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalSupplierConfig" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalSupplierConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalSupplierConfig", propOrder = {
    "globalSupplierConfig"
})
public class ArrayOfGlobalSupplierConfig {

    @XmlElement(name = "GlobalSupplierConfig", nillable = true)
    protected List<GlobalSupplierConfig> globalSupplierConfig;

    /**
     * Gets the value of the globalSupplierConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalSupplierConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalSupplierConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalSupplierConfig }
     * 
     * 
     */
    public List<GlobalSupplierConfig> getGlobalSupplierConfig() {
        if (globalSupplierConfig == null) {
            globalSupplierConfig = new ArrayList<GlobalSupplierConfig>();
        }
        return this.globalSupplierConfig;
    }

}
