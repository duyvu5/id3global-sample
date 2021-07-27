
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalExternalDataResultParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalExternalDataResultParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalCaseResultParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverallMatchItemKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalExternalDataResultParameter" minOccurs="0"/&gt;
 *         &lt;element name="ExternalDataIds" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalKeyValuePairOfstringint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalExternalDataResultParameters", propOrder = {
    "overallMatchItemKey",
    "parameters",
    "externalDataIds"
})
public class GlobalExternalDataResultParameters
    extends GlobalCaseResultParameters
{

    @XmlElementRef(name = "OverallMatchItemKey", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overallMatchItemKey;
    @XmlElementRef(name = "Parameters", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalExternalDataResultParameter> parameters;
    @XmlElementRef(name = "ExternalDataIds", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalKeyValuePairOfstringint> externalDataIds;

    /**
     * Gets the value of the overallMatchItemKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverallMatchItemKey() {
        return overallMatchItemKey;
    }

    /**
     * Sets the value of the overallMatchItemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverallMatchItemKey(JAXBElement<String> value) {
        this.overallMatchItemKey = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalExternalDataResultParameter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalExternalDataResultParameter> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalExternalDataResultParameter }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ArrayOfGlobalExternalDataResultParameter> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the externalDataIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalKeyValuePairOfstringint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalKeyValuePairOfstringint> getExternalDataIds() {
        return externalDataIds;
    }

    /**
     * Sets the value of the externalDataIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalKeyValuePairOfstringint }{@code >}
     *     
     */
    public void setExternalDataIds(JAXBElement<ArrayOfGlobalKeyValuePairOfstringint> value) {
        this.externalDataIds = value;
    }

}
