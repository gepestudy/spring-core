package com.gepe.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { // buat registrasi component bean jika dia berada di luar package
//		"com.gepe.springcore",
//		"com.gepe.util",
//})
public class SpringcoreApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
