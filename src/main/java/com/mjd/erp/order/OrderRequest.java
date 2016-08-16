
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
 *         &lt;element ref="{http://www.mjd.com/edi/Order/v1.0}OrderReqBody"/&gt;
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
    "orderReqBody"
})
@XmlRootElement(name = "OrderRequest")
public class OrderRequest {

    @XmlElement(name = "Header", namespace = "http://www.mjd.com/edi/Order/v1.0", required = true)
    protected Header header;
    @XmlElement(name = "OrderReqBody", namespace = "http://www.mjd.com/edi/Order/v1.0", required = true)
    protected OrderReqBody orderReqBody;

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
     * Gets the value of the orderReqBody property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReqBody }
     *     
     */
    public OrderReqBody getOrderReqBody() {
        return orderReqBody;
    }

    /**
     * Sets the value of the orderReqBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReqBody }
     *     
     */
    public void setOrderReqBody(OrderReqBody value) {
        this.orderReqBody = value;
    }

}
