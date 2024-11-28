import java.util.ArrayList;
import java.util.List;

class FlightItineraryPlanner {

    private List<Flight> flights;

    public FlightItineraryPlanner() {
        flights = new ArrayList<>();
    }

    public void addFlight(String departure, String arrival, double cost, int seats) {
        Flight flight = new Flight(departure, arrival, cost, seats);
        flights.add(flight);
        System.out.println(flight);
    }


    // Other methods like findAllItineraries will be implemented here in the future
}