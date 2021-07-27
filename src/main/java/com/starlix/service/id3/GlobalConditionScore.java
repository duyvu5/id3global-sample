
package com.starlix.service.id3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalConditionScore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalConditionScore"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScoreTargetVal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TrueIfGTEQ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalConditionScore", propOrder = {
    "scoreTargetVal",
    "trueIfGTEQ"
})
public class GlobalConditionScore {

    @XmlElement(name = "ScoreTargetVal")
    protected Integer scoreTargetVal;
    @XmlElement(name = "TrueIfGTEQ")
    protected Boolean trueIfGTEQ;

    /**
     * Gets the value of the scoreTargetVal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScoreTargetVal() {
        return scoreTargetVal;
    }

    /**
     * Sets the value of the scoreTargetVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScoreTargetVal(Integer value) {
        this.scoreTargetVal = value;
    }

    /**
     * Gets the value of the trueIfGTEQ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrueIfGTEQ() {
        return trueIfGTEQ;
    }

    /**
     * Sets the value of the trueIfGTEQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrueIfGTEQ(Boolean value) {
        this.trueIfGTEQ = value;
    }

}
