import java.sql.Array;
import java.util.ArrayList;

public class Airline implements IAir {
    private ArrayList<Flight> flights;
    private ArrayList<Passenger> allPassengers;
    private ArrayList<Passenger> registeredUsers;

    private int uniqueId;
    private String name;

    public Airline(String name) {
        flights = new ArrayList<>();
        registeredUsers = new ArrayList<>();
        allPassengers = new ArrayList<>();
        this.name = name;
    }

    public void registerUser(Passenger passenger) {
        registeredUsers.add(passenger);
    }
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void addMultipleFlights(ArrayList<Flight> newFlights) {
        flights.addAll(newFlights);
    }

    public void addPassengerToFlight(Passenger passenger, Flight flight) {
        flight.addPassenger(passenger);
        addPassengerToAllPassengers(passenger);
    }

    public void addPassengerToAllPassengers(Passenger passenger) {
        allPassengers.add(passenger);
    }

    public void displayFlights() {
        for (int i = 0; i < flights.size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.print(flights.get(i).getFlightID() + " ");
            System.out.print(flights.get(i).getDestination()+"\n");
        }
    }

    public void cancelFlight(Flight flight) {
        flights.remove(flight);
        for (Passenger passenger : allPassengers) {
            if (passenger.getFlights().contains(flight)) {
                passenger.removeFlightFromPassenger(flight);
            }
        }
    }

    @Override
    public void searchDestination(String destination) {
        int counter = 1;
        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getDestination().equals(destination)) {
                System.out.print(counter++ + ". ");
                System.out.print(flights.get(i).getFlightID() + " ");
                System.out.print(flights.get(i).getDestination() +"\n");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void incrementUniqueID() {
        this.uniqueId++;
    }

    public int getUniqueID() {
        return uniqueId;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
}
