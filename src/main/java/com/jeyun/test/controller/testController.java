package com.jeyun.test.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
public class testController {


	
	@RequestMapping("/list.do")
	public String test1() throws Exception {			

		return "main/test";
	}
	
	@RequestMapping("/test.do")
	public String test2() throws Exception {
		System.out.println("여기까지 왔다");
		return "main/test";
	}
	
		@RequestMapping("/login.do")
		public String admin() throws Exception {
			System.out.println(" admin만허용 ");
			return "main/login.tiles";
		}
		
}
