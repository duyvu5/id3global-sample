
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalProfileDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalProfileDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalProfileVersion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DecisionBanding" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalDecisionBanding" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItem" minOccurs="0"/&gt;
 *         &lt;element name="PreAuthenticationRules" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalPreAuthentication" minOccurs="0"/&gt;
 *         &lt;element name="ItemCheckDecisionBands" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckDecisionBand" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalProfileDetails", propOrder = {
    "decisionBanding",
    "items",
    "preAuthenticationRules",
    "itemCheckDecisionBands"
})
public class GlobalProfileDetails
    extends GlobalProfileVersion
{

    @XmlElementRef(name = "DecisionBanding", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalDecisionBanding> decisionBanding;
    @XmlElementRef(name = "Items", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItem> items;
    @XmlElementRef(name = "PreAuthenticationRules", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalPreAuthentication> preAuthenticationRules;
    @XmlElementRef(name = "ItemCheckDecisionBands", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckDecisionBand> itemCheckDecisionBands;

    /**
     * Gets the value of the decisionBanding property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalDecisionBanding }{@code >}
     *     
     */
    public JAXBElement<GlobalDecisionBanding> getDecisionBanding() {
        return decisionBanding;
    }

    /**
     * Sets the value of the decisionBanding property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalDecisionBanding }{@code >}
     *     
     */
    public void setDecisionBanding(JAXBElement<GlobalDecisionBanding> value) {
        this.decisionBanding = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItem> getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItem }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfGlobalItem> value) {
        this.items = value;
    }

    /**
     * Gets the value of the preAuthenticationRules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalPreAuthentication }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalPreAuthentication> getPreAuthenticationRules() {
        return preAuthenticationRules;
    }

    /**
     * Sets the value of the preAuthenticationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalPreAuthentication }{@code >}
     *     
     */
    public void setPreAuthenticationRules(JAXBElement<ArrayOfGlobalPreAuthentication> value) {
        this.preAuthenticationRules = value;
    }

    /**
     * Gets the value of the itemCheckDecisionBands property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckDecisionBand }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckDecisionBand> getItemCheckDecisionBands() {
        return itemCheckDecisionBands;
    }

    /**
     * Sets the value of the itemCheckDecisionBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckDecisionBand }{@code >}
     *     
     */
    public void setItemCheckDecisionBands(JAXBElement<ArrayOfGlobalItemCheckDecisionBand> value) {
        this.itemCheckDecisionBands = value;
    }

}
