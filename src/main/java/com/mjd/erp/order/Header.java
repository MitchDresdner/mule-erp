
package com.mjd.erp.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestGuid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestGuid",
    "requestTimestamp"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(required = true)
    protected String requestGuid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTimestamp;

    /**
     * Gets the value of the requestGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestGuid() {
        return requestGuid;
    }

    /**
     * Sets the value of the requestGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestGuid(String value) {
        this.requestGuid = value;
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTimestamp(XMLGregorianCalendar value) {
        this.requestTimestamp = value;
    }

}