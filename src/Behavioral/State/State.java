package Behavioral.State;

public interface State {
    void insertMoney(VendingMachine machine);

    void selectProduct(VendingMachine machine);

    void dispense(VendingMachine machine);
}