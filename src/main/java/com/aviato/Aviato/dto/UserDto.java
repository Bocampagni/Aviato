package com.aviato.Aviato.dto;

import com.aviato.Aviato.model.Flight;

import java.util.Date;
import java.util.List;

public class UserDto {

    private Long U_id;

    private String name;

    private String password;

    private String email;

    private String country;

    private String phone;

    private String token;

    private Date birthday;

    private String cpf;

    private String adress;

    private List<Flight> flights;


    public UserDto(Long u_id, String name, String password, String email, String country, String phone, String token, Date birthday, String cpf, String adress, List<Flight> flights) {
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
        this.flights = flights;
    }

    public UserDto() {
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

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
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
                ", flights=" + flights +
                '}';
    }

}
