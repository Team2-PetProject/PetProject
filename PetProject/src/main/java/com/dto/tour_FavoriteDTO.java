package com.dto;

public class tour_FavoriteDTO {
	private String tour_code;
	private String member_code;
	
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
	@Override
	public String toString() {
		return "tour_FavoritDTO [tour_code=" + tour_code + ", member_code=" + member_code + "]";
	}

	public tour_FavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tour_FavoriteDTO(String tour_code, String member_code) {
		super();
		this.tour_code = tour_code;
		this.member_code = member_code;
	}


	
}
