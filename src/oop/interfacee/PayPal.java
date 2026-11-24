package oop.interfacee;

public class PayPal implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid CHF " + amount + " PayPal.");
    }
}
