
package com.mjd.erp.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Items complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="item" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="itemQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "Items", propOrder = {
    "item"
})
public class Items {

    @XmlElement(required = true)
    protected List<Items.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Items.Item }
     * 
     * 
     */
    public List<Items.Item> getItem() {
        if (item == null) {
            item = new ArrayList<Items.Item>();
        }
        return this.item;
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
     *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="itemQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "itemId",
        "itemName",
        "unitPrice",
        "itemQty"
    })
    public static class Item {

        @XmlElement(required = true)
        protected String itemId;
        @XmlElement(required = true)
        protected String itemName;
        @XmlElement(required = true)
        protected BigDecimal unitPrice;
        protected int itemQty;

        /**
         * Gets the value of the itemId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemId() {
            return itemId;
        }

        /**
         * Sets the value of the itemId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemId(String value) {
            this.itemId = value;
        }

        /**
         * Gets the value of the itemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemName() {
            return itemName;
        }

        /**
         * Sets the value of the itemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemName(String value) {
            this.itemName = value;
        }

        /**
         * Gets the value of the unitPrice property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitPrice() {
            return unitPrice;
        }

        /**
         * Sets the value of the unitPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitPrice(BigDecimal value) {
            this.unitPrice = value;
        }

        /**
         * Gets the value of the itemQty property.
         * 
         */
        public int getItemQty() {
            return itemQty;
        }

        /**
         * Sets the value of the itemQty property.
         * 
         */
        public void setItemQty(int value) {
            this.itemQty = value;
        }

    }

}
