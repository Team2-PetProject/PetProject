package com.dto;

public class MemberDTO {
	private String member_code;
	private String member_passwd;
	private String member_name;
	private String member_post;
	private String member_addr1;
	private String member_addr2; 
	private String member_phone1; 
	private String member_phone2; 
	private String member_phone3;
	private String member_email1; 
	private String member_email2;
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String member_code, String member_passwd, String member_name, String member_post,
			String member_addr1, String member_addr2, String member_phone1, String member_phone2, String member_phone3,
			String member_email1, String member_email2) {
		super();
		this.member_code = member_code;
		this.member_passwd = member_passwd;
		this.member_name = member_name;
		this.member_post = member_post;
		this.member_addr1 = member_addr1;
		this.member_addr2 = member_addr2;
		this.member_phone1 = member_phone1;
		this.member_phone2 = member_phone2;
		this.member_phone3 = member_phone3;
		this.member_email1 = member_email1;
		this.member_email2 = member_email2;
	}

	public String getMember_code() {
		return member_code;
	}

	public void setMember_code(String member_code) {
		this.member_code = member_code;
	}

	public String getMember_passwd() {
		return member_passwd;
	}

	public void setMember_passwd(String member_passwd) {
		this.member_passwd = member_passwd;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_post() {
		return member_post;
	}

	public void setMember_post(String member_post) {
		this.member_post = member_post;
	}

	public String getMember_addr1() {
		return member_addr1;
	}

	public void setMember_addr1(String member_addr1) {
		this.member_addr1 = member_addr1;
	}

	public String getMember_addr2() {
		return member_addr2;
	}

	public void setMember_addr2(String member_addr2) {
		this.member_addr2 = member_addr2;
	}

	public String getMember_phone1() {
		return member_phone1;
	}

	public void setMember_phone1(String member_phone1) {
		this.member_phone1 = member_phone1;
	}

	public String getMember_phone2() {
		return member_phone2;
	}

	public void setMember_phone2(String member_phone2) {
		this.member_phone2 = member_phone2;
	}

	public String getMember_phone3() {
		return member_phone3;
	}

	public void setMember_phone3(String member_phone3) {
		this.member_phone3 = member_phone3;
	}

	public String getMember_email1() {
		return member_email1;
	}

	public void setMember_email1(String member_email1) {
		this.member_email1 = member_email1;
	}

	public String getMember_email2() {
		return member_email2;
	}

	public void setMember_email2(String member_email2) {
		this.member_email2 = member_email2;
	}

	@Override
	public String toString() {
		return "MemberDTO [member_code=" + member_code + ", member_passwd=" + member_passwd + ", member_name="
				+ member_name + ", member_post=" + member_post + ", member_addr1=" + member_addr1 + ", member_addr2="
				+ member_addr2 + ", member_phone1=" + member_phone1 + ", member_phone2=" + member_phone2
				+ ", member_phone3=" + member_phone3 + ", member_email1=" + member_email1 + ", member_email2="
				+ member_email2 + "]";
	}
	
	
}
	