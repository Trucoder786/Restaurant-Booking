package com.restaurantBooking.restaurantBooking.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "resortFoodMenu")
@Data
public class ResortFoodMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String FoodImage;
    String FoodName;
    int FoodPrice;
}
