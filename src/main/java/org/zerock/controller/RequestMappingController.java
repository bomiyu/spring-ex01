package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/reqmap/*")
public class RequestMappingController {
	
	@RequestMapping("")
	public void method1() {
		log.info("method1");
	}
	
	@RequestMapping("/ex2")
	public void method2() {
		log.info("method2");
	}
	
	@RequestMapping("/ex3")
	public void method3() {
		log.info("method3");
	}
	
	@RequestMapping(value = "/ex4", method = RequestMethod.GET)
	public void method4() {
		log.info("method4");
	}
	
	@RequestMapping(value = "/ex5", method = RequestMethod.POST)
	public void method5() {
		log.info("method5");
	}
	
	
	@GetMapping("/ex6")
	public void method6() {
		log.info("method6");
	}
	
	@PostMapping("/ex7")
	public void method7() {
		log.info("method7");
	}
}





