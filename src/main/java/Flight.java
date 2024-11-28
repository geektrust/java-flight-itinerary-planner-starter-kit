class Flight {
    String departure;
    String arrival;
    double cost;
    int seats;

    public Flight(String departure, String arrival, double cost, int seats) {
        this.departure = departure;
        this.arrival = arrival;
        this.cost = cost;
        this.seats = seats;
    }

     // Getters
     public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public double getCost() {
        return cost;
    }

    public int getSeats() {
        return seats;
    }

    // Setters
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}