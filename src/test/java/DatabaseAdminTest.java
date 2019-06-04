import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin DbAdmin;

    @Before

    public void setUp() {
        DbAdmin = new DatabaseAdmin("Joey", 10, 1400);
    }

    @Test
    public void hasName() {
        assertEquals("Joey", DbAdmin.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400, DbAdmin.getSalary());
    }

    @Test
    public void hasNInumber() {
        assertEquals(10, DbAdmin.getNInumber());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(2000, DbAdmin.raiseSalary(600));
    }

    @Test
    public void canPayBonus() {
        assertEquals(14, DbAdmin.payBonus(), 0.01);
    }

}
