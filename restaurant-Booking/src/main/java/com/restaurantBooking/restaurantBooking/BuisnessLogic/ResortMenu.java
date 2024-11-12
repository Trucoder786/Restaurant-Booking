package com.restaurantBooking.restaurantBooking.BuisnessLogic;

import com.restaurantBooking.restaurantBooking.Entity.ResortFoodMenu;
import com.restaurantBooking.restaurantBooking.Respository.ResortFoodMenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortMenu {
    @Autowired
    private ResortFoodMenuRepo resortFoodMenuRepo;

    public List<ResortFoodMenu> getFoodMenu(){
        return resortFoodMenuRepo.findAll();
    }
}
