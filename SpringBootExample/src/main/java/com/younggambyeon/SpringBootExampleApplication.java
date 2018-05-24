package com.younggambyeon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 컴포넌트 검색과 자동 구성 활성화
public class SpringBootExampleApplication {

	public static void main(String[] args) {

		// 애플리케이션 부트스트랩
		SpringApplication.run(SpringBootExampleApplication.class, args);
	}
}
