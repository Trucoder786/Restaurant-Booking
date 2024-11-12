package com.restaurantBooking.restaurantBooking.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LoginRequest {
    private String Email;
    private String password;
}
