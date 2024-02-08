/**
 * Fetchbookingdetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Fetchbookingdetails extends java.rmi.Remote {
    public main.FlightDetails fetchFlightDetails(int flightID) throws java.rmi.RemoteException;
    public java.lang.String booking(int passengerID) throws java.rmi.RemoteException;
}
