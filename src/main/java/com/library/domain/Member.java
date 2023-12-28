package com.library.domain;

import lombok.Data;
import javax.persistence.*;

@Data
public class Member {
    @Id
    @Column(name="CUSTOMER_ID")
    private String id;
    private String password;
    private String name;
    private String birthDate;
    private String address;
    private String addressDetail;

    @ManyToOne
    @JoinColumn(name = "rental_id")
    private Rental rentals;
}