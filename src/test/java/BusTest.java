import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Bus busTwo;
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

    @Test
    public void cantAddPassengerToBus() {
        busTwo = new Bus("Edinburgh", 2);
        busTwo.addPassenger(person);
        busTwo.addPassenger(person);
        busTwo.addPassenger(person);
        assertEquals(2, busTwo.getPassengerList());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerList());
    }
}
