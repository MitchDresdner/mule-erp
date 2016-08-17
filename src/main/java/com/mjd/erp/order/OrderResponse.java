
package com.mjd.erp.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.mjd.com/edi/Order/v1.0}Header"/&gt;
 *         &lt;element ref="{http://www.mjd.com/edi/Order/v1.0}OrderResponseBody"/&gt;
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
    "header",
    "orderResponseBody"
})
@XmlRootElement(name = "OrderResponse")
public class OrderResponse {

    @XmlElement(name = "Header", namespace = "http://www.mjd.com/edi/Order/v1.0", required = true)
    protected Header header;
    @XmlElement(name = "OrderResponseBody", namespace = "http://www.mjd.com/edi/Order/v1.0", required = true)
    protected OrderResponseBody orderResponseBody;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the orderResponseBody property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseBody }
     *     
     */
    public OrderResponseBody getOrderResponseBody() {
        return orderResponseBody;
    }

    /**
     * Sets the value of the orderResponseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseBody }
     *     
     */
    public void setOrderResponseBody(OrderResponseBody value) {
        this.orderResponseBody = value;
    }

}
