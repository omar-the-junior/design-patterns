package Behavioral.State;

public class VendingMachine {
    private State currentState;
    private boolean hasProduct;

    public VendingMachine() {
        currentState = new NoMoneyState();
        hasProduct = true;
    }

    public void insertMoney() {
        currentState.insertMoney(this);
    }

    public void selectProduct() {
        currentState.selectProduct(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public boolean hasProduct() {
        return hasProduct;
    }

    public void setHasProduct(boolean hasProduct) {
        this.hasProduct = hasProduct;
    }
}