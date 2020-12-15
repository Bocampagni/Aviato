package com.aviato.Aviato.dto;

import com.aviato.Aviato.model.Company;
import com.aviato.Aviato.model.Plane;
import com.aviato.Aviato.model.UserModel;

import java.util.Date;
import java.util.List;

public class FlightDto {

    private Long Flight_id;

    private int quantity;

    private double price;

    private Date date;

    private List<Plane> planes;

    private List<Company> companies;

    private List<UserModel> users;

    private String arrive;

    private String departure;

    public FlightDto() {
    }

    public FlightDto(Long flight_id, int quantity, double price, Date date, List<Plane> planes, List<Company> companies, List<UserModel> users, String arrive, String departure) {
        Flight_id = flight_id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.planes = planes;
        this.companies = companies;
        this.users = users;
        this.arrive = arrive;
        this.departure = departure;
    }

    public Long getFlight_id() {
        return Flight_id;
    }

    public void setFlight_id(Long flight_id) {
        Flight_id = flight_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "Flight_id=" + Flight_id +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date=" + date +
                ", planes=" + planes +
                ", companies=" + companies +
                ", users=" + users +
                ", arrive='" + arrive + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
