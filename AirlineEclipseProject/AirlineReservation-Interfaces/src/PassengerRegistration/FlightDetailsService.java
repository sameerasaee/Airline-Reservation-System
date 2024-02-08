/**
 * FlightDetailsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public interface FlightDetailsService extends javax.xml.rpc.Service {
    public java.lang.String getFlightDetailsAddress();

    public PassengerRegistration.FlightDetails getFlightDetails() throws javax.xml.rpc.ServiceException;

    public PassengerRegistration.FlightDetails getFlightDetails(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
