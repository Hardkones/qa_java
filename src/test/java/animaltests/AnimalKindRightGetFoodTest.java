package animaltests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalKindRightGetFoodTest {
    private final String argumentValue;
    private final List<String> expectedValue;

    public AnimalKindRightGetFoodTest(String argumentValue, List<String> expectedValue) {
        this.argumentValue = argumentValue;
        this.expectedValue = expectedValue;
    }
    @Parameterized.Parameters
    public static Object[][] getValues() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void animalGetFoodExpectedList() throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedValue, animal.getFood(argumentValue));
    }
}
