create database mule;
use mule;

#
# https://docs.jboss.org/hibernate/stable/core.old/reference/en/html/example-mappings-customerorderproduct.html
#
CREATE USER muser IDENTIFIED BY 'mulepw'; 

grant usage on *.* to muser@localhost identified by 'mulepw'; 
grant all privileges on mule.* to muser@localhost;

create table Orders ( 
	OrderId 	INT NOT NULL AUTO_INCREMENT,
	PlacementDate 	DATE NOT NULL,
	CustomerName	VARCHAR(100) NOT NULL
);

create table OrderItems ( 
	OrderItemId
	OrderId
	ItemId
	ItemCount
);

create table Items ( 
	ItemId
	ItemName
	ItemCost
);

