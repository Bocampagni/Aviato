package com.aviato.Aviato.repository;

import com.aviato.Aviato.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface userRepository extends JpaRepository<userModel, Long> {

    List<userModel> findAllBy();

}
