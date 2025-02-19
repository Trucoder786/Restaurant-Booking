package com.restaurantBooking.restaurantBooking.Respository;

import com.restaurantBooking.restaurantBooking.Entity.Order;
import com.restaurantBooking.restaurantBooking.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long User_id);
}
