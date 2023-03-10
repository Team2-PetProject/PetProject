package com.dto;

public class MemberDTO {
	private String Member_code;
	private String Member_passwd;
	private String Member_name;
	private String Member_post;
	private String Member_Addr1;
	private String Member_Addr2;
	private String Member_Phone1;
	private String Member_Phone2;
	private String Member_Phone3;
	private String Member_Email1;
	private String Member_Email2;
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDTO(String member_code, String member_passwd, String member_name, String member_post,
			String member_Addr1, String member_Addr2, String member_Phone1, String member_Phone2, String member_Phone3,
			String member_Email1, String member_Email2) {
		super();
		Member_code = member_code;
		Member_passwd = member_passwd;
		Member_name = member_name;
		Member_post = member_post;
		Member_Addr1 = member_Addr1;
		Member_Addr2 = member_Addr2;
		Member_Phone1 = member_Phone1;
		Member_Phone2 = member_Phone2;
		Member_Phone3 = member_Phone3;
		Member_Email1 = member_Email1;
		Member_Email2 = member_Email2;
	}
	public String getMember_code() {
		return Member_code;
	}
	public void setMember_code(String member_code) {
		Member_code = member_code;
	}
	public String getMember_passwd() {
		return Member_passwd;
	}
	public void setMember_passwd(String member_passwd) {
		Member_passwd = member_passwd;
	}
	public String getMember_name() {
		return Member_name;
	}
	public void setMember_name(String member_name) {
		Member_name = member_name;
	}
	public String getMember_post() {
		return Member_post;
	}
	public void setMember_post(String member_post) {
		Member_post = member_post;
	}
	public String getMember_Addr1() {
		return Member_Addr1;
	}
	public void setMember_Addr1(String member_Addr1) {
		Member_Addr1 = member_Addr1;
	}
	public String getMember_Addr2() {
		return Member_Addr2;
	}
	public void setMember_Addr2(String member_Addr2) {
		Member_Addr2 = member_Addr2;
	}
	public String getMember_Phone1() {
		return Member_Phone1;
	}
	public void setMember_Phone1(String member_Phone1) {
		Member_Phone1 = member_Phone1;
	}
	public String getMember_Phone2() {
		return Member_Phone2;
	}
	public void setMember_Phone2(String member_Phone2) {
		Member_Phone2 = member_Phone2;
	}
	public String getMember_Phone3() {
		return Member_Phone3;
	}
	public void setMember_Phone3(String member_Phone3) {
		Member_Phone3 = member_Phone3;
	}
	public String getMember_Email1() {
		return Member_Email1;
	}
	public void setMember_Email1(String member_Email1) {
		Member_Email1 = member_Email1;
	}
	public String getMember_Email2() {
		return Member_Email2;
	}
	public void setMember_Email2(String member_Email2) {
		Member_Email2 = member_Email2;
	}
	@Override
	public String toString() {
		return "MemberDTO [Member_code=" + Member_code + ", Member_passwd=" + Member_passwd + ", Member_name="
				+ Member_name + ", Member_post=" + Member_post + ", Member_Addr1=" + Member_Addr1 + ", Member_Addr2="
				+ Member_Addr2 + ", Member_Phone1=" + Member_Phone1 + ", Member_Phone2=" + Member_Phone2
				+ ", Member_Phone3=" + Member_Phone3 + ", Member_Email1=" + Member_Email1 + ", Member_Email2="
				+ Member_Email2 + "]";
	}
	
	
	
}