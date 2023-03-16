package com.dto;

public class OrderItemDTO {
	private int OrderItem_Code;
	private int Cart_Code;
	private String Item_Code;
	private int OrderInfo_Code;
	private String Item_Category;
	private String Member_Code;
	private String Order_Name;
	private int Cart_Amount;
	private int Item_Price;
	private String Item_Image;
	private String Item_Name;
	private String Cart_Size;
	private String Cart_Color;
	private String Cart_Taste;
	public OrderItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItemDTO(int orderItem_Code, String item_Code, int orderInfo_Code, String member_Code, String order_Name,
			int cart_Amount, int item_Price, String item_Image, String item_Name, String cart_Size, String cart_Color,
			String cart_Taste) {
		super();
		OrderItem_Code = orderItem_Code;
		Item_Code = item_Code;
		OrderInfo_Code = orderInfo_Code;
		Member_Code = member_Code;
		Order_Name = order_Name;
		Cart_Amount = cart_Amount;
		Item_Price = item_Price;
		Item_Image = item_Image;
		Item_Name = item_Name;
		Cart_Size = cart_Size;
		Cart_Color = cart_Color;
		Cart_Taste = cart_Taste;
	}
	public int getOrderItem_Code() {
		return OrderItem_Code;
	}
	public void setOrderItem_Code(int orderItem_Code) {
		OrderItem_Code = orderItem_Code;
	}
	public int getCart_Code() {
		return Cart_Code;
	}
	public void setCart_Code(int cart_Code) {
		Cart_Code = cart_Code;
	}
	public String getItem_Code() {
		return Item_Code;
	}
	public void setItem_Code(String item_Code) {
		Item_Code = item_Code;
	}
	public int getOrderInfo_Code() {
		return OrderInfo_Code;
	}
	public void setOrderInfo_Code(int orderInfo_Code) {
		OrderInfo_Code = orderInfo_Code;
	}
	public String getItem_Category() {
		return Item_Category;
	}
	public void setItem_Category(String item_Category) {
		Item_Category = item_Category;
	}
	public String getMember_Code() {
		return Member_Code;
	}
	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}
	public String getOrder_Name() {
		return Order_Name;
	}
	public void setOrder_Name(String order_Name) {
		Order_Name = order_Name;
	}
	public int getCart_Amount() {
		return Cart_Amount;
	}
	public void setCart_Amount(int cart_Amount) {
		Cart_Amount = cart_Amount;
	}
	public int getItem_Price() {
		return Item_Price;
	}
	public void setItem_Price(int item_Price) {
		Item_Price = item_Price;
	}
	public String getItem_Image() {
		return Item_Image;
	}
	public void setItem_Image(String item_Image) {
		Item_Image = item_Image;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public String getCart_Size() {
		return Cart_Size;
	}
	public void setCart_Size(String cart_Size) {
		Cart_Size = cart_Size;
	}
	public String getCart_Color() {
		return Cart_Color;
	}
	public void setCart_Color(String cart_Color) {
		Cart_Color = cart_Color;
	}
	public String getCart_Taste() {
		return Cart_Taste;
	}
	public void setCart_Taste(String cart_Taste) {
		Cart_Taste = cart_Taste;
	}
	@Override
	public String toString() {
		return "OrderItemDTO [OrderItem_Code=" + OrderItem_Code + ", Item_Code=" + Item_Code + ", OrderInfo_Code="
				+ OrderInfo_Code + ", Member_Code=" + Member_Code + ", Order_Name=" + Order_Name + ", Cart_Amount="
				+ Cart_Amount + ", Item_Price=" + Item_Price + ", Item_Image=" + Item_Image + ", Item_Name=" + Item_Name
				+ ", Cart_Size=" + Cart_Size + ", Cart_Color=" + Cart_Color + ", Cart_Taste=" + Cart_Taste + "]";
	}
}
