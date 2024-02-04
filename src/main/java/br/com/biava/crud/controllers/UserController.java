package br.com.biava.crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.biava.crud.model.User;
import br.com.biava.crud.services.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/findAll")
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<User> insert(@RequestBody User user) {
        return ResponseEntity.ok().body(service.insert(user));
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@RequestParam(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/findById")
    public ResponseEntity<User> findById(@RequestParam(value = "id") Long id) {
        return ResponseEntity.ok().body(service.findById(id));
    }
}
