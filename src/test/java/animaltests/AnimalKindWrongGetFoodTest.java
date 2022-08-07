package animaltests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AnimalKindWrongGetFoodTest {
    private final String argumentValue;

    public AnimalKindWrongGetFoodTest(String argumentValue) {
        this.argumentValue = argumentValue;
    }
    @Parameterized.Parameters
    public static Object[][] getValue() {
        return new Object[][] {
                {"Tpaвoяднoe"},
                {"Плотоядное"},
                {" "},
        };
    }
    @Test(expected = Exception.class)
    public void getFoodWrongAnimalKind() throws Exception {
        Animal animal = new Animal();
        animal.getFood(argumentValue);
    }
}
