
import com.mjd.erp.order.Items
import com.mjd.erp.order.OrderItems

ordItem = flowVars.orders[counter - 1]

OrderItems.OrderItem oi = new OrderItems.OrderItem ()

oi.orderItemId = ordItem.ORDERITEMID
oi.orderId = ordItem.ORDERID
oi.itemCount = ordItem.ITEMCOUNT

Items it = new Items()
oi.items = it
	
for (itm in message.payload) {
	Items.Item item = new Items.Item()
	
	item.itemId = itm.ITEMID		// message.payload.ITEMID
	item.itemName = itm.ITEMNAME	// message.payload.ITEMNAME
	item.itemQty  = itm.ITEMQTY
	item.unitPrice = itm.ITEMCOST	// message.payload.ITEMCOST[0]
	
	
	
	it.item.add(item)
}
	
flowVars.orderMsg.orderResponseBody.order.orderItems.orderItem.add(oi)
