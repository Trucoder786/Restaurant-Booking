package com.restaurantBooking.restaurantBooking.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "UserRegistration")
public class SignUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long number;
    private String email;
    private String password;
}
