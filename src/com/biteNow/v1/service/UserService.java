package com.biteNow.v1.service;

import com.biteNow.v1.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    Map<Integer,User> usersDetails = new HashMap<>();

    public void register(int userId,String userName,String phone,String address){
        User user = new User(userId,userName,phone,address);
        usersDetails.put(userId,user);
        System.out.println("User added successfully!");
        System.out.println(user);
    }

    public boolean login(int userId){
        User user = usersDetails.get(userId);
        if(user == null){
            System.out.println("Invalid user credentials!");
            return false;
        }else{
            System.out.println(user);
            return true;
        }
    }

}
