import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before () {
        manager = new Manager("John Smith", "QQ123456C", 25000.00, "Accounting");
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, manager.getSalary(), 0);
    }

    @Test
    public void canIncrementTheSalary(){
        manager.raiseSalary(50.00);
        assertEquals(25050.00, manager.getSalary(), 0);
    }

    @Test
    public void canReturnOnePercentOfTheSalary() {
        assertEquals(250, manager.payBonus(), 0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Accounting", manager.getDeptName());
    }
}
