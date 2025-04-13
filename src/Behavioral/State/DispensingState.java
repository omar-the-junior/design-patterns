package Behavioral.State;

public class DispensingState implements State {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Please wait, dispensing product");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please wait, dispensing product");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Dispensing product...");
        machine.setHasProduct(false);
        machine.setState(new NoMoneyState());
    }
}