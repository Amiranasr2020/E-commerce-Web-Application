// default package
// Generated Mar 27, 2021, 4:05:51 PM by Hibernate Tools 6.0.0.Alpha2

package com.iti.model.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name = "address"
        , catalog = "naseejstore"
)
public class Address implements java.io.Serializable {


    private String address;
    private UserDetails userDetails;

    public Address() {
    }

    @Id
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Address(String address) {
        this.address = address;
    }

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    public void setUserDetails(UserDetails userdetails) {
        this.userDetails = userdetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address1 = (Address) o;
        return address.equals(address1.address);
    }


    @Override
    public String toString() {
        return "Address{" +
                "address='" + address +

                '}';
    }
}


