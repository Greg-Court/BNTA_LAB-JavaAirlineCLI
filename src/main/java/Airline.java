import java.sql.Array;
import java.util.ArrayList;

public class Airline implements IAir {
    private ArrayList<Flight> flights;
    private ArrayList<Passenger> allPassengers;
//    private ArrayList<Passenger> registeredUsers;

    private int uniqueId;
    private String name;
    Airport airport;

    public Airline(String name, Airport airport) {
        flights = new ArrayList<>();
//        registeredUsers = new ArrayList<>();
        allPassengers = new ArrayList<>();
        this.name = name;
        this.airport = airport;
    }

//    public void registerUser(Passenger passenger) {
//        registeredUsers.add(passenger);
//    }
    
    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
        airport.addFlight(flight);
    }

    @Override
    public void addMultipleFlights(ArrayList<Flight> newFlights) {
        flights.addAll(newFlights);
        airport.addMultipleFlights(newFlights);
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
            if (passenger.getBookedFlights().contains(flight)) {
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
