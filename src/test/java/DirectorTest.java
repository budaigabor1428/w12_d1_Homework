import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before () {
        director = new Director("John Smith", "QQ123456C", 25000.00, "Accounting", 9000000);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, director.getSalary(), 0);
    }

    @Test
    public void canIncrementTheSalary(){
        director.raiseSalary(50.00);
        assertEquals(25050.00, director.getSalary(), 0);
    }

    @Test
    public void canReturnOnePercentOfTheSalary() {
        assertEquals(500, director.payBonus(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Accounting", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(9000000, director.getBudget(), 0);
    }
}
