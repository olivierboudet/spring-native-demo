package com.example.demo;

import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.config.SpringDataMongoV3Context;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.TypeHint;

@SpringBootApplication
//@EnableMongock
@TypeHint(types = {SpringDataMongoV3Context.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
