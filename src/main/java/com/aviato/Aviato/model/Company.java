package com.aviato.Aviato.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Company")
public class Company {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Company_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Company_id;

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

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "adress")
    private String adress;

    @Column(name = "status")
    private String status; //Trocar pra enum no futuro

    @OneToMany
    private List<Plane> planes;

    @OneToMany
    private List<Flight> flighs;

    public Company() {
    }

    public Company(Long company_id, String name, String password, String email, String country, String phone, String token, Date birthday, String cnpj, String adress, String status, List<Plane> planes, List<Flight> flighs) {
        Company_id = company_id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.country = country;
        this.phone = phone;
        this.token = token;
        this.birthday = birthday;
        this.cnpj = cnpj;
        this.adress = adress;
        this.status = status;
        this.planes = planes;
        this.flighs = flighs;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCompany_id() {
        return Company_id;
    }

    public void setCompany_id(Long company_id) {
        Company_id = company_id;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Flight> getFlighs() {
        return flighs;
    }

    public void setFlighs(List<Flight> flighs) {
        this.flighs = flighs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Company_id=" + Company_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", token='" + token + '\'' +
                ", birthday=" + birthday +
                ", cnpj='" + cnpj + '\'' +
                ", adress='" + adress + '\'' +
                ", status='" + status + '\'' +
                ", planes=" + planes +
                ", flighs=" + flighs +
                '}';
    }
}
