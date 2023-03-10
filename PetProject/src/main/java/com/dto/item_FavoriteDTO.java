package com.dto;

public class item_FavoriteDTO {
	
	private String member_code;
	private String gCode;
	
	public String getMember_code() {
		return member_code;
	}
	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}
	public String getgCode() {
		return gCode;
	}
	public void setgCode(String gCode) {
		this.gCode = gCode;
	}
	@Override
	public String toString() {
		return "item_FavoriteDTO [member_code=" + member_code + ", gCode=" + gCode + "]";
	}

	public item_FavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public item_FavoriteDTO(String member_code, String gCode) {
		super();
		this.member_code = member_code;
		this.gCode = gCode;
	}

	
}
