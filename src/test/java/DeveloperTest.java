import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before () {
        developer = new Developer("John Smith", "QQ123456C", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, developer.getSalary(), 0);
    }

    @Test
    public void canIncrementTheSalary(){
        developer.raiseSalary(50.00);
        assertEquals(25050.00, developer.getSalary(), 0);
    }

    @Test
    public void canReturnOnePercentOfTheSalary() {
        assertEquals(250, developer.payBonus(), 0);
    }

}
