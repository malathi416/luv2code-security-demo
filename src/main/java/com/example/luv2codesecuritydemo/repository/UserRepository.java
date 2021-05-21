package com.example.luv2codesecuritydemo.repository;

import com.example.luv2codesecuritydemo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
//        User findByUsername(String firstName);

}
