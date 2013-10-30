package com.lecast.cloud.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lecast.cloud.entity.User;
import com.lecast.cloud.service.UserService;

@Controller
public class FirstController {

	@Autowired
	UserService userService;

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "xxxxxx";
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest rq, HttpServletResponse rp, 
			Map<String, Object> params) {
		String userName = rq.getParameter("username");
		String pwd = rq.getParameter("password");
		User bean = new User();
		bean.setUserName(userName);
		bean.setUserPassword(pwd);
		boolean result = userService.getLoginValidate(bean);
		if(result){
			return new ModelAndView("hello", "message", userName);
		}
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest rq, HttpServletResponse rp, 
			Map<String, Object> params) {
		String userName = rq.getParameter("username");
		String pwd = rq.getParameter("password");
		User bean = new User();
		bean.setUserName(userName);
		bean.setUserPassword(pwd);
		userService.registerUser(bean);
		return new ModelAndView("helloRegister", "message", userName);
	}
	

}
