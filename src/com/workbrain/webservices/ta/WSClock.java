/**
 * WSClock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSClock  implements java.io.Serializable {
    private java.lang.String changed;

    private java.lang.String clockData;

    private java.util.Calendar clockTime;

    private java.lang.String manual;

    private java.lang.String type;

    public WSClock() {
    }

    public WSClock(
           java.lang.String changed,
           java.lang.String clockData,
           java.util.Calendar clockTime,
           java.lang.String manual,
           java.lang.String type) {
           this.changed = changed;
           this.clockData = clockData;
           this.clockTime = clockTime;
           this.manual = manual;
           this.type = type;
    }


    /**
     * Gets the changed value for this WSClock.
     * 
     * @return changed
     */
    public java.lang.String getChanged() {
        return changed;
    }


    /**
     * Sets the changed value for this WSClock.
     * 
     * @param changed
     */
    public void setChanged(java.lang.String changed) {
        this.changed = changed;
    }


    /**
     * Gets the clockData value for this WSClock.
     * 
     * @return clockData
     */
    public java.lang.String getClockData() {
        return clockData;
    }


    /**
     * Sets the clockData value for this WSClock.
     * 
     * @param clockData
     */
    public void setClockData(java.lang.String clockData) {
        this.clockData = clockData;
    }


    /**
     * Gets the clockTime value for this WSClock.
     * 
     * @return clockTime
     */
    public java.util.Calendar getClockTime() {
        return clockTime;
    }


    /**
     * Sets the clockTime value for this WSClock.
     * 
     * @param clockTime
     */
    public void setClockTime(java.util.Calendar clockTime) {
        this.clockTime = clockTime;
    }


    /**
     * Gets the manual value for this WSClock.
     * 
     * @return manual
     */
    public java.lang.String getManual() {
        return manual;
    }


    /**
     * Sets the manual value for this WSClock.
     * 
     * @param manual
     */
    public void setManual(java.lang.String manual) {
        this.manual = manual;
    }


    /**
     * Gets the type value for this WSClock.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WSClock.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSClock)) return false;
        WSClock other = (WSClock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.changed==null && other.getChanged()==null) || 
             (this.changed!=null &&
              this.changed.equals(other.getChanged()))) &&
            ((this.clockData==null && other.getClockData()==null) || 
             (this.clockData!=null &&
              this.clockData.equals(other.getClockData()))) &&
            ((this.clockTime==null && other.getClockTime()==null) || 
             (this.clockTime!=null &&
              this.clockTime.equals(other.getClockTime()))) &&
            ((this.manual==null && other.getManual()==null) || 
             (this.manual!=null &&
              this.manual.equals(other.getManual()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getChanged() != null) {
            _hashCode += getChanged().hashCode();
        }
        if (getClockData() != null) {
            _hashCode += getClockData().hashCode();
        }
        if (getClockTime() != null) {
            _hashCode += getClockTime().hashCode();
        }
        if (getManual() != null) {
            _hashCode += getManual().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSClock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clockData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clockData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clockTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clockTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
