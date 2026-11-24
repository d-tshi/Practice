package oop.interfacee;

public class CreditCard implements Payment{


    @Override
    public void pay(int amount) {
        System.out.println("Paid CHF " + amount + " using CreditCard.");
    }


}
