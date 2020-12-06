package com.aviato.Aviato.repository;

import com.aviato.Aviato.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findByNameLike(String name);
}
