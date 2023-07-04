package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String streetName = "Creek Bridge Road";

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
