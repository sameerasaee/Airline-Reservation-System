package PassengerRegistration;

public class PaymentDetailsProxy implements PassengerRegistration.PaymentDetails {
  private String _endpoint = null;
  private PassengerRegistration.PaymentDetails paymentDetails = null;
  
  public PaymentDetailsProxy() {
    _initPaymentDetailsProxy();
  }
  
  public PaymentDetailsProxy(String endpoint) {
    _endpoint = endpoint;
    _initPaymentDetailsProxy();
  }
  
  private void _initPaymentDetailsProxy() {
    try {
      paymentDetails = (new PassengerRegistration.PaymentDetailsServiceLocator()).getPaymentDetails();
      if (paymentDetails != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)paymentDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)paymentDetails)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (paymentDetails != null)
      ((javax.xml.rpc.Stub)paymentDetails)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PassengerRegistration.PaymentDetails getPaymentDetails() {
    if (paymentDetails == null)
      _initPaymentDetailsProxy();
    return paymentDetails;
  }
  
  public java.lang.String paymentConfim(java.lang.String ptype) throws java.rmi.RemoteException{
    if (paymentDetails == null)
      _initPaymentDetailsProxy();
    return paymentDetails.paymentConfim(ptype);
  }
  
  
}