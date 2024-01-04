package main;

public class FlightDetails {
    public String departureLocation;
    public String arrivalLocation;
    public String departureDate;
    
    public FlightDetails(){
    }

    FlightDetails(String departureLocation, String arrivalLocation, String departureDate) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDate = departureDate;
    }
}
