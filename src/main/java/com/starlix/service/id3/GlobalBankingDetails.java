
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalBankingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalBankingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankAccount" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalBankAccount" minOccurs="0"/&gt;
 *         &lt;element name="CreditDebitCard" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCreditDebitCard" minOccurs="0"/&gt;
 *         &lt;element name="China" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalChinaBank" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalBankingDetails", propOrder = {
    "bankAccount",
    "creditDebitCard",
    "china"
})
public class GlobalBankingDetails {

    @XmlElementRef(name = "BankAccount", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalBankAccount> bankAccount;
    @XmlElementRef(name = "CreditDebitCard", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCreditDebitCard> creditDebitCard;
    @XmlElementRef(name = "China", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalChinaBank> china;

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalBankAccount }{@code >}
     *     
     */
    public JAXBElement<GlobalBankAccount> getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalBankAccount }{@code >}
     *     
     */
    public void setBankAccount(JAXBElement<GlobalBankAccount> value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the creditDebitCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCreditDebitCard }{@code >}
     *     
     */
    public JAXBElement<GlobalCreditDebitCard> getCreditDebitCard() {
        return creditDebitCard;
    }

    /**
     * Sets the value of the creditDebitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCreditDebitCard }{@code >}
     *     
     */
    public void setCreditDebitCard(JAXBElement<GlobalCreditDebitCard> value) {
        this.creditDebitCard = value;
    }

    /**
     * Gets the value of the china property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaBank }{@code >}
     *     
     */
    public JAXBElement<GlobalChinaBank> getChina() {
        return china;
    }

    /**
     * Sets the value of the china property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalChinaBank }{@code >}
     *     
     */
    public void setChina(JAXBElement<GlobalChinaBank> value) {
        this.china = value;
    }

}
