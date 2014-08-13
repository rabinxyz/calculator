package eu.etransit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void shouldAddThreeValues() {

        double expectedResult = 10;

        final Calculator calculator = new Calculator(4);

        calculator.add(3);
        calculator.add(3);

        Assert.assertEquals(calculator.result(), expectedResult);

    }

    @Test
    public void shouldAddTwoValuesAndDivideByOneValue() {

        double expectedResult = 4;

        final Calculator calculator = new Calculator(4);

        calculator.add(4);
        calculator.divide(2);

        Assert.assertEquals(calculator.result(), expectedResult);

    }


    @Test
    public void shouldAddTwoValuesWithClear() {

        double expectedResult = 8;

        final Calculator calculator = new Calculator(4);

        calculator.add(4);

        Assert.assertEquals(calculator.result(), expectedResult);

        calculator.clearWith(0);
        Assert.assertEquals(calculator.result(), 0.0);

    }



}