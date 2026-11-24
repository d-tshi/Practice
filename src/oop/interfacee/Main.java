import oop.interfacee.CreditCard;
import oop.interfacee.PayPal;
import oop.interfacee.Payment;
import oop.interfacee.Twint;

/***
 * Interface is like contract that describes what a class must be able to do, without necessarily
 * specifying how it does it. Like all of the classes of animal needs an eat method because animals eat
 * but how and what they eat is not important. Like it defines which functionality they must provide.
 * Everything in the interface has to be in the class.
 * you have to have every method from  the interface in your class which implements it.
 * advantage is, you can use the interface and lets you keep track of what you need.
 */

public static void main(String[] args) {
    Twint twint = new Twint();
    CreditCard creditcard = new CreditCard();
    PayPal paypal= new PayPal();

    twint.pay(50);
    creditcard.pay(100);
    paypal.pay(123);

}
