/**
 * WSElapsedTimeOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSElapsedTimeOverride  extends com.workbrain.webservices.ta.WSWorkDetailOverride  implements java.io.Serializable {
    private java.lang.String respectBreaks;

    public WSElapsedTimeOverride() {
    }

    public WSElapsedTimeOverride(
           java.lang.String action,
           com.workbrain.webservices.ta.WSOverride override,
           com.workbrain.webservices.ta.WSWorkDetail workDetail,
           java.lang.String respectBreaks) {
        super(
            action,
            override,
            workDetail);
        this.respectBreaks = respectBreaks;
    }


    /**
     * Gets the respectBreaks value for this WSElapsedTimeOverride.
     * 
     * @return respectBreaks
     */
    public java.lang.String getRespectBreaks() {
        return respectBreaks;
    }


    /**
     * Sets the respectBreaks value for this WSElapsedTimeOverride.
     * 
     * @param respectBreaks
     */
    public void setRespectBreaks(java.lang.String respectBreaks) {
        this.respectBreaks = respectBreaks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSElapsedTimeOverride)) return false;
        WSElapsedTimeOverride other = (WSElapsedTimeOverride) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.respectBreaks==null && other.getRespectBreaks()==null) || 
             (this.respectBreaks!=null &&
              this.respectBreaks.equals(other.getRespectBreaks())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRespectBreaks() != null) {
            _hashCode += getRespectBreaks().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSElapsedTimeOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSElapsedTimeOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respectBreaks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respectBreaks"));
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
