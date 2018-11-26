/**
 * WSWorkSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSWorkSummary  implements java.io.Serializable {
    private java.lang.String authBy;

    private java.util.Calendar authDate;

    private java.lang.String authorized;

    private java.lang.String calcgrpId;

    private com.workbrain.webservices.ta.WSClock[] clocks;

    private java.lang.String comments;

    private java.lang.String desc;

    private java.lang.String empId;

    private java.util.Calendar endTime;

    private java.lang.String error;

    private java.lang.String errorStatus;

    private java.lang.String flag1;

    private java.lang.String flag2;

    private java.lang.String flag3;

    private java.lang.String flag4;

    private java.lang.String flag5;

    private java.lang.String flagBrk;

    private java.lang.String flagRecall;

    private java.lang.String fullDayCode;

    private java.lang.String fullDayMinutes;

    private java.lang.String htypeSum;

    private java.lang.String id;

    private java.lang.String inCode;

    private java.lang.String manualCalc;

    private java.lang.String messages;

    private java.lang.String origClocks;

    private java.lang.String outCode;

    private java.lang.String paygrpId;

    private java.lang.String retrieved;

    private java.lang.String rulesApplied;

    private java.lang.String shftId;

    private java.util.Calendar startTime;

    private java.lang.String submitted;

    private java.lang.String tcodeSum;

    private java.lang.String udf1;

    private java.lang.String udf10;

    private java.lang.String udf2;

    private java.lang.String udf3;

    private java.lang.String udf4;

    private java.lang.String udf5;

    private java.lang.String udf6;

    private java.lang.String udf7;

    private java.lang.String udf8;

    private java.lang.String udf9;

    private java.lang.String useDefSettings;

    private java.util.Calendar workDate;

    public WSWorkSummary() {
    }

    public WSWorkSummary(
           java.lang.String authBy,
           java.util.Calendar authDate,
           java.lang.String authorized,
           java.lang.String calcgrpId,
           com.workbrain.webservices.ta.WSClock[] clocks,
           java.lang.String comments,
           java.lang.String desc,
           java.lang.String empId,
           java.util.Calendar endTime,
           java.lang.String error,
           java.lang.String errorStatus,
           java.lang.String flag1,
           java.lang.String flag2,
           java.lang.String flag3,
           java.lang.String flag4,
           java.lang.String flag5,
           java.lang.String flagBrk,
           java.lang.String flagRecall,
           java.lang.String fullDayCode,
           java.lang.String fullDayMinutes,
           java.lang.String htypeSum,
           java.lang.String id,
           java.lang.String inCode,
           java.lang.String manualCalc,
           java.lang.String messages,
           java.lang.String origClocks,
           java.lang.String outCode,
           java.lang.String paygrpId,
           java.lang.String retrieved,
           java.lang.String rulesApplied,
           java.lang.String shftId,
           java.util.Calendar startTime,
           java.lang.String submitted,
           java.lang.String tcodeSum,
           java.lang.String udf1,
           java.lang.String udf10,
           java.lang.String udf2,
           java.lang.String udf3,
           java.lang.String udf4,
           java.lang.String udf5,
           java.lang.String udf6,
           java.lang.String udf7,
           java.lang.String udf8,
           java.lang.String udf9,
           java.lang.String useDefSettings,
           java.util.Calendar workDate) {
           this.authBy = authBy;
           this.authDate = authDate;
           this.authorized = authorized;
           this.calcgrpId = calcgrpId;
           this.clocks = clocks;
           this.comments = comments;
           this.desc = desc;
           this.empId = empId;
           this.endTime = endTime;
           this.error = error;
           this.errorStatus = errorStatus;
           this.flag1 = flag1;
           this.flag2 = flag2;
           this.flag3 = flag3;
           this.flag4 = flag4;
           this.flag5 = flag5;
           this.flagBrk = flagBrk;
           this.flagRecall = flagRecall;
           this.fullDayCode = fullDayCode;
           this.fullDayMinutes = fullDayMinutes;
           this.htypeSum = htypeSum;
           this.id = id;
           this.inCode = inCode;
           this.manualCalc = manualCalc;
           this.messages = messages;
           this.origClocks = origClocks;
           this.outCode = outCode;
           this.paygrpId = paygrpId;
           this.retrieved = retrieved;
           this.rulesApplied = rulesApplied;
           this.shftId = shftId;
           this.startTime = startTime;
           this.submitted = submitted;
           this.tcodeSum = tcodeSum;
           this.udf1 = udf1;
           this.udf10 = udf10;
           this.udf2 = udf2;
           this.udf3 = udf3;
           this.udf4 = udf4;
           this.udf5 = udf5;
           this.udf6 = udf6;
           this.udf7 = udf7;
           this.udf8 = udf8;
           this.udf9 = udf9;
           this.useDefSettings = useDefSettings;
           this.workDate = workDate;
    }


    /**
     * Gets the authBy value for this WSWorkSummary.
     * 
     * @return authBy
     */
    public java.lang.String getAuthBy() {
        return authBy;
    }


    /**
     * Sets the authBy value for this WSWorkSummary.
     * 
     * @param authBy
     */
    public void setAuthBy(java.lang.String authBy) {
        this.authBy = authBy;
    }


    /**
     * Gets the authDate value for this WSWorkSummary.
     * 
     * @return authDate
     */
    public java.util.Calendar getAuthDate() {
        return authDate;
    }


    /**
     * Sets the authDate value for this WSWorkSummary.
     * 
     * @param authDate
     */
    public void setAuthDate(java.util.Calendar authDate) {
        this.authDate = authDate;
    }


    /**
     * Gets the authorized value for this WSWorkSummary.
     * 
     * @return authorized
     */
    public java.lang.String getAuthorized() {
        return authorized;
    }


    /**
     * Sets the authorized value for this WSWorkSummary.
     * 
     * @param authorized
     */
    public void setAuthorized(java.lang.String authorized) {
        this.authorized = authorized;
    }


    /**
     * Gets the calcgrpId value for this WSWorkSummary.
     * 
     * @return calcgrpId
     */
    public java.lang.String getCalcgrpId() {
        return calcgrpId;
    }


    /**
     * Sets the calcgrpId value for this WSWorkSummary.
     * 
     * @param calcgrpId
     */
    public void setCalcgrpId(java.lang.String calcgrpId) {
        this.calcgrpId = calcgrpId;
    }


    /**
     * Gets the clocks value for this WSWorkSummary.
     * 
     * @return clocks
     */
    public com.workbrain.webservices.ta.WSClock[] getClocks() {
        return clocks;
    }


    /**
     * Sets the clocks value for this WSWorkSummary.
     * 
     * @param clocks
     */
    public void setClocks(com.workbrain.webservices.ta.WSClock[] clocks) {
        this.clocks = clocks;
    }


    /**
     * Gets the comments value for this WSWorkSummary.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this WSWorkSummary.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the desc value for this WSWorkSummary.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this WSWorkSummary.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the empId value for this WSWorkSummary.
     * 
     * @return empId
     */
    public java.lang.String getEmpId() {
        return empId;
    }


    /**
     * Sets the empId value for this WSWorkSummary.
     * 
     * @param empId
     */
    public void setEmpId(java.lang.String empId) {
        this.empId = empId;
    }


    /**
     * Gets the endTime value for this WSWorkSummary.
     * 
     * @return endTime
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this WSWorkSummary.
     * 
     * @param endTime
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the error value for this WSWorkSummary.
     * 
     * @return error
     */
    public java.lang.String getError() {
        return error;
    }


    /**
     * Sets the error value for this WSWorkSummary.
     * 
     * @param error
     */
    public void setError(java.lang.String error) {
        this.error = error;
    }


    /**
     * Gets the errorStatus value for this WSWorkSummary.
     * 
     * @return errorStatus
     */
    public java.lang.String getErrorStatus() {
        return errorStatus;
    }


    /**
     * Sets the errorStatus value for this WSWorkSummary.
     * 
     * @param errorStatus
     */
    public void setErrorStatus(java.lang.String errorStatus) {
        this.errorStatus = errorStatus;
    }


    /**
     * Gets the flag1 value for this WSWorkSummary.
     * 
     * @return flag1
     */
    public java.lang.String getFlag1() {
        return flag1;
    }


    /**
     * Sets the flag1 value for this WSWorkSummary.
     * 
     * @param flag1
     */
    public void setFlag1(java.lang.String flag1) {
        this.flag1 = flag1;
    }


    /**
     * Gets the flag2 value for this WSWorkSummary.
     * 
     * @return flag2
     */
    public java.lang.String getFlag2() {
        return flag2;
    }


    /**
     * Sets the flag2 value for this WSWorkSummary.
     * 
     * @param flag2
     */
    public void setFlag2(java.lang.String flag2) {
        this.flag2 = flag2;
    }


    /**
     * Gets the flag3 value for this WSWorkSummary.
     * 
     * @return flag3
     */
    public java.lang.String getFlag3() {
        return flag3;
    }


    /**
     * Sets the flag3 value for this WSWorkSummary.
     * 
     * @param flag3
     */
    public void setFlag3(java.lang.String flag3) {
        this.flag3 = flag3;
    }


    /**
     * Gets the flag4 value for this WSWorkSummary.
     * 
     * @return flag4
     */
    public java.lang.String getFlag4() {
        return flag4;
    }


    /**
     * Sets the flag4 value for this WSWorkSummary.
     * 
     * @param flag4
     */
    public void setFlag4(java.lang.String flag4) {
        this.flag4 = flag4;
    }


    /**
     * Gets the flag5 value for this WSWorkSummary.
     * 
     * @return flag5
     */
    public java.lang.String getFlag5() {
        return flag5;
    }


    /**
     * Sets the flag5 value for this WSWorkSummary.
     * 
     * @param flag5
     */
    public void setFlag5(java.lang.String flag5) {
        this.flag5 = flag5;
    }


    /**
     * Gets the flagBrk value for this WSWorkSummary.
     * 
     * @return flagBrk
     */
    public java.lang.String getFlagBrk() {
        return flagBrk;
    }


    /**
     * Sets the flagBrk value for this WSWorkSummary.
     * 
     * @param flagBrk
     */
    public void setFlagBrk(java.lang.String flagBrk) {
        this.flagBrk = flagBrk;
    }


    /**
     * Gets the flagRecall value for this WSWorkSummary.
     * 
     * @return flagRecall
     */
    public java.lang.String getFlagRecall() {
        return flagRecall;
    }


    /**
     * Sets the flagRecall value for this WSWorkSummary.
     * 
     * @param flagRecall
     */
    public void setFlagRecall(java.lang.String flagRecall) {
        this.flagRecall = flagRecall;
    }


    /**
     * Gets the fullDayCode value for this WSWorkSummary.
     * 
     * @return fullDayCode
     */
    public java.lang.String getFullDayCode() {
        return fullDayCode;
    }


    /**
     * Sets the fullDayCode value for this WSWorkSummary.
     * 
     * @param fullDayCode
     */
    public void setFullDayCode(java.lang.String fullDayCode) {
        this.fullDayCode = fullDayCode;
    }


    /**
     * Gets the fullDayMinutes value for this WSWorkSummary.
     * 
     * @return fullDayMinutes
     */
    public java.lang.String getFullDayMinutes() {
        return fullDayMinutes;
    }


    /**
     * Sets the fullDayMinutes value for this WSWorkSummary.
     * 
     * @param fullDayMinutes
     */
    public void setFullDayMinutes(java.lang.String fullDayMinutes) {
        this.fullDayMinutes = fullDayMinutes;
    }


    /**
     * Gets the htypeSum value for this WSWorkSummary.
     * 
     * @return htypeSum
     */
    public java.lang.String getHtypeSum() {
        return htypeSum;
    }


    /**
     * Sets the htypeSum value for this WSWorkSummary.
     * 
     * @param htypeSum
     */
    public void setHtypeSum(java.lang.String htypeSum) {
        this.htypeSum = htypeSum;
    }


    /**
     * Gets the id value for this WSWorkSummary.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this WSWorkSummary.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the inCode value for this WSWorkSummary.
     * 
     * @return inCode
     */
    public java.lang.String getInCode() {
        return inCode;
    }


    /**
     * Sets the inCode value for this WSWorkSummary.
     * 
     * @param inCode
     */
    public void setInCode(java.lang.String inCode) {
        this.inCode = inCode;
    }


    /**
     * Gets the manualCalc value for this WSWorkSummary.
     * 
     * @return manualCalc
     */
    public java.lang.String getManualCalc() {
        return manualCalc;
    }


    /**
     * Sets the manualCalc value for this WSWorkSummary.
     * 
     * @param manualCalc
     */
    public void setManualCalc(java.lang.String manualCalc) {
        this.manualCalc = manualCalc;
    }


    /**
     * Gets the messages value for this WSWorkSummary.
     * 
     * @return messages
     */
    public java.lang.String getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this WSWorkSummary.
     * 
     * @param messages
     */
    public void setMessages(java.lang.String messages) {
        this.messages = messages;
    }


    /**
     * Gets the origClocks value for this WSWorkSummary.
     * 
     * @return origClocks
     */
    public java.lang.String getOrigClocks() {
        return origClocks;
    }


    /**
     * Sets the origClocks value for this WSWorkSummary.
     * 
     * @param origClocks
     */
    public void setOrigClocks(java.lang.String origClocks) {
        this.origClocks = origClocks;
    }


    /**
     * Gets the outCode value for this WSWorkSummary.
     * 
     * @return outCode
     */
    public java.lang.String getOutCode() {
        return outCode;
    }


    /**
     * Sets the outCode value for this WSWorkSummary.
     * 
     * @param outCode
     */
    public void setOutCode(java.lang.String outCode) {
        this.outCode = outCode;
    }


    /**
     * Gets the paygrpId value for this WSWorkSummary.
     * 
     * @return paygrpId
     */
    public java.lang.String getPaygrpId() {
        return paygrpId;
    }


    /**
     * Sets the paygrpId value for this WSWorkSummary.
     * 
     * @param paygrpId
     */
    public void setPaygrpId(java.lang.String paygrpId) {
        this.paygrpId = paygrpId;
    }


    /**
     * Gets the retrieved value for this WSWorkSummary.
     * 
     * @return retrieved
     */
    public java.lang.String getRetrieved() {
        return retrieved;
    }


    /**
     * Sets the retrieved value for this WSWorkSummary.
     * 
     * @param retrieved
     */
    public void setRetrieved(java.lang.String retrieved) {
        this.retrieved = retrieved;
    }


    /**
     * Gets the rulesApplied value for this WSWorkSummary.
     * 
     * @return rulesApplied
     */
    public java.lang.String getRulesApplied() {
        return rulesApplied;
    }


    /**
     * Sets the rulesApplied value for this WSWorkSummary.
     * 
     * @param rulesApplied
     */
    public void setRulesApplied(java.lang.String rulesApplied) {
        this.rulesApplied = rulesApplied;
    }


    /**
     * Gets the shftId value for this WSWorkSummary.
     * 
     * @return shftId
     */
    public java.lang.String getShftId() {
        return shftId;
    }


    /**
     * Sets the shftId value for this WSWorkSummary.
     * 
     * @param shftId
     */
    public void setShftId(java.lang.String shftId) {
        this.shftId = shftId;
    }


    /**
     * Gets the startTime value for this WSWorkSummary.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this WSWorkSummary.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the submitted value for this WSWorkSummary.
     * 
     * @return submitted
     */
    public java.lang.String getSubmitted() {
        return submitted;
    }


    /**
     * Sets the submitted value for this WSWorkSummary.
     * 
     * @param submitted
     */
    public void setSubmitted(java.lang.String submitted) {
        this.submitted = submitted;
    }


    /**
     * Gets the tcodeSum value for this WSWorkSummary.
     * 
     * @return tcodeSum
     */
    public java.lang.String getTcodeSum() {
        return tcodeSum;
    }


    /**
     * Sets the tcodeSum value for this WSWorkSummary.
     * 
     * @param tcodeSum
     */
    public void setTcodeSum(java.lang.String tcodeSum) {
        this.tcodeSum = tcodeSum;
    }


    /**
     * Gets the udf1 value for this WSWorkSummary.
     * 
     * @return udf1
     */
    public java.lang.String getUdf1() {
        return udf1;
    }


    /**
     * Sets the udf1 value for this WSWorkSummary.
     * 
     * @param udf1
     */
    public void setUdf1(java.lang.String udf1) {
        this.udf1 = udf1;
    }


    /**
     * Gets the udf10 value for this WSWorkSummary.
     * 
     * @return udf10
     */
    public java.lang.String getUdf10() {
        return udf10;
    }


    /**
     * Sets the udf10 value for this WSWorkSummary.
     * 
     * @param udf10
     */
    public void setUdf10(java.lang.String udf10) {
        this.udf10 = udf10;
    }


    /**
     * Gets the udf2 value for this WSWorkSummary.
     * 
     * @return udf2
     */
    public java.lang.String getUdf2() {
        return udf2;
    }


    /**
     * Sets the udf2 value for this WSWorkSummary.
     * 
     * @param udf2
     */
    public void setUdf2(java.lang.String udf2) {
        this.udf2 = udf2;
    }


    /**
     * Gets the udf3 value for this WSWorkSummary.
     * 
     * @return udf3
     */
    public java.lang.String getUdf3() {
        return udf3;
    }


    /**
     * Sets the udf3 value for this WSWorkSummary.
     * 
     * @param udf3
     */
    public void setUdf3(java.lang.String udf3) {
        this.udf3 = udf3;
    }


    /**
     * Gets the udf4 value for this WSWorkSummary.
     * 
     * @return udf4
     */
    public java.lang.String getUdf4() {
        return udf4;
    }


    /**
     * Sets the udf4 value for this WSWorkSummary.
     * 
     * @param udf4
     */
    public void setUdf4(java.lang.String udf4) {
        this.udf4 = udf4;
    }


    /**
     * Gets the udf5 value for this WSWorkSummary.
     * 
     * @return udf5
     */
    public java.lang.String getUdf5() {
        return udf5;
    }


    /**
     * Sets the udf5 value for this WSWorkSummary.
     * 
     * @param udf5
     */
    public void setUdf5(java.lang.String udf5) {
        this.udf5 = udf5;
    }


    /**
     * Gets the udf6 value for this WSWorkSummary.
     * 
     * @return udf6
     */
    public java.lang.String getUdf6() {
        return udf6;
    }


    /**
     * Sets the udf6 value for this WSWorkSummary.
     * 
     * @param udf6
     */
    public void setUdf6(java.lang.String udf6) {
        this.udf6 = udf6;
    }


    /**
     * Gets the udf7 value for this WSWorkSummary.
     * 
     * @return udf7
     */
    public java.lang.String getUdf7() {
        return udf7;
    }


    /**
     * Sets the udf7 value for this WSWorkSummary.
     * 
     * @param udf7
     */
    public void setUdf7(java.lang.String udf7) {
        this.udf7 = udf7;
    }


    /**
     * Gets the udf8 value for this WSWorkSummary.
     * 
     * @return udf8
     */
    public java.lang.String getUdf8() {
        return udf8;
    }


    /**
     * Sets the udf8 value for this WSWorkSummary.
     * 
     * @param udf8
     */
    public void setUdf8(java.lang.String udf8) {
        this.udf8 = udf8;
    }


    /**
     * Gets the udf9 value for this WSWorkSummary.
     * 
     * @return udf9
     */
    public java.lang.String getUdf9() {
        return udf9;
    }


    /**
     * Sets the udf9 value for this WSWorkSummary.
     * 
     * @param udf9
     */
    public void setUdf9(java.lang.String udf9) {
        this.udf9 = udf9;
    }


    /**
     * Gets the useDefSettings value for this WSWorkSummary.
     * 
     * @return useDefSettings
     */
    public java.lang.String getUseDefSettings() {
        return useDefSettings;
    }


    /**
     * Sets the useDefSettings value for this WSWorkSummary.
     * 
     * @param useDefSettings
     */
    public void setUseDefSettings(java.lang.String useDefSettings) {
        this.useDefSettings = useDefSettings;
    }


    /**
     * Gets the workDate value for this WSWorkSummary.
     * 
     * @return workDate
     */
    public java.util.Calendar getWorkDate() {
        return workDate;
    }


    /**
     * Sets the workDate value for this WSWorkSummary.
     * 
     * @param workDate
     */
    public void setWorkDate(java.util.Calendar workDate) {
        this.workDate = workDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSWorkSummary)) return false;
        WSWorkSummary other = (WSWorkSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authBy==null && other.getAuthBy()==null) || 
             (this.authBy!=null &&
              this.authBy.equals(other.getAuthBy()))) &&
            ((this.authDate==null && other.getAuthDate()==null) || 
             (this.authDate!=null &&
              this.authDate.equals(other.getAuthDate()))) &&
            ((this.authorized==null && other.getAuthorized()==null) || 
             (this.authorized!=null &&
              this.authorized.equals(other.getAuthorized()))) &&
            ((this.calcgrpId==null && other.getCalcgrpId()==null) || 
             (this.calcgrpId!=null &&
              this.calcgrpId.equals(other.getCalcgrpId()))) &&
            ((this.clocks==null && other.getClocks()==null) || 
             (this.clocks!=null &&
              java.util.Arrays.equals(this.clocks, other.getClocks()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.empId==null && other.getEmpId()==null) || 
             (this.empId!=null &&
              this.empId.equals(other.getEmpId()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError()))) &&
            ((this.errorStatus==null && other.getErrorStatus()==null) || 
             (this.errorStatus!=null &&
              this.errorStatus.equals(other.getErrorStatus()))) &&
            ((this.flag1==null && other.getFlag1()==null) || 
             (this.flag1!=null &&
              this.flag1.equals(other.getFlag1()))) &&
            ((this.flag2==null && other.getFlag2()==null) || 
             (this.flag2!=null &&
              this.flag2.equals(other.getFlag2()))) &&
            ((this.flag3==null && other.getFlag3()==null) || 
             (this.flag3!=null &&
              this.flag3.equals(other.getFlag3()))) &&
            ((this.flag4==null && other.getFlag4()==null) || 
             (this.flag4!=null &&
              this.flag4.equals(other.getFlag4()))) &&
            ((this.flag5==null && other.getFlag5()==null) || 
             (this.flag5!=null &&
              this.flag5.equals(other.getFlag5()))) &&
            ((this.flagBrk==null && other.getFlagBrk()==null) || 
             (this.flagBrk!=null &&
              this.flagBrk.equals(other.getFlagBrk()))) &&
            ((this.flagRecall==null && other.getFlagRecall()==null) || 
             (this.flagRecall!=null &&
              this.flagRecall.equals(other.getFlagRecall()))) &&
            ((this.fullDayCode==null && other.getFullDayCode()==null) || 
             (this.fullDayCode!=null &&
              this.fullDayCode.equals(other.getFullDayCode()))) &&
            ((this.fullDayMinutes==null && other.getFullDayMinutes()==null) || 
             (this.fullDayMinutes!=null &&
              this.fullDayMinutes.equals(other.getFullDayMinutes()))) &&
            ((this.htypeSum==null && other.getHtypeSum()==null) || 
             (this.htypeSum!=null &&
              this.htypeSum.equals(other.getHtypeSum()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.inCode==null && other.getInCode()==null) || 
             (this.inCode!=null &&
              this.inCode.equals(other.getInCode()))) &&
            ((this.manualCalc==null && other.getManualCalc()==null) || 
             (this.manualCalc!=null &&
              this.manualCalc.equals(other.getManualCalc()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages()))) &&
            ((this.origClocks==null && other.getOrigClocks()==null) || 
             (this.origClocks!=null &&
              this.origClocks.equals(other.getOrigClocks()))) &&
            ((this.outCode==null && other.getOutCode()==null) || 
             (this.outCode!=null &&
              this.outCode.equals(other.getOutCode()))) &&
            ((this.paygrpId==null && other.getPaygrpId()==null) || 
             (this.paygrpId!=null &&
              this.paygrpId.equals(other.getPaygrpId()))) &&
            ((this.retrieved==null && other.getRetrieved()==null) || 
             (this.retrieved!=null &&
              this.retrieved.equals(other.getRetrieved()))) &&
            ((this.rulesApplied==null && other.getRulesApplied()==null) || 
             (this.rulesApplied!=null &&
              this.rulesApplied.equals(other.getRulesApplied()))) &&
            ((this.shftId==null && other.getShftId()==null) || 
             (this.shftId!=null &&
              this.shftId.equals(other.getShftId()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.submitted==null && other.getSubmitted()==null) || 
             (this.submitted!=null &&
              this.submitted.equals(other.getSubmitted()))) &&
            ((this.tcodeSum==null && other.getTcodeSum()==null) || 
             (this.tcodeSum!=null &&
              this.tcodeSum.equals(other.getTcodeSum()))) &&
            ((this.udf1==null && other.getUdf1()==null) || 
             (this.udf1!=null &&
              this.udf1.equals(other.getUdf1()))) &&
            ((this.udf10==null && other.getUdf10()==null) || 
             (this.udf10!=null &&
              this.udf10.equals(other.getUdf10()))) &&
            ((this.udf2==null && other.getUdf2()==null) || 
             (this.udf2!=null &&
              this.udf2.equals(other.getUdf2()))) &&
            ((this.udf3==null && other.getUdf3()==null) || 
             (this.udf3!=null &&
              this.udf3.equals(other.getUdf3()))) &&
            ((this.udf4==null && other.getUdf4()==null) || 
             (this.udf4!=null &&
              this.udf4.equals(other.getUdf4()))) &&
            ((this.udf5==null && other.getUdf5()==null) || 
             (this.udf5!=null &&
              this.udf5.equals(other.getUdf5()))) &&
            ((this.udf6==null && other.getUdf6()==null) || 
             (this.udf6!=null &&
              this.udf6.equals(other.getUdf6()))) &&
            ((this.udf7==null && other.getUdf7()==null) || 
             (this.udf7!=null &&
              this.udf7.equals(other.getUdf7()))) &&
            ((this.udf8==null && other.getUdf8()==null) || 
             (this.udf8!=null &&
              this.udf8.equals(other.getUdf8()))) &&
            ((this.udf9==null && other.getUdf9()==null) || 
             (this.udf9!=null &&
              this.udf9.equals(other.getUdf9()))) &&
            ((this.useDefSettings==null && other.getUseDefSettings()==null) || 
             (this.useDefSettings!=null &&
              this.useDefSettings.equals(other.getUseDefSettings()))) &&
            ((this.workDate==null && other.getWorkDate()==null) || 
             (this.workDate!=null &&
              this.workDate.equals(other.getWorkDate())));
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
        if (getAuthBy() != null) {
            _hashCode += getAuthBy().hashCode();
        }
        if (getAuthDate() != null) {
            _hashCode += getAuthDate().hashCode();
        }
        if (getAuthorized() != null) {
            _hashCode += getAuthorized().hashCode();
        }
        if (getCalcgrpId() != null) {
            _hashCode += getCalcgrpId().hashCode();
        }
        if (getClocks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClocks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClocks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getEmpId() != null) {
            _hashCode += getEmpId().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        if (getErrorStatus() != null) {
            _hashCode += getErrorStatus().hashCode();
        }
        if (getFlag1() != null) {
            _hashCode += getFlag1().hashCode();
        }
        if (getFlag2() != null) {
            _hashCode += getFlag2().hashCode();
        }
        if (getFlag3() != null) {
            _hashCode += getFlag3().hashCode();
        }
        if (getFlag4() != null) {
            _hashCode += getFlag4().hashCode();
        }
        if (getFlag5() != null) {
            _hashCode += getFlag5().hashCode();
        }
        if (getFlagBrk() != null) {
            _hashCode += getFlagBrk().hashCode();
        }
        if (getFlagRecall() != null) {
            _hashCode += getFlagRecall().hashCode();
        }
        if (getFullDayCode() != null) {
            _hashCode += getFullDayCode().hashCode();
        }
        if (getFullDayMinutes() != null) {
            _hashCode += getFullDayMinutes().hashCode();
        }
        if (getHtypeSum() != null) {
            _hashCode += getHtypeSum().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInCode() != null) {
            _hashCode += getInCode().hashCode();
        }
        if (getManualCalc() != null) {
            _hashCode += getManualCalc().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        if (getOrigClocks() != null) {
            _hashCode += getOrigClocks().hashCode();
        }
        if (getOutCode() != null) {
            _hashCode += getOutCode().hashCode();
        }
        if (getPaygrpId() != null) {
            _hashCode += getPaygrpId().hashCode();
        }
        if (getRetrieved() != null) {
            _hashCode += getRetrieved().hashCode();
        }
        if (getRulesApplied() != null) {
            _hashCode += getRulesApplied().hashCode();
        }
        if (getShftId() != null) {
            _hashCode += getShftId().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getSubmitted() != null) {
            _hashCode += getSubmitted().hashCode();
        }
        if (getTcodeSum() != null) {
            _hashCode += getTcodeSum().hashCode();
        }
        if (getUdf1() != null) {
            _hashCode += getUdf1().hashCode();
        }
        if (getUdf10() != null) {
            _hashCode += getUdf10().hashCode();
        }
        if (getUdf2() != null) {
            _hashCode += getUdf2().hashCode();
        }
        if (getUdf3() != null) {
            _hashCode += getUdf3().hashCode();
        }
        if (getUdf4() != null) {
            _hashCode += getUdf4().hashCode();
        }
        if (getUdf5() != null) {
            _hashCode += getUdf5().hashCode();
        }
        if (getUdf6() != null) {
            _hashCode += getUdf6().hashCode();
        }
        if (getUdf7() != null) {
            _hashCode += getUdf7().hashCode();
        }
        if (getUdf8() != null) {
            _hashCode += getUdf8().hashCode();
        }
        if (getUdf9() != null) {
            _hashCode += getUdf9().hashCode();
        }
        if (getUseDefSettings() != null) {
            _hashCode += getUseDefSettings().hashCode();
        }
        if (getWorkDate() != null) {
            _hashCode += getWorkDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSWorkSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorized");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcgrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calcgrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clocks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desc"));
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
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagBrk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flagBrk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagRecall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flagRecall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullDayCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullDayCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullDayMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullDayMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htypeSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "htypeSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manualCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origClocks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origClocks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paygrpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paygrpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rulesApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rulesApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shftId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shftId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcodeSum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcodeSum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf10");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf10"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf8");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf8"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udf9");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udf9"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useDefSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
