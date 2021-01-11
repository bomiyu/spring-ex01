package org.zerock.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.Member;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/model/*")
@Log4j
public class ModelController {

	@RequestMapping("/ex1")
	public void method1(Model model) {
		log.info("method1");

//		request.setAttribute("abc", abc);
		model.addAttribute("name", "java");

	}

	@RequestMapping("/ex2")
	public void method2(@ModelAttribute("name") String name) {
		log.info("method2");

//		model.addAttribute("name", name);
	}

	@RequestMapping("/ex3")
	public void method3(@ModelAttribute("name") String name, @ModelAttribute("age") int age) {
		log.info("method3");
		log.info(name);
		log.info(age);
	}

	@RequestMapping("/ex4")
	public void method4(@ModelAttribute("member") Member member) {
		log.info("method4");
		log.info(member);

//		model.addAttribute("member", member);

	}

	@RequestMapping("/ex5")
	// model attribute의 이름은 소문자로 바꾼 type 명으로 결정됨
	public void method5(@ModelAttribute Member member) {
		log.info("method5");
		log.info(member);

	}

	@RequestMapping("/ex6")
	// model attribute의 이름은 소문자로 바꾼 type 명으로 결정됨
	public String method6(Member member) {
		log.info("method6");
		log.info(member);

		return "model/ex4";
	}

	@RequestMapping("/ex7")
	public String method7(Model model, HttpSession session, RedirectAttributes rattr) {
		log.info("method7");
		model.addAttribute("myattr1", "myvalue1");
		session.setAttribute("myAttr2", "myValue2");
		rattr.addFlashAttribute("myAttr3", "myValue3");

		return "redirect:ex8";
	}

	@RequestMapping("/ex8")
	public String method8(Model model) {
		log.info("method8");
		
		Map<String, Object> map = model.asMap();
		log.info(map.get("myattr1"));
				log.info(map.get("myAttr2"));
						log.info(map.get("myAttr3"));
		return "redirectex1";
	}
}
