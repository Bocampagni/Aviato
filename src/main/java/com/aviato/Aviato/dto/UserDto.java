package com.aviato.Aviato.dto;

import com.aviato.Aviato.model.Flight;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class UserDto {

    @Id
    @Column(name = "U_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long U_id;

    @Column(name = "name")
    private String name;

    private String password;

    private String email;

    private String country;

    private String phone;

    private String token;

    private Date birthday;

    private String cpf;

    private String adress;

    public UserDto() {
    }

    public UserDto(Long u_id, String name, String password, String email, String country, String phone, String token, Date birthday, String cpf, String adress) {
        U_id = u_id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.country = country;
        this.phone = phone;
        this.token = token;
        this.birthday = birthday;
        this.cpf = cpf;
        this.adress = adress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "U_id=" + U_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", token='" + token + '\'' +
                ", birthday=" + birthday +
                ", cpf='" + cpf + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
