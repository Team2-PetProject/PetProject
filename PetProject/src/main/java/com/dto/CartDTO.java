package com.dto;

public class CartDTO {
	private int Cart_Code;
	private String Member_Code;
	private String Cart_Amount;
	private String Item_Spec;
	private String Item_Taste;
	private String Item_Color;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int cart_Code, String member_Code, String cart_Amount, String item_Spec, String item_Taste) {
		super();
		Cart_Code = cart_Code;
		Member_Code = member_Code;
		Cart_Amount = cart_Amount;
		Item_Spec = item_Spec;
		Item_Taste = item_Taste;
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
	public String getItem_Spec() {
		return Item_Spec;
	}
	public void setItem_Spec(String item_Spec) {
		Item_Spec = item_Spec;
	}
	public String getItem_Taste() {
		return Item_Taste;
	}
	public void setItem_Taste(String item_Taste) {
		Item_Taste = item_Taste;
	}
	@Override
	public String toString() {
		return "CartDTO [Cart_Code=" + Cart_Code + ", Member_Code=" + Member_Code + ", Cart_Amount=" + Cart_Amount
				+ ", Item_Spec=" + Item_Spec + ", Item_Taste=" + Item_Taste + "]";
	}
	
}
