package com.controller.member;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class SendEmailpwServlet
 */
@WebServlet("/SendEmailpwServlet")
public class SendEmailpwServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendEmailpwServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String Member_code = request.getParameter("Member_code");
		String Member_email1 = request.getParameter("Member_email1");
		String Member_email2 = request.getParameter("Member_email2");
		
		System.out.println(Member_code);
		System.out.println(Member_email1);
		System.out.println(Member_email2);
		
		
		
		//먼저 아이디로 회원정보를 받아오고 가져온 데이터에서 email 값을 비교하여 존재하지 않으면 인증메일 보내지 못함
		MemberService mService = new MemberService();
		MemberDTO member = mService.mypage(Member_code);
		System.out.println("memberdto : " + member);
		
		String nextPage = "";
		if(member!=null && Member_email1.equals(member.getMember_email1()) && Member_email2.equals(member.getMember_email2()) ) {
			
			//mail server 설정
			String host = "smtp.naver.com";
			String user = "발신자이메일";  //발신자 계정  
			String password = "발신자이메일비번";   
			
			//메일 받을 주소 
			String to_email = member.getMember_email1()+"@"+member.getMember_email2();
			
			//SMTP 서버 정보 설정
			Properties prop = new Properties();
			prop.put("mail.smtp.host", host);
			prop.put("mail.smtp.port", 465);
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.ssl.enable", "true");
			prop.put("mail.smtp.ssl.trust", "smtp.naver.com");
			
			//인증번호 생성 
			Random random = new Random();
			int createNum = 0;
			String ranNum = "";
			int letter = 4;
			String resultNum="";
			
			for (int i = 0; i < letter; i++) {
				createNum = random.nextInt(10);
				ranNum = Integer.toString(createNum);
				resultNum += ranNum;
			}
			
			
			System.out.println("인증번호 : " +resultNum);
			
			Session session = Session.getDefaultInstance(prop,new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(user, password);
				}
			});
			
			
			//email 전송
			
			//step3 메세지 작성  -Message 클래스의 객체를 사용하여 수신자와 내용, 제목의 메시지를 작성
			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(user));
						
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email)); //수신자 메일 주소
				message.setSubject("안녕하세요 Kkosunnae 인증 메일입니다."); //메일 제목을 입력
				
				message.setText("임시 비밀번호는 "+ resultNum +" 입니다.");  //메일 내용을 입력
						
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
			
			
			nextPage = "pwUpdate.jsp";
			request.setAttribute("resultNum", resultNum);
			
			
		}else {
			
			String checkmesg = "회원 정보가 존재하지 않습니다.";
			request.setAttribute("checkmesg", checkmesg);
			nextPage = "pwSearch.jsp";
		}
		

		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
		
	

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
