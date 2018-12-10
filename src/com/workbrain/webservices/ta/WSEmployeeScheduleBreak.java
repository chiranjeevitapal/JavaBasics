/**
 * WSEmployeeScheduleBreak.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSEmployeeScheduleBreak  implements java.io.Serializable {
    private java.util.Calendar empskdBrksDefaultStartTime;

    private java.lang.String empskdBrksDuration;

    private java.util.Calendar empskdBrksEndTime;

    private java.lang.String empskdBrksHtypeName;

    private java.util.Calendar empskdBrksStartTime;

    private java.lang.String empskdBrksTcodeName;

    public WSEmployeeScheduleBreak() {
    }

    public WSEmployeeScheduleBreak(
           java.util.Calendar empskdBrksDefaultStartTime,
           java.lang.String empskdBrksDuration,
           java.util.Calendar empskdBrksEndTime,
           java.lang.String empskdBrksHtypeName,
           java.util.Calendar empskdBrksStartTime,
           java.lang.String empskdBrksTcodeName) {
           this.empskdBrksDefaultStartTime = empskdBrksDefaultStartTime;
           this.empskdBrksDuration = empskdBrksDuration;
           this.empskdBrksEndTime = empskdBrksEndTime;
           this.empskdBrksHtypeName = empskdBrksHtypeName;
           this.empskdBrksStartTime = empskdBrksStartTime;
           this.empskdBrksTcodeName = empskdBrksTcodeName;
    }


    /**
     * Gets the empskdBrksDefaultStartTime value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksDefaultStartTime
     */
    public java.util.Calendar getEmpskdBrksDefaultStartTime() {
        return empskdBrksDefaultStartTime;
    }


    /**
     * Sets the empskdBrksDefaultStartTime value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksDefaultStartTime
     */
    public void setEmpskdBrksDefaultStartTime(java.util.Calendar empskdBrksDefaultStartTime) {
        this.empskdBrksDefaultStartTime = empskdBrksDefaultStartTime;
    }


    /**
     * Gets the empskdBrksDuration value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksDuration
     */
    public java.lang.String getEmpskdBrksDuration() {
        return empskdBrksDuration;
    }


    /**
     * Sets the empskdBrksDuration value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksDuration
     */
    public void setEmpskdBrksDuration(java.lang.String empskdBrksDuration) {
        this.empskdBrksDuration = empskdBrksDuration;
    }


    /**
     * Gets the empskdBrksEndTime value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksEndTime
     */
    public java.util.Calendar getEmpskdBrksEndTime() {
        return empskdBrksEndTime;
    }


    /**
     * Sets the empskdBrksEndTime value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksEndTime
     */
    public void setEmpskdBrksEndTime(java.util.Calendar empskdBrksEndTime) {
        this.empskdBrksEndTime = empskdBrksEndTime;
    }


    /**
     * Gets the empskdBrksHtypeName value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksHtypeName
     */
    public java.lang.String getEmpskdBrksHtypeName() {
        return empskdBrksHtypeName;
    }


    /**
     * Sets the empskdBrksHtypeName value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksHtypeName
     */
    public void setEmpskdBrksHtypeName(java.lang.String empskdBrksHtypeName) {
        this.empskdBrksHtypeName = empskdBrksHtypeName;
    }


    /**
     * Gets the empskdBrksStartTime value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksStartTime
     */
    public java.util.Calendar getEmpskdBrksStartTime() {
        return empskdBrksStartTime;
    }


    /**
     * Sets the empskdBrksStartTime value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksStartTime
     */
    public void setEmpskdBrksStartTime(java.util.Calendar empskdBrksStartTime) {
        this.empskdBrksStartTime = empskdBrksStartTime;
    }


    /**
     * Gets the empskdBrksTcodeName value for this WSEmployeeScheduleBreak.
     * 
     * @return empskdBrksTcodeName
     */
    public java.lang.String getEmpskdBrksTcodeName() {
        return empskdBrksTcodeName;
    }


    /**
     * Sets the empskdBrksTcodeName value for this WSEmployeeScheduleBreak.
     * 
     * @param empskdBrksTcodeName
     */
    public void setEmpskdBrksTcodeName(java.lang.String empskdBrksTcodeName) {
        this.empskdBrksTcodeName = empskdBrksTcodeName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSEmployeeScheduleBreak)) return false;
        WSEmployeeScheduleBreak other = (WSEmployeeScheduleBreak) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empskdBrksDefaultStartTime==null && other.getEmpskdBrksDefaultStartTime()==null) || 
             (this.empskdBrksDefaultStartTime!=null &&
              this.empskdBrksDefaultStartTime.equals(other.getEmpskdBrksDefaultStartTime()))) &&
            ((this.empskdBrksDuration==null && other.getEmpskdBrksDuration()==null) || 
             (this.empskdBrksDuration!=null &&
              this.empskdBrksDuration.equals(other.getEmpskdBrksDuration()))) &&
            ((this.empskdBrksEndTime==null && other.getEmpskdBrksEndTime()==null) || 
             (this.empskdBrksEndTime!=null &&
              this.empskdBrksEndTime.equals(other.getEmpskdBrksEndTime()))) &&
            ((this.empskdBrksHtypeName==null && other.getEmpskdBrksHtypeName()==null) || 
             (this.empskdBrksHtypeName!=null &&
              this.empskdBrksHtypeName.equals(other.getEmpskdBrksHtypeName()))) &&
            ((this.empskdBrksStartTime==null && other.getEmpskdBrksStartTime()==null) || 
             (this.empskdBrksStartTime!=null &&
              this.empskdBrksStartTime.equals(other.getEmpskdBrksStartTime()))) &&
            ((this.empskdBrksTcodeName==null && other.getEmpskdBrksTcodeName()==null) || 
             (this.empskdBrksTcodeName!=null &&
              this.empskdBrksTcodeName.equals(other.getEmpskdBrksTcodeName())));
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
        if (getEmpskdBrksDefaultStartTime() != null) {
            _hashCode += getEmpskdBrksDefaultStartTime().hashCode();
        }
        if (getEmpskdBrksDuration() != null) {
            _hashCode += getEmpskdBrksDuration().hashCode();
        }
        if (getEmpskdBrksEndTime() != null) {
            _hashCode += getEmpskdBrksEndTime().hashCode();
        }
        if (getEmpskdBrksHtypeName() != null) {
            _hashCode += getEmpskdBrksHtypeName().hashCode();
        }
        if (getEmpskdBrksStartTime() != null) {
            _hashCode += getEmpskdBrksStartTime().hashCode();
        }
        if (getEmpskdBrksTcodeName() != null) {
            _hashCode += getEmpskdBrksTcodeName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSEmployeeScheduleBreak.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksDefaultStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksDefaultStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksHtypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksHtypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBrksTcodeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBrksTcodeName"));
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
