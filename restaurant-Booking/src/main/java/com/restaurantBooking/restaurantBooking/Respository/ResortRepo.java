package com.restaurantBooking.restaurantBooking.Respository;

import com.restaurantBooking.restaurantBooking.Entity.Resort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface ResortRepo extends JpaRepository<Resort,Long> {
}
