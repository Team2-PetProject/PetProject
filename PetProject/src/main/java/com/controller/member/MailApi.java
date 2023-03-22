package com.controller.member;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailApi {
	static Properties prop;
	static Session session;
	static MimeMessage message;
	
	public static void main(String[] args) {
		generateAndSendEmail();
		System.out.println("\n\n ===> Your Java Program has just sent an Email successfully . Check you email.....");
		
	}

	private static void generateAndSendEmail() {
		//발신자의 메일 계정과 비밀번호 설정
		final String user = "";    //발신자의 이메일 아이디를 입력
		final String password = ""; 
		
		//step1  프로퍼티 생성 , 프로퍼티에 SMTP 서버 정보를 설정
		prop = new Properties();
		//"main.smtp.host" 는 이메일 발송을 처리해줄 smtp 서버를 나타냄
		prop.put("mail.smtp.host", "smtp.naver.com");
		//"mail.smtp.port"는 SMTP 서버와 통신하는 포트를 말함  naver의 경우 465
		prop.put("mail.smtp.port", 465);
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.ssl.enable", "true");
		prop.put("mail.smtp.ssl.trust", "smtp.naver.com");
		
		
		//step2 세션설정 -SMTP 서버 정보와 사용자 정보를 기반으로 session 클래스의 인스턴스를 생성
		Session session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		
		//step3 메세지 작성  -Message 클래스의 객체를 사용하여 수신자와 내용, 제목의 메시지를 작성
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			
			//수신자 메일 주소
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("수신자이메일"));
			
			//subject
			message.setSubject("임시비밀번호입니다."); //메일 제목을 입력
			
			//Text
			message.setText("임시 비밀번호는 12341234입니다.");  //메일 내용을 입력
			
		//step4 이메일 보내기 - Transport 클래스를 사용하여 작성한 메시지를 전달 
			Transport.send(message);  ////전송
			System.out.println("message sent successfully...");
		} catch (AddressException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}//end generateAndSendEmail
}
