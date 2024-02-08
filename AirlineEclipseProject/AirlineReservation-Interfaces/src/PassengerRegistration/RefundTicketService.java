/**
 * RefundTicketService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PassengerRegistration;

public interface RefundTicketService extends javax.xml.rpc.Service {
    public java.lang.String getRefundTicketAddress();

    public PassengerRegistration.RefundTicket getRefundTicket() throws javax.xml.rpc.ServiceException;

    public PassengerRegistration.RefundTicket getRefundTicket(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
