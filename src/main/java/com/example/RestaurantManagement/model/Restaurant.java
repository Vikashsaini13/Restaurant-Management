package com.example.RestaurantManagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    private Integer restaurantId;
    private String restaurantName;
    private String restaurantSpeciality;
    private Integer restaurantStaff;
    private Double restaurantRating;

}
