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
    private List<Company> companies;

    @ManyToMany
    private List<UserModel> users;

    @Column(name = "arrive")
    private String arrive;

    @Column(name = "departure")
    private String departure;
}
