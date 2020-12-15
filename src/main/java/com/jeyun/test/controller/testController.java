package com.jeyun.test.controller;



import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeyun.test.service.testService;


@Controller
public class testController {

	@Resource(name="testServie")
	testService service;
	
	
	@RequestMapping("/list.do")
	public String test1() throws Exception {			
		System.out.println(service.serviceTest().get(1).getID()+"첫번쨰값");
	
		return "main/test";
	}
	
	@RequestMapping("/test.do")
	public String test2() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
	@RequestMapping("/guest.do")
	public String guest() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
	@RequestMapping("/member.do")
	public String member() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
	@RequestMapping("/admin.do")
	public String admin() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
		@RequestMapping("/login.do")
		public String login() throws Exception {
			System.out.println(" admin만허용 ");
			return "main/login.tiles";
		}
		
}
