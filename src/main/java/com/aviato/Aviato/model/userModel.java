package com.aviato.Aviato.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "user_entity")
public class userModel implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "U_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long U_id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "age")
    private Integer age;
    @Column(name = "isCompany")
    private boolean isCompany;

    public userModel() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getU_id() {
        return U_id;
    }

    public void setU_id(Long u_id) {
        U_id = u_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isCompany() {
        return isCompany;
    }

    public void setCompany(boolean company) {
        isCompany = company;
    }

    public userModel(Long u_id, String name, String email, String country, String phone, Integer age, boolean isCompany) {
        U_id = u_id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.phone = phone;
        this.age = age;
        this.isCompany = isCompany;
    }
}
