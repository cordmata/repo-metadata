//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 05:13:02 PM MST 
//


package eml.ecoinformatics_org.literature_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import eml.ecoinformatics_org.party_2_1.ResponsibleParty;


/**
 * <p>Java class for Chapter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Chapter">
 *   &lt;complexContent>
 *     &lt;extension base="{eml://ecoinformatics.org/literature-2.1.1}Book">
 *       &lt;sequence>
 *         &lt;element name="chapterNumber" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *         &lt;element name="editor" type="{eml://ecoinformatics.org/party-2.1.1}ResponsibleParty" maxOccurs="unbounded"/>
 *         &lt;element name="bookTitle" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType"/>
 *         &lt;element name="pageRange" type="{eml://ecoinformatics.org/resource-2.1.1}NonEmptyStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Chapter", propOrder = {
    "chapterNumber",
    "editor",
    "bookTitle",
    "pageRange"
})
@XmlSeeAlso({
    ConferenceProceedings.class
})
public class Chapter
    extends Book
{

    protected String chapterNumber;
    @XmlElement(required = true)
    protected List<ResponsibleParty> editor;
    @XmlElement(required = true)
    protected String bookTitle;
    protected String pageRange;

    /**
     * Gets the value of the chapterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapterNumber() {
        return chapterNumber;
    }

    /**
     * Sets the value of the chapterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterNumber(String value) {
        this.chapterNumber = value;
    }

    /**
     * Gets the value of the editor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEditor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsibleParty }
     * 
     * 
     */
    public List<ResponsibleParty> getEditor() {
        if (editor == null) {
            editor = new ArrayList<ResponsibleParty>();
        }
        return this.editor;
    }

    /**
     * Gets the value of the bookTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the value of the bookTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookTitle(String value) {
        this.bookTitle = value;
    }

    /**
     * Gets the value of the pageRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageRange() {
        return pageRange;
    }

    /**
     * Sets the value of the pageRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageRange(String value) {
        this.pageRange = value;
    }

}