
class Flight {
    private String departureCity;
    private String arrivalCity; 
    private double cost;        
    private int seats;  

    public Flight(String departureCity, String arrivalCity, double cost, int seats) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.cost = cost;
        this.seats = seats;
    }

     // Getters
     public String getDeparture() {
        return departureCity;
    }

    public String getArrival() {
        return arrivalCity;
    }

    public double getCost() {
        return cost;
    }

    public int getSeats() {
        return seats;
    }

    // Setters
    public void setDeparture(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrival(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}