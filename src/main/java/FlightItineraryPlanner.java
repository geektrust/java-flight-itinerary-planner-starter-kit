import java.util.ArrayList;
import java.util.List;

class FlightItineraryPlanner {

    private List<Flight> flights;

    public FlightItineraryPlanner() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
        System.out.println(flight);
    }


    // Other methods like findAllItineraries will be implemented here in the future
}