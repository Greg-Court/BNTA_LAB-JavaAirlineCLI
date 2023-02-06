import java.util.ArrayList;
import java.util.Random;

public class Passenger {
    private String name;
    private String surname;
    private String number;
    private String email;
    private String customerId;
    private Airline airline;
    private boolean checkedIn;
    private ArrayList<Flight> flights;

    public Passenger(String name, String surname, String number, String email, Airline airline) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.customerId = generateId(airline);
    }

    public String generateId(Airline airline){
        // generate customer Id
        String airlineIdentifier = airline.getName().substring(0,3).toUpperCase();
        airline.incrementUniqueID();

        return airlineIdentifier + String.format("%05d",airline.getUniqueID());
        // return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setSurname(){
        this.surname = surname;
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
