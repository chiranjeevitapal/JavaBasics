/**
 * WSPayGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSPayGroup  implements java.io.Serializable {
    private java.util.Calendar paygrpAdjustDate;

    private java.util.Calendar paygrpDayStartTime;

    private java.lang.String paygrpDesc;

    private java.util.Calendar paygrpEndDate;

    private java.util.Calendar paygrpHandsOffDate;

    private long paygrpId;

    private java.lang.String paygrpName;

    private java.util.Calendar paygrpStartDate;

    private java.util.Calendar paygrpSupervisorDate;

    private java.util.Calendar paygrpYearFirstDate;

    private long paygrptypId;

    private long paysysId;

    public WSPayGroup() {
    }

    public WSPayGroup(
           java.util.Calendar paygrpAdjustDate,
           java.util.Calendar paygrpDayStartTime,
           java.lang.String paygrpDesc,
           java.util.Calendar paygrpEndDate,
           java.util.Calendar paygrpHandsOffDate,
           long paygrpId,
           java.lang.String paygrpName,
           java.util.Calendar paygrpStartDate,
           java.util.Calendar paygrpSupervisorDate,
           java.util.Calendar paygrpYearFirstDate,
           long paygrptypId,
           long paysysId) {
           this.paygrpAdjustDate = paygrpAdjustDate;
           this.paygrpDayStartTime = paygrpDayStartTime;
           this.paygrpDesc = paygrpDesc;
           this.paygrpEndDate = paygrpEndDate;
           this.paygrpHandsOffDate = paygrpHandsOffDate;
           this.paygrpId = paygrpId;
           this.paygrpName = paygrpName;
           this.paygrpStartDate = paygrpStartDate;
           this.paygrpSupervisorDate = paygrpSupervisorDate;
           this.paygrpYearFirstDate = paygrpYearFirstDate;
           this.paygrptypId = paygrptypId;
           this.paysysId = paysysId;
    }


    /**
     * Gets the paygrpAdjustDate value for this WSPayGroup.
     * 
     * @return paygrpAdjustDate
     */
    public java.util.Calendar getPaygrpAdjustDate() {
        return paygrpAdjustDate;
    }


    /**
     * Sets the paygrpAdjustDate value for this WSPayGroup.
     * 
     * @param paygrpAdjustDate
     */
    public void setPaygrpAdjustDate(java.util.Calendar paygrpAdjustDate) {
        this.paygrpAdjustDate = paygrpAdjustDate;
    }


    /**
     * Gets the paygrpDayStartTime value for this WSPayGroup.
     * 
     * @return paygrpDayStartTime
     */
    public java.util.Calendar getPaygrpDayStartTime() {
        return paygrpDayStartTime;
    }


    /**
     * Sets the paygrpDayStartTime value for this WSPayGroup.
     * 
     * @param paygrpDayStartTime
     */
    public void setPaygrpDayStartTime(java.util.Calendar paygrpDayStartTime) {
        this.paygrpDayStartTime = paygrpDayStartTime;
    }


    /**
     * Gets the paygrpDesc value for this WSPayGroup.
     * 
     * @return paygrpDesc
     */
    public java.lang.String getPaygrpDesc() {
        return paygrpDesc;
    }


    /**
     * Sets the paygrpDesc value for this WSPayGroup.
     * 
     * @param paygrpDesc
     */
    public void setPaygrpDesc(java.lang.String paygrpDesc) {
        this.paygrpDesc = paygrpDesc;
    }


    /**
     * Gets the paygrpEndDate value for this WSPayGroup.
     * 
     * @return paygrpEndDate
     */
    public java.util.Calendar getPaygrpEndDate() {
        return paygrpEndDate;
    }


    /**
     * Sets the paygrpEndDate value for this WSPayGroup.
     * 
     * @param paygrpEndDate
     */
    public void setPaygrpEndDate(java.util.Calendar paygrpEndDate) {
        this.paygrpEndDate = paygrpEndDate;
    }


    /**
     * Gets the paygrpHandsOffDate value for this WSPayGroup.
     * 
     * @return paygrpHandsOffDate
     */
    public java.util.Calendar getPaygrpHandsOffDate() {
        return paygrpHandsOffDate;
    }


    /**
     * Sets the paygrpHandsOffDate value for this WSPayGroup.
     * 
     * @param paygrpHandsOffDate
     */
    public void setPaygrpHandsOffDate(java.util.Calendar paygrpHandsOffDate) {
        this.paygrpHandsOffDate = paygrpHandsOffDate;
    }


    /**
     * Gets the paygrpId value for this WSPayGroup.
     * 
     * @return paygrpId
     */
    public long getPaygrpId() {
        return paygrpId;
    }


    /**
     * Sets the paygrpId value for this WSPayGroup.
     * 
     * @param paygrpId
     */
    public void setPaygrpId(long paygrpId) {
        this.paygrpId = paygrpId;
    }


    /**
     * Gets the paygrpName value for this WSPayGroup.
     * 
     * @return paygrpName
     */
    public java.lang.String getPaygrpName() {
        return paygrpName;
    }


    /**
     * Sets the paygrpName value for this WSPayGroup.
     * 
     * @param paygrpName
     */
    public void setPaygrpName(java.lang.String paygrpName) {
        this.paygrpName = paygrpName;
    }


    /**
     * Gets the paygrpStartDate value for this WSPayGroup.
     * 
     * @return paygrpStartDate
     */
    public java.util.Calendar getPaygrpStartDate() {
        return paygrpStartDate;
    }


    /**
     * Sets the paygrpStartDate value for this WSPayGroup.
     * 
     * @param paygrpStartDate
     */
    public void setPaygrpStartDate(java.util.Calendar paygrpStartDate) {
        this.paygrpStartDate = paygrpStartDate;
    }


    /**
     * Gets the paygrpSupervisorDate value for this WSPayGroup.
     * 
     * @return paygrpSupervisorDate
     */
    public java.util.Calendar getPaygrpSupervisorDate() {
        return paygrpSupervisorDate;
    }


    /**
     * Sets the paygrpSupervisorDate value for this WSPayGroup.
     * 
     * @param paygrpSupervisorDate
     */
    public void setPaygrpSupervisorDate(java.util.Calendar paygrpSupervisorDate) {
        this.paygrpSupervisorDate = paygrpSupervisorDate;
    }


    /**
     * Gets the paygrpYearFirstDate value for this WSPayGroup.
     * 
     * @return paygrpYearFirstDate
     */
    public java.util.Calendar getPaygrpYearFirstDate() {
        return paygrpYearFirstDate;
    }


    /**
     * Sets the paygrpYearFirstDate value for this WSPayGroup.
     * 
     * @param paygrpYearFirstDate
     */
    public void setPaygrpYearFirstDate(java.util.Calendar paygrpYearFirstDate) {
        this.paygrpYearFirstDate = paygrpYearFirstDate;
    }


    /**
     * Gets the paygrptypId value for this WSPayGroup.
     * 
     * @return paygrptypId
     */
    public long getPaygrptypId() {
        return paygrptypId;
    }


    /**
     * Sets the paygrptypId value for this WSPayGroup.
     * 
     * @param paygrptypId
     */
    public void setPaygrptypId(long paygrptypId) {
        this.paygrptypId = paygrptypId;
    }


    /**
     * Gets the paysysId value for this WSPayGroup.
     * 
     * @return paysysId
     */
    public long getPaysysId() {
        return paysysId;
    }


    /**
     * Sets the paysysId value for this WSPayGroup.
     * 
     * @param paysysId
     */
    public void setPaysysId(long paysysId) {
        this.paysysId = paysysId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSPayGroup)) return false;
        WSPayGroup other = (WSPayGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paygrpAdjustDate==null && other.getPaygrpAdjustDate()==null) || 
             (this.paygrpAdjustDate!=null &&
              this.paygrpAdjustDate.equals(other.getPaygrpAdjustDate()))) &&
            ((this.paygrpDayStartTime==null && other.getPaygrpDayStartTime()==null) || 
             (this.paygrpDayStartTime!=null &&
              this.paygrpDayStartTime.equals(other.getPaygrpDayStartTime()))) &&
            ((this.paygrpDesc==null && other.getPaygrpDesc()==null) || 
             (this.paygrpDesc!=null &&
              this.paygrpDesc.equals(other.getPaygrpDesc()))) &&
            ((this.paygrpEndDate==null && other.getPaygrpEndDate()==null) || 
             (this.paygrpEndDate!=null &&
              this.paygrpEndDate.equals(other.getPaygrpEndDate()))) &&
            ((this.paygrpHandsOffDate==null && other.getPaygrpHandsOffDate()==null) || 
             (this.paygrpHandsOffDate!=null &&
              this.paygrpHandsOffDate.equals(other.getPaygrpHandsOffDate()))) &&
            this.paygrpId == other.getPaygrpId() &&
            ((this.paygrpName==null && other.getPaygrpName()==null) || 
             (this.paygrpName!=null &&
              this.paygrpName.equals(other.getPaygrpName()))) &&
            ((this.paygrpStartDate==null && other.getPaygrpStartDate()==null) || 
             (this.paygrpStartDate!=null &&
              this.paygrpStartDate.equals(other.getPaygrpStartDate()))) &&
            ((this.paygrpSupervisorDate==null && other.getPaygrpSupervisorDate()==null) || 
             (this.paygrpSupervisorDate!=null &&
              this.paygrpSupervisorDate.equals(other.getPaygrpSupervisorDate()))) &&
            ((this.paygrpYearFirstDate==null && other.getPaygrpYearFirstDate()==null) || 
             (this.paygrpYearFirstDate!=null &&
              this.paygrpYearFirstDate.equals(other.getPaygrpYearFirstDate()))) &&
            this.paygrptypId == other.getPaygrptypId() &&
            this.paysysId == other.getPaysysId();
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
        if (getPaygrpAdjustDate() != null) {
            _hashCode += getPaygrpAdjustDate().hashCode();
        }
        if (getPaygrpDayStartTime() != null) {
            _hashCode += getPaygrpDayStartTime().hashCode();
        }
        if (getPaygrpDesc() != null) {
            _hashCode += getPaygrpDesc().hashCode();
        }
        if (getPaygrpEndDate() != null) {
            _hashCode += getPaygrpEndDate().hashCode();
        }
        if (getPaygrpHandsOffDate() != null) {
            _hashCode += getPaygrpHandsOffDate().hashCode();
        }
        _hashCode += new Long(getPaygrpId()).hashCode();
        if (getPaygrpName() != null) {
            _hashCode += getPaygrpName().hashCode();
        }
        if (getPaygrpStartDate() != null) {
            _hashCode += getPaygrpStartDate().hashCode();
        }
        if (getPaygrpSupervisorDate() != null) {
            _hashCode += getPaygrpSupervisorDate().hashCode();
        }
        if (getPaygrpYearFirstDate() != null) {
            _hashCode += getPaygrpYearFirstDate().hashCode();
        }
        _hashCode += new Long(getPaygrptypId()).hashCode();
        _hashCode += new Long(getPaysysId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSPayGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSPayGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpAdjustDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpAdjustDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpDayStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpDayStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpHandsOffDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpHandsOffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpSupervisorDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpSupervisorDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpYearFirstDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpYearFirstDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrptypId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrptypId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paysysId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paysysId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
