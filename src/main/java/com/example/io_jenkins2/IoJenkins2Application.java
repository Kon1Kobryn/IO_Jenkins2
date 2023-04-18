package com.example.io_jenkins2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoJenkins2Application {

	public static void main(String[] args) {
		SpringApplication.run(IoJenkins2Application.class, args);
	}

	public int added(int a, int b){
		return a * b;
	}
}
