package entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    public String state;
    public String city;
    public String Pincode;

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        Pincode = pincode;
    }

    public Address() {

    }
}
