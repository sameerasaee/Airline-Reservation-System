package main;

public class BoardingPassProxy implements main.BoardingPass {
  private String _endpoint = null;
  private main.BoardingPass boardingPass = null;
  
  public BoardingPassProxy() {
    _initBoardingPassProxy();
  }
  
  public BoardingPassProxy(String endpoint) {
    _endpoint = endpoint;
    _initBoardingPassProxy();
  }
  
  private void _initBoardingPassProxy() {
    try {
      boardingPass = (new main.BoardingPassServiceLocator()).getBoardingPass();
      if (boardingPass != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)boardingPass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)boardingPass)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (boardingPass != null)
      ((javax.xml.rpc.Stub)boardingPass)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.BoardingPass getBoardingPass() {
    if (boardingPass == null)
      _initBoardingPassProxy();
    return boardingPass;
  }
  
  public int verifyPassengerIdentity(java.lang.String passportNumber) throws java.rmi.RemoteException{
    if (boardingPass == null)
      _initBoardingPassProxy();
    return boardingPass.verifyPassengerIdentity(passportNumber);
  }
  
  
}