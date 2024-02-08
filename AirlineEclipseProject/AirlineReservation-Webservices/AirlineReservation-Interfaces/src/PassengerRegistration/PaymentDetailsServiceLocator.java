/**
 * PaymentDetailsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public class PaymentDetailsServiceLocator extends org.apache.axis.client.Service implements PassengerRegistration.PaymentDetailsService {

    public PaymentDetailsServiceLocator() {
    }


    public PaymentDetailsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentDetailsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaymentDetails
    private java.lang.String PaymentDetails_address = "http://localhost:8080/AirlineReservation-Webservices/services/PaymentDetails";

    public java.lang.String getPaymentDetailsAddress() {
        return PaymentDetails_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentDetailsWSDDServiceName = "PaymentDetails";

    public java.lang.String getPaymentDetailsWSDDServiceName() {
        return PaymentDetailsWSDDServiceName;
    }

    public void setPaymentDetailsWSDDServiceName(java.lang.String name) {
        PaymentDetailsWSDDServiceName = name;
    }

    public PassengerRegistration.PaymentDetails getPaymentDetails() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaymentDetails_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaymentDetails(endpoint);
    }

    public PassengerRegistration.PaymentDetails getPaymentDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PassengerRegistration.PaymentDetailsSoapBindingStub _stub = new PassengerRegistration.PaymentDetailsSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaymentDetailsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentDetailsEndpointAddress(java.lang.String address) {
        PaymentDetails_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PassengerRegistration.PaymentDetails.class.isAssignableFrom(serviceEndpointInterface)) {
                PassengerRegistration.PaymentDetailsSoapBindingStub _stub = new PassengerRegistration.PaymentDetailsSoapBindingStub(new java.net.URL(PaymentDetails_address), this);
                _stub.setPortName(getPaymentDetailsWSDDServiceName());
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
        if ("PaymentDetails".equals(inputPortName)) {
            return getPaymentDetails();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PassengerRegistration", "PaymentDetailsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PassengerRegistration", "PaymentDetails"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaymentDetails".equals(portName)) {
            setPaymentDetailsEndpointAddress(address);
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
