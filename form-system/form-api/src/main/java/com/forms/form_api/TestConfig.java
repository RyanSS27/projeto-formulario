package com.forms.form_api;

import com.forms.form_api.model.User;
import com.forms.form_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(
                null,
                "Ryan",
                "Souza",
                "teste1@gmail.com",
                "(63) 12345-6789",
                "senha",
                "masc");
        User u2 = new User(
                null,
                "Tamandua",
                "Bandeira",
                "teste2@gmail.com",
                "(63) 12345-6789",
                "senha",
                "masc");
        User u3 = new User(
                null,
                "Loirin",
                "do Fut",
                "teste3@gmail.com",
                "(63) 12345-6789",
                "senha",
                "masc");
        userRepository.saveAll(Arrays.asList(u1,u2,u3));
    }
}
