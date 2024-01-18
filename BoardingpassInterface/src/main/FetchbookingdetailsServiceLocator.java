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

    // Use to get a proxy class for fetchbookingdetails
    private java.lang.String fetchbookingdetails_address = "http://localhost:8080/airlinereservationsystems/services/fetchbookingdetails";

    public java.lang.String getfetchbookingdetailsAddress() {
        return fetchbookingdetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String fetchbookingdetailsWSDDServiceName = "fetchbookingdetails";

    public java.lang.String getfetchbookingdetailsWSDDServiceName() {
        return fetchbookingdetailsWSDDServiceName;
    }

    public void setfetchbookingdetailsWSDDServiceName(java.lang.String name) {
        fetchbookingdetailsWSDDServiceName = name;
    }

    public main.Fetchbookingdetails getfetchbookingdetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(fetchbookingdetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getfetchbookingdetails(endpoint);
    }

    public main.Fetchbookingdetails getfetchbookingdetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.FetchbookingdetailsSoapBindingStub _stub = new main.FetchbookingdetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getfetchbookingdetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setfetchbookingdetailsEndpointAddress(java.lang.String address) {
        fetchbookingdetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Fetchbookingdetails.class.isAssignableFrom(serviceEndpointInterface)) {
                main.FetchbookingdetailsSoapBindingStub _stub = new main.FetchbookingdetailsSoapBindingStub(new java.net.URL(fetchbookingdetails_address), this);
                _stub.setPortName(getfetchbookingdetailsWSDDServiceName());
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
        if ("fetchbookingdetails".equals(inputPortName)) {
            return getfetchbookingdetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "fetchbookingdetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "fetchbookingdetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("fetchbookingdetails".equals(portName)) {
            setfetchbookingdetailsEndpointAddress(address);
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
