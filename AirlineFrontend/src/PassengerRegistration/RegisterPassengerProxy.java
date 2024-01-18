package PassengerRegistration;

public class RegisterPassengerProxy implements PassengerRegistration.RegisterPassenger {
  private String _endpoint = null;
  private PassengerRegistration.RegisterPassenger registerPassenger = null;
  
  public RegisterPassengerProxy() {
    _initRegisterPassengerProxy();
  }
  
  public RegisterPassengerProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegisterPassengerProxy();
  }
  
  private void _initRegisterPassengerProxy() {
    try {
      registerPassenger = (new PassengerRegistration.RegisterPassengerServiceLocator()).getRegisterPassenger();
      if (registerPassenger != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)registerPassenger)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)registerPassenger)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (registerPassenger != null)
      ((javax.xml.rpc.Stub)registerPassenger)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PassengerRegistration.RegisterPassenger getRegisterPassenger() {
    if (registerPassenger == null)
      _initRegisterPassengerProxy();
    return registerPassenger;
  }
  
  public int addDetails(java.lang.String name, int contactNumber, java.lang.String passportNumber) throws java.rmi.RemoteException{
    if (registerPassenger == null)
      _initRegisterPassengerProxy();
    return registerPassenger.addDetails(name, contactNumber, passportNumber);
  }
  
  
}