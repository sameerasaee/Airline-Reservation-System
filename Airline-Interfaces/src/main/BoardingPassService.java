/**
 * BoardingPassService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface BoardingPassService extends javax.xml.rpc.Service {
    public java.lang.String getBoardingPassAddress();

    public main.BoardingPass getBoardingPass() throws javax.xml.rpc.ServiceException;

    public main.BoardingPass getBoardingPass(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
