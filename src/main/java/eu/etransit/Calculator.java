package eu.etransit;

public class Calculator {

    private double currentValue;

    public Calculator(double initValue) {
        this.currentValue = initValue;
    }

    public void add(double value) {
        this.currentValue = OperationsFactory.createAddOperation().calculate(this.currentValue, value);
    }

    public void result() {

    }
}
