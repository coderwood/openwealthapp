package com.coderwood.openwealthapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@SpringBootApplication
@RestController
public class OpenwealthappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenwealthappApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome() {
		String[] welcomeMessages = {
			"欢迎来到OpenWealth应用！",
			"很高兴见到你！",
			"欢迎访问我们的应用！",
			"你好，欢迎使用OpenWealth！",
			"欢迎加入OpenWealth大家庭！"
		};
		Random random = new Random();
		String randomMessage = welcomeMessages[random.nextInt(welcomeMessages.length)];
		return "zhangjunke " + randomMessage;
	}

}
