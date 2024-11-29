
class Flight {
    String departure_city;
    String arrival_city;
    double cost;
    int seats;

    public Flight(String departure_city, String arrival_city, double cost, int seats) {
        this.departure_city = departure_city;
        this.arrival_city = arrival_city;
        this.cost = cost;
        this.seats = seats;
    }

     // Getters
     public String getDeparture() {
        return departure_city;
    }

    public String getArrival() {
        return arrival_city;
    }

    public double getCost() {
        return cost;
    }

    public int getSeats() {
        return seats;
    }

    // Setters
    public void setDeparture(String departure_city) {
        this.departure_city = departure_city;
    }

    public void setArrival(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}