package Fundamentals.UserInput;
import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        // Personal Information

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        double height;
        String language;

        System.out.println("What is your name?");
        name = scanner.nextLine();

        System.out.println("How old are you?");
        age = scanner.nextInt();

        System.out.println("How tall are you?(in meter)");
        height = scanner.nextDouble();

        System.out.println("Whats your favorite programming language?");
        language = scanner.nextLine();

        System.out.println("--- Personal Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");
        System.out.println("Favorite programming language: " + language);

        scanner.close();


    }
}
