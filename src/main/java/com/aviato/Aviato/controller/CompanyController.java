package com.aviato.Aviato.controller;

import com.aviato.Aviato.model.Company;
import com.aviato.Aviato.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;

    @GetMapping(path = "/getAllCompanies")
    public List<Company> getAll(){

        return companyRepository.findAll();
    }

    @GetMapping(path = "/getCompany/{id}")
    public Company getCompany(@PathVariable Long id){

        Optional<Company> company = companyRepository.findById(id);
        return company
                .orElseGet(Company::new);

    }

    @PostMapping(path = "/saveCompany")
    public ResponseEntity<Company> saveUser(@RequestBody Company company){

        Company persistedCompany = companyRepository.save(company);

        return ResponseEntity.accepted().body(persistedCompany);
    }

    @PutMapping(path = "/updateCompany")
    public Company updateUser(@RequestBody Company companyToPersist){

        return companyRepository.save(companyToPersist);
    }

    @DeleteMapping(path = "/deleteCompany/{id}")
    public ResponseEntity<Company> deleteUser(@PathVariable Long id){

        companyRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }
}
