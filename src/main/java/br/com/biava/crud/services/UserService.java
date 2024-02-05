package br.com.biava.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.biava.crud.model.User;
import br.com.biava.crud.repositories.UserRepository;
import br.com.biava.crud.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
        }
        else {
            throw new ResourceNotFoundException("Invalid id! Id = " + id);
        }
    }

    public User findById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException("Invalid id! Id = " + id));
    }

    public User update(User user) {
       return repository.saveAndFlush(user);
    }

    public List<User> findByWord(String string) {
        return repository.findByNameContainingIgnoreCase(string.trim());
    }
}
