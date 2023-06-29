package com.example.RestaurantManagement.service;

import com.example.RestaurantManagement.model.Restaurant;
import com.example.RestaurantManagement.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants() {
      return restaurantRepo.getRestaurantList();
    }

    public String addRestaurant(Restaurant restaurant) {
        List<Restaurant> originalList=getAllRestaurants();
        originalList.add(restaurant);
        return " added";
    }

    public Restaurant getRestaurantById(Integer id) {
        List<Restaurant> originalList=getAllRestaurants();
        for(Restaurant restaurant :originalList){
            if(restaurant.getRestaurantId().equals((id))){
                return restaurant;
            }
        }
        return null;
    }

    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> originalList=getAllRestaurants();
        originalList.addAll(restaurants);

        return "restaurants added successfully";
    }

    public String deleteRestaurant(Integer id) {
        List<Restaurant> originalList=getAllRestaurants();
        for(Restaurant restaurant :originalList){
            if(restaurant.getRestaurantId().equals((id))){
                originalList.remove(restaurant);
                return "removed";
            }
        }
        return "restaurant not found";
    }

    public String updateRestaurantInfo(Integer id, Integer staff, Double rating) {
        List<Restaurant> originalList=getAllRestaurants();
        for(Restaurant restaurant :originalList){
            if(restaurant.getRestaurantId().equals((id))){
                restaurant.setRestaurantStaff(staff);
                restaurant.setRestaurantRating(rating);
                return  "updated successfully";

            }
        }
        return "restaurant not found";
    }
}
