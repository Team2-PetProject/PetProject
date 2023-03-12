package com.dto;

public class CartDTO {
	private int Cart_Code;
	private String Member_Code;
	private String Cart_Amount;
	private String Item_Spec;
	private String Item_Taste;
	private String Item_Code;
	private String Item_Category;
	private String Item_Name;
	private String Item_Info;
	private int Item_Price;
	private String Item_Image;
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDTO(int cart_Code, String member_Code, String cart_Amount, String item_Spec, String item_Taste,
			String item_Code, String item_Category, String item_Name, String item_Info, int item_Price,
			String item_Image) {
		super();
		Cart_Code = cart_Code;
		Member_Code = member_Code;
		Cart_Amount = cart_Amount;
		Item_Spec = item_Spec;
		Item_Taste = item_Taste;
		Item_Code = item_Code;
		Item_Category = item_Category;
		Item_Name = item_Name;
		Item_Info = item_Info;
		Item_Price = item_Price;
		Item_Image = item_Image;
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
	public String getItem_Code() {
		return Item_Code;
	}
	public void setItem_Code(String item_Code) {
		Item_Code = item_Code;
	}
	public String getItem_Category() {
		return Item_Category;
	}
	public void setItem_Category(String item_Category) {
		Item_Category = item_Category;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public String getItem_Info() {
		return Item_Info;
	}
	public void setItem_Info(String item_Info) {
		Item_Info = item_Info;
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
	@Override
	public String toString() {
		return "CartDTO [Cart_Code=" + Cart_Code + ", Member_Code=" + Member_Code + ", Cart_Amount=" + Cart_Amount
				+ ", Item_Spec=" + Item_Spec + ", Item_Taste=" + Item_Taste + ", Item_Code=" + Item_Code
				+ ", Item_Category=" + Item_Category + ", Item_Name=" + Item_Name + ", Item_Info=" + Item_Info
				+ ", Item_Price=" + Item_Price + ", Item_Image=" + Item_Image + "]";
	}
	
}
