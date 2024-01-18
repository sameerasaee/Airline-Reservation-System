package main;

public class FetchbookingdetailsProxy implements main.Fetchbookingdetails {
  private String _endpoint = null;
  private main.Fetchbookingdetails fetchbookingdetails = null;
  
  public FetchbookingdetailsProxy() {
    _initFetchbookingdetailsProxy();
  }
  
  public FetchbookingdetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initFetchbookingdetailsProxy();
  }
  
  private void _initFetchbookingdetailsProxy() {
    try {
      fetchbookingdetails = (new main.FetchbookingdetailsServiceLocator()).getfetchbookingdetails();
      if (fetchbookingdetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fetchbookingdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fetchbookingdetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fetchbookingdetails != null)
      ((javax.xml.rpc.Stub)fetchbookingdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Fetchbookingdetails getFetchbookingdetails() {
    if (fetchbookingdetails == null)
      _initFetchbookingdetailsProxy();
    return fetchbookingdetails;
  }
  
  public main.FlightDetails fetchFlightDetails(int flightID) throws java.rmi.RemoteException{
    if (fetchbookingdetails == null)
      _initFetchbookingdetailsProxy();
    return fetchbookingdetails.fetchFlightDetails(flightID);
  }
  
  public java.lang.String booking(int passengerID) throws java.rmi.RemoteException{
    if (fetchbookingdetails == null)
      _initFetchbookingdetailsProxy();
    return fetchbookingdetails.booking(passengerID);
  }
  
  
}