
package com.mjd.erp.order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mjd.edi.order.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Order_QNAME = new QName("http://www.mjd.com/edi/Order/v1.0", "Order");
    private final static QName _Comment_QNAME = new QName("http://www.mjd.com/edi/Order/v1.0", "comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mjd.edi.order.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderItems }
     * 
     */
    public OrderItems createOrderItems() {
        return new OrderItems();
    }

    /**
     * Create an instance of {@link Items }
     * 
     */
    public Items createItems() {
        return new Items();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link OrderType }
     * 
     */
    public OrderType createOrderType() {
        return new OrderType();
    }

    /**
     * Create an instance of {@link OrderReqBody }
     * 
     */
    public OrderReqBody createOrderReqBody() {
        return new OrderReqBody();
    }

    /**
     * Create an instance of {@link OrderRequest }
     * 
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link OrderResponse }
     * 
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link OrderResponseBody }
     * 
     */
    public OrderResponseBody createOrderResponseBody() {
        return new OrderResponseBody();
    }

    /**
     * Create an instance of {@link ServiceSoapFault }
     * 
     */
    public ServiceSoapFault createServiceSoapFault() {
        return new ServiceSoapFault();
    }

    /**
     * Create an instance of {@link OrderItems.OrderItem }
     * 
     */
    public OrderItems.OrderItem createOrderItemsOrderItem() {
        return new OrderItems.OrderItem();
    }

    /**
     * Create an instance of {@link Items.Item }
     * 
     */
    public Items.Item createItemsItem() {
        return new Items.Item();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mjd.com/edi/Order/v1.0", name = "Order")
    public JAXBElement<OrderType> createOrder(OrderType value) {
        return new JAXBElement<OrderType>(_Order_QNAME, OrderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mjd.com/edi/Order/v1.0", name = "comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

}