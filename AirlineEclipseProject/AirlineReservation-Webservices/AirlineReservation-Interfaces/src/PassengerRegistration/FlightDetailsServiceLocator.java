/**
 * FlightDetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public class FlightDetailsServiceLocator extends org.apache.axis.client.Service implements PassengerRegistration.FlightDetailsService {

    public FlightDetailsServiceLocator() {
    }


    public FlightDetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FlightDetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FlightDetails
    private java.lang.String FlightDetails_address = "http://localhost:8080/AirlineReservation-Webservices/services/FlightDetails";

    public java.lang.String getFlightDetailsAddress() {
        return FlightDetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FlightDetailsWSDDServiceName = "FlightDetails";

    public java.lang.String getFlightDetailsWSDDServiceName() {
        return FlightDetailsWSDDServiceName;
    }

    public void setFlightDetailsWSDDServiceName(java.lang.String name) {
        FlightDetailsWSDDServiceName = name;
    }

    public PassengerRegistration.FlightDetails getFlightDetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FlightDetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFlightDetails(endpoint);
    }

    public PassengerRegistration.FlightDetails getFlightDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PassengerRegistration.FlightDetailsSoapBindingStub _stub = new PassengerRegistration.FlightDetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getFlightDetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFlightDetailsEndpointAddress(java.lang.String address) {
        FlightDetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PassengerRegistration.FlightDetails.class.isAssignableFrom(serviceEndpointInterface)) {
                PassengerRegistration.FlightDetailsSoapBindingStub _stub = new PassengerRegistration.FlightDetailsSoapBindingStub(new java.net.URL(FlightDetails_address), this);
                _stub.setPortName(getFlightDetailsWSDDServiceName());
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
        if ("FlightDetails".equals(inputPortName)) {
            return getFlightDetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PassengerRegistration", "FlightDetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PassengerRegistration", "FlightDetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FlightDetails".equals(portName)) {
            setFlightDetailsEndpointAddress(address);
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
