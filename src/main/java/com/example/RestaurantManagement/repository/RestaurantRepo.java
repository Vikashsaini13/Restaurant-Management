package com.example.RestaurantManagement.repository;


import com.example.RestaurantManagement.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {


    @Autowired
   private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }


}
