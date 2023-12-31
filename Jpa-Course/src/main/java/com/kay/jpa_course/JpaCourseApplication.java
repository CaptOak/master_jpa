package com.kay.jpa_course;

import com.github.javafaker.Faker;
import com.kay.jpa_course.models.Author;
import com.kay.jpa_course.models.Video;
import com.kay.jpa_course.repositories.AuthorRepository;
import com.kay.jpa_course.repositories.VideoRespository;
import com.kay.jpa_course.specification.AuthorSpecification;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.Specification;

@SpringBootApplication
public class JpaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCourseApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRepository repository,
		VideoRespository videoRespository
	){
		return args -> {
			for(int i =0; i < 50; i++) {
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19,99))
						.email(faker.name().username() + "@perftraka.info")
						.build();
				//repository.save(author);
			}

			var author = Author.builder()
					.id(1)
					.firstName("Kingsley")
					.lastName("Kanu")
					.age(40)
					.email("contact@@perftraka.info")
					.build();
			//repository.save(author);

			//repository.updateAuthor(22,1);

			//repository.updateAllAuthorsAges(22);

//			repository.findByNamedQuery(60).forEach(System.out::println);
//
//			repository.updateByNamedQuery(12);

			Specification<Author> spec = Specification
					.where(AuthorSpecification.hasAge(22))
					.or(AuthorSpecification.firstnameContains("i"))
			 ;
			repository.findAll(spec).forEach(System.out::println);
		};
	}

}
