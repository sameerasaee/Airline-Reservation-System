package PassengerRegistration;

public class DisplayFlightProxy implements PassengerRegistration.DisplayFlight {
  private String _endpoint = null;
  private PassengerRegistration.DisplayFlight displayFlight = null;
  
  public DisplayFlightProxy() {
    _initDisplayFlightProxy();
  }
  
  public DisplayFlightProxy(String endpoint) {
    _endpoint = endpoint;
    _initDisplayFlightProxy();
  }
  
  private void _initDisplayFlightProxy() {
    try {
      displayFlight = (new PassengerRegistration.DisplayFlightServiceLocator()).getDisplayFlight();
      if (displayFlight != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)displayFlight)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)displayFlight)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (displayFlight != null)
      ((javax.xml.rpc.Stub)displayFlight)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PassengerRegistration.DisplayFlight getDisplayFlight() {
    if (displayFlight == null)
      _initDisplayFlightProxy();
    return displayFlight;
  }
  
  public java.lang.String viewFlights() throws java.rmi.RemoteException{
    if (displayFlight == null)
      _initDisplayFlightProxy();
    return displayFlight.viewFlights();
  }
  
  
}