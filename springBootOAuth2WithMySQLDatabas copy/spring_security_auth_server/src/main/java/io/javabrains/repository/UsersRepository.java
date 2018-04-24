package io.javabrains.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByName(String username);

}
