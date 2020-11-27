package com.aviato.Aviato.repository;

import com.aviato.Aviato.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<userModel, Long> {

    Optional<userModel> findByNameLike(String name);
}
