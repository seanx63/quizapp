package com.genspark.quizapp.Repository;

import com.genspark.quizapp.Entity.CompletedQuiz;
import org.springframework.data.repository.CrudRepository;

public interface CompletedQuizRepository extends CrudRepository<CompletedQuiz, Long> {
}