//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.party_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import eml.ecoinformatics_org.resource_2_1.I18NNonEmptyStringType;
import eml.ecoinformatics_org.resource_2_1.ScopeType;


/**
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element name="deliveryPoint" type="{eml://ecoinformatics.org/resource-2.1.1}i18nNonEmptyStringType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="city" type="{eml://ecoinformatics.org/resource-2.1.1}i18nNonEmptyStringType" minOccurs="0"/>
 *           &lt;element name="administrativeArea" type="{eml://ecoinformatics.org/resource-2.1.1}i18nNonEmptyStringType" minOccurs="0"/>
 *           &lt;element name="postalCode" type="{eml://ecoinformatics.org/resource-2.1.1}i18nNonEmptyStringType" minOccurs="0"/>
 *           &lt;element name="country" type="{eml://ecoinformatics.org/resource-2.1.1}i18nNonEmptyStringType" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;group ref="{eml://ecoinformatics.org/resource-2.1.1}ReferencesGroup"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{eml://ecoinformatics.org/resource-2.1.1}IDType" />
 *       &lt;attribute name="system" type="{eml://ecoinformatics.org/resource-2.1.1}SystemType" />
 *       &lt;attribute name="scope" type="{eml://ecoinformatics.org/resource-2.1.1}ScopeType" default="document" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = {
    "deliveryPoint",
    "city",
    "administrativeArea",
    "postalCode",
    "country",
    "references"
})
public class Address {

    protected List<I18NNonEmptyStringType> deliveryPoint;
    protected I18NNonEmptyStringType city;
    protected I18NNonEmptyStringType administrativeArea;
    protected I18NNonEmptyStringType postalCode;
    protected I18NNonEmptyStringType country;
    protected eml.ecoinformatics_org.view_2_1.ViewType.References references;
    @XmlAttribute(name = "id")
    protected List<String> id;
    @XmlAttribute(name = "system")
    protected List<String> system;
    @XmlAttribute(name = "scope")
    protected ScopeType scope;

    /**
     * Gets the value of the deliveryPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link I18NNonEmptyStringType }
     * 
     * 
     */
    public List<I18NNonEmptyStringType> getDeliveryPoint() {
        if (deliveryPoint == null) {
            deliveryPoint = new ArrayList<I18NNonEmptyStringType>();
        }
        return this.deliveryPoint;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public I18NNonEmptyStringType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public void setCity(I18NNonEmptyStringType value) {
        this.city = value;
    }

    /**
     * Gets the value of the administrativeArea property.
     * 
     * @return
     *     possible object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public I18NNonEmptyStringType getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Sets the value of the administrativeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public void setAdministrativeArea(I18NNonEmptyStringType value) {
        this.administrativeArea = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public I18NNonEmptyStringType getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public void setPostalCode(I18NNonEmptyStringType value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public I18NNonEmptyStringType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link I18NNonEmptyStringType }
     *     
     */
    public void setCountry(I18NNonEmptyStringType value) {
        this.country = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link eml.ecoinformatics_org.view_2_1.ViewType.References }
     *     
     */
    public eml.ecoinformatics_org.view_2_1.ViewType.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link eml.ecoinformatics_org.view_2_1.ViewType.References }
     *     
     */
    public void setReferences(eml.ecoinformatics_org.view_2_1.ViewType.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getId() {
        if (id == null) {
            id = new ArrayList<String>();
        }
        return this.id;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSystem() {
        if (system == null) {
            system = new ArrayList<String>();
        }
        return this.system;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeType }
     *     
     */
    public ScopeType getScope() {
        if (scope == null) {
            return ScopeType.DOCUMENT;
        } else {
            return scope;
        }
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeType }
     *     
     */
    public void setScope(ScopeType value) {
        this.scope = value;
    }

}