import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before

    public void setUp() {
        developer = new Developer("Zack", 11, 1400);
    }

    @Test
    public void hasName() {
        assertEquals("Zack", developer.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400, developer.getSalary());
    }

    @Test
    public void hasNInumber() {
        assertEquals(11, developer.getNInumber());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(2000, developer.raiseSalary(600));
    }

    @Test
    public void canPayBonus() {
        assertEquals(14, developer.payBonus(), 0.01);
    }

}
