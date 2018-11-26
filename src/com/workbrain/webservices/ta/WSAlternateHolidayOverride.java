/**
 * WSAlternateHolidayOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSAlternateHolidayOverride  implements java.io.Serializable {
    private java.lang.String action;

    private com.workbrain.webservices.ta.WSHoliday holiday;

    private com.workbrain.webservices.ta.WSOverride override;

    public WSAlternateHolidayOverride() {
    }

    public WSAlternateHolidayOverride(
           java.lang.String action,
           com.workbrain.webservices.ta.WSHoliday holiday,
           com.workbrain.webservices.ta.WSOverride override) {
           this.action = action;
           this.holiday = holiday;
           this.override = override;
    }


    /**
     * Gets the action value for this WSAlternateHolidayOverride.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSAlternateHolidayOverride.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the holiday value for this WSAlternateHolidayOverride.
     * 
     * @return holiday
     */
    public com.workbrain.webservices.ta.WSHoliday getHoliday() {
        return holiday;
    }


    /**
     * Sets the holiday value for this WSAlternateHolidayOverride.
     * 
     * @param holiday
     */
    public void setHoliday(com.workbrain.webservices.ta.WSHoliday holiday) {
        this.holiday = holiday;
    }


    /**
     * Gets the override value for this WSAlternateHolidayOverride.
     * 
     * @return override
     */
    public com.workbrain.webservices.ta.WSOverride getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSAlternateHolidayOverride.
     * 
     * @param override
     */
    public void setOverride(com.workbrain.webservices.ta.WSOverride override) {
        this.override = override;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSAlternateHolidayOverride)) return false;
        WSAlternateHolidayOverride other = (WSAlternateHolidayOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.holiday==null && other.getHoliday()==null) || 
             (this.holiday!=null &&
              this.holiday.equals(other.getHoliday()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getHoliday() != null) {
            _hashCode += getHoliday().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSAlternateHolidayOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSAlternateHolidayOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holiday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holiday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSHoliday"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverride"));
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
