package com.example.userdepto.repositories;

import com.example.userdepto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
