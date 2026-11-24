package oop.interfacee;

public class Twint implements Payment{
    @Override
    public void pay(int amount) {
        System.out.println("Paid CHF " + amount + " using Twint.");
    }
}
