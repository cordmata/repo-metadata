//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.28 at 12:09:31 PM MST 
//


package org.datacite.v41;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for box complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="box">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="westBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/>
 *         &lt;element name="eastBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/>
 *         &lt;element name="southBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/>
 *         &lt;element name="northBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "box", propOrder = {

})
public class Box {

    protected float westBoundLongitude;
    protected float eastBoundLongitude;
    protected float southBoundLatitude;
    protected float northBoundLatitude;

    /**
     * Gets the value of the westBoundLongitude property.
     * 
     */
    public float getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Sets the value of the westBoundLongitude property.
     * 
     */
    public void setWestBoundLongitude(float value) {
        this.westBoundLongitude = value;
    }

    /**
     * Gets the value of the eastBoundLongitude property.
     * 
     */
    public float getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Sets the value of the eastBoundLongitude property.
     * 
     */
    public void setEastBoundLongitude(float value) {
        this.eastBoundLongitude = value;
    }

    /**
     * Gets the value of the southBoundLatitude property.
     * 
     */
    public float getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Sets the value of the southBoundLatitude property.
     * 
     */
    public void setSouthBoundLatitude(float value) {
        this.southBoundLatitude = value;
    }

    /**
     * Gets the value of the northBoundLatitude property.
     * 
     */
    public float getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Sets the value of the northBoundLatitude property.
     * 
     */
    public void setNorthBoundLatitude(float value) {
        this.northBoundLatitude = value;
    }

}
