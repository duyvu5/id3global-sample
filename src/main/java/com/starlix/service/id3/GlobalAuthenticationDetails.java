
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalAuthenticationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalAuthenticationDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.id3global.com/ID3gWS/2013/04}GlobalAuthentication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputData" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalInputData" minOccurs="0"/&gt;
 *         &lt;element name="ResultCodes" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckResultCodes" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserBreakpoint" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="NoRetry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DecisionBands" type="{http://www.id3global.com/ID3gWS/2013/04}ArrayOfGlobalItemCheckDecisionBands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalAuthenticationDetails", propOrder = {
    "inputData",
    "resultCodes",
    "name",
    "username",
    "domainName",
    "userBreakpoint",
    "noRetry",
    "decisionBands"
})
public class GlobalAuthenticationDetails
    extends GlobalAuthentication
{

    @XmlElementRef(name = "InputData", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalInputData> inputData;
    @XmlElementRef(name = "ResultCodes", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckResultCodes> resultCodes;
    @XmlElementRef(name = "Name", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Username", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "DomainName", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domainName;
    @XmlElement(name = "UserBreakpoint")
    @XmlSchemaType(name = "unsignedInt")
    protected Long userBreakpoint;
    @XmlElement(name = "NoRetry")
    protected Boolean noRetry;
    @XmlElementRef(name = "DecisionBands", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfGlobalItemCheckDecisionBands> decisionBands;

    /**
     * Gets the value of the inputData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalInputData }{@code >}
     *     
     */
    public JAXBElement<GlobalInputData> getInputData() {
        return inputData;
    }

    /**
     * Sets the value of the inputData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalInputData }{@code >}
     *     
     */
    public void setInputData(JAXBElement<GlobalInputData> value) {
        this.inputData = value;
    }

    /**
     * Gets the value of the resultCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCodes }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckResultCodes> getResultCodes() {
        return resultCodes;
    }

    /**
     * Sets the value of the resultCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckResultCodes }{@code >}
     *     
     */
    public void setResultCodes(JAXBElement<ArrayOfGlobalItemCheckResultCodes> value) {
        this.resultCodes = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomainName(JAXBElement<String> value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the userBreakpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserBreakpoint() {
        return userBreakpoint;
    }

    /**
     * Sets the value of the userBreakpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserBreakpoint(Long value) {
        this.userBreakpoint = value;
    }

    /**
     * Gets the value of the noRetry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRetry() {
        return noRetry;
    }

    /**
     * Sets the value of the noRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRetry(Boolean value) {
        this.noRetry = value;
    }

    /**
     * Gets the value of the decisionBands property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckDecisionBands }{@code >}
     *     
     */
    public JAXBElement<ArrayOfGlobalItemCheckDecisionBands> getDecisionBands() {
        return decisionBands;
    }

    /**
     * Sets the value of the decisionBands property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfGlobalItemCheckDecisionBands }{@code >}
     *     
     */
    public void setDecisionBands(JAXBElement<ArrayOfGlobalItemCheckDecisionBands> value) {
        this.decisionBands = value;
    }

}
