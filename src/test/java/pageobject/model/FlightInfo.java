package pageobject.model;

public class FlightInfo {
    private String destination;
    private String departure;
    private String discount;
    private int adultsCount;
    private int childrenCount;
    private int luggageCount;
    private String flightDate;
    private int seatNr;
    private Passenger passenger;

    public FlightInfo(String destination, String departure, String discount, int adultsCount, int childrenCount,
                      int luggageCount, String flightDate, int seatNr) {
        this.destination = destination;
        this.departure = departure;
        this.discount = discount;
        this.adultsCount = adultsCount;
        this.childrenCount = childrenCount;
        this.luggageCount = luggageCount;
        this.flightDate = flightDate;
        this.seatNr = seatNr;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getAdultsCount() {
        return adultsCount;
    }

    public void setAdultsCount(int adultsCount) {
        this.adultsCount = adultsCount;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public int getLuggageCount() {
        return luggageCount;
    }

    public void setLuggageCount(int luggageCount) {
        this.luggageCount = luggageCount;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public int getSeatNr() {
        return seatNr;
    }

    public void setSeatNr(int seatNr) {
        this.seatNr = seatNr;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
