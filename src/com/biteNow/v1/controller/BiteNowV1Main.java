package com.biteNow.v1.controller;

import com.biteNow.v1.service.RestaurantService;
import com.biteNow.v1.service.UserService;

import java.util.Scanner;

public class BiteNowV1Main {

    private static final Scanner in = new Scanner(System.in);
    private static final UserService userService = new UserService();
    private static final RestaurantService restaurantService = new RestaurantService();
    private static boolean res = false;


    public static void main(String[] args) {

        while (true){
            System.out.println("----Welcome to BiteNow----");
            System.out.println("\n1.Register");
            System.out.println("2.Login");

            System.out.println("Enter your choice: ");
            int userChoice = in.nextInt();

            switch (userChoice){
                case 1:
                    System.out.println("Enter the userId: ");
                    int userId = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter the name: ");
                    String username = in.nextLine();
                    System.out.println("Enter the phone Number: ");
                    String userPhone = in.nextLine();
                    System.out.println("Enter the address: ");
                    String address = in.nextLine();
                    
                    userService.register(userId,username,userPhone,address);
                    break;
                    
                case 2:
                    System.out.println("Enter the userId: ");
                    int loginId = in.nextInt();
                    res = userService.login(loginId);
                    if(res) nextProcess();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void nextProcess() {

        while(true){
            System.out.println("----BiteNow Application----");
            System.out.println("1.View All Restaurant!");
            System.out.println("2.View Menu");
            System.out.println("3.Add to Cart");
            System.out.println("4.View Cart");
            System.out.println("5.place Order");
            System.out.println("6.View orders history");
            System.out.println("7.View Transaction History");
            System.out.println("8.Exit");

            System.out.println("\nEnter your choice: ");
            int choice = in.nextInt();

            switch (choice){
                case 1:
                    restaurantService.viewAllRestaurant();
                    break;
                case 2:
                    System.out.println("Enter the Restaurant Id: ");
                    int restaurantId = in.nextInt();
                    restaurantService.showAllMenu(restaurantId);
                    break;
                case 3:
                    System.out.println("Enter the Restaurant Id: ");
                    int itemRestaurantId = in.nextInt();
                    System.out.println("Enter the Item Id: ");
                    int itemId = in.nextInt();
                    restaurantService.addToCartByItemId(itemRestaurantId,itemId);
                    break;
                case 4:
                    restaurantService.viewCart();
                    break;
                case 5:
                    restaurantService.placeOrder();
                    break;
                case 6:
                    restaurantService.viewOrderHistory();
                    break;
                case 7:
                    restaurantService.viewTransactionHistory();
                    break;
                case 8:
                    System.out.println("----BiteNow Terminated!----");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        }
    }
}
