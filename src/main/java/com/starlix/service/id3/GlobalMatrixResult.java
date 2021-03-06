
package com.starlix.service.id3;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalMatrixResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalMatrixResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenticationId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="ProfileId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="Overall" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatrixResultItem" minOccurs="0"/&gt;
 *         &lt;element name="Summary" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalMatrixResultItem" minOccurs="0"/&gt;
 *         &lt;element name="OverallFields" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalMatrixResultField" minOccurs="0"/&gt;
 *         &lt;element name="CellGroups" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalMatrixCellGroup" minOccurs="0"/&gt;
 *         &lt;element name="SummaryTemplate" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalMatrixSummaryTemplateType" minOccurs="0"/&gt;
 *         &lt;element name="Pending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalDataIds" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalKeyValuePairOfstringint" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalMatrixResult", propOrder = {
    "authenticationId",
    "profileId",
    "overall",
    "summary",
    "overallFields",
    "cellGroups",
    "summaryTemplate",
    "pending",
    "externalDataIds",
    "date"
})
public class GlobalMatrixResult {

    @XmlElement(name = "AuthenticationId")
    protected String authenticationId;
    @XmlElement(name = "ProfileId")
    protected String profileId;
    @XmlElementRef(name = "Overall", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalMatrixResultItem> overall;
    @XmlElementRef(name = "Summary", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalMatrixResultItem> summary;
    @XmlElementRef(name = "OverallFields", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalMatrixResultField> overallFields;
    @XmlElementRef(name = "CellGroups", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalMatrixCellGroup> cellGroups;
    @XmlElement(name = "SummaryTemplate")
    @XmlSchemaType(name = "string")
    protected GlobalMatrixSummaryTemplateType summaryTemplate;
    @XmlElement(name = "Pending")
    protected Boolean pending;
    @XmlElementRef(name = "ExternalDataIds", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalKeyValuePairOfstringint> externalDataIds;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the authenticationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationId() {
        return authenticationId;
    }

    /**
     * Sets the value of the authenticationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationId(String value) {
        this.authenticationId = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileId(String value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the overall property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalMatrixResultItem }{@code >}
     *     
     */
    public JAXBElement<GlobalMatrixResultItem> getOverall() {
        return overall;
    }

    /**
     * Sets the value of the overall property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalMatrixResultItem }{@code >}
     *     
     */
    public void setOverall(JAXBElement<GlobalMatrixResultItem> value) {
        this.overall = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixResultItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalMatrixResultItem> getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixResultItem }{@code >}
     *     
     */
    public void setSummary(JAXBElement<ArrayOfGlobalMatrixResultItem> value) {
        this.summary = value;
    }

    /**
     * Gets the value of the overallFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixResultField }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalMatrixResultField> getOverallFields() {
        return overallFields;
    }

    /**
     * Sets the value of the overallFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixResultField }{@code >}
     *     
     */
    public void setOverallFields(JAXBElement<ArrayOfGlobalMatrixResultField> value) {
        this.overallFields = value;
    }

    /**
     * Gets the value of the cellGroups property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixCellGroup }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalMatrixCellGroup> getCellGroups() {
        return cellGroups;
    }

    /**
     * Sets the value of the cellGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalMatrixCellGroup }{@code >}
     *     
     */
    public void setCellGroups(JAXBElement<ArrayOfGlobalMatrixCellGroup> value) {
        this.cellGroups = value;
    }

    /**
     * Gets the value of the summaryTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalMatrixSummaryTemplateType }
     *     
     */
    public GlobalMatrixSummaryTemplateType getSummaryTemplate() {
        return summaryTemplate;
    }

    /**
     * Sets the value of the summaryTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalMatrixSummaryTemplateType }
     *     
     */
    public void setSummaryTemplate(GlobalMatrixSummaryTemplateType value) {
        this.summaryTemplate = value;
    }

    /**
     * Gets the value of the pending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPending(Boolean value) {
        this.pending = value;
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

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
