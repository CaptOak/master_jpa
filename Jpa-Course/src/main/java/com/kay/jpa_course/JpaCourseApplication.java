package com.kay.jpa_course;

import com.kay.jpa_course.models.Author;
import com.kay.jpa_course.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCourseApplication.class, args);
	}


	//@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository
	){
		return args -> {
			var author = Author.builder()
					.firstName("Kanu")
					.lastName("Okereke")
					.age(40)
					.email("kay@gmail.com")
					.build();
			repository.save(author);
		};
	}

}
