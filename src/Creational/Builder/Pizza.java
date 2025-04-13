package Creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private List<String> toppings;
    private String sauce;

    Pizza() {
        this.toppings = new ArrayList<>();
    }

    void setSize(String size) {
        this.size = size;
    }

    void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    void addTopping(String topping) {
        this.toppings.add(topping);
    }

    void setSauce(String sauce) {
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", toppings=" + toppings +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}