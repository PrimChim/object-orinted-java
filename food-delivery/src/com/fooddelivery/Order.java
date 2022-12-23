package com.fooddelivery;

public class Order {
	  private String menuItem;
	  private String name;
	  private String address;

	  public Order(String menuItem, String name, String address) {
	    this.menuItem = menuItem;
	    this.name = name;
	    this.address = address;
	  }

	  public String getMenuItem() {
	    return menuItem;
	  }

	  public String getName() {
	    return name;
	  }

	  public String getAddress() {
	    return address;
	  }
	}