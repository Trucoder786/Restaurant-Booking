package com.restaurantBooking.restaurantBooking.BuisnessLogic;

import com.restaurantBooking.restaurantBooking.Entity.SignUp;
import com.restaurantBooking.restaurantBooking.Respository.SignUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SignUpLogic {
    @Autowired
    private SignUpRepo signUpRepo;
    public SignUp signInUp(SignUp signInDetails){
        return signUpRepo.save(signInDetails);
    }
}

