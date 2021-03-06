
package com.mjd.erp.order;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.mjd.erp.order.OrderRequest;
import com.mjd.erp.order.OrderResponse;
import com.mjd.erp.order.Header;
import com.mjd.erp.order.OrderReqBody;
import com.mjd.erp.order.OrderType;


/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-07-28T13:56:07.901-04:00
 * Generated source version: 3.1.6
 * 
 */
public final class OrderService_OrderServiceEndpoint1_Client {

    private static final QName SERVICE_NAME = new QName("http://xmlns.example.com/1469188796440", "Order");

    private OrderService_OrderServiceEndpoint1_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Order.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Order ss = new Order(wsdlURL, SERVICE_NAME);
        OrderService port = ss.getOrderServiceEndpoint1();  
        
        System.out.println("Invoking operation...");
        
        try {
        
	    OrderRequest req = new OrderRequest();

	    Header hdr = new Header();
	    hdr.setRequestGuid("9997");
	    // XMLGregorianCalendar: hdr.setRequestTimestamp("2016-07-28T14:20:00");
	
	    OrderReqBody body = new OrderReqBody();
	    body.setOrderGuid("10101010");
	    
	    req.setHeader(hdr);
	    req.setOrderReqBody(body);

            OrderResponse resp = port.operation(req);
            System.out.println("Order Guid: " + resp.getHeader().getRequestGuid());
            
            

        } catch (OrderFault e) { 
            System.out.println("Expected exception: OrderFault has occurred.");
            System.out.println(e.toString());
        }

        System.exit(0);
    }

}