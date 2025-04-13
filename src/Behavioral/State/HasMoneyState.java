package Behavioral.State;

public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Already have money inserted");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        if (machine.hasProduct()) {
            System.out.println("Product selected");
            machine.setState(new DispensingState());
        } else {
            System.out.println("Sorry, out of products");
            machine.setState(new NoMoneyState());
        }
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please select a product first");
    }
}