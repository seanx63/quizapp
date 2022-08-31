package com.genspark.quizapp;

import static org.assertj.core.api.Assertions.assertThat;
import com.genspark.quizapp.Entity.User;
import com.genspark.quizapp.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user = new User();
        user.setEmail("phanieshob@gmail.com");
        user.setPasswordEncoded("niesho2022");
        user.setName("Phaniesho Budhan");

        User savedUser = repo.save(user);

        User existingUser = entityManager.find(User.class,savedUser.getId());

        assertThat(existingUser.getEmail()).isEqualTo(user.getEmail());
    }

}
