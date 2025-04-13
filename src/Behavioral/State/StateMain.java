package Behavioral.State;

public class StateMain {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        // Try to get a product without inserting money
        System.out.println("Trying to get a product without money:");
        machine.selectProduct();

        // Insert money and select product
        System.out.println("\nInserting money and selecting product:");
        machine.insertMoney();
        machine.selectProduct();
        machine.dispense();

        // Try to get another product (machine is empty now)
        System.out.println("\nTrying to get another product:");
        machine.insertMoney();
        machine.selectProduct();
    }
}