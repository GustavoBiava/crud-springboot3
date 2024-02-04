package br.com.biava.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biava.crud.model.User;
import br.com.biava.crud.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/findAll")
    public ResponseEntity<List<User>> getMethodName() {
        return ResponseEntity.ok().body(service.findAll());
    }
    
    
}
