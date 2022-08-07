package felinetests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    private final int argumentValue;
    private final int expectedValue;
    public FelineGetKittensTest(int argumentValue, int expectedValue) {
        this.argumentValue = argumentValue;
        this.expectedValue = expectedValue;
    }
    @Parameterized.Parameters
    public static Object[][] getValues() {
        return new Object[][] {
                {1, 1},
                {7, 7},
                {0, 0},
                {-2, -2},
        };
    }
    @Test
    public void getKittensReturnsIntKittensCount() {
        Feline feline = new Feline();
        assertEquals(expectedValue, feline.getKittens(argumentValue));
    }
}
