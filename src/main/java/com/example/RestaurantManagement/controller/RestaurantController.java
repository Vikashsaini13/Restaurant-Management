package com.example.RestaurantManagement.controller;

import com.example.RestaurantManagement.model.Restaurant;
import com.example.RestaurantManagement.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    //get all restaurant

    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    //get by id
    @GetMapping("restaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantService.getRestaurantById(id);
    }

    //add single restaurant
    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
       return restaurantService.addRestaurant(restaurant);
    }


    //add multiple at a time
    @PostMapping("restaurants")
    public String addRestaurants(@RequestBody List<Restaurant> restaurants){
        return restaurantService.addRestaurants(restaurants);
    }

    //delete restaurant based on id
    @DeleteMapping("restaurant/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
        return restaurantService.deleteRestaurant(id);
    }

    //update restaurant rating and staff
    @PutMapping("restaurant/{id}/{staff}/{rating}")
    public String updateRestaurantInfo(@PathVariable Integer id,@PathVariable Integer staff,@PathVariable Double rating){
        return restaurantService.updateRestaurantInfo(id,staff,rating);
    }

}
