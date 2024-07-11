package com.example.MongoConnectAws.repository;

import com.example.MongoConnectAws.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    Optional<Users> findByEmail(String email);

    Optional<Users> findByUserName(String username);
}
