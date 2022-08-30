package com.genspark.quizapp.Repository;

import com.genspark.quizapp.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}