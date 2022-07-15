package com.springboot.studykok.web.controller.api.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/di")
public class DiController {
	
	@Autowired	//@Service로 IoC에 배정한 인터페이스의 객체를 찾아서 주입해주는 어노테이션.
	@Qualifier("t1")
	private TestInterface testInterface1;
	
	@Autowired
	@Qualifier("t2")
	private TestInterface testInterface2;
	
	@GetMapping("/test1")
	public ResponseEntity<?> test1() {
		testInterface1.a();
		testInterface1.b();
		
		testInterface2.a();
		testInterface2.b();
		return ResponseEntity.ok().body(null);
	}
}
