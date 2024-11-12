package com.restaurantBooking.restaurantBooking.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<String> item;
    private double total;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "order_time")
    private LocalDateTime orderTime;


}
