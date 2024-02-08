/**
 * BoardingpassdetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class BoardingpassdetailsServiceLocator extends org.apache.axis.client.Service implements main.BoardingpassdetailsService {

    public BoardingpassdetailsServiceLocator() {
    }


    public BoardingpassdetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BoardingpassdetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Boardingpassdetails
    private java.lang.String Boardingpassdetails_address = "http://localhost:8080/AirlineReservation-Webservices/services/Boardingpassdetails";

    public java.lang.String getBoardingpassdetailsAddress() {
        return Boardingpassdetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BoardingpassdetailsWSDDServiceName = "Boardingpassdetails";

    public java.lang.String getBoardingpassdetailsWSDDServiceName() {
        return BoardingpassdetailsWSDDServiceName;
    }

    public void setBoardingpassdetailsWSDDServiceName(java.lang.String name) {
        BoardingpassdetailsWSDDServiceName = name;
    }

    public main.Boardingpassdetails getBoardingpassdetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Boardingpassdetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBoardingpassdetails(endpoint);
    }

    public main.Boardingpassdetails getBoardingpassdetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.BoardingpassdetailsSoapBindingStub _stub = new main.BoardingpassdetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getBoardingpassdetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBoardingpassdetailsEndpointAddress(java.lang.String address) {
        Boardingpassdetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Boardingpassdetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.BoardingpassdetailsSoapBindingStub _stub = new main.BoardingpassdetailsSoapBindingStub(new java.net.URL(Boardingpassdetails_address), this);
                _stub.setPortName(getBoardingpassdetailsWSDDServiceName());
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
        if ("Boardingpassdetails".equals(inputPortName)) {
            return getBoardingpassdetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "BoardingpassdetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Boardingpassdetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Boardingpassdetails".equals(portName)) {
            setBoardingpassdetailsEndpointAddress(address);
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
