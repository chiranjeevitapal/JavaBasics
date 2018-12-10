/**
 * WSEmployeeBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSEmployeeBalance  implements java.io.Serializable {
    private java.lang.String balId;

    private java.lang.String empId;

    private java.lang.String empbalId;

    private java.lang.String empbalName;

    private java.lang.String empbalValue;

    public WSEmployeeBalance() {
    }

    public WSEmployeeBalance(
           java.lang.String balId,
           java.lang.String empId,
           java.lang.String empbalId,
           java.lang.String empbalName,
           java.lang.String empbalValue) {
           this.balId = balId;
           this.empId = empId;
           this.empbalId = empbalId;
           this.empbalName = empbalName;
           this.empbalValue = empbalValue;
    }


    /**
     * Gets the balId value for this WSEmployeeBalance.
     * 
     * @return balId
     */
    public java.lang.String getBalId() {
        return balId;
    }


    /**
     * Sets the balId value for this WSEmployeeBalance.
     * 
     * @param balId
     */
    public void setBalId(java.lang.String balId) {
        this.balId = balId;
    }


    /**
     * Gets the empId value for this WSEmployeeBalance.
     * 
     * @return empId
     */
    public java.lang.String getEmpId() {
        return empId;
    }


    /**
     * Sets the empId value for this WSEmployeeBalance.
     * 
     * @param empId
     */
    public void setEmpId(java.lang.String empId) {
        this.empId = empId;
    }


    /**
     * Gets the empbalId value for this WSEmployeeBalance.
     * 
     * @return empbalId
     */
    public java.lang.String getEmpbalId() {
        return empbalId;
    }


    /**
     * Sets the empbalId value for this WSEmployeeBalance.
     * 
     * @param empbalId
     */
    public void setEmpbalId(java.lang.String empbalId) {
        this.empbalId = empbalId;
    }


    /**
     * Gets the empbalName value for this WSEmployeeBalance.
     * 
     * @return empbalName
     */
    public java.lang.String getEmpbalName() {
        return empbalName;
    }


    /**
     * Sets the empbalName value for this WSEmployeeBalance.
     * 
     * @param empbalName
     */
    public void setEmpbalName(java.lang.String empbalName) {
        this.empbalName = empbalName;
    }


    /**
     * Gets the empbalValue value for this WSEmployeeBalance.
     * 
     * @return empbalValue
     */
    public java.lang.String getEmpbalValue() {
        return empbalValue;
    }


    /**
     * Sets the empbalValue value for this WSEmployeeBalance.
     * 
     * @param empbalValue
     */
    public void setEmpbalValue(java.lang.String empbalValue) {
        this.empbalValue = empbalValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSEmployeeBalance)) return false;
        WSEmployeeBalance other = (WSEmployeeBalance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balId==null && other.getBalId()==null) || 
             (this.balId!=null &&
              this.balId.equals(other.getBalId()))) &&
            ((this.empId==null && other.getEmpId()==null) || 
             (this.empId!=null &&
              this.empId.equals(other.getEmpId()))) &&
            ((this.empbalId==null && other.getEmpbalId()==null) || 
             (this.empbalId!=null &&
              this.empbalId.equals(other.getEmpbalId()))) &&
            ((this.empbalName==null && other.getEmpbalName()==null) || 
             (this.empbalName!=null &&
              this.empbalName.equals(other.getEmpbalName()))) &&
            ((this.empbalValue==null && other.getEmpbalValue()==null) || 
             (this.empbalValue!=null &&
              this.empbalValue.equals(other.getEmpbalValue())));
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
        if (getBalId() != null) {
            _hashCode += getBalId().hashCode();
        }
        if (getEmpId() != null) {
            _hashCode += getEmpId().hashCode();
        }
        if (getEmpbalId() != null) {
            _hashCode += getEmpbalId().hashCode();
        }
        if (getEmpbalName() != null) {
            _hashCode += getEmpbalName().hashCode();
        }
        if (getEmpbalValue() != null) {
            _hashCode += getEmpbalValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSEmployeeBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empbalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empbalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empbalName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empbalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empbalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empbalValue"));
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
