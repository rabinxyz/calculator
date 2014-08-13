package eu.etransit;

public class DivideOperation implements Operation {

    @Override
    public double calculate(final double a, final double b) {
        return a / b;
    }
}
