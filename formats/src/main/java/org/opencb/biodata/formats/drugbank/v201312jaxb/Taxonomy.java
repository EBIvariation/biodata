//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.18 at 04:12:32 PM CET 
//


package org.opencb.biodata.formats.drugbank.v201312jaxb;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kingdom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://drugbank.ca}substructures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kingdom",
    "substructures"
})
@XmlRootElement(name = "taxonomy")
public class Taxonomy {

    @XmlElement(required = true)
    protected String kingdom;
    @XmlElement(required = true)
    protected Substructures substructures;

    /**
     * Gets the value of the kingdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Sets the value of the kingdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * Gets the value of the substructures property.
     * 
     * @return
     *     possible object is
     *     {@link Substructures }
     *     
     */
    public Substructures getSubstructures() {
        return substructures;
    }

    /**
     * Sets the value of the substructures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Substructures }
     *     
     */
    public void setSubstructures(Substructures value) {
        this.substructures = value;
    }

}
