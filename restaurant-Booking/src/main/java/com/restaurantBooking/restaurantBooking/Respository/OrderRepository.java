package com.restaurantBooking.restaurantBooking.Respository;

import com.restaurantBooking.restaurantBooking.Entity.Order;
import com.restaurantBooking.restaurantBooking.Entity.User;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long userId);
}
