package com.gg.bank.repositories;

import com.gg.bank.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String doc);
    Optional<User> findUserById(Long id);
}
