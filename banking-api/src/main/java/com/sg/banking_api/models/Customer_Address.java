package com.sg.banking_api.models;

public class Customer_Address {
    private String customer_number;
    private String Street;
    private String City;
    private String State;
    private String zipcode;

    public Customer_Address(String customer_number) {
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
}
