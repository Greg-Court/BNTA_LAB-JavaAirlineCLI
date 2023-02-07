import java.util.ArrayList;

public interface IAir {

    void displayFlights();
    void searchDestination(String destination);
    
    void addMultipleFlights(ArrayList<Flight> newFlights);
    
    void addFlight(Flight flight);

}
