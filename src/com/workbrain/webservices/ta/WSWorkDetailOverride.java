/**
 * WSWorkDetailOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSWorkDetailOverride  implements java.io.Serializable {
    private java.lang.String action;

    private com.workbrain.webservices.ta.WSOverride override;

    private com.workbrain.webservices.ta.WSWorkDetail workDetail;

    public WSWorkDetailOverride() {
    }

    public WSWorkDetailOverride(
           java.lang.String action,
           com.workbrain.webservices.ta.WSOverride override,
           com.workbrain.webservices.ta.WSWorkDetail workDetail) {
           this.action = action;
           this.override = override;
           this.workDetail = workDetail;
    }


    /**
     * Gets the action value for this WSWorkDetailOverride.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSWorkDetailOverride.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the override value for this WSWorkDetailOverride.
     * 
     * @return override
     */
    public com.workbrain.webservices.ta.WSOverride getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSWorkDetailOverride.
     * 
     * @param override
     */
    public void setOverride(com.workbrain.webservices.ta.WSOverride override) {
        this.override = override;
    }


    /**
     * Gets the workDetail value for this WSWorkDetailOverride.
     * 
     * @return workDetail
     */
    public com.workbrain.webservices.ta.WSWorkDetail getWorkDetail() {
        return workDetail;
    }


    /**
     * Sets the workDetail value for this WSWorkDetailOverride.
     * 
     * @param workDetail
     */
    public void setWorkDetail(com.workbrain.webservices.ta.WSWorkDetail workDetail) {
        this.workDetail = workDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWorkDetailOverride)) return false;
        WSWorkDetailOverride other = (WSWorkDetailOverride) obj;
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
            ((this.workDetail==null && other.getWorkDetail()==null) || 
             (this.workDetail!=null &&
              this.workDetail.equals(other.getWorkDetail())));
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
        if (getWorkDetail() != null) {
            _hashCode += getWorkDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWorkDetailOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetailOverride"));
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
        elemField.setFieldName("workDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetail"));
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
