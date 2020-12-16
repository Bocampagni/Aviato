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

    private Flight flights;

    public PlaneDto() {
    }

    public PlaneDto(Long plane_id, String model, Double version, Integer capacity, String description, String madeIn, Company belongTo, Flight flights) {
        Plane_id = plane_id;
        this.model = model;
        this.version = version;
        this.capacity = capacity;
        this.description = description;
        this.madeIn = madeIn;
        this.belongTo = belongTo;
        this.flights = flights;
    }

    public Long getPlane_id() {
        return Plane_id;
    }

    public void setPlane_id(Long plane_id) {
        Plane_id = plane_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "PlaneDto{" +
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
