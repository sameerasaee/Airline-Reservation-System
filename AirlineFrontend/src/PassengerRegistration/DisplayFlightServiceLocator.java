/**
 * DisplayFlightServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public class DisplayFlightServiceLocator extends org.apache.axis.client.Service implements PassengerRegistration.DisplayFlightService {

    public DisplayFlightServiceLocator() {
    }


    public DisplayFlightServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DisplayFlightServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DisplayFlight
    private java.lang.String DisplayFlight_address = "http://localhost:8080/AirlineBackend/services/DisplayFlight";

    public java.lang.String getDisplayFlightAddress() {
        return DisplayFlight_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DisplayFlightWSDDServiceName = "DisplayFlight";

    public java.lang.String getDisplayFlightWSDDServiceName() {
        return DisplayFlightWSDDServiceName;
    }

    public void setDisplayFlightWSDDServiceName(java.lang.String name) {
        DisplayFlightWSDDServiceName = name;
    }

    public PassengerRegistration.DisplayFlight getDisplayFlight() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DisplayFlight_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDisplayFlight(endpoint);
    }

    public PassengerRegistration.DisplayFlight getDisplayFlight(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PassengerRegistration.DisplayFlightSoapBindingStub _stub = new PassengerRegistration.DisplayFlightSoapBindingStub(portAddress, this);
            _stub.setPortName(getDisplayFlightWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDisplayFlightEndpointAddress(java.lang.String address) {
        DisplayFlight_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PassengerRegistration.DisplayFlight.class.isAssignableFrom(serviceEndpointInterface)) {
                PassengerRegistration.DisplayFlightSoapBindingStub _stub = new PassengerRegistration.DisplayFlightSoapBindingStub(new java.net.URL(DisplayFlight_address), this);
                _stub.setPortName(getDisplayFlightWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DisplayFlight".equals(inputPortName)) {
            return getDisplayFlight();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PassengerRegistration", "DisplayFlightService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PassengerRegistration", "DisplayFlight"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DisplayFlight".equals(portName)) {
            setDisplayFlightEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
