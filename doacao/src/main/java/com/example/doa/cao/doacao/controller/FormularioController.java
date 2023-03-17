package com.example.doa.cao.doacao.controller;

import com.example.doa.cao.doacao.model.User;
import com.example.doa.cao.doacao.model.dto.UserDTO;
import com.example.doa.cao.doacao.repository.UserRepository;
import com.example.doa.cao.doacao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/form")
public class FormularioController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> listaUsuario() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok(userService.findUser(id));
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.saveUser(user));
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> update(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.updateUser(user));
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
