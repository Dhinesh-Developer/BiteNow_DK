package com.biteNow.v1.service;

import com.biteNow.v1.data.MenuData;
import com.biteNow.v1.data.RestaurantData;
import com.biteNow.v1.entity.Menu;
import com.biteNow.v1.entity.Order;
import com.biteNow.v1.entity.Payment;
import com.biteNow.v1.entity.Restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RestaurantService {

    private Restaurant restaurant = new Restaurant();
    private RestaurantData restaurantData = new RestaurantData();
    private MenuData menuData = new MenuData();

    // Data
    List<Menu> addToCart = new ArrayList<>();
    private List<Order> orderDetails = new ArrayList<>();
    private List<Payment> paymentsDetails = new ArrayList<>();

    // view all available Restaurant
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

    // Show all available menu by Restaurant
    public void showAllMenu(int restaurantId){
        if(restaurantId == 501){
            Iterator<Menu> itr=  menuData.restaurant1.iterator();

            System.out.println("Menu Details of RR briyani!");
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }else if(restaurantId == 502){
            Iterator<Menu> itr=  menuData.restaurant2.iterator();

            System.out.println("Menu Details of Famous baker!");
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }else if(restaurantId == 503){
            Iterator<Menu> itr=  menuData.restaurant3.iterator();

            System.out.println("Menu Details of Muniyandhi Hotel");
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }else{
            System.out.println("Invalid Restaurant Id!");
            return;
        }

    }

    // Add to Cart
    public void addToCartByItemId(int restaurantId,int itemId){
        Menu menu = null;
        if(restaurantId == 501){
            menu = menuData.restaurant1.get(itemId);
        }else if(restaurantId == 502){
            menu = menuData.restaurant2.get(itemId);
        }else if(restaurantId == 503){
            menu = menuData.restaurant3.get(itemId);
        }

        if(menu == null){
            System.out.println("Menu is Not Available!");
            return;
        }else{
            addToCart.add(menu);
            System.out.println(menu);
            System.out.println("Item added to Cart!");
        }
    }

    // view cart
    public void viewCart(){
        if(addToCart.isEmpty()){
            System.out.println("Cart is Empty!");
            return;
        }else{
            System.out.println("Cart Details!");

            Iterator<Menu> itr = addToCart.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }

            double total = cartTotalPrice();
            System.out.println("Total Amount: "+total);
        }
    }

    // Cart total price
    public double cartTotalPrice(){
        double totalAmount = 0;
        Iterator<Menu> itr = addToCart.iterator();;
        while(itr.hasNext()){
            Menu menu = (Menu)itr.next();
            totalAmount += menu.getPrice();
        }
        return totalAmount;
    }

    // Orders and Payment
    public void placeOrder(){
        if(addToCart.isEmpty()){
            System.out.println("Cart is empty! cannot place order, Add item to place Order!");
            return;
        }else{
            System.out.println("Cart Details!");
            Iterator itr = addToCart.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            System.out.println("Total Amount: "+cartTotalPrice());

            // Orders and payment
            paymentProcess();
        }

    }

    // payment process
    public void paymentProcess(){
        Scanner in = new Scanner(System.in);
        System.out.println("Payment Details!");

        System.out.println("Enter the Amount: ");
        double amount = in.nextDouble();
        in.nextLine();
        System.out.println("Enter the name: ");
        String name = in.nextLine();
        System.out.println("Enter the payment Type: (CASH/UPI): ");
        String paymentType = in.nextLine();

        Payment payment = new Payment(name,amount,paymentType,"SUCCESS");
        System.out.println(payment);
        paymentsDetails.add(payment);

        Order order = new Order(name,cartTotalPrice(),"PLACED",addToCart);

        System.out.println(order);
        orderDetails.add(order);

    }

    public void viewOrderHistory(){
        if(orderDetails.isEmpty()){
            System.out.println("Order history is Empty!");
        }else{
            System.out.println("\n Order details!");
            Iterator itr = orderDetails.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }

    public void viewTransactionHistory(){
        if(paymentsDetails.isEmpty()){
            System.out.println("Payment history is Empty!");
        }else{
            System.out.println("\n Payment details!");
            Iterator itr = paymentsDetails.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }


}
