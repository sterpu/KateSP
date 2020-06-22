package com.example.KateSP;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class KateSpApplication {

    @Autowired
    private KateLearningInterface kateLearningInterface;

    @Autowired
	private TeacherService teacherService;

    private static final Logger log = LoggerFactory.getLogger(KateSpApplication.class);

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
						@RequestParam(value = "greetingWord", defaultValue = "Hello") String greetingWord) {
		return String.format("%s %s!", greetingWord, name);
	}

	public static void main(String[] args) {
		SpringApplication.run(KateSpApplication.class, args);
	}

	@PostConstruct
	public void methodF1(){
		TeacherEntity teacherEntity = teacherService.getById(1);
		System.out.println("_________________________________________________________");
		System.out.println(teacherEntity);

	}
}
