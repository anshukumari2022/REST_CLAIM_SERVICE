//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.allstate.claim;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PolicyDetails" type="{http://allstate.com/claim}PolicyDetails"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyDetails"
})
@XmlRootElement(name = "GetPolicyDetailsResponse")
public class GetPolicyDetailsResponse {

    @XmlElement(name = "PolicyDetails", required = true)
    protected PolicyDetails policyDetails;

    /**
     * Gets the value of the policyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDetails }
     *     
     */
    public PolicyDetails getPolicyDetails() {
        return policyDetails;
    }

    /**
     * Sets the value of the policyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDetails }
     *     
     */
    public void setPolicyDetails(PolicyDetails value) {
        this.policyDetails = value;
    }

}
