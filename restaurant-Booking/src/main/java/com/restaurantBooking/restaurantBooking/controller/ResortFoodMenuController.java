package com.restaurantBooking.restaurantBooking.controller;

import com.restaurantBooking.restaurantBooking.BuisnessLogic.ResortMenu;
import com.restaurantBooking.restaurantBooking.Entity.ResortFoodMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Booking")
@CrossOrigin("*")
public class ResortFoodMenuController {
    @Autowired
    private ResortMenu resortMenu;
    @GetMapping("/resort/food/{id}/menu")
    private List<ResortFoodMenu> getFood(@PathVariable(value = "id") int id){
        return resortMenu.getFoodMenu();
    }
}
