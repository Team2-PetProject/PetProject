package com.dto;

public class TourFavoriteDTO {
	private int Tour_Code;
	private String Member_Code;

	public TourFavoriteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TourFavoriteDTO(int tour_Code, String member_Code) {
		super();
		Tour_Code = tour_Code;
		Member_Code = member_Code;
	}

	public int getTour_Code() {
		return Tour_Code;
	}

	public void setTour_Code(int tour_Code) {
		Tour_Code = tour_Code;
	}

	public String getMember_Code() {
		return Member_Code;
	}

	public void setMember_Code(String member_Code) {
		Member_Code = member_Code;
	}

	@Override
	public String toString() {
		return "TourFavoriteDTO [Tour_Code=" + Tour_Code + ", Member_Code=" + Member_Code + "]";
	}

	
	
}
