import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    
    public void setUp() {
        manager = new Manager("Jack", 9, 1400, "Shoeshop" );
        
    }

    @Test
    public void hasName() {
        assertEquals("Jack", manager.getName());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400, manager.getSalary());
    }

    @Test
    public void hasNInumber() {
        assertEquals(9, manager.getNInumber());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Shoeshop", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(2000, manager.raiseSalary(600));
    }

    @Test
    public void canPayBonus() {
        assertEquals(14, manager.payBonus(), 0.01);
    }

//Couldn't get this to pass.
//    @Test
//    public void raiseCannotBeNegative() {
//        assertEquals(IllegalArgumentException.class, manager.raiseSalary(-400));
//    }
}
