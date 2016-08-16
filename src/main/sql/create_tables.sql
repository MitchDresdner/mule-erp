create database mule;
use mule;

#
# https://docs.jboss.org/hibernate/stable/core.old/reference/en/html/example-mappings-customerorderproduct.html
#
CREATE USER muser IDENTIFIED BY 'mulepw'; 

grant usage on *.* to muser@localhost identified by 'mulepw'; 
grant all privileges on mule.* to muser@localhost;

# Works for H2 and MySQL
drop table Orders;
create table Orders ( 
	OrderId 	INT NOT NULL AUTO_INCREMENT,
	PlacementDate 	TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	CustomerName   VARCHAR(100) NOT NULL,
    PRIMARY KEY (OrderId)
);

drop table OrderItems;
create table OrderItems ( 
	OrderItemId    VARCHAR(10),
	OrderId VARCHAR(10),
	ItemId  VARCHAR(10),
	ItemCount      INTEGER
);

drop table Items;
create table Items ( 
	ItemId         VARCHAR(10),
    OrderItemId    VARCHAR(10),
	ItemName       VARCHAR(100),
    ItemQty        Integer,
	ItemCost       DECIMAL(5,2)
);


insert into Orders (OrderId, CustomerName) values ('86504', 'Bob Mondavi', {ts '2016-07-30T22:10:15.45'});
insert into Orders (OrderId, CustomerName, PlacementDate) values ('86505', 'Ernie Gallo', {ts '2016-07-29T18:47:52.69'});

insert into OrderItems (OrderItemId, OrderId, ItemId, ItemCount) values ('504-001', '86504', '41531', 1);
insert into OrderItems (OrderItemId, OrderId, ItemId, ItemCount) values ('504-002', '86504', '41217', 3);

insert into OrderItems (OrderItemId, OrderId, ItemId, ItemCount) values ('505-001', '86505', '41918', 1);
insert into OrderItems (OrderItemId, OrderId, ItemId, ItemCount) values ('505-002', '86505', '41506', 2);
insert into OrderItems (OrderItemId, OrderId, ItemId, ItemCount) values ('505-003', '86505', '6509', 2);

insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41531', '504-001', 'Australian Cabernet Sauvignon Kit', 1, 89.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41918', '505-001', 'Chardonnay - Master Vintner', 1, 69.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41217', '504-002', '#8 Straight corks 7/8" x 1-3/4"', 3, 4.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41221', '504-002', 'Red heat shink bottle caps, 25ea', 1, 12.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41309', '504-002', 'Parafin sealing wax, red', 1, 7.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41506', '505-002', 'FastLabel 22 oz. Bomber and Wine Labels - 50 count', 2, 9.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('41512', '505-002', 'Blank Wine Labels, ink jet template - 50 count', 1, 9.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('6509', '505-003', '750 ml Green Glass Claret Bottles, screw top', 1, 14.99);
insert into Items (ItemId, OrderItemId, ItemName, ItemQty, ItemCost) 
    values ('16559', '505-003', 'Bottle cleaning brush and solvent', 1, 8.99);

