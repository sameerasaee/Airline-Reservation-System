package main;

public class BookingdetailsProxy implements main.Bookingdetails {
  private String _endpoint = null;
  private main.Bookingdetails bookingdetails = null;
  
  public BookingdetailsProxy() {
    _initBookingdetailsProxy();
  }
  
  public BookingdetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initBookingdetailsProxy();
  }
  
  private void _initBookingdetailsProxy() {
    try {
      bookingdetails = (new main.BookingdetailsServiceLocator()).getbookingdetails();
      if (bookingdetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bookingdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bookingdetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bookingdetails != null)
      ((javax.xml.rpc.Stub)bookingdetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Bookingdetails getBookingdetails() {
    if (bookingdetails == null)
      _initBookingdetailsProxy();
    return bookingdetails;
  }
  
  public java.lang.String bookingDetails(int passengerID) throws java.rmi.RemoteException{
    if (bookingdetails == null)
      _initBookingdetailsProxy();
    return bookingdetails.bookingDetails(passengerID);
  }
  
  
}