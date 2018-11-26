/**
 * WSTimeAndAttendanceData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSTimeAndAttendanceData  implements java.io.Serializable {
    private com.workbrain.webservices.ta.WSAlternateHolidayOverride[] alternateOverrideList;

    private com.workbrain.webservices.ta.WSCalcGroup[] calcGroupList;

    private boolean calculateRecs;

    private boolean createDefaultRecord;

    private int currentPage;

    private com.workbrain.webservices.ta.WSDepartment[] departmentList;

    private com.workbrain.webservices.ta.WSDocket[] docketList;

    private com.workbrain.webservices.ta.WSElapsedTimeOverride[] elapsedTimeOverrideList;

    private com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] employeeBalanceOverrideList;

    private com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] employeeDefaultLaborOverrideList;

    private com.workbrain.webservices.ta.WSEmployee[] employeeList;

    private com.workbrain.webservices.ta.WSEmployeeOverride[] employeeOverrideList;

    private com.workbrain.webservices.ta.WSEmployeeSchedule[] employeeScheduleList;

    private com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] employeeScheduleOverrideList;

    private com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] holidayOverrideList;

    private com.workbrain.webservices.ta.WSHourType[] hourTypeList;

    private com.workbrain.webservices.ta.WSJob[] jobList;

    private com.workbrain.webservices.ta.WSLTAOverride[] ltaOverrideList;

    private com.workbrain.webservices.ta.WSOverride[] overrideList;

    private com.workbrain.webservices.ta.WSOverrideType[] overrideTypeList;

    private com.workbrain.webservices.ta.WSPayGroup[] payGroupList;

    private com.workbrain.webservices.ta.WSProject[] projectList;

    private java.lang.String queryId;

    private com.workbrain.webservices.ta.WSShift[] shiftList;

    private com.workbrain.webservices.ta.WSShiftPattern[] shiftPatternList;

    private com.workbrain.webservices.ta.WSTimeCode[] timeCodeList;

    private int totalPages;

    private com.workbrain.webservices.ta.WSWorkDetail[] workDetailList;

    private com.workbrain.webservices.ta.WSWorkDetailOverride[] workDetailOverrideList;

    private com.workbrain.webservices.ta.WSWorkPremiumOverride[] workPremiumOverrideList;

    private com.workbrain.webservices.ta.WSWorkSummary[] workSummaryList;

    private com.workbrain.webservices.ta.WSWorkSummaryOverride[] workSummaryOverrideList;

    public WSTimeAndAttendanceData() {
    }

    public WSTimeAndAttendanceData(
           com.workbrain.webservices.ta.WSAlternateHolidayOverride[] alternateOverrideList,
           com.workbrain.webservices.ta.WSCalcGroup[] calcGroupList,
           boolean calculateRecs,
           boolean createDefaultRecord,
           int currentPage,
           com.workbrain.webservices.ta.WSDepartment[] departmentList,
           com.workbrain.webservices.ta.WSDocket[] docketList,
           com.workbrain.webservices.ta.WSElapsedTimeOverride[] elapsedTimeOverrideList,
           com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] employeeBalanceOverrideList,
           com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] employeeDefaultLaborOverrideList,
           com.workbrain.webservices.ta.WSEmployee[] employeeList,
           com.workbrain.webservices.ta.WSEmployeeOverride[] employeeOverrideList,
           com.workbrain.webservices.ta.WSEmployeeSchedule[] employeeScheduleList,
           com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] employeeScheduleOverrideList,
           com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] holidayOverrideList,
           com.workbrain.webservices.ta.WSHourType[] hourTypeList,
           com.workbrain.webservices.ta.WSJob[] jobList,
           com.workbrain.webservices.ta.WSLTAOverride[] ltaOverrideList,
           com.workbrain.webservices.ta.WSOverride[] overrideList,
           com.workbrain.webservices.ta.WSOverrideType[] overrideTypeList,
           com.workbrain.webservices.ta.WSPayGroup[] payGroupList,
           com.workbrain.webservices.ta.WSProject[] projectList,
           java.lang.String queryId,
           com.workbrain.webservices.ta.WSShift[] shiftList,
           com.workbrain.webservices.ta.WSShiftPattern[] shiftPatternList,
           com.workbrain.webservices.ta.WSTimeCode[] timeCodeList,
           int totalPages,
           com.workbrain.webservices.ta.WSWorkDetail[] workDetailList,
           com.workbrain.webservices.ta.WSWorkDetailOverride[] workDetailOverrideList,
           com.workbrain.webservices.ta.WSWorkPremiumOverride[] workPremiumOverrideList,
           com.workbrain.webservices.ta.WSWorkSummary[] workSummaryList,
           com.workbrain.webservices.ta.WSWorkSummaryOverride[] workSummaryOverrideList) {
           this.alternateOverrideList = alternateOverrideList;
           this.calcGroupList = calcGroupList;
           this.calculateRecs = calculateRecs;
           this.createDefaultRecord = createDefaultRecord;
           this.currentPage = currentPage;
           this.departmentList = departmentList;
           this.docketList = docketList;
           this.elapsedTimeOverrideList = elapsedTimeOverrideList;
           this.employeeBalanceOverrideList = employeeBalanceOverrideList;
           this.employeeDefaultLaborOverrideList = employeeDefaultLaborOverrideList;
           this.employeeList = employeeList;
           this.employeeOverrideList = employeeOverrideList;
           this.employeeScheduleList = employeeScheduleList;
           this.employeeScheduleOverrideList = employeeScheduleOverrideList;
           this.holidayOverrideList = holidayOverrideList;
           this.hourTypeList = hourTypeList;
           this.jobList = jobList;
           this.ltaOverrideList = ltaOverrideList;
           this.overrideList = overrideList;
           this.overrideTypeList = overrideTypeList;
           this.payGroupList = payGroupList;
           this.projectList = projectList;
           this.queryId = queryId;
           this.shiftList = shiftList;
           this.shiftPatternList = shiftPatternList;
           this.timeCodeList = timeCodeList;
           this.totalPages = totalPages;
           this.workDetailList = workDetailList;
           this.workDetailOverrideList = workDetailOverrideList;
           this.workPremiumOverrideList = workPremiumOverrideList;
           this.workSummaryList = workSummaryList;
           this.workSummaryOverrideList = workSummaryOverrideList;
    }


    /**
     * Gets the alternateOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return alternateOverrideList
     */
    public com.workbrain.webservices.ta.WSAlternateHolidayOverride[] getAlternateOverrideList() {
        return alternateOverrideList;
    }


    /**
     * Sets the alternateOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param alternateOverrideList
     */
    public void setAlternateOverrideList(com.workbrain.webservices.ta.WSAlternateHolidayOverride[] alternateOverrideList) {
        this.alternateOverrideList = alternateOverrideList;
    }


    /**
     * Gets the calcGroupList value for this WSTimeAndAttendanceData.
     * 
     * @return calcGroupList
     */
    public com.workbrain.webservices.ta.WSCalcGroup[] getCalcGroupList() {
        return calcGroupList;
    }


    /**
     * Sets the calcGroupList value for this WSTimeAndAttendanceData.
     * 
     * @param calcGroupList
     */
    public void setCalcGroupList(com.workbrain.webservices.ta.WSCalcGroup[] calcGroupList) {
        this.calcGroupList = calcGroupList;
    }


    /**
     * Gets the calculateRecs value for this WSTimeAndAttendanceData.
     * 
     * @return calculateRecs
     */
    public boolean isCalculateRecs() {
        return calculateRecs;
    }


    /**
     * Sets the calculateRecs value for this WSTimeAndAttendanceData.
     * 
     * @param calculateRecs
     */
    public void setCalculateRecs(boolean calculateRecs) {
        this.calculateRecs = calculateRecs;
    }


    /**
     * Gets the createDefaultRecord value for this WSTimeAndAttendanceData.
     * 
     * @return createDefaultRecord
     */
    public boolean isCreateDefaultRecord() {
        return createDefaultRecord;
    }


    /**
     * Sets the createDefaultRecord value for this WSTimeAndAttendanceData.
     * 
     * @param createDefaultRecord
     */
    public void setCreateDefaultRecord(boolean createDefaultRecord) {
        this.createDefaultRecord = createDefaultRecord;
    }


    /**
     * Gets the currentPage value for this WSTimeAndAttendanceData.
     * 
     * @return currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }


    /**
     * Sets the currentPage value for this WSTimeAndAttendanceData.
     * 
     * @param currentPage
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }


    /**
     * Gets the departmentList value for this WSTimeAndAttendanceData.
     * 
     * @return departmentList
     */
    public com.workbrain.webservices.ta.WSDepartment[] getDepartmentList() {
        return departmentList;
    }


    /**
     * Sets the departmentList value for this WSTimeAndAttendanceData.
     * 
     * @param departmentList
     */
    public void setDepartmentList(com.workbrain.webservices.ta.WSDepartment[] departmentList) {
        this.departmentList = departmentList;
    }


    /**
     * Gets the docketList value for this WSTimeAndAttendanceData.
     * 
     * @return docketList
     */
    public com.workbrain.webservices.ta.WSDocket[] getDocketList() {
        return docketList;
    }


    /**
     * Sets the docketList value for this WSTimeAndAttendanceData.
     * 
     * @param docketList
     */
    public void setDocketList(com.workbrain.webservices.ta.WSDocket[] docketList) {
        this.docketList = docketList;
    }


    /**
     * Gets the elapsedTimeOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return elapsedTimeOverrideList
     */
    public com.workbrain.webservices.ta.WSElapsedTimeOverride[] getElapsedTimeOverrideList() {
        return elapsedTimeOverrideList;
    }


    /**
     * Sets the elapsedTimeOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param elapsedTimeOverrideList
     */
    public void setElapsedTimeOverrideList(com.workbrain.webservices.ta.WSElapsedTimeOverride[] elapsedTimeOverrideList) {
        this.elapsedTimeOverrideList = elapsedTimeOverrideList;
    }


    /**
     * Gets the employeeBalanceOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeBalanceOverrideList
     */
    public com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] getEmployeeBalanceOverrideList() {
        return employeeBalanceOverrideList;
    }


    /**
     * Sets the employeeBalanceOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeBalanceOverrideList
     */
    public void setEmployeeBalanceOverrideList(com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] employeeBalanceOverrideList) {
        this.employeeBalanceOverrideList = employeeBalanceOverrideList;
    }


    /**
     * Gets the employeeDefaultLaborOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeDefaultLaborOverrideList
     */
    public com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] getEmployeeDefaultLaborOverrideList() {
        return employeeDefaultLaborOverrideList;
    }


    /**
     * Sets the employeeDefaultLaborOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeDefaultLaborOverrideList
     */
    public void setEmployeeDefaultLaborOverrideList(com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] employeeDefaultLaborOverrideList) {
        this.employeeDefaultLaborOverrideList = employeeDefaultLaborOverrideList;
    }


    /**
     * Gets the employeeList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeList
     */
    public com.workbrain.webservices.ta.WSEmployee[] getEmployeeList() {
        return employeeList;
    }


    /**
     * Sets the employeeList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeList
     */
    public void setEmployeeList(com.workbrain.webservices.ta.WSEmployee[] employeeList) {
        this.employeeList = employeeList;
    }


    /**
     * Gets the employeeOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeOverrideList
     */
    public com.workbrain.webservices.ta.WSEmployeeOverride[] getEmployeeOverrideList() {
        return employeeOverrideList;
    }


    /**
     * Sets the employeeOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeOverrideList
     */
    public void setEmployeeOverrideList(com.workbrain.webservices.ta.WSEmployeeOverride[] employeeOverrideList) {
        this.employeeOverrideList = employeeOverrideList;
    }


    /**
     * Gets the employeeScheduleList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeScheduleList
     */
    public com.workbrain.webservices.ta.WSEmployeeSchedule[] getEmployeeScheduleList() {
        return employeeScheduleList;
    }


    /**
     * Sets the employeeScheduleList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeScheduleList
     */
    public void setEmployeeScheduleList(com.workbrain.webservices.ta.WSEmployeeSchedule[] employeeScheduleList) {
        this.employeeScheduleList = employeeScheduleList;
    }


    /**
     * Gets the employeeScheduleOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return employeeScheduleOverrideList
     */
    public com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] getEmployeeScheduleOverrideList() {
        return employeeScheduleOverrideList;
    }


    /**
     * Sets the employeeScheduleOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param employeeScheduleOverrideList
     */
    public void setEmployeeScheduleOverrideList(com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] employeeScheduleOverrideList) {
        this.employeeScheduleOverrideList = employeeScheduleOverrideList;
    }


    /**
     * Gets the holidayOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return holidayOverrideList
     */
    public com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] getHolidayOverrideList() {
        return holidayOverrideList;
    }


    /**
     * Sets the holidayOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param holidayOverrideList
     */
    public void setHolidayOverrideList(com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] holidayOverrideList) {
        this.holidayOverrideList = holidayOverrideList;
    }


    /**
     * Gets the hourTypeList value for this WSTimeAndAttendanceData.
     * 
     * @return hourTypeList
     */
    public com.workbrain.webservices.ta.WSHourType[] getHourTypeList() {
        return hourTypeList;
    }


    /**
     * Sets the hourTypeList value for this WSTimeAndAttendanceData.
     * 
     * @param hourTypeList
     */
    public void setHourTypeList(com.workbrain.webservices.ta.WSHourType[] hourTypeList) {
        this.hourTypeList = hourTypeList;
    }


    /**
     * Gets the jobList value for this WSTimeAndAttendanceData.
     * 
     * @return jobList
     */
    public com.workbrain.webservices.ta.WSJob[] getJobList() {
        return jobList;
    }


    /**
     * Sets the jobList value for this WSTimeAndAttendanceData.
     * 
     * @param jobList
     */
    public void setJobList(com.workbrain.webservices.ta.WSJob[] jobList) {
        this.jobList = jobList;
    }


    /**
     * Gets the ltaOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return ltaOverrideList
     */
    public com.workbrain.webservices.ta.WSLTAOverride[] getLtaOverrideList() {
        return ltaOverrideList;
    }


    /**
     * Sets the ltaOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param ltaOverrideList
     */
    public void setLtaOverrideList(com.workbrain.webservices.ta.WSLTAOverride[] ltaOverrideList) {
        this.ltaOverrideList = ltaOverrideList;
    }


    /**
     * Gets the overrideList value for this WSTimeAndAttendanceData.
     * 
     * @return overrideList
     */
    public com.workbrain.webservices.ta.WSOverride[] getOverrideList() {
        return overrideList;
    }


    /**
     * Sets the overrideList value for this WSTimeAndAttendanceData.
     * 
     * @param overrideList
     */
    public void setOverrideList(com.workbrain.webservices.ta.WSOverride[] overrideList) {
        this.overrideList = overrideList;
    }


    /**
     * Gets the overrideTypeList value for this WSTimeAndAttendanceData.
     * 
     * @return overrideTypeList
     */
    public com.workbrain.webservices.ta.WSOverrideType[] getOverrideTypeList() {
        return overrideTypeList;
    }


    /**
     * Sets the overrideTypeList value for this WSTimeAndAttendanceData.
     * 
     * @param overrideTypeList
     */
    public void setOverrideTypeList(com.workbrain.webservices.ta.WSOverrideType[] overrideTypeList) {
        this.overrideTypeList = overrideTypeList;
    }


    /**
     * Gets the payGroupList value for this WSTimeAndAttendanceData.
     * 
     * @return payGroupList
     */
    public com.workbrain.webservices.ta.WSPayGroup[] getPayGroupList() {
        return payGroupList;
    }


    /**
     * Sets the payGroupList value for this WSTimeAndAttendanceData.
     * 
     * @param payGroupList
     */
    public void setPayGroupList(com.workbrain.webservices.ta.WSPayGroup[] payGroupList) {
        this.payGroupList = payGroupList;
    }


    /**
     * Gets the projectList value for this WSTimeAndAttendanceData.
     * 
     * @return projectList
     */
    public com.workbrain.webservices.ta.WSProject[] getProjectList() {
        return projectList;
    }


    /**
     * Sets the projectList value for this WSTimeAndAttendanceData.
     * 
     * @param projectList
     */
    public void setProjectList(com.workbrain.webservices.ta.WSProject[] projectList) {
        this.projectList = projectList;
    }


    /**
     * Gets the queryId value for this WSTimeAndAttendanceData.
     * 
     * @return queryId
     */
    public java.lang.String getQueryId() {
        return queryId;
    }


    /**
     * Sets the queryId value for this WSTimeAndAttendanceData.
     * 
     * @param queryId
     */
    public void setQueryId(java.lang.String queryId) {
        this.queryId = queryId;
    }


    /**
     * Gets the shiftList value for this WSTimeAndAttendanceData.
     * 
     * @return shiftList
     */
    public com.workbrain.webservices.ta.WSShift[] getShiftList() {
        return shiftList;
    }


    /**
     * Sets the shiftList value for this WSTimeAndAttendanceData.
     * 
     * @param shiftList
     */
    public void setShiftList(com.workbrain.webservices.ta.WSShift[] shiftList) {
        this.shiftList = shiftList;
    }


    /**
     * Gets the shiftPatternList value for this WSTimeAndAttendanceData.
     * 
     * @return shiftPatternList
     */
    public com.workbrain.webservices.ta.WSShiftPattern[] getShiftPatternList() {
        return shiftPatternList;
    }


    /**
     * Sets the shiftPatternList value for this WSTimeAndAttendanceData.
     * 
     * @param shiftPatternList
     */
    public void setShiftPatternList(com.workbrain.webservices.ta.WSShiftPattern[] shiftPatternList) {
        this.shiftPatternList = shiftPatternList;
    }


    /**
     * Gets the timeCodeList value for this WSTimeAndAttendanceData.
     * 
     * @return timeCodeList
     */
    public com.workbrain.webservices.ta.WSTimeCode[] getTimeCodeList() {
        return timeCodeList;
    }


    /**
     * Sets the timeCodeList value for this WSTimeAndAttendanceData.
     * 
     * @param timeCodeList
     */
    public void setTimeCodeList(com.workbrain.webservices.ta.WSTimeCode[] timeCodeList) {
        this.timeCodeList = timeCodeList;
    }


    /**
     * Gets the totalPages value for this WSTimeAndAttendanceData.
     * 
     * @return totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this WSTimeAndAttendanceData.
     * 
     * @param totalPages
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the workDetailList value for this WSTimeAndAttendanceData.
     * 
     * @return workDetailList
     */
    public com.workbrain.webservices.ta.WSWorkDetail[] getWorkDetailList() {
        return workDetailList;
    }


    /**
     * Sets the workDetailList value for this WSTimeAndAttendanceData.
     * 
     * @param workDetailList
     */
    public void setWorkDetailList(com.workbrain.webservices.ta.WSWorkDetail[] workDetailList) {
        this.workDetailList = workDetailList;
    }


    /**
     * Gets the workDetailOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return workDetailOverrideList
     */
    public com.workbrain.webservices.ta.WSWorkDetailOverride[] getWorkDetailOverrideList() {
        return workDetailOverrideList;
    }


    /**
     * Sets the workDetailOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param workDetailOverrideList
     */
    public void setWorkDetailOverrideList(com.workbrain.webservices.ta.WSWorkDetailOverride[] workDetailOverrideList) {
        this.workDetailOverrideList = workDetailOverrideList;
    }


    /**
     * Gets the workPremiumOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return workPremiumOverrideList
     */
    public com.workbrain.webservices.ta.WSWorkPremiumOverride[] getWorkPremiumOverrideList() {
        return workPremiumOverrideList;
    }


    /**
     * Sets the workPremiumOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param workPremiumOverrideList
     */
    public void setWorkPremiumOverrideList(com.workbrain.webservices.ta.WSWorkPremiumOverride[] workPremiumOverrideList) {
        this.workPremiumOverrideList = workPremiumOverrideList;
    }


    /**
     * Gets the workSummaryList value for this WSTimeAndAttendanceData.
     * 
     * @return workSummaryList
     */
    public com.workbrain.webservices.ta.WSWorkSummary[] getWorkSummaryList() {
        return workSummaryList;
    }


    /**
     * Sets the workSummaryList value for this WSTimeAndAttendanceData.
     * 
     * @param workSummaryList
     */
    public void setWorkSummaryList(com.workbrain.webservices.ta.WSWorkSummary[] workSummaryList) {
        this.workSummaryList = workSummaryList;
    }


    /**
     * Gets the workSummaryOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @return workSummaryOverrideList
     */
    public com.workbrain.webservices.ta.WSWorkSummaryOverride[] getWorkSummaryOverrideList() {
        return workSummaryOverrideList;
    }


    /**
     * Sets the workSummaryOverrideList value for this WSTimeAndAttendanceData.
     * 
     * @param workSummaryOverrideList
     */
    public void setWorkSummaryOverrideList(com.workbrain.webservices.ta.WSWorkSummaryOverride[] workSummaryOverrideList) {
        this.workSummaryOverrideList = workSummaryOverrideList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSTimeAndAttendanceData)) return false;
        WSTimeAndAttendanceData other = (WSTimeAndAttendanceData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alternateOverrideList==null && other.getAlternateOverrideList()==null) || 
             (this.alternateOverrideList!=null &&
              java.util.Arrays.equals(this.alternateOverrideList, other.getAlternateOverrideList()))) &&
            ((this.calcGroupList==null && other.getCalcGroupList()==null) || 
             (this.calcGroupList!=null &&
              java.util.Arrays.equals(this.calcGroupList, other.getCalcGroupList()))) &&
            this.calculateRecs == other.isCalculateRecs() &&
            this.createDefaultRecord == other.isCreateDefaultRecord() &&
            this.currentPage == other.getCurrentPage() &&
            ((this.departmentList==null && other.getDepartmentList()==null) || 
             (this.departmentList!=null &&
              java.util.Arrays.equals(this.departmentList, other.getDepartmentList()))) &&
            ((this.docketList==null && other.getDocketList()==null) || 
             (this.docketList!=null &&
              java.util.Arrays.equals(this.docketList, other.getDocketList()))) &&
            ((this.elapsedTimeOverrideList==null && other.getElapsedTimeOverrideList()==null) || 
             (this.elapsedTimeOverrideList!=null &&
              java.util.Arrays.equals(this.elapsedTimeOverrideList, other.getElapsedTimeOverrideList()))) &&
            ((this.employeeBalanceOverrideList==null && other.getEmployeeBalanceOverrideList()==null) || 
             (this.employeeBalanceOverrideList!=null &&
              java.util.Arrays.equals(this.employeeBalanceOverrideList, other.getEmployeeBalanceOverrideList()))) &&
            ((this.employeeDefaultLaborOverrideList==null && other.getEmployeeDefaultLaborOverrideList()==null) || 
             (this.employeeDefaultLaborOverrideList!=null &&
              java.util.Arrays.equals(this.employeeDefaultLaborOverrideList, other.getEmployeeDefaultLaborOverrideList()))) &&
            ((this.employeeList==null && other.getEmployeeList()==null) || 
             (this.employeeList!=null &&
              java.util.Arrays.equals(this.employeeList, other.getEmployeeList()))) &&
            ((this.employeeOverrideList==null && other.getEmployeeOverrideList()==null) || 
             (this.employeeOverrideList!=null &&
              java.util.Arrays.equals(this.employeeOverrideList, other.getEmployeeOverrideList()))) &&
            ((this.employeeScheduleList==null && other.getEmployeeScheduleList()==null) || 
             (this.employeeScheduleList!=null &&
              java.util.Arrays.equals(this.employeeScheduleList, other.getEmployeeScheduleList()))) &&
            ((this.employeeScheduleOverrideList==null && other.getEmployeeScheduleOverrideList()==null) || 
             (this.employeeScheduleOverrideList!=null &&
              java.util.Arrays.equals(this.employeeScheduleOverrideList, other.getEmployeeScheduleOverrideList()))) &&
            ((this.holidayOverrideList==null && other.getHolidayOverrideList()==null) || 
             (this.holidayOverrideList!=null &&
              java.util.Arrays.equals(this.holidayOverrideList, other.getHolidayOverrideList()))) &&
            ((this.hourTypeList==null && other.getHourTypeList()==null) || 
             (this.hourTypeList!=null &&
              java.util.Arrays.equals(this.hourTypeList, other.getHourTypeList()))) &&
            ((this.jobList==null && other.getJobList()==null) || 
             (this.jobList!=null &&
              java.util.Arrays.equals(this.jobList, other.getJobList()))) &&
            ((this.ltaOverrideList==null && other.getLtaOverrideList()==null) || 
             (this.ltaOverrideList!=null &&
              java.util.Arrays.equals(this.ltaOverrideList, other.getLtaOverrideList()))) &&
            ((this.overrideList==null && other.getOverrideList()==null) || 
             (this.overrideList!=null &&
              java.util.Arrays.equals(this.overrideList, other.getOverrideList()))) &&
            ((this.overrideTypeList==null && other.getOverrideTypeList()==null) || 
             (this.overrideTypeList!=null &&
              java.util.Arrays.equals(this.overrideTypeList, other.getOverrideTypeList()))) &&
            ((this.payGroupList==null && other.getPayGroupList()==null) || 
             (this.payGroupList!=null &&
              java.util.Arrays.equals(this.payGroupList, other.getPayGroupList()))) &&
            ((this.projectList==null && other.getProjectList()==null) || 
             (this.projectList!=null &&
              java.util.Arrays.equals(this.projectList, other.getProjectList()))) &&
            ((this.queryId==null && other.getQueryId()==null) || 
             (this.queryId!=null &&
              this.queryId.equals(other.getQueryId()))) &&
            ((this.shiftList==null && other.getShiftList()==null) || 
             (this.shiftList!=null &&
              java.util.Arrays.equals(this.shiftList, other.getShiftList()))) &&
            ((this.shiftPatternList==null && other.getShiftPatternList()==null) || 
             (this.shiftPatternList!=null &&
              java.util.Arrays.equals(this.shiftPatternList, other.getShiftPatternList()))) &&
            ((this.timeCodeList==null && other.getTimeCodeList()==null) || 
             (this.timeCodeList!=null &&
              java.util.Arrays.equals(this.timeCodeList, other.getTimeCodeList()))) &&
            this.totalPages == other.getTotalPages() &&
            ((this.workDetailList==null && other.getWorkDetailList()==null) || 
             (this.workDetailList!=null &&
              java.util.Arrays.equals(this.workDetailList, other.getWorkDetailList()))) &&
            ((this.workDetailOverrideList==null && other.getWorkDetailOverrideList()==null) || 
             (this.workDetailOverrideList!=null &&
              java.util.Arrays.equals(this.workDetailOverrideList, other.getWorkDetailOverrideList()))) &&
            ((this.workPremiumOverrideList==null && other.getWorkPremiumOverrideList()==null) || 
             (this.workPremiumOverrideList!=null &&
              java.util.Arrays.equals(this.workPremiumOverrideList, other.getWorkPremiumOverrideList()))) &&
            ((this.workSummaryList==null && other.getWorkSummaryList()==null) || 
             (this.workSummaryList!=null &&
              java.util.Arrays.equals(this.workSummaryList, other.getWorkSummaryList()))) &&
            ((this.workSummaryOverrideList==null && other.getWorkSummaryOverrideList()==null) || 
             (this.workSummaryOverrideList!=null &&
              java.util.Arrays.equals(this.workSummaryOverrideList, other.getWorkSummaryOverrideList())));
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
        if (getAlternateOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalcGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalcGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalcGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isCalculateRecs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCreateDefaultRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCurrentPage();
        if (getDepartmentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartmentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartmentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocketList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocketList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocketList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getElapsedTimeOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getElapsedTimeOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getElapsedTimeOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeBalanceOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeBalanceOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeBalanceOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeDefaultLaborOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeDefaultLaborOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeDefaultLaborOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeScheduleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeScheduleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeScheduleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeScheduleOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeScheduleOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeScheduleOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHolidayOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHolidayOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHolidayOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHourTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHourTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHourTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLtaOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLtaOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLtaOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideTypeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverrideTypeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverrideTypeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayGroupList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryId() != null) {
            _hashCode += getQueryId().hashCode();
        }
        if (getShiftList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShiftList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShiftList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShiftPatternList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShiftPatternList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShiftPatternList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeCodeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeCodeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeCodeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTotalPages();
        if (getWorkDetailList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkDetailList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkDetailList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkDetailOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkDetailOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkDetailOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkPremiumOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkPremiumOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkPremiumOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkSummaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkSummaryOverrideList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkSummaryOverrideList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkSummaryOverrideList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSTimeAndAttendanceData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeAndAttendanceData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSAlternateHolidayOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calcGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSCalcGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculateRecs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculateRecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDefaultRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDefaultRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDepartment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docketList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docketList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDocket"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elapsedTimeOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elapsedTimeOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSElapsedTimeOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeBalanceOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeBalanceOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalanceOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeDefaultLaborOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeDefaultLaborOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeDefaultLaborOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployee"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeScheduleList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeScheduleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeSchedule"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeScheduleOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "employeeScheduleOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holidayOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holidayOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeHolidayOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hourTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hourTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSHourType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSJob"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ltaOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ltaOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSLTAOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideTypeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideTypeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverrideType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSPayGroup"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSProject"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shiftList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shiftList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShift"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shiftPatternList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shiftPatternList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShiftPattern"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeCodeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeCodeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeCode"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDetailList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDetailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetail"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDetailOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workDetailOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetailOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workPremiumOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workPremiumOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkPremiumOverride"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummary"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workSummaryOverrideList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workSummaryOverrideList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummaryOverride"));
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
