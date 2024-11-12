package com.restaurantBooking.restaurantBooking.BuisnessLogic;

import com.restaurantBooking.restaurantBooking.Entity.Order;
import com.restaurantBooking.restaurantBooking.Entity.User;
import com.restaurantBooking.restaurantBooking.Respository.OrderRepository;
import com.restaurantBooking.restaurantBooking.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository  userRepository;

    public User saveUser(String email){
        Optional<User>  checkUser = userRepository.findByEmail(email);
        if (!checkUser.isPresent()) {
            User newUser = new User();
            newUser.setEmail(email);
            return userRepository.save(newUser);
        } else {
            return checkUser.get(); // Return the existing user if it's found
        }
    }
    public List<Order> saveOrder(Order order){
        User user = saveUser(order.getUser().getEmail()); // Save or retrieve the user associated with the order
        order.setUser(user); // Set the user for the order
        orderRepository.save(order); // Save the order
        return orderRepository.findAll(); // Return all orders after saving
    }

    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

}
