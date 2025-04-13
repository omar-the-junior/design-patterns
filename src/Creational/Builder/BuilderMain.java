package Creational.Builder;

public class BuilderMain {
    public static void main(String[] args) {
        // Creating a custom pizza using the builder pattern
        Pizza customPizza = new PizzaBuilder()
                .setSize("large")
                .setCrustType("thin")
                .setSauce("tomato")
                .addTopping("cheese")
                .addTopping("pepperoni")
                .addTopping("mushrooms")
                .build();

        System.out.println("Custom Pizza Order Details:");
        System.out.println(customPizza);

        // Creating a simple vegetarian pizza
        Pizza vegetarianPizza = new PizzaBuilder()
                .setSize("medium")
                .setCrustType("thick")
                .setSauce("pesto")
                .addTopping("cheese")
                .addTopping("tomatoes")
                .addTopping("bell peppers")
                .addTopping("olives")
                .build();

        System.out.println("\nVegetarian Pizza Order Details:");
        System.out.println(vegetarianPizza);
    }
}