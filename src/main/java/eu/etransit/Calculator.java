package eu.etransit;

public class Calculator {

    private double currentValue;

    public Calculator(double initValue) {
        this.currentValue = initValue;
    }

    public void add(double value) {
        this.currentValue = OperationsFactory.createAddOperation().calculate(this.currentValue, value);
    }

    public void divide(double value) {
        this.currentValue = OperationsFactory.createDivideOperation().calculate(this.currentValue, value);
    }

    public void clearWith(double initValue) {
        this.currentValue = initValue;
    }

    public double result() {
        return currentValue;
    }
}
