package com.library.domain;

import lombok.Data;
import javax.persistence.*;

@Data
public class Rental {
    @Id
    @Column(name="RENTAL_ID")
    private String id;
    private String rentalDate;
    private String renewDate;
    private String dueDate;
    private String returnDate;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;
}