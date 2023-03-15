package com.dto;

public class FavoriteDTO {
	
	private String tour_code;
	private String member_code;
	private String item_Code;
	
	public String getTour_code() {
		return tour_code;
	}
	public void setTour_code(String tour_code) {
		this.tour_code = tour_code;
	}
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
		return "FavoritDTO [tour_code=" + tour_code + ", member_code=" + member_code + ", item_Code=" + item_Code + "]";
	}

	public FavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FavoriteDTO(String tour_code, String member_code, String item_Code) {
		super();
		this.tour_code = tour_code;
		this.member_code = member_code;
		this.item_Code = item_Code;
	}
	
	
}
