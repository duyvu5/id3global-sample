
package com.starlix.service.id3;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalEmployment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalEmployment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResidenceType" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalResidenceType" minOccurs="0"/&gt;
 *         &lt;element name="EmploymentStatus" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalEmploymentStatus" minOccurs="0"/&gt;
 *         &lt;element name="CurrentTime" type="{http://www.id3global.com/ID3gWS/2013/04}GlobalCurrentTime" minOccurs="0"/&gt;
 *         &lt;element name="Salary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalEmployment", propOrder = {
    "residenceType",
    "employmentStatus",
    "currentTime",
    "salary"
})
public class GlobalEmployment {

    @XmlElementRef(name = "ResidenceType", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalResidenceType> residenceType;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalEmploymentStatus> employmentStatus;
    @XmlElementRef(name = "CurrentTime", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<GlobalCurrentTime> currentTime;
    @XmlElementRef(name = "Salary", namespace = "http://www.id3global.com/ID3gWS/2013/04", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salary;

    /**
     * Gets the value of the residenceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalResidenceType }{@code >}
     *     
     */
    public JAXBElement<GlobalResidenceType> getResidenceType() {
        return residenceType;
    }

    /**
     * Sets the value of the residenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalResidenceType }{@code >}
     *     
     */
    public void setResidenceType(JAXBElement<GlobalResidenceType> value) {
        this.residenceType = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmploymentStatus }{@code >}
     *     
     */
    public JAXBElement<GlobalEmploymentStatus> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalEmploymentStatus }{@code >}
     *     
     */
    public void setEmploymentStatus(JAXBElement<GlobalEmploymentStatus> value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GlobalCurrentTime }{@code >}
     *     
     */
    public JAXBElement<GlobalCurrentTime> getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GlobalCurrentTime }{@code >}
     *     
     */
    public void setCurrentTime(JAXBElement<GlobalCurrentTime> value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalary(JAXBElement<String> value) {
        this.salary = value;
    }

}
