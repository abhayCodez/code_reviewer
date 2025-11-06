package com.codereviewer.githubService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class GithubServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubServiceApplication.class, args);
	}

}
