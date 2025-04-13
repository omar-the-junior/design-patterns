package Behavioral.State;

public class NoMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Money accepted!");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert money first");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Please insert money first");
    }
}