/**
 * FetchbookingdetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class FetchbookingdetailsServiceLocator extends org.apache.axis.client.Service implements main.FetchbookingdetailsService {

    public FetchbookingdetailsServiceLocator() {
    }


    public FetchbookingdetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FetchbookingdetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Fetchbookingdetails
    private java.lang.String Fetchbookingdetails_address = "http://localhost:8080/AirlineReservation-Webservices/services/Fetchbookingdetails";

    public java.lang.String getFetchbookingdetailsAddress() {
        return Fetchbookingdetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FetchbookingdetailsWSDDServiceName = "Fetchbookingdetails";

    public java.lang.String getFetchbookingdetailsWSDDServiceName() {
        return FetchbookingdetailsWSDDServiceName;
    }

    public void setFetchbookingdetailsWSDDServiceName(java.lang.String name) {
        FetchbookingdetailsWSDDServiceName = name;
    }

    public main.Fetchbookingdetails getFetchbookingdetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Fetchbookingdetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFetchbookingdetails(endpoint);
    }

    public main.Fetchbookingdetails getFetchbookingdetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.FetchbookingdetailsSoapBindingStub _stub = new main.FetchbookingdetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getFetchbookingdetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFetchbookingdetailsEndpointAddress(java.lang.String address) {
        Fetchbookingdetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Fetchbookingdetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.FetchbookingdetailsSoapBindingStub _stub = new main.FetchbookingdetailsSoapBindingStub(new java.net.URL(Fetchbookingdetails_address), this);
                _stub.setPortName(getFetchbookingdetailsWSDDServiceName());
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
        if ("Fetchbookingdetails".equals(inputPortName)) {
            return getFetchbookingdetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "FetchbookingdetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Fetchbookingdetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Fetchbookingdetails".equals(portName)) {
            setFetchbookingdetailsEndpointAddress(address);
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
