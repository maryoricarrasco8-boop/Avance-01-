package com.example.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.example.demo.model.User;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
