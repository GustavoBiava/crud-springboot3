package br.com.biava.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.biava.crud.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;
    
}
