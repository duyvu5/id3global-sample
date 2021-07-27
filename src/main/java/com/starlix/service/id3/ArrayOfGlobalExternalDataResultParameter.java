
package com.starlix.service.id3;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGlobalExternalDataResultParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGlobalExternalDataResultParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalExternalDataResultParameter" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalExternalDataResultParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGlobalExternalDataResultParameter", propOrder = {
    "globalExternalDataResultParameter"
})
public class ArrayOfGlobalExternalDataResultParameter {

    @XmlElement(name = "GlobalExternalDataResultParameter", nillable = true)
    protected List<GlobalExternalDataResultParameter> globalExternalDataResultParameter;

    /**
     * Gets the value of the globalExternalDataResultParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the globalExternalDataResultParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalExternalDataResultParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalExternalDataResultParameter }
     * 
     * 
     */
    public List<GlobalExternalDataResultParameter> getGlobalExternalDataResultParameter() {
        if (globalExternalDataResultParameter == null) {
            globalExternalDataResultParameter = new ArrayList<GlobalExternalDataResultParameter>();
        }
        return this.globalExternalDataResultParameter;
    }

}
