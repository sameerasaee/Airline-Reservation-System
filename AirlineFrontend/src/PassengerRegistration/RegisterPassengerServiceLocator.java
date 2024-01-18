/**
 * RegisterPassengerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public class RegisterPassengerServiceLocator extends org.apache.axis.client.Service implements PassengerRegistration.RegisterPassengerService {

    public RegisterPassengerServiceLocator() {
    }


    public RegisterPassengerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegisterPassengerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RegisterPassenger
    private java.lang.String RegisterPassenger_address = "http://localhost:8080/AirlineBackend/services/RegisterPassenger";

    public java.lang.String getRegisterPassengerAddress() {
        return RegisterPassenger_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RegisterPassengerWSDDServiceName = "RegisterPassenger";

    public java.lang.String getRegisterPassengerWSDDServiceName() {
        return RegisterPassengerWSDDServiceName;
    }

    public void setRegisterPassengerWSDDServiceName(java.lang.String name) {
        RegisterPassengerWSDDServiceName = name;
    }

    public PassengerRegistration.RegisterPassenger getRegisterPassenger() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RegisterPassenger_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRegisterPassenger(endpoint);
    }

    public PassengerRegistration.RegisterPassenger getRegisterPassenger(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PassengerRegistration.RegisterPassengerSoapBindingStub _stub = new PassengerRegistration.RegisterPassengerSoapBindingStub(portAddress, this);
            _stub.setPortName(getRegisterPassengerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRegisterPassengerEndpointAddress(java.lang.String address) {
        RegisterPassenger_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PassengerRegistration.RegisterPassenger.class.isAssignableFrom(serviceEndpointInterface)) {
                PassengerRegistration.RegisterPassengerSoapBindingStub _stub = new PassengerRegistration.RegisterPassengerSoapBindingStub(new java.net.URL(RegisterPassenger_address), this);
                _stub.setPortName(getRegisterPassengerWSDDServiceName());
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
        if ("RegisterPassenger".equals(inputPortName)) {
            return getRegisterPassenger();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PassengerRegistration", "RegisterPassengerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PassengerRegistration", "RegisterPassenger"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RegisterPassenger".equals(portName)) {
            setRegisterPassengerEndpointAddress(address);
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
