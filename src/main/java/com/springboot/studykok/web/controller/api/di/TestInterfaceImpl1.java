package com.springboot.studykok.web.controller.api.di;

import org.springframework.stereotype.Component;

@Component("t1")	//Component에 이름 지정 안 해주면 클래스명 앞에 소문자로 변수를 설정해서 알아서 주입됨.
public class TestInterfaceImpl1 implements TestInterface{

	@Override
	public void a() {
		System.out.println("테스트 인터페이스 2에서 호출한 a메소드");
	}

	@Override
	public void b() {
		System.out.println("테스트 인터페이스 2에서 호출한 b메소드");
	}

}
