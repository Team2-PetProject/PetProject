package com.dto;

public class item_FavoriteDTO {
	
	private String member_code;
	private String item_Code;
	
	public String getMember_code() {
		return member_code;
	}
	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}
	public String getItem_Code() {
		return item_Code;
	}
	public void setItem_Code(String item_Code) {
		this.item_Code = item_Code;
	}
	@Override
	public String toString() {
		return "item_FavoriteDTO [member_code=" + member_code + ", item_Code=" + item_Code + "]";
	}

	public item_FavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public item_FavoriteDTO(String member_code, String item_Code) {
		super();
		this.member_code = member_code;
		this.item_Code = item_Code;
	}
	

	
}
