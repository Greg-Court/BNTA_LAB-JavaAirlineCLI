import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CLI {
    void startCLI() {

        Airport airport = new Airport("Joe Mama Airport");

        Airline joeLine = new Airline("Joe Mama Air");
        Airline rydLine = new Airline("RydAIR");
        Airline gregLine = new Airline("GregAIRious");

        airport.addAirline(joeLine);
        airport.addAirline(rydLine);
        airport.addAirline(gregLine);

        Flight flight1 = new Flight("New York City", LocalDate.of(2023, 2, 12));
        Flight flight2 = new Flight("London", LocalDate.of(2023, 3, 2));
        Flight flight3 = new Flight("Tokyo", LocalDate.of(2023, 2, 22));
        Flight flight4 = new Flight("Dubai", LocalDate.of(2023, 2, 28));
        Flight flight5 = new Flight("Sydney", LocalDate.of(2023, 3, 5));
        Flight flight6 = new Flight("Rome", LocalDate.of(2023, 2, 18));
        Flight flight7 = new Flight("Paris", LocalDate.of(2023, 2, 25));
        Flight flight8 = new Flight("Beijing", LocalDate.of(2023, 2, 10));
        Flight flight9 = new Flight("Shanghai", LocalDate.of(2023, 3, 1));
        Flight flight10 = new Flight("Barcelona", LocalDate.of(2023, 2, 20));
        Flight flight11 = new Flight("Moscow", LocalDate.of(2023, 2, 15));
        Flight flight12 = new Flight("Mexico City", LocalDate.of(2023, 3, 4));
        Flight flight13 = new Flight("Toronto", LocalDate.of(2023, 2, 19));
        Flight flight14 = new Flight("Seoul", LocalDate.of(2023, 2, 23));
        Flight flight15 = new Flight("Mumbai", LocalDate.of(2023, 3, 7));
        Flight flight16 = new Flight("San Francisco", LocalDate.of(2023, 2, 14));
        Flight flight17 = new Flight("Singapore", LocalDate.of(2023, 2, 26));
        Flight flight18 = new Flight("Berlin", LocalDate.of(2023, 3, 3));
        Flight flight19 = new Flight("Madrid", LocalDate.of(2023, 2, 21));
        Flight flight20 = new Flight("Amsterdam", LocalDate.of(2023, 2, 17));
        Flight flight21 = new Flight("Bangkok", LocalDate.of(2023, 2, 11));
        Flight flight22 = new Flight("Hong Kong", LocalDate.of(2023, 2, 24));
        Flight flight23 = new Flight("Vienna", LocalDate.of(2023, 3, 6));
        Flight flight24 = new Flight("Brussels", LocalDate.of(2023, 2, 16));
        Flight flight25 = new Flight("Dublin", LocalDate.of(2023, 3, 5));
        Flight flight26 = new Flight("Zurich", LocalDate.of(2023, 2, 27));
        Flight flight27 = new Flight("Oslo", LocalDate.of(2023, 2, 13));
        Flight flight28 = new Flight("Stockholm", LocalDate.of(2023, 2, 9));
        Flight flight29 = new Flight("Copenhagen", LocalDate.of(2023, 2, 20));
        Flight flight30 = new Flight("Helsinki", LocalDate.of(2023, 2, 8));

        joeLine.addMultipleFlights(new ArrayList<>(Arrays.asList(flight1, flight2, flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10)));
        rydLine.addMultipleFlights(new ArrayList<>(Arrays.asList(flight11, flight12, flight13, flight14, flight15, flight16, flight17, flight18, flight19, flight20)));
        gregLine.addMultipleFlights(new ArrayList<>(Arrays.asList(flight21, flight22, flight23, flight24, flight25, flight26, flight27, flight28, flight29, flight30)));

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the Joe Mama Airport Self-Service Kiosk.");
        System.out.println("Please insert your bank card and select one of the following options to continue.");

        int passengerBalance = sc.nextInt();

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Book a flight");
            System.out.println("3. Check in");
            System.out.println("4. Display all available flights");
            System.out.println("5. Cancel your flight\n");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    // Register to an airline -----------------------------------------------------------------------
                    System.out.println("You selected option 1: Register");

                    System.out.println("\nPlease select which airline you'd like to register with by entering its index number.");
                    Airline selectedAirline = null;
                    airport.displayAirlines();
                    int selectedAirlineIndex = sc.nextInt() - 1;
                    sc.nextLine();

                    if (selectedAirlineIndex >= 0 && selectedAirlineIndex < airport.getAirlines().size()) {
                        selectedAirline = airport.getAirlines().get(selectedAirlineIndex);
                        System.out.println("You have selected airline: " + selectedAirline.getName());
                    } else {
                        System.out.println("Invalid airline index selected. Please try again.");
                    }

                    System.out.print("Enter your first name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Enter your last name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Enter your number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter your email: ");
                    String email = sc.nextLine();

                    String detailsConfirmation = "no";
                    while (!detailsConfirmation.equals("yes")) {
                        System.out.println("Thank you for registering your details.");
                        System.out.println("Please confirm that the following is correct: ");
                        System.out.println("Full name: " + firstName + " " + lastName);
                        System.out.println("Mobile number: " + number);
                        System.out.println("Email: " + email);
                        System.out.println("Enter 'yes' to confirm or 'no' to re-enter your details.");

                        detailsConfirmation = sc.nextLine();

                        if (!detailsConfirmation.equals("yes")) {
                            System.out.println("Please re-enter your details:");
                            System.out.print("First name: ");
                            firstName = sc.nextLine();

                            System.out.print("Last name: ");
                            lastName = sc.nextLine();

                            System.out.print("Mobile Number: ");
                            number = sc.nextLine();

                            System.out.print("Email: ");
                            email = sc.nextLine();
                        }
                    }

                    Passenger user = new Passenger(firstName, lastName, number, email, selectedAirline, passengerBalance);
                    selectedAirline.registerUser(user);

                    System.out.println("You have successfully registered with " + selectedAirline.getName() + ". ");
                    System.out.println("Returning to main menu.");
                    break;

                case 2:
                    // Book a flight -----------------------------------------------------------------------
                    System.out.println("You selected option 2: Book a flight");
                    System.out.println("Please select an option from the following flights");
                    // print all available flights from all airlines
                    // allow user to select a flight by number
                    break;

                case 3:
                    // Check In -----------------------------------------------------------------------
                    System.out.println("You selected option 3: Check in");
                    System.out.println("Please select which flight you'd like to check in for");
                    // display current user's available flights (only ones they have booked)
                    break;

                case 4:
                    // Display all available flights -----------------------------------------------------------------------
                    System.out.println("You selected option 4: Display all available flights");
                    System.out.println("Here are currently available flights:");

                    airport.displayFlights();
                    break;

                case 5:
                    // Cancel your flight -----------------------------------------------------------------------
                    System.out.println("You selected option 5: Cancel your flight");
                    System.out.println("Please select a flight you'd like to cancel. Please be aware that you will incur a cancellation fee of £1000.");

                    user.displayFlights();

                    int selectedPassengerFlightIndex = sc.nextInt() - 1;

                    if (selectedPassengerFlightIndex >= 0 && selectedPassengerFlightIndex <= user.getFlights().size()) {
                        Flight selectedFlight = user.getFlights().get(selectedPassengerFlightIndex);
                        System.out.println("You have successfully cancelled flight " + selectedFlight.getFlightID() + " to " + selectedFlight.getDestination() + " on " + selectedFlight.getDate());
                        user.getFlights().remove(selectedPassengerFlightIndex);
                    }


                    break;

                default:
                    System.out.println("Invalid option selected. Please try again.");
            }
        }


    }


}
