
package com.mjd.erp.order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItems"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderItem" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="items" type="{http://www.mjd.com/edi/Order/v1.0}Items"/&gt;
 *                   &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItems", propOrder = {
    "orderItem"
})
public class OrderItems {

    @XmlElement(required = true)
    protected List<OrderItems.OrderItem> orderItem;

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItems.OrderItem }
     * 
     * 
     */
    public List<OrderItems.OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderItems.OrderItem>();
        }
        return this.orderItem;
    }


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
     *         &lt;element name="orderItemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="items" type="{http://www.mjd.com/edi/Order/v1.0}Items"/&gt;
     *         &lt;element name="itemCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "orderItemId",
        "orderId",
        "items",
        "itemCount"
    })
    public static class OrderItem {

        @XmlElement(required = true)
        protected String orderItemId;
        @XmlElement(required = true)
        protected String orderId;
        @XmlElement(required = true)
        protected Items items;
        protected int itemCount=0;

        public OrderItem (){
        	
        }
        
        public OrderItem (String orderItemId, String orderId) {
        	this.orderItemId = orderItemId;
        	this.orderId = orderId;
        	this.itemCount++;
        }
        

        /**
         * Gets the value of the orderItemId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderItemId() {
            return orderItemId;
        }

        /**
         * Sets the value of the orderItemId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderItemId(String value) {
            this.orderItemId = value;
        }

        /**
         * Gets the value of the orderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Sets the value of the orderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
        }

        /**
         * Gets the value of the items property.
         * 
         * @return
         *     possible object is
         *     {@link Items }
         *     
         */
        public Items getItems() {
            return items;
        }

        /**
         * Sets the value of the items property.
         * 
         * @param value
         *     allowed object is
         *     {@link Items }
         *     
         */
        public void setItems(Items value) {
            this.items = value;
        }

        /**
         * Gets the value of the itemCount property.
         * 
         */
        public int getItemCount() {
            return itemCount;
        }

        /**
         * Sets the value of the itemCount property.
         * 
         */
        public void setItemCount(int value) {
            this.itemCount = value;
        }

    }

}