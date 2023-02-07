import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CLI {
    void startCLI() {

        Airport airport = new Airport("Joe Mama Airport");

        Airline joeLine = new Airline("Joe Mama Air", airport);
        Airline rydLine = new Airline("RydAIR", airport);
        Airline gregLine = new Airline("GregAIRious", airport);

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

        boolean loop = true;
        int passengerBalance = 0;

        while (loop) {
            try {
                System.out.println("Please insert your bank card to continue.");
                passengerBalance = sc.nextInt();
                loop = false;
            }
            catch(Exception e) {
                System.out.println("Error: Invalid card. Please insert a valid bank card.");
                sc.nextLine();
                continue;
            }
        }


        Passenger user = null;
        boolean runProgam = true;

        while (runProgam) {
            System.out.println("\n1. Register");
            System.out.println("2. Book a flight");
            System.out.println("3. Check in");
            System.out.println("4. Display all available flights");
            System.out.println("5. Cancel your flight");
            System.out.println("6. Add a new flight - ADMIN ACCESS REQUIRED");
            System.out.println("7. Exit\n");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    // Register to an airline -----------------------------------------------------------------------
                    System.out.println("You selected option 1: Register");

//                    System.out.println("\nPlease select which airline you'd like to register with by entering its index number.");
//                    Airline selectedAirline = null;
//                    airport.displayAirlines();
//                    int selectedAirlineIndex = sc.nextInt() - 1;
//                    sc.nextLine();
//
//                    if (selectedAirlineIndex >= 0 && selectedAirlineIndex < airport.getAirlines().size()) {
//                        selectedAirline = airport.getAirlines().get(selectedAirlineIndex);
//                        System.out.println("You have selected airline: " + selectedAirline.getName());
//                    } else {
//                        System.out.println("Invalid airline index selected. Please try again.");
//                    }

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

                    user = new Passenger(firstName, lastName, number, email, passengerBalance);
                    airport.addRegisteredUser(user);

                    System.out.println("You have successfully registered on our airport system. ");
                    System.out.println("Returning to main menu.");
                    break;

                case 2:
                    // Book a flight -----------------------------------------------------------------------
                    System.out.println("You selected option 2: Book a flight");
                    System.out.println("Please select an option from the following flights");
                    // print all available flights from all airlines
                    if (user != null) {
                        // declare a variable called selectedAirportFlightIndex int = userinput int - 1
                        airport.displayFlights();
                        int selectedAirportFlightIndex = sc.nextInt() - 1;

                        // putting the flight in the passenger arraylist
                        if (selectedAirportFlightIndex >= 0 && selectedAirportFlightIndex <= airport.getAllAirportFlights().size()) {
                            Flight selectedFlight = airport.getAllAirportFlights().get(selectedAirportFlightIndex);
                            if (user.getBookedFlights().contains(selectedFlight)) {
                                System.out.println("You have already booked this flight.");
                            } else {
                                System.out.println("You have successfully booked flight " + selectedFlight.getFlightID() +
                                        " to " + selectedFlight.getDestination() + " on " + selectedFlight.getDate());

                                // putting the flight in the passenger arraylist
                                user.addFlightToPassenger(selectedFlight);
                                System.out.println("\n Here is a list of all your booked flights:");
                                user.displayBookedFlights();
                            }
                        } else {
                            System.out.println("Please select a valid option.");
                        }
                    } else {
                        System.out.println("Please register first.");
                    }
                    break;

                case 3:
                    // Check In -----------------------------------------------------------------------
                    System.out.println("You selected option 3: Check in");
                    user.displayBookedFlights();
                    int selectedFlightIndex = sc.nextInt() - 1;

                    if (user != null) {
                        if (user.getBookedFlights().size() > 0) {
                            System.out.println("Please select which flight you'd like to check in for");
                            if (selectedFlightIndex >= 0 && selectedFlightIndex <= user.getBookedFlights().size()) {
                                Flight flightToCheckIn = user.getBookedFlights().get(selectedFlightIndex);
                                System.out.println("You have successfully checked in flight " + flightToCheckIn.getFlightID()
                                        + " to " + flightToCheckIn.getDestination() + " on " + flightToCheckIn.getDate());
                                user.checkInFlight(flightToCheckIn);
                                System.out.println("Here is a list of all your checked in flights: ");
                                user.displayCheckedInFlights();
                            }
                        } else {
                            System.out.println("No booked flights available. Please book a flight first.");
                            break;
                        }

                    }
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


                    if (user != null) {
                        if (user.getBookedFlights().size() <= 0) {
                            System.out.println("There are no flights on your account.");
                            System.out.println("Please book a flight or contact customer service.");
                            break;
                        } else {
                            System.out.println("Please select a flight you'd like to cancel. " +
                                    "Please be aware that you will incur a cancellation fee of £1000.");
                            user.displayBookedFlights();

                            int selectedPassengerFlightIndex = sc.nextInt() - 1;

                            if (selectedPassengerFlightIndex >= 0 && selectedPassengerFlightIndex <= user.getBookedFlights().size()) {
                                Flight selectedFlight = user.getBookedFlights().get(selectedPassengerFlightIndex);
                                System.out.println("You have successfully cancelled flight " + selectedFlight.getFlightID()
                                        + " to " + selectedFlight.getDestination() + " on " + selectedFlight.getDate());
                                user.getBookedFlights().remove(selectedPassengerFlightIndex);
                                if (user.getCheckedInFlights().contains(selectedFlight)) {
                                    user.removeCheckedInFlights(selectedFlight);
                                }
                                System.out.println("Here are your remaining flights: ");
                                user.displayBookedFlights();
                            }
                        }
                    } else {
                        System.out.println("Please register first.");
                    }
                    break;
                default:
                    System.out.println("Invalid option selected. Please try again.");
                case 6:
                    break;
                case 7:
                    runProgam = false;
            }
        }


    }


}
