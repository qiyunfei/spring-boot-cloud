package com.f1ne.springboot.learn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations="classpath:dubbo.xml")
@MapperScan(basePackages="com.f1ne.springboot.learn.mapper.kafka")
public class SpringbootLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearnApplication.class, args);
	}
}
