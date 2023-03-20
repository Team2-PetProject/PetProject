package com.dto;

public class ItemDTO {
	private String Item_Code;
	private String Item_Category;
	private String Item_Name;
	private int Item_Price;
	private String Item_Image;
	private String Item_Taste;
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDTO(String item_Code, String item_Category, String item_Name, int item_Price,
			String item_Image, String item_Taste) {
		super();
		Item_Code = item_Code;
		Item_Category = item_Category;
		Item_Name = item_Name;
		Item_Price = item_Price;
		Item_Image = item_Image;
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
	public String getItem_Taste() {
		return Item_Taste;
	}
	public void setItem_Taste(String item_Taste) {
		Item_Taste = item_Taste;
	}
	@Override
	public String toString() {
		return "ItemDTO [Item_Code=" + Item_Code + ", Item_Category=" + Item_Category + ", Item_Name=" + Item_Name
				+ ", Item_Price=" + Item_Price + ", Item_Image=" + Item_Image + ", Item_Taste=" + Item_Taste + "]";
	}
	
}
