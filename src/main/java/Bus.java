
public class Bus {

    private String busDestination;
    private int capacity;

    public Bus(String busDestination, int capacity){
        this.busDestination = busDestination;
        this.capacity = capacity;
    }


    public String getDestination() {
        return this.busDestination;
    }
}
