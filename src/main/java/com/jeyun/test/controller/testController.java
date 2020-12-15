package com.jeyun.test.controller;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeyun.test.service.testService;


@Controller
public class testController {

	@Resource(name="testServie")
	testService service;
	
	
	
	@RequestMapping("/access_denied_page.do")
	public String access_denied() throws Exception {						
			return "main/access_denied_page";
	}	
		
	@RequestMapping("/list.do")
	public String test1() throws Exception {			
		System.out.println(service.serviceTest().get(1).getID()+"첫번쨰값");
		return "main/test";
	}
		
	@RequestMapping("/suceess.do")
	public void success() throws Exception {
		System.out.println("로그인 인증 성공");
	}
	
	@RequestMapping("/test.do")
	public String test2() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
	@RequestMapping("/guest.do")
	public String guest() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/guest";
	}
	
	@RequestMapping("/member.do")
	public String member() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/member";
	}
	
	@RequestMapping("/admin.do")
	public String admin() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/admin";
	}
	
		@RequestMapping("/loginPage.do")
		public String login() throws Exception {
			System.out.println(" admin만허용 ");
			return "main/login.tiles";
		}
		
}
