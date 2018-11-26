/**
 * WSEmployeeBalanceOverride.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSEmployeeBalanceOverride  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String balanceAction;

    private com.workbrain.webservices.ta.WSEmployeeBalance employeeBalance;

    private com.workbrain.webservices.ta.WSOverride override;

    public WSEmployeeBalanceOverride() {
    }

    public WSEmployeeBalanceOverride(
           java.lang.String action,
           java.lang.String balanceAction,
           com.workbrain.webservices.ta.WSEmployeeBalance employeeBalance,
           com.workbrain.webservices.ta.WSOverride override) {
           this.action = action;
           this.balanceAction = balanceAction;
           this.employeeBalance = employeeBalance;
           this.override = override;
    }


    /**
     * Gets the action value for this WSEmployeeBalanceOverride.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this WSEmployeeBalanceOverride.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the balanceAction value for this WSEmployeeBalanceOverride.
     * 
     * @return balanceAction
     */
    public java.lang.String getBalanceAction() {
        return balanceAction;
    }


    /**
     * Sets the balanceAction value for this WSEmployeeBalanceOverride.
     * 
     * @param balanceAction
     */
    public void setBalanceAction(java.lang.String balanceAction) {
        this.balanceAction = balanceAction;
    }


    /**
     * Gets the employeeBalance value for this WSEmployeeBalanceOverride.
     * 
     * @return employeeBalance
     */
    public com.workbrain.webservices.ta.WSEmployeeBalance getEmployeeBalance() {
        return employeeBalance;
    }


    /**
     * Sets the employeeBalance value for this WSEmployeeBalanceOverride.
     * 
     * @param employeeBalance
     */
    public void setEmployeeBalance(com.workbrain.webservices.ta.WSEmployeeBalance employeeBalance) {
        this.employeeBalance = employeeBalance;
    }


    /**
     * Gets the override value for this WSEmployeeBalanceOverride.
     * 
     * @return override
     */
    public com.workbrain.webservices.ta.WSOverride getOverride() {
        return override;
    }


    /**
     * Sets the override value for this WSEmployeeBalanceOverride.
     * 
     * @param override
     */
    public void setOverride(com.workbrain.webservices.ta.WSOverride override) {
        this.override = override;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSEmployeeBalanceOverride)) return false;
        WSEmployeeBalanceOverride other = (WSEmployeeBalanceOverride) obj;
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
            ((this.balanceAction==null && other.getBalanceAction()==null) || 
             (this.balanceAction!=null &&
              this.balanceAction.equals(other.getBalanceAction()))) &&
            ((this.employeeBalance==null && other.getEmployeeBalance()==null) || 
             (this.employeeBalance!=null &&
              this.employeeBalance.equals(other.getEmployeeBalance()))) &&
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
        if (getBalanceAction() != null) {
            _hashCode += getBalanceAction().hashCode();
        }
        if (getEmployeeBalance() != null) {
            _hashCode += getEmployeeBalance().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSEmployeeBalanceOverride.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalanceOverride"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balanceAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalance"));
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
