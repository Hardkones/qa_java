package animaltests;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalGetFamilyTest {
    @Test
    public void getFamilyTestAnimalWithoutArgument() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
