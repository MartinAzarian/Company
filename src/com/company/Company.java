package com.company;

public class Company {
    private String name;
    private String address;
    private int numberOfEmployees;
    private String googleMapPinLink;
    private String websiteUrl;


    public Company(String name, String address, int numberOfEmployees, String googleMapPinLink, String websiteUrl) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.googleMapPinLink = googleMapPinLink;
        this.websiteUrl = websiteUrl;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getGoogleMapPinLink() {
        return googleMapPinLink;
    }

    public void setGoogleMapPinLink(String googleMapPinLink) {
        this.googleMapPinLink = googleMapPinLink;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String toString() {
        return ("Name = " + getName() + "\n" + "Address = " + getAddress() + "\n" + "Number of employees = "
                + getNumberOfEmployees() + "\n" + "Google map pin link = " + getGoogleMapPinLink() + "\n" + "Website url = " + getWebsiteUrl());

    }
}
