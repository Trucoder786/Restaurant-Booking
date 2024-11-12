package com.restaurantBooking.restaurantBooking.BuisnessLogic;
import java.util.List;
import java.util.Optional;

import com.restaurantBooking.restaurantBooking.Entity.Resort;
import com.restaurantBooking.restaurantBooking.Respository.ResortRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResortDataLogic {
    @Autowired
    private ResortRepo resortRepo;

    public List<Resort> resortData(){
        return resortRepo.findAll();
    }
    public Optional<Resort> findResort(Long id){
        return resortRepo.findById(id);
    }
}
