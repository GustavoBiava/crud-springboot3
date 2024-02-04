package br.com.biava.crud.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.biava.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByNameContainingIgnoreCase(String string);
    
}
