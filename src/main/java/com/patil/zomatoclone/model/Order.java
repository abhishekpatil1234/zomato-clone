package com.patil.zomatoclone.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	int orderId;
	int totalAmount;
	List<Item> item;
	Date orderedOn;
}
