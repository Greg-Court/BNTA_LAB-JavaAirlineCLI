import java.sql.Array;
import java.util.ArrayList;

public class Airport implements IAir {

    ArrayList<Airline> airlines;
    
    ArrayList<Flight> allAirportFlights;

    ArrayList<Passenger> registeredUsers;

    String name;

    private int uniqueId;

    public Airport(String name) {
        airlines = new ArrayList<>();
        allAirportFlights = new ArrayList<>();
        registeredUsers = new ArrayList<>();
        this.name = name;
    }

    public void addRegisteredUser(Passenger passenger) {
        registeredUsers.add(passenger);
    }

    public void displayAirlines() {
        int airlineIndex = 1;
        for (Airline airline : airlines) {
            System.out.println(airlineIndex + ". " + airline.getName());
            airlineIndex++;
        }
    }

    @Override
    public void displayFlights() {
        int flightIndex = 1;
        for (Flight flight : allAirportFlights) {
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination()
                    + " " + flight.getDate() + " £" + flight.getPrice());
            flightIndex++;
        }
    }

    @Override
    public void searchDestination(char destinationChar) {
        int counter = 0;
        for (Flight flight : allAirportFlights) {
            if (flight.getDestination().toUpperCase().charAt(0) == destinationChar) {
                System.out.println(flight.getFlightID() + " " + flight.getDestination()
                        + " " + flight.getDate() + " £" + flight.getPrice());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Sorry, no destinations starting with " + destinationChar);
        }
    }

    public void removeFlight(Flight flight) {
        this.getAllAirportFlights().remove(flight);
    }

    @Override
    public void addMultipleFlights(ArrayList<Flight> newFlights) {
        allAirportFlights.addAll(newFlights);
    }

    @Override
    public void addFlight(Flight flight) {
        allAirportFlights.add(flight);
    }

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public ArrayList<Flight> getAllAirportFlights() {
        return allAirportFlights;
    }

    public void incrementUniqueID() {
        this.uniqueId++;
    }

    public int getUniqueID() {
        return uniqueId;
    }
}
