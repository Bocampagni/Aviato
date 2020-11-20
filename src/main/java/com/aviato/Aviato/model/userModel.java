package com.aviato.Aviato.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_entity")
public class userModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
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

    public userModel(){};

    public userModel(String id, String name, String email, String country, String phone, Integer age, boolean isCompany) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.phone = phone;
        this.age = age;
        this.isCompany = isCompany;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
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
        age = age;
    }

    public boolean isCompany() {
        return isCompany;
    }

    public void setCompany(boolean company) {
        isCompany = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        userModel userModel = (userModel) o;

        if (isCompany != userModel.isCompany) return false;
        if (!Objects.equals(id, userModel.id)) return false;
        if (!Objects.equals(name, userModel.name)) return false;
        if (!Objects.equals(email, userModel.email)) return false;
        if (!Objects.equals(country, userModel.country)) return false;
        if (!Objects.equals(phone, userModel.phone)) return false;
        return Objects.equals(age, userModel.age);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (isCompany ? 1 : 0);
        return result;
    }
}
