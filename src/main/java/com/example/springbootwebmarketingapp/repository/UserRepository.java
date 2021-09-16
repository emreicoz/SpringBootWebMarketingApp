package com.example.springbootwebmarketingapp.repository;

import com.example.springbootwebmarketingapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
