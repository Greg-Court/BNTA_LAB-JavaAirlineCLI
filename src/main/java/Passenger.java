import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String firstName;
    private String lastName;
    private String number;
    private String email;
    private String customerID;
    private Airport airport;
    private ArrayList<Flight> bookedFlights;
    private ArrayList<Flight> checkedInFlights;
    private int currentAccount;

    public Passenger(String firstName, String lastName, String number, String email, int money, Airport airport) {
        bookedFlights = new ArrayList<>();
        checkedInFlights = new ArrayList<>();
        this.airport = airport;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.email = email;
        this.customerID = generateId();
        this.currentAccount = money;
    }

    public String generateId(){
        // generate customer Id
        String customerIdentifier = this.firstName.substring(0,3).toUpperCase();
        airport.incrementUniqueID();
        return customerIdentifier + String.format("%05d",airport.getUniqueID());
        // return id;
    }

    public boolean checkIfFlightCheckedIn(Flight flight) {
        return checkedInFlights.contains(flight);
    }

    public String isFlightCheckedInString(Flight flight) {
        if (checkedInFlights.contains(flight)) {
            return "CHECKED IN";
        } else {
            return "NOT CHECKED IN";
        }
    }


    public void displayBookedFlights() {
        int flightIndex = 1;
        for (Flight flight : bookedFlights) {
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination()
                    + " on " + flight.getDate() + " - " + isFlightCheckedInString(flight));
            flightIndex++;
        }
    }

    public void displayCheckedInFlights() {
        int flightIndex = 1;
        for (Flight flight : checkedInFlights) {
            System.out.println(flightIndex + ". " + flight.getFlightID() + " " + flight.getDestination()
                    + " on " + flight.getDate());
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

    public String getCustomerID() {
        return customerID;
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

