package com.biteNow.v1.service;

import com.biteNow.v1.data.RestaurantData;
import com.biteNow.v1.entity.Restaurant;

import java.util.Iterator;
import java.util.List;

public class RestaurantService {

    private Restaurant restaurant = new Restaurant();
    private RestaurantData restaurantData = new RestaurantData();

    public void viewAllRestaurant(){
        if(restaurantData.restaurantList.isEmpty()){
            System.out.println("Restaurant is Not available!");
            return;
        }else{
            System.out.println("BiteNow Restaurant Details!");
            Iterator<Restaurant> itr = restaurantData.restaurantList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println();
        }
    }

}
