package com.forms.form_api.controller;

import com.forms.form_api.model.User;
import com.forms.form_api.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

//    @GetMapping
//    public ResponseEntity<User> todosUsuarios() {
//        User teste = new User(
//                1L,
//                "Ryan",
//                "Souza",
//                "teste@gmail.com",
//                "(63) 12345-6789",
//                "senha",
//                "masc");
//        return ResponseEntity.ok().body(teste);
//    }
}
