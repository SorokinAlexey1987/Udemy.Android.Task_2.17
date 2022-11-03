package Calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {
    @Test
    public void TestCalc() throws Exception {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 15);
        Assert.assertEquals(25, result);
    }
}
