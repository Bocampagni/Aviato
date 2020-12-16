package com.aviato.Aviato.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Flight {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Flight_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Flight_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private Date date;

    @ManyToMany
    private List<Plane> planes;


    @ManyToMany
    private List<UserModel> users;

    @Column(name = "arrive")
    private String arrive;

    @Column(name = "departure")
    private String departure;

    public Flight() {
    }

    public Flight(Long flight_id, int quantity, double price, Date date, List<Plane> planes, List<UserModel> users, String arrive, String departure) {
        Flight_id = flight_id;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.planes = planes;
        this.users = users;
        this.arrive = arrive;
        this.departure = departure;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
                ", users=" + users +
                ", arrive='" + arrive + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
