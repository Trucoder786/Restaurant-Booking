package com.restaurantBooking.restaurantBooking.controller;

import com.restaurantBooking.restaurantBooking.Entity.LoginRequest;
import com.restaurantBooking.restaurantBooking.Entity.SignUp;
import com.restaurantBooking.restaurantBooking.Respository.SignUpRepo;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Booking")
@CrossOrigin("*")
public class SignInController {
    @Autowired
    private SignUpRepo signUpRepo;

    @PostMapping("/SignIn")
    public ResponseEntity<String> signIn(@RequestBody LoginRequest request){
        Optional<SignUp> userOptional = signUpRepo.findByEmail(request.getEmail());
        if(userOptional.isPresent()){
            SignUp signIn = userOptional.get();
            if(signIn.getPassword().equals(request.getPassword())){
//                return ResponseEntity.ok("Successfully loginIn with email: "+request.getEmail());
                return ResponseEntity.ok().body("{\"message\": \"Successfully logged in\", \"email\": \"" + request.getEmail() + "\"}");
            }
        }
//        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Failed");
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Unauthorized\"}");
    }
}
