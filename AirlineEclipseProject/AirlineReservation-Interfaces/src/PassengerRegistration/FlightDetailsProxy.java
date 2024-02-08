package PassengerRegistration;

public class FlightDetailsProxy implements PassengerRegistration.FlightDetails {
  private String _endpoint = null;
  private PassengerRegistration.FlightDetails flightDetails = null;
  
  public FlightDetailsProxy() {
    _initFlightDetailsProxy();
  }
  
  public FlightDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initFlightDetailsProxy();
  }
  
  private void _initFlightDetailsProxy() {
    try {
      flightDetails = (new PassengerRegistration.FlightDetailsServiceLocator()).getFlightDetails();
      if (flightDetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)flightDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)flightDetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (flightDetails != null)
      ((javax.xml.rpc.Stub)flightDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PassengerRegistration.FlightDetails getFlightDetails() {
    if (flightDetails == null)
      _initFlightDetailsProxy();
    return flightDetails;
  }
  
  public java.lang.String bookFlight(int flightId) throws java.rmi.RemoteException{
    if (flightDetails == null)
      _initFlightDetailsProxy();
    return flightDetails.bookFlight(flightId);
  }
  
  
}