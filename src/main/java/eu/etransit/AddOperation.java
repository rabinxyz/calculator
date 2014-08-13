package eu.etransit;

public class AddOperation implements Operation {

    @Override
    public double calculate(final double a, final double b) {
        return a + b;
    }
}
