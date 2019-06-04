import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before

    public void setUp() {
        director = new Director("Bobby", 12, 2800, "Shoeshop", 20000.00 );

    }

    @Test
    public void hasName() {
        assertEquals("Bobby", director.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(2800, director.getSalary());
    }

    @Test
    public void hasNInumber() {
        assertEquals(12, director.getNInumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Shoeshop", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(3400, director.raiseSalary(600));
    }

    @Test
    public void canPayBonus() {
        assertEquals(28, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(20000.00, director.getBudget(), 0.01);
    }
}
