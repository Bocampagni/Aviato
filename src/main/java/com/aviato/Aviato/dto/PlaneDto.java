package com.aviato.Aviato.dto;

import javax.persistence.*;
import com.aviato.Aviato.model.Company;
import com.aviato.Aviato.model.Flight;

import java.util.List;

public class PlaneDto {


    private Long Plane_id;

    private String model;

    private Double version;

    private Integer capacity;

    private String description;

    private String madeIn;

    private Company belongTo;

    private List<Flight> flights;


    public PlaneDto() {
    }

    public PlaneDto(List<Flight> flights,Long plane_id, String model, Double version, Integer capacity, String description, String madeIn, Company belongTo) {
        this.flights = flights;
        Plane_id = plane_id;
        this.model = model;
        this.version = version;
        this.capacity = capacity;
        this.description = description;
        this.madeIn = madeIn;
        this.belongTo = belongTo;
    }


    public Long getPlane_id() {
        return Plane_id;
    }

    public void setPlane_id(Long plane_id) {
        Plane_id = plane_id;
    }

    public String getModelo() {
        return model;
    }

    public void setModelo(String modelo) {
        this.model = modelo;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public Company getBelongTo() {
        return belongTo;
    }

    public void setBelongTo(Company belongTo) {
        this.belongTo = belongTo;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "Plane_id=" + Plane_id +
                ", model='" + model + '\'' +
                ", version=" + version +
                ", capacity=" + capacity +
                ", description='" + description + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", belongTo=" + belongTo +
                ", flights=" + flights +
                '}';
    }
}
