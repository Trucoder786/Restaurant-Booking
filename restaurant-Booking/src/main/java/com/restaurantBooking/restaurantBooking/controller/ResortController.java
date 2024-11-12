package com.restaurantBooking.restaurantBooking.controller;

import com.restaurantBooking.restaurantBooking.BuisnessLogic.ResortDataLogic;
import com.restaurantBooking.restaurantBooking.BuisnessLogic.ResortMenu;
import com.restaurantBooking.restaurantBooking.Entity.Resort;
import com.restaurantBooking.restaurantBooking.Entity.ResortFoodMenu;
import com.restaurantBooking.restaurantBooking.Respository.ResortFoodMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Booking")
@CrossOrigin("*")
public class ResortController {
    @Autowired
    private ResortDataLogic resortDataLogic;



    @GetMapping("/resort-data")
    private List<Resort> resortData(){
        return resortDataLogic.resortData();
    }

//  Getting Resort Data By id
    @GetMapping("/resort-data/{id}")
    private Optional<Resort> resortData(@PathVariable (value = "id")Long id){
        return resortDataLogic.findResort(id);
    }

// Getting Food Menu



}
