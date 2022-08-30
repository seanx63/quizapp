package com.genspark.quizapp;

import com.genspark.quizapp.Entity.User;
import com.genspark.quizapp.Repository.CompletedQuizRepository;
import com.genspark.quizapp.Repository.QuizRepository;
import com.genspark.quizapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class QuizappApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private QuizRepository quizRepository;
	@Autowired
	private CompletedQuizRepository completedQuizRepository;
	public static void main(String[] args) {
		SpringApplication.run(QuizappApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1, "demo", "demo@demo.com", "{noop}password"));
	}

}
