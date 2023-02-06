import java.util.ArrayList;

public class Airport implements IAir {

    ArrayList<Airline> airlines;

    String name;

    public Airport(String name) {
        airlines = new ArrayList<>();
        this.name = name;
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
        int counter = 1;
        for (int i = 0; i < airlines.size(); i++) {
            for (int j = 0; j < airlines.get(i).getFlights().size(); j++ ) {
                System.out.print(counter++ + ". ");
                System.out.print(airlines.get(i).getFlights().get(j).getFlightID() + " ");
                System.out.print(airlines.get(i).getFlights().get(j).getDestination() +"\n");
            }
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

    public void addAirline(Airline airline) {
        airlines.add(airline);
    }

    public ArrayList<Airline> getAirlines() {
        return airlines;
    }
}
