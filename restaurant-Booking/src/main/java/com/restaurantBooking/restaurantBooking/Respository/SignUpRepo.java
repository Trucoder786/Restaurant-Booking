package com.restaurantBooking.restaurantBooking.Respository;

import com.restaurantBooking.restaurantBooking.Entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Component
@Repository
public interface SignUpRepo extends JpaRepository<SignUp,Long> {
    Optional<SignUp> findByEmail(String email);
}
