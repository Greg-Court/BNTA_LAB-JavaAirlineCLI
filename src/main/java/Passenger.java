import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String customerId;
    private Airline airline;
    private ArrayList<Flight> bookedFlights;
    private ArrayList<Flight> checkedInFlights;
    private int currentAccount;

    public Passenger(String firstName, String lastName, String number, String email, int money) {
        bookedFlights = new ArrayList<>();
        checkedInFlights = new ArrayList<>();
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

    public boolean checkIfFlightCheckedIn(Flight flight) {
        return checkedInFlights.contains(flight);
    }


    public void displayBookedFlights() {
        int flightIndex = 1;
        for (Flight flight : bookedFlights) {
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination() + " on " + flight.getDate());
            flightIndex++;
        }
    }

    public void displayCheckedInFlights() {
        int flightIndex = 1;
        for (Flight flight : checkedInFlights) {
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
        bookedFlights.add(flight);
    }

    public void checkInFlight(Flight flight) {
        checkedInFlights.add(flight);
    }

    public void removeFlightFromPassenger(Flight flight) {
        bookedFlights.remove(flight);
    }

    public ArrayList<Flight> getBookedFlights() {
        return bookedFlights;
    }


    public ArrayList<Flight> getCheckedInFlights() {
        return checkedInFlights;
    }

    public void removeCheckedInFlights(Flight flight) {
        checkedInFlights.remove(flight);
    }

}

