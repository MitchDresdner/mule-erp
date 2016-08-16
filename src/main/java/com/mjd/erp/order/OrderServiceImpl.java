package com.mjd.erp.order;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Logger;


import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.WebServiceContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.mjd.erp.order.OrderResponse;
import com.mjd.erp.order.Header;
import com.mjd.erp.order.OrderResponseBody;

//@WebService(endpointInterface = "com.mjd.erp.order.OrderService", serviceName = "OrderService")
//@javax.jws.WebService(targetNamespace = "http://xmlns.example.com/1469188796440",
//		name = "OrderService")
/* serviceName = "OrderService",
portName = "OrderServiceEndpoint1",       
wsdlLocation = "Order.wsdl",
endpointInterface = "com.mjd.erp.order.OrderService")
*/

public class OrderServiceImpl implements OrderService {

	// @Resource
	// private WebServiceContext context;

	private static final Logger LOG = Logger.getLogger(OrderServiceImpl.class.getName());
	
	private static DatatypeFactory df = null;
	
	static {
	  try {
	    df = DatatypeFactory.newInstance();
	  } catch(DatatypeConfigurationException e) {
	    throw new IllegalStateException("ERROR: Instantiating DatatypeFactory: ", e);
	  }
	}
	
	public static XMLGregorianCalendar getXMLPlacementDate(Date date) {
	
		if (df == null) { return null; }
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(date.getTime());
		
		return df.newXMLGregorianCalendar(gc);
	}
	

	public void addItem (OrderItems items, String orderItemId, String orderId) {
		
		items.getOrderItem().add(new OrderItems.OrderItem (orderItemId, orderId));
	}
	
	public OrderResponse operation(OrderRequest request) throws OrderFault {

		LOG.info("Executing operation operation");
		System.out.println(request);

		try {

			Header hdr = new Header();

			hdr.setRequestGuid(request.getHeader().getRequestGuid());
			hdr.setRequestTimestamp(getXMLPlacementDate(new Date()));

			OrderItems items = new OrderItems();

			OrderType order = new OrderType();
			order.setComment("Prompt shipping");
			order.setOrderItems(items);

			OrderResponseBody body = new OrderResponseBody();
			body.setOrder(order);

			OrderResponse resp = new OrderResponse();
			resp.setHeader(hdr);
			resp.setOrderResponseBody(body);

			return resp;

		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}


	}

}
