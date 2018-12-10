/**
 * WSWorkSummaryOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSWorkSummaryOverride  implements java.io.Serializable {
    private java.lang.String action;

    private com.workbrain.webservices.ta.WSOverride override;

    private com.workbrain.webservices.ta.WSWorkSummary workSummary;

    public WSWorkSummaryOverride() {
    }

    public WSWorkSummaryOverride(
           java.lang.String action,
           com.workbrain.webservices.ta.WSOverride override,
           com.workbrain.webservices.ta.WSWorkSummary workSummary) {
           this.action = action;
           this.override = override;
           this.workSummary = workSummary;
    }


    /**
     * Gets the action value for this WSWorkSummaryOverride.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSWorkSummaryOverride.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the override value for this WSWorkSummaryOverride.
     * 
     * @return override
     */
    public com.workbrain.webservices.ta.WSOverride getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSWorkSummaryOverride.
     * 
     * @param override
     */
    public void setOverride(com.workbrain.webservices.ta.WSOverride override) {
        this.override = override;
    }


    /**
     * Gets the workSummary value for this WSWorkSummaryOverride.
     * 
     * @return workSummary
     */
    public com.workbrain.webservices.ta.WSWorkSummary getWorkSummary() {
        return workSummary;
    }


    /**
     * Sets the workSummary value for this WSWorkSummaryOverride.
     * 
     * @param workSummary
     */
    public void setWorkSummary(com.workbrain.webservices.ta.WSWorkSummary workSummary) {
        this.workSummary = workSummary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWorkSummaryOverride)) return false;
        WSWorkSummaryOverride other = (WSWorkSummaryOverride) obj;
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
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.workSummary==null && other.getWorkSummary()==null) || 
             (this.workSummary!=null &&
              this.workSummary.equals(other.getWorkSummary())));
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
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getWorkSummary() != null) {
            _hashCode += getWorkSummary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWorkSummaryOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummaryOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummary"));
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
