package br.com.biava.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biava.crud.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
}
