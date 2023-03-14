package com.dto;

public class OrderHistoryDTO {
	private String member_code;
	private String item_name;
	private String item_image;
	private int item_price;
	private int cart_amount;
	private String orderinfo_orderday;
public String getMember_code() {
		return member_code;
	}
	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getItem_image() {
		return item_image;
	}
	public void setItem_image(String item_image) {
		this.item_image = item_image;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getCart_amount() {
		return cart_amount;
	}
	public void setCart_amount(int cart_amount) {
		this.cart_amount = cart_amount;
	}
	public String getOrderinfo_orderday() {
		return orderinfo_orderday;
	}
	public void setOrderinfo_orderday(String orderinfo_orderday) {
		this.orderinfo_orderday = orderinfo_orderday;
	}
@Override
	public String toString() {
		return "OrderHistoryDTO [member_code=" + member_code + ", item_name=" + item_name + ", item_image=" + item_image
				+ ", item_price=" + item_price + ", cart_amount=" + cart_amount + ", orderinfo_orderday="
				+ orderinfo_orderday + "]";
	}

public OrderHistoryDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public OrderHistoryDTO(String member_code, String item_name, String item_image, int item_price, int cart_amount,
		String orderinfo_orderday) {
	super();
	this.member_code = member_code;
	this.item_name = item_name;
	this.item_image = item_image;
	this.item_price = item_price;
	this.cart_amount = cart_amount;
	this.orderinfo_orderday = orderinfo_orderday;
}




}
