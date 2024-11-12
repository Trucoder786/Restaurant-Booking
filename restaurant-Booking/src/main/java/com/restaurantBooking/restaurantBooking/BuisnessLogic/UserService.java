package com.restaurantBooking.restaurantBooking.BuisnessLogic;

import com.restaurantBooking.restaurantBooking.Entity.User;
import com.restaurantBooking.restaurantBooking.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Long findUserIdByEmail(String email) {
        Optional<User> userOptional = userRepository.findByEmail(email);
        return userOptional.map(User::getId).orElse(null);
    }
}
