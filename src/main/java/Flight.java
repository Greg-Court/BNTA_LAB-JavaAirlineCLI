import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private String destination;
    private String flightID;
    private LocalDate date;
    private ArrayList<Passenger> passengers;
    private int price;


    public Flight(String destination, LocalDate date) {
        this.destination = destination;
        this.date = date;
        this.flightID = generateId(destination);
        this.price = generatePrice();
    }

    public String generateId(String destination) {
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        String countryIdentifier = destination.substring(0,3).toUpperCase();
        return countryIdentifier + Integer.toString(randomNumber);
    }

    public int generatePrice() {
        Random random = new Random();
        return random.nextInt(2000 + 1) + 500;
    }

    public String getFlightID() {
        return flightID;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public String getDestination() {
        return destination;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getPrice() {
        return price;
    }
}
