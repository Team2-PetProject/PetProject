package com.dto;

public class CartDTO {
	private int Cart_Code;
	private String Member_Code;
	private String Cart_Amount;
	private String Item_Code;
	private String Cart_Size;
	private String Cart_Color;
	private String Cart_Taste;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int cart_Code, String member_Code, String cart_Amount, String item_Code, String cart_Size,
			String cart_Color, String cart_Taste) {
		super();
		Cart_Code = cart_Code;
		Member_Code = member_Code;
		Cart_Amount = cart_Amount;
		Item_Code = item_Code;
		Cart_Size = cart_Size;
		Cart_Color = cart_Color;
		Cart_Taste = cart_Taste;
	}
	public int getCart_Code() {
		return Cart_Code;
	}
	public void setCart_Code(int cart_Code) {
		Cart_Code = cart_Code;
	}
	public String getMember_Code() {
		return Member_Code;
	}
	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}
	public String getCart_Amount() {
		return Cart_Amount;
	}
	public void setCart_Amount(String cart_Amount) {
		Cart_Amount = cart_Amount;
	}
	public String getItem_Code() {
		return Item_Code;
	}
	public void setItem_Code(String item_Code) {
		Item_Code = item_Code;
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
		return "CartDTO [Cart_Code=" + Cart_Code + ", Member_Code=" + Member_Code + ", Cart_Amount=" + Cart_Amount
				+ ", Item_Code=" + Item_Code + ", Cart_Size=" + Cart_Size + ", Cart_Color=" + Cart_Color
				+ ", Cart_Taste=" + Cart_Taste + "]";
	}
	
}
