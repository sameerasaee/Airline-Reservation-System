/**
 * RefundTicketServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public class RefundTicketServiceLocator extends org.apache.axis.client.Service implements PassengerRegistration.RefundTicketService {

    public RefundTicketServiceLocator() {
    }


    public RefundTicketServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RefundTicketServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RefundTicket
    private java.lang.String RefundTicket_address = "http://localhost:8080/Airline-Webservices/services/RefundTicket";

    public java.lang.String getRefundTicketAddress() {
        return RefundTicket_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RefundTicketWSDDServiceName = "RefundTicket";

    public java.lang.String getRefundTicketWSDDServiceName() {
        return RefundTicketWSDDServiceName;
    }

    public void setRefundTicketWSDDServiceName(java.lang.String name) {
        RefundTicketWSDDServiceName = name;
    }

    public PassengerRegistration.RefundTicket getRefundTicket() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RefundTicket_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRefundTicket(endpoint);
    }

    public PassengerRegistration.RefundTicket getRefundTicket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PassengerRegistration.RefundTicketSoapBindingStub _stub = new PassengerRegistration.RefundTicketSoapBindingStub(portAddress, this);
            _stub.setPortName(getRefundTicketWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRefundTicketEndpointAddress(java.lang.String address) {
        RefundTicket_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PassengerRegistration.RefundTicket.class.isAssignableFrom(serviceEndpointInterface)) {
                PassengerRegistration.RefundTicketSoapBindingStub _stub = new PassengerRegistration.RefundTicketSoapBindingStub(new java.net.URL(RefundTicket_address), this);
                _stub.setPortName(getRefundTicketWSDDServiceName());
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
        if ("RefundTicket".equals(inputPortName)) {
            return getRefundTicket();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PassengerRegistration", "RefundTicketService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PassengerRegistration", "RefundTicket"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RefundTicket".equals(portName)) {
            setRefundTicketEndpointAddress(address);
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
