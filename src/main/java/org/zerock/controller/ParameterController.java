package org.zerock.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.Member;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/paramex/*")
@Log4j
public class ParameterController {

	@RequestMapping("/ex1")
	public void method1(HttpServletRequest request) {
		log.info(request);
		log.info(request.getParameter("name"));
		log.info("method1");
	}

	@RequestMapping("/ex2")
	public void method2(@RequestParam("name") String n) {
		log.info("method2");
		log.info(n);
	}

	@RequestMapping("/ex3")
	public void method3(@RequestParam String name) {
		log.info("method3");
		log.info(name);
	}

	@RequestMapping("/ex4")
	public void method4(String name) {
		log.info("method4");
		log.info(name);
	}

	@RequestMapping("/ex6")
	public void method6(String[] check) {
		log.info("method6");
		for (String s : check) {
			log.info(s);
		}
	}

	@RequestMapping("/ex7")
	public void method7(@RequestParam("check") ArrayList<String> check) {
		log.info("method7");
		for (String c : check) {
			log.info(c);
		}
	}

	@RequestMapping("/ex8")
	public void method8(HttpServletRequest request) {
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);

		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		log.info("method8");
		log.info(member);

	}

	@RequestMapping("/ex9")
	public void method9(Member member) {
		log.info("method9");
		log.info(member);

	}

}
