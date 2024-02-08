package PassengerRegistration;

public class RefundTicketProxy implements PassengerRegistration.RefundTicket {
  private String _endpoint = null;
  private PassengerRegistration.RefundTicket refundTicket = null;
  
  public RefundTicketProxy() {
    _initRefundTicketProxy();
  }
  
  public RefundTicketProxy(String endpoint) {
    _endpoint = endpoint;
    _initRefundTicketProxy();
  }
  
  private void _initRefundTicketProxy() {
    try {
      refundTicket = (new PassengerRegistration.RefundTicketServiceLocator()).getRefundTicket();
      if (refundTicket != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)refundTicket)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)refundTicket)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (refundTicket != null)
      ((javax.xml.rpc.Stub)refundTicket)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PassengerRegistration.RefundTicket getRefundTicket() {
    if (refundTicket == null)
      _initRefundTicketProxy();
    return refundTicket;
  }
  
  public java.lang.String processRefund(int passengerId, int choice) throws java.rmi.RemoteException{
    if (refundTicket == null)
      _initRefundTicketProxy();
    return refundTicket.processRefund(passengerId, choice);
  }
  
  
}