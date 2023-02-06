import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String customerId;
    private Airline airline;
    private boolean checkedIn;
    private ArrayList<Flight> flights;
    private int currentAccount;

    public Passenger(String firstName, String lastName, String number, String email, Airline airline, int money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.customerId = generateId(airline);
        this.currentAccount = money;
    }

    public String generateId(Airline airline){
        // generate customer Id
        String airlineIdentifier = airline.getName().substring(0,3).toUpperCase();
        airline.incrementUniqueID();

        return airlineIdentifier + String.format("%05d",airline.getUniqueID());
        // return id;
    }

    public void displayFlights() {
        int flightIndex = 1;
        for (Flight flight : flights) {
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination() + " on " + flight.getDate());
            flightIndex++;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
        }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void addFlightToPassenger(Flight flight) {
        flights.add(flight);
    }

    public void removeFlightFromPassenger(Flight flight) {
        flights.remove(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }


}
