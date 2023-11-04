package ru.kubajan.bingoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BingoprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BingoprojectApplication.class, args);
	}

}
