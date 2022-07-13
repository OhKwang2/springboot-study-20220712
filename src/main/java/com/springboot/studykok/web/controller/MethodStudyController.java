package com.springboot.studykok.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//Controller <- 페이지 로드할 때
public class MethodStudyController {
	
	/*
	@GetMapping({"/", "/index"})
	public String getMethod() {
		return "method/get";
	}
	*/
	
	/*
	@GetMapping("/test")
	public String getMethod2() {
		return "method/test";
	}
	*/
	
	/*
	@ResponseBody
	//ResponseBody <- 데이터를 보여줌. (경로를 찾아와 해당 파일을 실행시켜주는 것이 아님)
	@GetMapping("/api/v1/username")
	public String getUsername() {
		return "junil";
	}
	*/
	
}