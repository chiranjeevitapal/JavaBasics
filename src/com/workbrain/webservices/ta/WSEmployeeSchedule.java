/**
 * WSEmployeeSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSEmployeeSchedule  implements java.io.Serializable {
    private java.lang.String empId;

    private java.lang.String empskdActBaseRate;

    private java.util.Calendar empskdActEndTime;

    private java.util.Calendar empskdActEndTime2;

    private java.util.Calendar empskdActEndTime3;

    private java.util.Calendar empskdActEndTime4;

    private java.util.Calendar empskdActEndTime5;

    private java.lang.String empskdActMinutes;

    private java.lang.String empskdActShftpatId;

    private java.lang.String empskdActShiftId;

    private java.lang.String empskdActShiftId2;

    private java.lang.String empskdActShiftId3;

    private java.lang.String empskdActShiftId4;

    private java.lang.String empskdActShiftId5;

    private java.util.Calendar empskdActStartTime;

    private java.util.Calendar empskdActStartTime2;

    private java.util.Calendar empskdActStartTime3;

    private java.util.Calendar empskdActStartTime4;

    private java.util.Calendar empskdActStartTime5;

    private com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak;

    private com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak2;

    private com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak3;

    private com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak4;

    private com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak5;

    private java.lang.String empskdDefBaseRate;

    private java.util.Calendar empskdDefEndTime;

    private java.lang.String empskdDefMinutes;

    private java.lang.String empskdDefShftpatId;

    private java.lang.String empskdDefShiftId;

    private java.util.Calendar empskdDefStartTime;

    private java.lang.String empskdId;

    private java.lang.String empskdLtaId;

    private java.util.Calendar workDate;

    public WSEmployeeSchedule() {
    }

    public WSEmployeeSchedule(
           java.lang.String empId,
           java.lang.String empskdActBaseRate,
           java.util.Calendar empskdActEndTime,
           java.util.Calendar empskdActEndTime2,
           java.util.Calendar empskdActEndTime3,
           java.util.Calendar empskdActEndTime4,
           java.util.Calendar empskdActEndTime5,
           java.lang.String empskdActMinutes,
           java.lang.String empskdActShftpatId,
           java.lang.String empskdActShiftId,
           java.lang.String empskdActShiftId2,
           java.lang.String empskdActShiftId3,
           java.lang.String empskdActShiftId4,
           java.lang.String empskdActShiftId5,
           java.util.Calendar empskdActStartTime,
           java.util.Calendar empskdActStartTime2,
           java.util.Calendar empskdActStartTime3,
           java.util.Calendar empskdActStartTime4,
           java.util.Calendar empskdActStartTime5,
           com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak,
           com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak2,
           com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak3,
           com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak4,
           com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak5,
           java.lang.String empskdDefBaseRate,
           java.util.Calendar empskdDefEndTime,
           java.lang.String empskdDefMinutes,
           java.lang.String empskdDefShftpatId,
           java.lang.String empskdDefShiftId,
           java.util.Calendar empskdDefStartTime,
           java.lang.String empskdId,
           java.lang.String empskdLtaId,
           java.util.Calendar workDate) {
           this.empId = empId;
           this.empskdActBaseRate = empskdActBaseRate;
           this.empskdActEndTime = empskdActEndTime;
           this.empskdActEndTime2 = empskdActEndTime2;
           this.empskdActEndTime3 = empskdActEndTime3;
           this.empskdActEndTime4 = empskdActEndTime4;
           this.empskdActEndTime5 = empskdActEndTime5;
           this.empskdActMinutes = empskdActMinutes;
           this.empskdActShftpatId = empskdActShftpatId;
           this.empskdActShiftId = empskdActShiftId;
           this.empskdActShiftId2 = empskdActShiftId2;
           this.empskdActShiftId3 = empskdActShiftId3;
           this.empskdActShiftId4 = empskdActShiftId4;
           this.empskdActShiftId5 = empskdActShiftId5;
           this.empskdActStartTime = empskdActStartTime;
           this.empskdActStartTime2 = empskdActStartTime2;
           this.empskdActStartTime3 = empskdActStartTime3;
           this.empskdActStartTime4 = empskdActStartTime4;
           this.empskdActStartTime5 = empskdActStartTime5;
           this.empskdBreak = empskdBreak;
           this.empskdBreak2 = empskdBreak2;
           this.empskdBreak3 = empskdBreak3;
           this.empskdBreak4 = empskdBreak4;
           this.empskdBreak5 = empskdBreak5;
           this.empskdDefBaseRate = empskdDefBaseRate;
           this.empskdDefEndTime = empskdDefEndTime;
           this.empskdDefMinutes = empskdDefMinutes;
           this.empskdDefShftpatId = empskdDefShftpatId;
           this.empskdDefShiftId = empskdDefShiftId;
           this.empskdDefStartTime = empskdDefStartTime;
           this.empskdId = empskdId;
           this.empskdLtaId = empskdLtaId;
           this.workDate = workDate;
    }


    /**
     * Gets the empId value for this WSEmployeeSchedule.
     * 
     * @return empId
     */
    public java.lang.String getEmpId() {
        return empId;
    }


    /**
     * Sets the empId value for this WSEmployeeSchedule.
     * 
     * @param empId
     */
    public void setEmpId(java.lang.String empId) {
        this.empId = empId;
    }


    /**
     * Gets the empskdActBaseRate value for this WSEmployeeSchedule.
     * 
     * @return empskdActBaseRate
     */
    public java.lang.String getEmpskdActBaseRate() {
        return empskdActBaseRate;
    }


    /**
     * Sets the empskdActBaseRate value for this WSEmployeeSchedule.
     * 
     * @param empskdActBaseRate
     */
    public void setEmpskdActBaseRate(java.lang.String empskdActBaseRate) {
        this.empskdActBaseRate = empskdActBaseRate;
    }


    /**
     * Gets the empskdActEndTime value for this WSEmployeeSchedule.
     * 
     * @return empskdActEndTime
     */
    public java.util.Calendar getEmpskdActEndTime() {
        return empskdActEndTime;
    }


    /**
     * Sets the empskdActEndTime value for this WSEmployeeSchedule.
     * 
     * @param empskdActEndTime
     */
    public void setEmpskdActEndTime(java.util.Calendar empskdActEndTime) {
        this.empskdActEndTime = empskdActEndTime;
    }


    /**
     * Gets the empskdActEndTime2 value for this WSEmployeeSchedule.
     * 
     * @return empskdActEndTime2
     */
    public java.util.Calendar getEmpskdActEndTime2() {
        return empskdActEndTime2;
    }


    /**
     * Sets the empskdActEndTime2 value for this WSEmployeeSchedule.
     * 
     * @param empskdActEndTime2
     */
    public void setEmpskdActEndTime2(java.util.Calendar empskdActEndTime2) {
        this.empskdActEndTime2 = empskdActEndTime2;
    }


    /**
     * Gets the empskdActEndTime3 value for this WSEmployeeSchedule.
     * 
     * @return empskdActEndTime3
     */
    public java.util.Calendar getEmpskdActEndTime3() {
        return empskdActEndTime3;
    }


    /**
     * Sets the empskdActEndTime3 value for this WSEmployeeSchedule.
     * 
     * @param empskdActEndTime3
     */
    public void setEmpskdActEndTime3(java.util.Calendar empskdActEndTime3) {
        this.empskdActEndTime3 = empskdActEndTime3;
    }


    /**
     * Gets the empskdActEndTime4 value for this WSEmployeeSchedule.
     * 
     * @return empskdActEndTime4
     */
    public java.util.Calendar getEmpskdActEndTime4() {
        return empskdActEndTime4;
    }


    /**
     * Sets the empskdActEndTime4 value for this WSEmployeeSchedule.
     * 
     * @param empskdActEndTime4
     */
    public void setEmpskdActEndTime4(java.util.Calendar empskdActEndTime4) {
        this.empskdActEndTime4 = empskdActEndTime4;
    }


    /**
     * Gets the empskdActEndTime5 value for this WSEmployeeSchedule.
     * 
     * @return empskdActEndTime5
     */
    public java.util.Calendar getEmpskdActEndTime5() {
        return empskdActEndTime5;
    }


    /**
     * Sets the empskdActEndTime5 value for this WSEmployeeSchedule.
     * 
     * @param empskdActEndTime5
     */
    public void setEmpskdActEndTime5(java.util.Calendar empskdActEndTime5) {
        this.empskdActEndTime5 = empskdActEndTime5;
    }


    /**
     * Gets the empskdActMinutes value for this WSEmployeeSchedule.
     * 
     * @return empskdActMinutes
     */
    public java.lang.String getEmpskdActMinutes() {
        return empskdActMinutes;
    }


    /**
     * Sets the empskdActMinutes value for this WSEmployeeSchedule.
     * 
     * @param empskdActMinutes
     */
    public void setEmpskdActMinutes(java.lang.String empskdActMinutes) {
        this.empskdActMinutes = empskdActMinutes;
    }


    /**
     * Gets the empskdActShftpatId value for this WSEmployeeSchedule.
     * 
     * @return empskdActShftpatId
     */
    public java.lang.String getEmpskdActShftpatId() {
        return empskdActShftpatId;
    }


    /**
     * Sets the empskdActShftpatId value for this WSEmployeeSchedule.
     * 
     * @param empskdActShftpatId
     */
    public void setEmpskdActShftpatId(java.lang.String empskdActShftpatId) {
        this.empskdActShftpatId = empskdActShftpatId;
    }


    /**
     * Gets the empskdActShiftId value for this WSEmployeeSchedule.
     * 
     * @return empskdActShiftId
     */
    public java.lang.String getEmpskdActShiftId() {
        return empskdActShiftId;
    }


    /**
     * Sets the empskdActShiftId value for this WSEmployeeSchedule.
     * 
     * @param empskdActShiftId
     */
    public void setEmpskdActShiftId(java.lang.String empskdActShiftId) {
        this.empskdActShiftId = empskdActShiftId;
    }


    /**
     * Gets the empskdActShiftId2 value for this WSEmployeeSchedule.
     * 
     * @return empskdActShiftId2
     */
    public java.lang.String getEmpskdActShiftId2() {
        return empskdActShiftId2;
    }


    /**
     * Sets the empskdActShiftId2 value for this WSEmployeeSchedule.
     * 
     * @param empskdActShiftId2
     */
    public void setEmpskdActShiftId2(java.lang.String empskdActShiftId2) {
        this.empskdActShiftId2 = empskdActShiftId2;
    }


    /**
     * Gets the empskdActShiftId3 value for this WSEmployeeSchedule.
     * 
     * @return empskdActShiftId3
     */
    public java.lang.String getEmpskdActShiftId3() {
        return empskdActShiftId3;
    }


    /**
     * Sets the empskdActShiftId3 value for this WSEmployeeSchedule.
     * 
     * @param empskdActShiftId3
     */
    public void setEmpskdActShiftId3(java.lang.String empskdActShiftId3) {
        this.empskdActShiftId3 = empskdActShiftId3;
    }


    /**
     * Gets the empskdActShiftId4 value for this WSEmployeeSchedule.
     * 
     * @return empskdActShiftId4
     */
    public java.lang.String getEmpskdActShiftId4() {
        return empskdActShiftId4;
    }


    /**
     * Sets the empskdActShiftId4 value for this WSEmployeeSchedule.
     * 
     * @param empskdActShiftId4
     */
    public void setEmpskdActShiftId4(java.lang.String empskdActShiftId4) {
        this.empskdActShiftId4 = empskdActShiftId4;
    }


    /**
     * Gets the empskdActShiftId5 value for this WSEmployeeSchedule.
     * 
     * @return empskdActShiftId5
     */
    public java.lang.String getEmpskdActShiftId5() {
        return empskdActShiftId5;
    }


    /**
     * Sets the empskdActShiftId5 value for this WSEmployeeSchedule.
     * 
     * @param empskdActShiftId5
     */
    public void setEmpskdActShiftId5(java.lang.String empskdActShiftId5) {
        this.empskdActShiftId5 = empskdActShiftId5;
    }


    /**
     * Gets the empskdActStartTime value for this WSEmployeeSchedule.
     * 
     * @return empskdActStartTime
     */
    public java.util.Calendar getEmpskdActStartTime() {
        return empskdActStartTime;
    }


    /**
     * Sets the empskdActStartTime value for this WSEmployeeSchedule.
     * 
     * @param empskdActStartTime
     */
    public void setEmpskdActStartTime(java.util.Calendar empskdActStartTime) {
        this.empskdActStartTime = empskdActStartTime;
    }


    /**
     * Gets the empskdActStartTime2 value for this WSEmployeeSchedule.
     * 
     * @return empskdActStartTime2
     */
    public java.util.Calendar getEmpskdActStartTime2() {
        return empskdActStartTime2;
    }


    /**
     * Sets the empskdActStartTime2 value for this WSEmployeeSchedule.
     * 
     * @param empskdActStartTime2
     */
    public void setEmpskdActStartTime2(java.util.Calendar empskdActStartTime2) {
        this.empskdActStartTime2 = empskdActStartTime2;
    }


    /**
     * Gets the empskdActStartTime3 value for this WSEmployeeSchedule.
     * 
     * @return empskdActStartTime3
     */
    public java.util.Calendar getEmpskdActStartTime3() {
        return empskdActStartTime3;
    }


    /**
     * Sets the empskdActStartTime3 value for this WSEmployeeSchedule.
     * 
     * @param empskdActStartTime3
     */
    public void setEmpskdActStartTime3(java.util.Calendar empskdActStartTime3) {
        this.empskdActStartTime3 = empskdActStartTime3;
    }


    /**
     * Gets the empskdActStartTime4 value for this WSEmployeeSchedule.
     * 
     * @return empskdActStartTime4
     */
    public java.util.Calendar getEmpskdActStartTime4() {
        return empskdActStartTime4;
    }


    /**
     * Sets the empskdActStartTime4 value for this WSEmployeeSchedule.
     * 
     * @param empskdActStartTime4
     */
    public void setEmpskdActStartTime4(java.util.Calendar empskdActStartTime4) {
        this.empskdActStartTime4 = empskdActStartTime4;
    }


    /**
     * Gets the empskdActStartTime5 value for this WSEmployeeSchedule.
     * 
     * @return empskdActStartTime5
     */
    public java.util.Calendar getEmpskdActStartTime5() {
        return empskdActStartTime5;
    }


    /**
     * Sets the empskdActStartTime5 value for this WSEmployeeSchedule.
     * 
     * @param empskdActStartTime5
     */
    public void setEmpskdActStartTime5(java.util.Calendar empskdActStartTime5) {
        this.empskdActStartTime5 = empskdActStartTime5;
    }


    /**
     * Gets the empskdBreak value for this WSEmployeeSchedule.
     * 
     * @return empskdBreak
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] getEmpskdBreak() {
        return empskdBreak;
    }


    /**
     * Sets the empskdBreak value for this WSEmployeeSchedule.
     * 
     * @param empskdBreak
     */
    public void setEmpskdBreak(com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak) {
        this.empskdBreak = empskdBreak;
    }


    /**
     * Gets the empskdBreak2 value for this WSEmployeeSchedule.
     * 
     * @return empskdBreak2
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] getEmpskdBreak2() {
        return empskdBreak2;
    }


    /**
     * Sets the empskdBreak2 value for this WSEmployeeSchedule.
     * 
     * @param empskdBreak2
     */
    public void setEmpskdBreak2(com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak2) {
        this.empskdBreak2 = empskdBreak2;
    }


    /**
     * Gets the empskdBreak3 value for this WSEmployeeSchedule.
     * 
     * @return empskdBreak3
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] getEmpskdBreak3() {
        return empskdBreak3;
    }


    /**
     * Sets the empskdBreak3 value for this WSEmployeeSchedule.
     * 
     * @param empskdBreak3
     */
    public void setEmpskdBreak3(com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak3) {
        this.empskdBreak3 = empskdBreak3;
    }


    /**
     * Gets the empskdBreak4 value for this WSEmployeeSchedule.
     * 
     * @return empskdBreak4
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] getEmpskdBreak4() {
        return empskdBreak4;
    }


    /**
     * Sets the empskdBreak4 value for this WSEmployeeSchedule.
     * 
     * @param empskdBreak4
     */
    public void setEmpskdBreak4(com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak4) {
        this.empskdBreak4 = empskdBreak4;
    }


    /**
     * Gets the empskdBreak5 value for this WSEmployeeSchedule.
     * 
     * @return empskdBreak5
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] getEmpskdBreak5() {
        return empskdBreak5;
    }


    /**
     * Sets the empskdBreak5 value for this WSEmployeeSchedule.
     * 
     * @param empskdBreak5
     */
    public void setEmpskdBreak5(com.workbrain.webservices.ta.WSEmployeeScheduleBreak[] empskdBreak5) {
        this.empskdBreak5 = empskdBreak5;
    }


    /**
     * Gets the empskdDefBaseRate value for this WSEmployeeSchedule.
     * 
     * @return empskdDefBaseRate
     */
    public java.lang.String getEmpskdDefBaseRate() {
        return empskdDefBaseRate;
    }


    /**
     * Sets the empskdDefBaseRate value for this WSEmployeeSchedule.
     * 
     * @param empskdDefBaseRate
     */
    public void setEmpskdDefBaseRate(java.lang.String empskdDefBaseRate) {
        this.empskdDefBaseRate = empskdDefBaseRate;
    }


    /**
     * Gets the empskdDefEndTime value for this WSEmployeeSchedule.
     * 
     * @return empskdDefEndTime
     */
    public java.util.Calendar getEmpskdDefEndTime() {
        return empskdDefEndTime;
    }


    /**
     * Sets the empskdDefEndTime value for this WSEmployeeSchedule.
     * 
     * @param empskdDefEndTime
     */
    public void setEmpskdDefEndTime(java.util.Calendar empskdDefEndTime) {
        this.empskdDefEndTime = empskdDefEndTime;
    }


    /**
     * Gets the empskdDefMinutes value for this WSEmployeeSchedule.
     * 
     * @return empskdDefMinutes
     */
    public java.lang.String getEmpskdDefMinutes() {
        return empskdDefMinutes;
    }


    /**
     * Sets the empskdDefMinutes value for this WSEmployeeSchedule.
     * 
     * @param empskdDefMinutes
     */
    public void setEmpskdDefMinutes(java.lang.String empskdDefMinutes) {
        this.empskdDefMinutes = empskdDefMinutes;
    }


    /**
     * Gets the empskdDefShftpatId value for this WSEmployeeSchedule.
     * 
     * @return empskdDefShftpatId
     */
    public java.lang.String getEmpskdDefShftpatId() {
        return empskdDefShftpatId;
    }


    /**
     * Sets the empskdDefShftpatId value for this WSEmployeeSchedule.
     * 
     * @param empskdDefShftpatId
     */
    public void setEmpskdDefShftpatId(java.lang.String empskdDefShftpatId) {
        this.empskdDefShftpatId = empskdDefShftpatId;
    }


    /**
     * Gets the empskdDefShiftId value for this WSEmployeeSchedule.
     * 
     * @return empskdDefShiftId
     */
    public java.lang.String getEmpskdDefShiftId() {
        return empskdDefShiftId;
    }


    /**
     * Sets the empskdDefShiftId value for this WSEmployeeSchedule.
     * 
     * @param empskdDefShiftId
     */
    public void setEmpskdDefShiftId(java.lang.String empskdDefShiftId) {
        this.empskdDefShiftId = empskdDefShiftId;
    }


    /**
     * Gets the empskdDefStartTime value for this WSEmployeeSchedule.
     * 
     * @return empskdDefStartTime
     */
    public java.util.Calendar getEmpskdDefStartTime() {
        return empskdDefStartTime;
    }


    /**
     * Sets the empskdDefStartTime value for this WSEmployeeSchedule.
     * 
     * @param empskdDefStartTime
     */
    public void setEmpskdDefStartTime(java.util.Calendar empskdDefStartTime) {
        this.empskdDefStartTime = empskdDefStartTime;
    }


    /**
     * Gets the empskdId value for this WSEmployeeSchedule.
     * 
     * @return empskdId
     */
    public java.lang.String getEmpskdId() {
        return empskdId;
    }


    /**
     * Sets the empskdId value for this WSEmployeeSchedule.
     * 
     * @param empskdId
     */
    public void setEmpskdId(java.lang.String empskdId) {
        this.empskdId = empskdId;
    }


    /**
     * Gets the empskdLtaId value for this WSEmployeeSchedule.
     * 
     * @return empskdLtaId
     */
    public java.lang.String getEmpskdLtaId() {
        return empskdLtaId;
    }


    /**
     * Sets the empskdLtaId value for this WSEmployeeSchedule.
     * 
     * @param empskdLtaId
     */
    public void setEmpskdLtaId(java.lang.String empskdLtaId) {
        this.empskdLtaId = empskdLtaId;
    }


    /**
     * Gets the workDate value for this WSEmployeeSchedule.
     * 
     * @return workDate
     */
    public java.util.Calendar getWorkDate() {
        return workDate;
    }


    /**
     * Sets the workDate value for this WSEmployeeSchedule.
     * 
     * @param workDate
     */
    public void setWorkDate(java.util.Calendar workDate) {
        this.workDate = workDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSEmployeeSchedule)) return false;
        WSEmployeeSchedule other = (WSEmployeeSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.empId==null && other.getEmpId()==null) || 
             (this.empId!=null &&
              this.empId.equals(other.getEmpId()))) &&
            ((this.empskdActBaseRate==null && other.getEmpskdActBaseRate()==null) || 
             (this.empskdActBaseRate!=null &&
              this.empskdActBaseRate.equals(other.getEmpskdActBaseRate()))) &&
            ((this.empskdActEndTime==null && other.getEmpskdActEndTime()==null) || 
             (this.empskdActEndTime!=null &&
              this.empskdActEndTime.equals(other.getEmpskdActEndTime()))) &&
            ((this.empskdActEndTime2==null && other.getEmpskdActEndTime2()==null) || 
             (this.empskdActEndTime2!=null &&
              this.empskdActEndTime2.equals(other.getEmpskdActEndTime2()))) &&
            ((this.empskdActEndTime3==null && other.getEmpskdActEndTime3()==null) || 
             (this.empskdActEndTime3!=null &&
              this.empskdActEndTime3.equals(other.getEmpskdActEndTime3()))) &&
            ((this.empskdActEndTime4==null && other.getEmpskdActEndTime4()==null) || 
             (this.empskdActEndTime4!=null &&
              this.empskdActEndTime4.equals(other.getEmpskdActEndTime4()))) &&
            ((this.empskdActEndTime5==null && other.getEmpskdActEndTime5()==null) || 
             (this.empskdActEndTime5!=null &&
              this.empskdActEndTime5.equals(other.getEmpskdActEndTime5()))) &&
            ((this.empskdActMinutes==null && other.getEmpskdActMinutes()==null) || 
             (this.empskdActMinutes!=null &&
              this.empskdActMinutes.equals(other.getEmpskdActMinutes()))) &&
            ((this.empskdActShftpatId==null && other.getEmpskdActShftpatId()==null) || 
             (this.empskdActShftpatId!=null &&
              this.empskdActShftpatId.equals(other.getEmpskdActShftpatId()))) &&
            ((this.empskdActShiftId==null && other.getEmpskdActShiftId()==null) || 
             (this.empskdActShiftId!=null &&
              this.empskdActShiftId.equals(other.getEmpskdActShiftId()))) &&
            ((this.empskdActShiftId2==null && other.getEmpskdActShiftId2()==null) || 
             (this.empskdActShiftId2!=null &&
              this.empskdActShiftId2.equals(other.getEmpskdActShiftId2()))) &&
            ((this.empskdActShiftId3==null && other.getEmpskdActShiftId3()==null) || 
             (this.empskdActShiftId3!=null &&
              this.empskdActShiftId3.equals(other.getEmpskdActShiftId3()))) &&
            ((this.empskdActShiftId4==null && other.getEmpskdActShiftId4()==null) || 
             (this.empskdActShiftId4!=null &&
              this.empskdActShiftId4.equals(other.getEmpskdActShiftId4()))) &&
            ((this.empskdActShiftId5==null && other.getEmpskdActShiftId5()==null) || 
             (this.empskdActShiftId5!=null &&
              this.empskdActShiftId5.equals(other.getEmpskdActShiftId5()))) &&
            ((this.empskdActStartTime==null && other.getEmpskdActStartTime()==null) || 
             (this.empskdActStartTime!=null &&
              this.empskdActStartTime.equals(other.getEmpskdActStartTime()))) &&
            ((this.empskdActStartTime2==null && other.getEmpskdActStartTime2()==null) || 
             (this.empskdActStartTime2!=null &&
              this.empskdActStartTime2.equals(other.getEmpskdActStartTime2()))) &&
            ((this.empskdActStartTime3==null && other.getEmpskdActStartTime3()==null) || 
             (this.empskdActStartTime3!=null &&
              this.empskdActStartTime3.equals(other.getEmpskdActStartTime3()))) &&
            ((this.empskdActStartTime4==null && other.getEmpskdActStartTime4()==null) || 
             (this.empskdActStartTime4!=null &&
              this.empskdActStartTime4.equals(other.getEmpskdActStartTime4()))) &&
            ((this.empskdActStartTime5==null && other.getEmpskdActStartTime5()==null) || 
             (this.empskdActStartTime5!=null &&
              this.empskdActStartTime5.equals(other.getEmpskdActStartTime5()))) &&
            ((this.empskdBreak==null && other.getEmpskdBreak()==null) || 
             (this.empskdBreak!=null &&
              java.util.Arrays.equals(this.empskdBreak, other.getEmpskdBreak()))) &&
            ((this.empskdBreak2==null && other.getEmpskdBreak2()==null) || 
             (this.empskdBreak2!=null &&
              java.util.Arrays.equals(this.empskdBreak2, other.getEmpskdBreak2()))) &&
            ((this.empskdBreak3==null && other.getEmpskdBreak3()==null) || 
             (this.empskdBreak3!=null &&
              java.util.Arrays.equals(this.empskdBreak3, other.getEmpskdBreak3()))) &&
            ((this.empskdBreak4==null && other.getEmpskdBreak4()==null) || 
             (this.empskdBreak4!=null &&
              java.util.Arrays.equals(this.empskdBreak4, other.getEmpskdBreak4()))) &&
            ((this.empskdBreak5==null && other.getEmpskdBreak5()==null) || 
             (this.empskdBreak5!=null &&
              java.util.Arrays.equals(this.empskdBreak5, other.getEmpskdBreak5()))) &&
            ((this.empskdDefBaseRate==null && other.getEmpskdDefBaseRate()==null) || 
             (this.empskdDefBaseRate!=null &&
              this.empskdDefBaseRate.equals(other.getEmpskdDefBaseRate()))) &&
            ((this.empskdDefEndTime==null && other.getEmpskdDefEndTime()==null) || 
             (this.empskdDefEndTime!=null &&
              this.empskdDefEndTime.equals(other.getEmpskdDefEndTime()))) &&
            ((this.empskdDefMinutes==null && other.getEmpskdDefMinutes()==null) || 
             (this.empskdDefMinutes!=null &&
              this.empskdDefMinutes.equals(other.getEmpskdDefMinutes()))) &&
            ((this.empskdDefShftpatId==null && other.getEmpskdDefShftpatId()==null) || 
             (this.empskdDefShftpatId!=null &&
              this.empskdDefShftpatId.equals(other.getEmpskdDefShftpatId()))) &&
            ((this.empskdDefShiftId==null && other.getEmpskdDefShiftId()==null) || 
             (this.empskdDefShiftId!=null &&
              this.empskdDefShiftId.equals(other.getEmpskdDefShiftId()))) &&
            ((this.empskdDefStartTime==null && other.getEmpskdDefStartTime()==null) || 
             (this.empskdDefStartTime!=null &&
              this.empskdDefStartTime.equals(other.getEmpskdDefStartTime()))) &&
            ((this.empskdId==null && other.getEmpskdId()==null) || 
             (this.empskdId!=null &&
              this.empskdId.equals(other.getEmpskdId()))) &&
            ((this.empskdLtaId==null && other.getEmpskdLtaId()==null) || 
             (this.empskdLtaId!=null &&
              this.empskdLtaId.equals(other.getEmpskdLtaId()))) &&
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
        if (getEmpId() != null) {
            _hashCode += getEmpId().hashCode();
        }
        if (getEmpskdActBaseRate() != null) {
            _hashCode += getEmpskdActBaseRate().hashCode();
        }
        if (getEmpskdActEndTime() != null) {
            _hashCode += getEmpskdActEndTime().hashCode();
        }
        if (getEmpskdActEndTime2() != null) {
            _hashCode += getEmpskdActEndTime2().hashCode();
        }
        if (getEmpskdActEndTime3() != null) {
            _hashCode += getEmpskdActEndTime3().hashCode();
        }
        if (getEmpskdActEndTime4() != null) {
            _hashCode += getEmpskdActEndTime4().hashCode();
        }
        if (getEmpskdActEndTime5() != null) {
            _hashCode += getEmpskdActEndTime5().hashCode();
        }
        if (getEmpskdActMinutes() != null) {
            _hashCode += getEmpskdActMinutes().hashCode();
        }
        if (getEmpskdActShftpatId() != null) {
            _hashCode += getEmpskdActShftpatId().hashCode();
        }
        if (getEmpskdActShiftId() != null) {
            _hashCode += getEmpskdActShiftId().hashCode();
        }
        if (getEmpskdActShiftId2() != null) {
            _hashCode += getEmpskdActShiftId2().hashCode();
        }
        if (getEmpskdActShiftId3() != null) {
            _hashCode += getEmpskdActShiftId3().hashCode();
        }
        if (getEmpskdActShiftId4() != null) {
            _hashCode += getEmpskdActShiftId4().hashCode();
        }
        if (getEmpskdActShiftId5() != null) {
            _hashCode += getEmpskdActShiftId5().hashCode();
        }
        if (getEmpskdActStartTime() != null) {
            _hashCode += getEmpskdActStartTime().hashCode();
        }
        if (getEmpskdActStartTime2() != null) {
            _hashCode += getEmpskdActStartTime2().hashCode();
        }
        if (getEmpskdActStartTime3() != null) {
            _hashCode += getEmpskdActStartTime3().hashCode();
        }
        if (getEmpskdActStartTime4() != null) {
            _hashCode += getEmpskdActStartTime4().hashCode();
        }
        if (getEmpskdActStartTime5() != null) {
            _hashCode += getEmpskdActStartTime5().hashCode();
        }
        if (getEmpskdBreak() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpskdBreak());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpskdBreak(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpskdBreak2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpskdBreak2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpskdBreak2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpskdBreak3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpskdBreak3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpskdBreak3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpskdBreak4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpskdBreak4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpskdBreak4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpskdBreak5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpskdBreak5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpskdBreak5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpskdDefBaseRate() != null) {
            _hashCode += getEmpskdDefBaseRate().hashCode();
        }
        if (getEmpskdDefEndTime() != null) {
            _hashCode += getEmpskdDefEndTime().hashCode();
        }
        if (getEmpskdDefMinutes() != null) {
            _hashCode += getEmpskdDefMinutes().hashCode();
        }
        if (getEmpskdDefShftpatId() != null) {
            _hashCode += getEmpskdDefShftpatId().hashCode();
        }
        if (getEmpskdDefShiftId() != null) {
            _hashCode += getEmpskdDefShiftId().hashCode();
        }
        if (getEmpskdDefStartTime() != null) {
            _hashCode += getEmpskdDefStartTime().hashCode();
        }
        if (getEmpskdId() != null) {
            _hashCode += getEmpskdId().hashCode();
        }
        if (getEmpskdLtaId() != null) {
            _hashCode += getEmpskdLtaId().hashCode();
        }
        if (getWorkDate() != null) {
            _hashCode += getWorkDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSEmployeeSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActBaseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActBaseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActEndTime2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActEndTime2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActEndTime3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActEndTime3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActEndTime4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActEndTime4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActEndTime5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActEndTime5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShftpatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShftpatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShiftId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShiftId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShiftId2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShiftId2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShiftId3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShiftId3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShiftId4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShiftId4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActShiftId5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActShiftId5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActStartTime2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActStartTime2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActStartTime3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActStartTime3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActStartTime4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActStartTime4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdActStartTime5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdActStartTime5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBreak");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBreak"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBreak2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBreak2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBreak3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBreak3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBreak4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBreak4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdBreak5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdBreak5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefBaseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefBaseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefEndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefShftpatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefShftpatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefShiftId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefShiftId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdDefStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdDefStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empskdLtaId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empskdLtaId"));
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
