import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before () {
        databaseAdmin = new DatabaseAdmin("John Smith", "QQ123456C", 25000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("QQ123456C", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canIncrementTheSalary(){
        databaseAdmin.raiseSalary(50.00);
        assertEquals(25050.00, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canReturnOnePercentOfTheSalary() {
        assertEquals(250, databaseAdmin.payBonus(), 0);
    }

}
