package com.SpringBootProfilesInclude.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
public class DataReadRunner implements CommandLineRunner {

	@Value("${my.app.id}")
	private Integer id;
	@Value("${my.app.title}")
	private String title;
	@Value("${my.app.driver}")
	private String driver;
	@Value("${my.app.url}")
	private String url;
	@Value("${my.app.host}")
	private String host;
	@Value("${my.app.port}")
	private Integer port;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
