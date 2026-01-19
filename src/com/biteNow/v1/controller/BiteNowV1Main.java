package com.biteNow.v1.controller;

import com.biteNow.v1.service.UserService;

import java.util.Scanner;

public class BiteNowV1Main {

    private static final Scanner in = new Scanner(System.in);
    private static final UserService userService = new UserService();
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
    }
}
