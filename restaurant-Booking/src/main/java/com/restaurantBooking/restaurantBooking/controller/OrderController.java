package com.restaurantBooking.restaurantBooking.controller;

import com.restaurantBooking.restaurantBooking.BuisnessLogic.OrderService;
import com.restaurantBooking.restaurantBooking.BuisnessLogic.UserService;
import com.restaurantBooking.restaurantBooking.Entity.Order;
import com.restaurantBooking.restaurantBooking.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PostMapping("/{email}")
    public User saveUser(@PathVariable String email){
        return orderService.saveUser(email);
    }
    @PostMapping("/save")
    public ResponseEntity<List<Order>> saveOrder(@RequestBody Order order) {
        List<Order> orders = orderService.saveOrder(order);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUserId(@PathVariable Long userId) {
        List<Order> orders = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/id/{email}")
    public ResponseEntity<List<Order>> findUserIdByEmail(@PathVariable String email) {
        Long userId = userService.findUserIdByEmail(email);
//        return ResponseEntity.ok(userId);
        List<Order> orders = orderService.getOrdersByUserId(userId);
        return ResponseEntity.ok(orders);
    }



}
