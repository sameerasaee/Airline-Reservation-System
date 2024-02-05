/**
 * BookingdetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class BookingdetailsServiceLocator extends org.apache.axis.client.Service implements main.BookingdetailsService {

    public BookingdetailsServiceLocator() {
    }


    public BookingdetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookingdetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for bookingdetails
    private java.lang.String bookingdetails_address = "http://localhost:8080/Airline-Webservices/services/bookingdetails";

    public java.lang.String getbookingdetailsAddress() {
        return bookingdetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String bookingdetailsWSDDServiceName = "bookingdetails";

    public java.lang.String getbookingdetailsWSDDServiceName() {
        return bookingdetailsWSDDServiceName;
    }

    public void setbookingdetailsWSDDServiceName(java.lang.String name) {
        bookingdetailsWSDDServiceName = name;
    }

    public main.Bookingdetails getbookingdetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(bookingdetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getbookingdetails(endpoint);
    }

    public main.Bookingdetails getbookingdetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.BookingdetailsSoapBindingStub _stub = new main.BookingdetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getbookingdetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setbookingdetailsEndpointAddress(java.lang.String address) {
        bookingdetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Bookingdetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.BookingdetailsSoapBindingStub _stub = new main.BookingdetailsSoapBindingStub(new java.net.URL(bookingdetails_address), this);
                _stub.setPortName(getbookingdetailsWSDDServiceName());
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
        if ("bookingdetails".equals(inputPortName)) {
            return getbookingdetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "bookingdetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "bookingdetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("bookingdetails".equals(portName)) {
            setbookingdetailsEndpointAddress(address);
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
