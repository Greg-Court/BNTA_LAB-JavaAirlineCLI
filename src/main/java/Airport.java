import java.util.ArrayList;

public class Airport implements IAir {

    ArrayList<Airline> airlines;

    String name;

    public Airport(String name) {
        this.name = name;
    }

    @Override
    public void searchDestination(String destination) {
        int counter = 1;
        for (int i = 0; i < airlines.size(); i++) {
            for (int j = 0; j < airlines.get(i).getFlights().size(); j++ ) {
                System.out.print(counter++ + ". ");
                System.out.print(airlines.get(i).getFlights().get(j).getFlightID() + " ");
                System.out.print(airlines.get(i).getFlights().get(j).getDestination() +"\n");
            }
        }  
    }
    
    public void addAirline(Airline airline) {
        airlines = new ArrayList<>();
        airlines.add(airline);
    }
}
