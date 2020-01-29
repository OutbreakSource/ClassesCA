/*
A sandwich is defined by a name, number of calories (integer is fine), and price.
Users should be able to create a sandwich given its name, number of calories, and price.
If the informed number of calories or price is negative,make sure those values are initialized to zero.
Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250,
false otherwise. Define 250 as a class variable (static)
constant (final).
 */

public class Sandwich {

    public final static int HEALTH = 250;
    private int calories;
    private double price;
    private String name;
    public static final int MIN_CALORIES = 0;
    public static final int MIN_PRICE = 0;

    public Sandwich(int calories, String name, double price) {
        this.calories = calories;
        this.name = name;
        this.price = price;

        this.calories = Math.max(MIN_CALORIES, calories);
        this.price = Math.max(MIN_PRICE, price);



    }

    boolean isHealthy() {
        return calories < HEALTH;
    }


    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return ("Name: " + getName() + "\n" + "Calories: " + getCalories() +
                "\n" + "Price: $" + getPrice() + "\n");

    }
}

