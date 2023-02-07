import jdk.jshell.spi.ExecutionControl;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;


public class CLI {
    void startCLI() {

        Map<String, String> usernamesPasswords = new HashMap<String, String>() {{
            put("Colin", "secretpassword123");
            put("Ed", "secretpassword123");
            put("Richard", "secretpassword123");
        }};


        Airport airport = new Airport("Joe Airport");

        Airline joeLine = new Airline("Joe Air", airport);
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
            } catch (Exception e) {
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
            System.out.println("5. Search for flights by destination");
            System.out.println("6. Display your currently booked flights");
            System.out.println("7. Cancel your flight");
            System.out.println("8. Add a new flight or cancel existing flight - ADMIN ACCESS REQUIRED");
            System.out.println("9. Exit\n");

            int option = 0;
            boolean selection = true;
            System.out.println("Please select an option between 1 - 9.");

            while (selection) {
                try {
                    option = sc.nextInt();
                    sc.nextLine();
                    if (option <= 9 && option >= 1) {
                        selection = false;
                    } else {
                        System.out.println("Invalid input. Please select an option between 1 - 9.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please select an option between 1 - 9.");
                    sc.nextLine();
                }
            }


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
                    String number = null;

                    boolean mobile = true;
                    while (mobile) {
                        try {
                            number = Long.toString(Long.parseLong(sc.nextLine()));
                            if (number.length() >= 10) {
                                mobile = false;
                            } else {
                                System.out.println("Invalid input. Please enter a valid number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                        }
                    }

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

                    user = new Passenger(firstName, lastName, number, email, passengerBalance, airport);
                    airport.addRegisteredUser(user);

                    System.out.println("You have successfully registered on our airport system. ");
                    System.out.println("Your unique Customer ID is: " + user.getCustomerID() + "\n");

                    System.out.println("Returning to main menu.");
                    break;

                case 2:
                    // Book a flight -----------------------------------------------------------------------
                    System.out.println("You selected option 2: Book a flight");
                    // print all available flights from all airlines
                    if (user != null) {
                        // declare a variable called selectedAirportFlightIndex int = userinput int - 1
                        System.out.println("Please select an option from the following flights:\n");
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


                    if (user != null) {
                        if (user.getBookedFlights().size() > 0) {
                            user.displayBookedFlights();
                            System.out.println("Please select which flight you'd like to check in for");
                            int selectedFlightIndex = sc.nextInt() - 1;
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

                    } else {
                        System.out.println("Please register first.");
                    }
                    break;


                case 4:
                    // Display all available flights -----------------------------------------------------------------------
                        System.out.println("You selected option 4: Display all available flights");
                        System.out.println("Here are currently available flights:");
                        airport.displayFlights();
                    break;

                case 5:
                    if (user != null) {
                        System.out.println("Please enter the first letter of your destination");
                        char destinationChar = sc.nextLine().toUpperCase().charAt(0);
                        System.out.println("Here are all the destinations matching your search criteria:\n");
                        airport.searchDestination(destinationChar);
                    } else {
                        System.out.println("Please register first.");
                    }

                    break;

                case 6:
                    if (user != null) {
                        System.out.println("Here is a list of all your currently booked flights: ");
                        user.displayBookedFlights();
                    } else {
                        System.out.println("Please register first.");
                    }

                    break;
                case 7:
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


                case 8:
                    String userName = null;
                    String password = null;

                    boolean access = true;
                    while (access) {
                        try {
                            System.out.println("Please enter your username to continue.");
                            userName = sc.nextLine();
                            if (usernamesPasswords.containsKey(userName)) {
                                System.out.println("Please enter your password.");
                                password = sc.nextLine();
                                if (usernamesPasswords.get(userName).equals(password)) {
                                    System.out.println("Welcome back, " + userName + "\n");

                                    System.out.println("Please choose one of the following options");
                                    System.out.println("1. Cancel a flight");
                                    System.out.println("2. Add a new flight");

                                    int userChoice = sc.nextInt();
                                    sc.nextLine();

                                    switch (userChoice) {
                                        case 1:
                                            System.out.println("Please select a flight to delete from the list");
                                            airport.displayFlights();

                                            int indexToCancel = sc.nextInt() - 1;
                                            sc.nextLine();

                                            if (indexToCancel >= 0 && indexToCancel <= airport.getAllAirportFlights().size()) {
                                                Flight flightToCancel = airport.allAirportFlights.get(indexToCancel);
                                                airport.removeFlight(flightToCancel);
                                                System.out.println("Flight " + flightToCancel.getFlightID() + " to " +
                                                        flightToCancel.getDestination() + " on " + flightToCancel.getDate() + " successfully cancelled.");
                                            }

                                            break;
                                        case 2:
                                            System.out.println("Please enter the flight destination.");
                                            String destinationInput = sc.nextLine();
                                            System.out.println("Please enter the flight date in the format YYYY-MM-DD.");
                                            while (true) {
                                                String dateInput = sc.nextLine();
                                                try {
                                                    airport.addFlight(new Flight(destinationInput, LocalDate.parse(dateInput)));
                                                    break;
                                                } catch (DateTimeParseException e) {
                                                    System.out.println("Date format not appropriate. Please try again.");
                                                }
                                            }
                                            System.out.println("You have successfully added a new flight.");
                                            airport.displayFlights();
                                            break;
                                    }
                                } else {
                                    System.out.println("Invalid password, please try again.");
                                    continue;
                                }
                            } else {
                                System.out.println("Invalid username. Please enter a valid username.");
                                continue;
                            }
                            access = false;
                        } catch (Exception e) {
                            System.out.println("An unexpected error occurred. Please try again.");
                        }
                    }

                    break;
                case 9:
                    runProgam = false;

                default:
                    System.out.println("Invalid option selected. Please try again.");
            }
        }


    }


}
