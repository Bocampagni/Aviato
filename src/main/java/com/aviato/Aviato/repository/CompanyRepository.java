package com.aviato.Aviato.repository;

import com.aviato.Aviato.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
