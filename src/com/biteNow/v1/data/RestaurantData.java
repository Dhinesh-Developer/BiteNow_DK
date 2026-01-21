package com.biteNow.v1.data;

import com.biteNow.v1.entity.Restaurant;
import java.util.*;
import java.util.Arrays;

public class RestaurantData {

    private static final MenuData menuData = new MenuData();

    public List<Restaurant> restaurantList = Arrays.asList(
            new Restaurant(501,"RR briyani",4.5,menuData.restaurant1),
            new Restaurant(502,"Famour Baker",4.9,menuData.restaurant2),
            new Restaurant(503,"Muniyandhi Hotel",4.6,menuData.restaurant3)

    );
}
