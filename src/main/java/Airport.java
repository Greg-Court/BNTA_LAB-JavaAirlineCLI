import java.sql.Array;
import java.util.ArrayList;

public class Airport implements IAir {

    ArrayList<Airline> airlines;
    
    ArrayList<Flight> allAirportFlights;
    
    ArrayList<Passenger> registeredUsers;

    String name;

    public Airport(String name) {
        airlines = new ArrayList<>();
        allAirportFlights = new ArrayList<>();
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
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination() + " " + flight.getDate());
            flightIndex++;
        }
    }

    @Override
    public void searchDestination(String destination) {
        int counter = 1;
        for (int i = 0; i < airlines.size(); i++) {
            for (int j = 0; j < airlines.get(i).getFlights().size(); j++ ) {
                if (airlines.get(i).getFlights().get(j).getDestination().equals(destination)) {
                    System.out.print(counter++ + ". ");
                    System.out.print(airlines.get(i).getFlights().get(j).getFlightID() + " ");
                    System.out.print(airlines.get(i).getFlights().get(j).getDestination() +"\n");
                }
            }
        }
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
}
