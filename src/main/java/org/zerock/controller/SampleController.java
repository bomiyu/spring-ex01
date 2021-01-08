package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*")  //여기로오는요청을 컨트롤러가 받아서 일을함
public class SampleController {

	
	@RequestMapping("")  //빈스트링일경우에 모두처리 
	public void basic() {
		log.info("basic....");
	}
}
