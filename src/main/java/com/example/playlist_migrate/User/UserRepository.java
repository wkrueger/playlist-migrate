package com.example.playlist_migrate.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  public Optional<User> getByUsername(String username);
}
