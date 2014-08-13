package eu.etransit;

public class OperationsFactory {

    public static Operation createAddOperation() {
        return new AddOperation();
    }

    public static Operation createDivideOperation() {
        return new DivideOperation();
    }
}
