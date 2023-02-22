package com.sg.banking_api.models;

import java.util.Objects;

public class Address {
    private String customer_number;
    private String Street;
    private String City;
    private String State;
    private String zipcode;

    public Address(String customer_number) {
        this.customer_number = customer_number;
    }

    public String getCustomer_number() {
        return customer_number;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return customer_number.equals(that.customer_number) && Objects.equals(Street, that.Street) && Objects.equals(City, that.City) && Objects.equals(State, that.State) && Objects.equals(zipcode, that.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer_number, Street, City, State, zipcode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "customer_number='" + customer_number + '\'' +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
