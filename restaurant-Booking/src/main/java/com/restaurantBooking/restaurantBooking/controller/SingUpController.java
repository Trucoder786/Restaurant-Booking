package com.restaurantBooking.restaurantBooking.controller;

import com.restaurantBooking.restaurantBooking.BuisnessLogic.SignUpLogic;
import com.restaurantBooking.restaurantBooking.Entity.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Booking")
@CrossOrigin("*")
public class SingUpController {
    @Autowired
    private SignUpLogic signUpLogic;

    @PostMapping("/Signup")
    public SignUp sign(@RequestBody SignUp sign){
        return signUpLogic.signInUp(sign);
    }
}
