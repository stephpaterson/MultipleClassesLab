import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 30);
        person = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(30, bus.getCapacity());
    }

    @Test
    public void isBusEmpty() {
        assertEquals(0, bus.getPassengerList());
    }

    @Test
    public void canAddPassengerToBus() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerList());
    }

}
