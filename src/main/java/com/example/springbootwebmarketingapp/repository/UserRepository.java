package com.example.springbootwebmarketingapp.repository;

import com.example.springbootwebmarketingapp.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "select email, password from users i where i.email = :email and i.password = :password", nativeQuery = true)
    Object findByLoginInfo(@Param("email") String email, @Param("password") String password);
}
