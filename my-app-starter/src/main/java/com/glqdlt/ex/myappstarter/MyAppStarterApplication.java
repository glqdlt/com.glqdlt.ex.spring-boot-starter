package com.glqdlt.ex.myappstarter;

import com.glqdlt.ex.springbootstarter.MySetup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyAppStarterApplication implements ApplicationRunner{

	@Autowired
	private MySetup mySetup;

	public static void main(String[] args) {
		SpringApplication.run(MyAppStarterApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(mySetup.toString());
	}
}
