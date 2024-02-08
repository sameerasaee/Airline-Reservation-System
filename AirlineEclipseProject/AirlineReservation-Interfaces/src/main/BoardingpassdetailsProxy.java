package main;

public class BoardingpassdetailsProxy implements main.Boardingpassdetails {
  private String _endpoint = null;
  private main.Boardingpassdetails boardingpassdetails = null;
  
  public BoardingpassdetailsProxy() {
    _initBoardingpassdetailsProxy();
  }
  
  public BoardingpassdetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBoardingpassdetailsProxy();
  }
  
  private void _initBoardingpassdetailsProxy() {
    try {
      boardingpassdetails = (new main.BoardingpassdetailsServiceLocator()).getBoardingpassdetails();
      if (boardingpassdetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)boardingpassdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)boardingpassdetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (boardingpassdetails != null)
      ((javax.xml.rpc.Stub)boardingpassdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Boardingpassdetails getBoardingpassdetails() {
    if (boardingpassdetails == null)
      _initBoardingpassdetailsProxy();
    return boardingpassdetails;
  }
  
  public java.lang.String bookingDetails(int passengerID) throws java.rmi.RemoteException{
    if (boardingpassdetails == null)
      _initBoardingpassdetailsProxy();
    return boardingpassdetails.bookingDetails(passengerID);
  }
  
  
}