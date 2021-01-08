package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*") //여기로오는요청을 컨트롤러가 받아서 일을함
@Log4j
public class SampleController {
	
	@RequestMapping("")//빈스트링일경우에 모두처리 
	public void basic() {
		log.info("basic.......");
	}
	
	@RequestMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get.......");
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name: " +name);
		log.info("age: " +age);
		return "ex02";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids: "+ Arrays.toString(ids));
		return "ex02Array";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ibs")ArrayList<String> ids) {
		log.info("ids: " +ids);
		return "ex02List";
	}
	
	
	// 130쪽
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info(""+dto);
		return "ex01";
	}
	
	//134쪽
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos: " + list);
		
		return "ex02Bean";
	}
	
}


