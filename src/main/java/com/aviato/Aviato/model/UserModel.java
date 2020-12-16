package com.aviato.Aviato.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_entity")
public class UserModel implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "U_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long U_id;

    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "phone")
    private String phone;

    @Column(name = "token")
    private String token;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "adress")
    private String adress;


    public UserModel() {
    }

    public UserModel(Long u_id, String name, String password, String email, String country, String phone, String token, Date birthday, String cpf, String adress) {
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
        return "UserModel{" +
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
