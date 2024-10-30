package com.maybeCRM.myCRM;

import org.springframework.boot.SpringApplication;

public class TestMyCrmApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyCrmApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
