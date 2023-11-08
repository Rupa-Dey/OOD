package StatePattern;
class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        state = new NoSelectionState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public VendingMachineState getState() {
        return state;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }
}

// State interface representing the vending machine states
interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
}

// Concrete state class representing the state when no item is selected
class NoSelectionState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("select a product");
        vendingMachine.setState(new ItemSelectedState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No product selected.");
    }
}
class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Item already selected");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item dispensed");
        vendingMachine.setState(new NoSelectionState());
    }
}

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.selectItem();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();

        vendingMachine.dispenseItem();

        vendingMachine.selectItem();
        vendingMachine.selectItem();
    }
}
