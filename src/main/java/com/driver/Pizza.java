package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean takeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.bill = "";

        if(isVeg){
            this.price = 300;
        } else {
            this.price = 400;
        }

        bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded){
            price += 80;
            bill += "Extra Cheese Added: 80\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            int toppingsPrice = isVeg ? 70 : 120;
            price += toppingsPrice;
            bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeawayAdded){
            price += 20;
            bill += "Paperbag Added: 20\n";
            takeawayAdded = true;
        }
    }

    public String getBill(){
        bill += "Total Price: " + price + "\n";
        return bill;
    }
}
