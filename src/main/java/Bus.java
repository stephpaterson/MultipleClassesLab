import java.util.ArrayList;

public class Bus {

    private String busDestination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String busDestination, int capacity) {
        this.busDestination = busDestination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }


    public String getDestination() {
        return this.busDestination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerList() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        this.passengers.add(person);
    }
}


