package org.com;

import java.util.ArrayList;
import java.util.List;

public class HotelBill {

	public List<Item>items;
	
	public HotelBill() {
		items=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		items.add(item);
	}
	public void genrateBill() {
		double total=0.0;
		 System.out.println("------ Hotel Bill ------");
	        for (Item item : items) {
	            System.out.println(item.getName() + "\t$" + item.getPrice());
	            total += item.getPrice();
	        }
	        System.out.println("------------------------");
	        System.out.println("Total\t$" + total);
	}

	
	}
	
	

