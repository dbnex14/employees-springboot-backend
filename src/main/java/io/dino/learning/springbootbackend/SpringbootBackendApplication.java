package io.dino.learning.springbootbackend;

import io.dino.learning.springbootbackend.model.User;
import io.dino.learning.springbootbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("Dino", "Buljubasic", "db@gmail.com"));
        userRepository.save(new User("Amira", "Imamovic", "amiraib@aol.com"));
        userRepository.save(new User("Alen", "Imamovic", "alen@outlook.com"));
    }
}
