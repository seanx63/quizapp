package com.genspark.quizapp.Repository;

import com.genspark.quizapp.Entity.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz, Long> {
}