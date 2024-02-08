/**
 * FlightDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class FlightDetails  implements java.io.Serializable {
    private java.lang.String departureLocation;

    private java.lang.String arrivalLocation;

    private java.lang.String departureDate;

    public FlightDetails() {
    }

    public FlightDetails(
           java.lang.String departureLocation,
           java.lang.String arrivalLocation,
           java.lang.String departureDate) {
           this.departureLocation = departureLocation;
           this.arrivalLocation = arrivalLocation;
           this.departureDate = departureDate;
    }


    /**
     * Gets the departureLocation value for this FlightDetails.
     * 
     * @return departureLocation
     */
    public java.lang.String getDepartureLocation() {
        return departureLocation;
    }


    /**
     * Sets the departureLocation value for this FlightDetails.
     * 
     * @param departureLocation
     */
    public void setDepartureLocation(java.lang.String departureLocation) {
        this.departureLocation = departureLocation;
    }


    /**
     * Gets the arrivalLocation value for this FlightDetails.
     * 
     * @return arrivalLocation
     */
    public java.lang.String getArrivalLocation() {
        return arrivalLocation;
    }


    /**
     * Sets the arrivalLocation value for this FlightDetails.
     * 
     * @param arrivalLocation
     */
    public void setArrivalLocation(java.lang.String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }


    /**
     * Gets the departureDate value for this FlightDetails.
     * 
     * @return departureDate
     */
    public java.lang.String getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this FlightDetails.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.lang.String departureDate) {
        this.departureDate = departureDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightDetails)) return false;
        FlightDetails other = (FlightDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departureLocation==null && other.getDepartureLocation()==null) || 
             (this.departureLocation!=null &&
              this.departureLocation.equals(other.getDepartureLocation()))) &&
            ((this.arrivalLocation==null && other.getArrivalLocation()==null) || 
             (this.arrivalLocation!=null &&
              this.arrivalLocation.equals(other.getArrivalLocation()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDepartureLocation() != null) {
            _hashCode += getDepartureLocation().hashCode();
        }
        if (getArrivalLocation() != null) {
            _hashCode += getArrivalLocation().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://main", "FlightDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "departureLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "arrivalLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://main", "departureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
