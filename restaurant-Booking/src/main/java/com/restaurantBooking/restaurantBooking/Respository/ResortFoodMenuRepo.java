package com.restaurantBooking.restaurantBooking.Respository;

import com.restaurantBooking.restaurantBooking.Entity.ResortFoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResortFoodMenuRepo extends JpaRepository<ResortFoodMenu,Long> {
}
