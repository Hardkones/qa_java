package animaltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AnimalGetFamilyTest.class,
        AnimalKindRightGetFoodTest.class,
        AnimalKindWrongGetFoodTest.class,
})
public class AnimalTest {
}
