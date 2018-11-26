/**
 * WSQueryCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WSQueryCriteria  implements java.io.Serializable {
    private java.lang.String authorizationType;

    private java.lang.String[] calcGroupIds;

    private java.lang.String[] calcGroupNames;

    private java.lang.String empFirstName;

    private java.lang.String[] empIds;

    private java.lang.String empLastName;

    private java.lang.String empName;

    private java.lang.String[] empNames;

    private java.util.Calendar endDate;

    private java.lang.String highEmpId;

    private java.lang.String includeSubTeams;

    private java.lang.String lowEmpId;

    private java.lang.String[] overrideStatus;

    private java.lang.String[] overrideTypeIds;

    private int pageNo;

    private int pageSize;

    private java.lang.String[] payGroupIds;

    private java.lang.String[] payGroupNames;

    private java.lang.String queryPeriod;

    private java.lang.String retrieveCalcGroupFlag;

    private java.lang.String retrieveDepartmentFlag;

    private java.lang.String retrieveDocketFlag;

    private java.lang.String retrieveEmployeeScheduleFlag;

    private java.lang.String retrieveEmployeesFlag;

    private java.lang.String retrieveHourTypeFlag;

    private java.lang.String retrieveJobFlag;

    private java.lang.String retrieveOverrideTypeFlag;

    private java.lang.String retrieveOverridesFlag;

    private java.lang.String retrievePayGroupFlag;

    private java.lang.String retrieveProjectFlag;

    private java.lang.String retrieveShiftFlag;

    private java.lang.String retrieveShiftPatternFlag;

    private java.lang.String retrieveTimeCodeFlag;

    private java.lang.String retrieveWorkDetailsFlag;

    private java.lang.String retrieveWorkSummaryFlag;

    private java.util.Calendar startDate;

    private java.lang.String[] teamIds;

    private java.lang.String[] teamNames;

    private boolean unProcessedClkInWrkSumary;

    private boolean useCurrentUserInRetrieval;

    private java.util.Calendar viewDate;

    private boolean applyOverride;

    public WSQueryCriteria() {
    }

    public WSQueryCriteria(
           java.lang.String authorizationType,
           java.lang.String[] calcGroupIds,
           java.lang.String[] calcGroupNames,
           java.lang.String empFirstName,
           java.lang.String[] empIds,
           java.lang.String empLastName,
           java.lang.String empName,
           java.lang.String[] empNames,
           java.util.Calendar endDate,
           java.lang.String highEmpId,
           java.lang.String includeSubTeams,
           java.lang.String lowEmpId,
           java.lang.String[] overrideStatus,
           java.lang.String[] overrideTypeIds,
           int pageNo,
           int pageSize,
           java.lang.String[] payGroupIds,
           java.lang.String[] payGroupNames,
           java.lang.String queryPeriod,
           java.lang.String retrieveCalcGroupFlag,
           java.lang.String retrieveDepartmentFlag,
           java.lang.String retrieveDocketFlag,
           java.lang.String retrieveEmployeeScheduleFlag,
           java.lang.String retrieveEmployeesFlag,
           java.lang.String retrieveHourTypeFlag,
           java.lang.String retrieveJobFlag,
           java.lang.String retrieveOverrideTypeFlag,
           java.lang.String retrieveOverridesFlag,
           java.lang.String retrievePayGroupFlag,
           java.lang.String retrieveProjectFlag,
           java.lang.String retrieveShiftFlag,
           java.lang.String retrieveShiftPatternFlag,
           java.lang.String retrieveTimeCodeFlag,
           java.lang.String retrieveWorkDetailsFlag,
           java.lang.String retrieveWorkSummaryFlag,
           java.util.Calendar startDate,
           java.lang.String[] teamIds,
           java.lang.String[] teamNames,
           boolean unProcessedClkInWrkSumary,
           boolean useCurrentUserInRetrieval,
           java.util.Calendar viewDate,
           boolean applyOverride) {
           this.authorizationType = authorizationType;
           this.calcGroupIds = calcGroupIds;
           this.calcGroupNames = calcGroupNames;
           this.empFirstName = empFirstName;
           this.empIds = empIds;
           this.empLastName = empLastName;
           this.empName = empName;
           this.empNames = empNames;
           this.endDate = endDate;
           this.highEmpId = highEmpId;
           this.includeSubTeams = includeSubTeams;
           this.lowEmpId = lowEmpId;
           this.overrideStatus = overrideStatus;
           this.overrideTypeIds = overrideTypeIds;
           this.pageNo = pageNo;
           this.pageSize = pageSize;
           this.payGroupIds = payGroupIds;
           this.payGroupNames = payGroupNames;
           this.queryPeriod = queryPeriod;
           this.retrieveCalcGroupFlag = retrieveCalcGroupFlag;
           this.retrieveDepartmentFlag = retrieveDepartmentFlag;
           this.retrieveDocketFlag = retrieveDocketFlag;
           this.retrieveEmployeeScheduleFlag = retrieveEmployeeScheduleFlag;
           this.retrieveEmployeesFlag = retrieveEmployeesFlag;
           this.retrieveHourTypeFlag = retrieveHourTypeFlag;
           this.retrieveJobFlag = retrieveJobFlag;
           this.retrieveOverrideTypeFlag = retrieveOverrideTypeFlag;
           this.retrieveOverridesFlag = retrieveOverridesFlag;
           this.retrievePayGroupFlag = retrievePayGroupFlag;
           this.retrieveProjectFlag = retrieveProjectFlag;
           this.retrieveShiftFlag = retrieveShiftFlag;
           this.retrieveShiftPatternFlag = retrieveShiftPatternFlag;
           this.retrieveTimeCodeFlag = retrieveTimeCodeFlag;
           this.retrieveWorkDetailsFlag = retrieveWorkDetailsFlag;
           this.retrieveWorkSummaryFlag = retrieveWorkSummaryFlag;
           this.startDate = startDate;
           this.teamIds = teamIds;
           this.teamNames = teamNames;
           this.unProcessedClkInWrkSumary = unProcessedClkInWrkSumary;
           this.useCurrentUserInRetrieval = useCurrentUserInRetrieval;
           this.viewDate = viewDate;
           this.applyOverride = applyOverride;
    }


    /**
     * Gets the authorizationType value for this WSQueryCriteria.
     * 
     * @return authorizationType
     */
    public java.lang.String getAuthorizationType() {
        return authorizationType;
    }


    /**
     * Sets the authorizationType value for this WSQueryCriteria.
     * 
     * @param authorizationType
     */
    public void setAuthorizationType(java.lang.String authorizationType) {
        this.authorizationType = authorizationType;
    }


    /**
     * Gets the calcGroupIds value for this WSQueryCriteria.
     * 
     * @return calcGroupIds
     */
    public java.lang.String[] getCalcGroupIds() {
        return calcGroupIds;
    }


    /**
     * Sets the calcGroupIds value for this WSQueryCriteria.
     * 
     * @param calcGroupIds
     */
    public void setCalcGroupIds(java.lang.String[] calcGroupIds) {
        this.calcGroupIds = calcGroupIds;
    }


    /**
     * Gets the calcGroupNames value for this WSQueryCriteria.
     * 
     * @return calcGroupNames
     */
    public java.lang.String[] getCalcGroupNames() {
        return calcGroupNames;
    }


    /**
     * Sets the calcGroupNames value for this WSQueryCriteria.
     * 
     * @param calcGroupNames
     */
    public void setCalcGroupNames(java.lang.String[] calcGroupNames) {
        this.calcGroupNames = calcGroupNames;
    }


    /**
     * Gets the empFirstName value for this WSQueryCriteria.
     * 
     * @return empFirstName
     */
    public java.lang.String getEmpFirstName() {
        return empFirstName;
    }


    /**
     * Sets the empFirstName value for this WSQueryCriteria.
     * 
     * @param empFirstName
     */
    public void setEmpFirstName(java.lang.String empFirstName) {
        this.empFirstName = empFirstName;
    }


    /**
     * Gets the empIds value for this WSQueryCriteria.
     * 
     * @return empIds
     */
    public java.lang.String[] getEmpIds() {
        return empIds;
    }


    /**
     * Sets the empIds value for this WSQueryCriteria.
     * 
     * @param empIds
     */
    public void setEmpIds(java.lang.String[] empIds) {
        this.empIds = empIds;
    }


    /**
     * Gets the empLastName value for this WSQueryCriteria.
     * 
     * @return empLastName
     */
    public java.lang.String getEmpLastName() {
        return empLastName;
    }


    /**
     * Sets the empLastName value for this WSQueryCriteria.
     * 
     * @param empLastName
     */
    public void setEmpLastName(java.lang.String empLastName) {
        this.empLastName = empLastName;
    }


    /**
     * Gets the empName value for this WSQueryCriteria.
     * 
     * @return empName
     */
    public java.lang.String getEmpName() {
        return empName;
    }


    /**
     * Sets the empName value for this WSQueryCriteria.
     * 
     * @param empName
     */
    public void setEmpName(java.lang.String empName) {
        this.empName = empName;
    }


    /**
     * Gets the empNames value for this WSQueryCriteria.
     * 
     * @return empNames
     */
    public java.lang.String[] getEmpNames() {
        return empNames;
    }


    /**
     * Sets the empNames value for this WSQueryCriteria.
     * 
     * @param empNames
     */
    public void setEmpNames(java.lang.String[] empNames) {
        this.empNames = empNames;
    }


    /**
     * Gets the endDate value for this WSQueryCriteria.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WSQueryCriteria.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the highEmpId value for this WSQueryCriteria.
     * 
     * @return highEmpId
     */
    public java.lang.String getHighEmpId() {
        return highEmpId;
    }


    /**
     * Sets the highEmpId value for this WSQueryCriteria.
     * 
     * @param highEmpId
     */
    public void setHighEmpId(java.lang.String highEmpId) {
        this.highEmpId = highEmpId;
    }


    /**
     * Gets the includeSubTeams value for this WSQueryCriteria.
     * 
     * @return includeSubTeams
     */
    public java.lang.String getIncludeSubTeams() {
        return includeSubTeams;
    }


    /**
     * Sets the includeSubTeams value for this WSQueryCriteria.
     * 
     * @param includeSubTeams
     */
    public void setIncludeSubTeams(java.lang.String includeSubTeams) {
        this.includeSubTeams = includeSubTeams;
    }


    /**
     * Gets the lowEmpId value for this WSQueryCriteria.
     * 
     * @return lowEmpId
     */
    public java.lang.String getLowEmpId() {
        return lowEmpId;
    }


    /**
     * Sets the lowEmpId value for this WSQueryCriteria.
     * 
     * @param lowEmpId
     */
    public void setLowEmpId(java.lang.String lowEmpId) {
        this.lowEmpId = lowEmpId;
    }


    /**
     * Gets the overrideStatus value for this WSQueryCriteria.
     * 
     * @return overrideStatus
     */
    public java.lang.String[] getOverrideStatus() {
        return overrideStatus;
    }


    /**
     * Sets the overrideStatus value for this WSQueryCriteria.
     * 
     * @param overrideStatus
     */
    public void setOverrideStatus(java.lang.String[] overrideStatus) {
        this.overrideStatus = overrideStatus;
    }


    /**
     * Gets the overrideTypeIds value for this WSQueryCriteria.
     * 
     * @return overrideTypeIds
     */
    public java.lang.String[] getOverrideTypeIds() {
        return overrideTypeIds;
    }


    /**
     * Sets the overrideTypeIds value for this WSQueryCriteria.
     * 
     * @param overrideTypeIds
     */
    public void setOverrideTypeIds(java.lang.String[] overrideTypeIds) {
        this.overrideTypeIds = overrideTypeIds;
    }


    /**
     * Gets the pageNo value for this WSQueryCriteria.
     * 
     * @return pageNo
     */
    public int getPageNo() {
        return pageNo;
    }


    /**
     * Sets the pageNo value for this WSQueryCriteria.
     * 
     * @param pageNo
     */
    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }


    /**
     * Gets the pageSize value for this WSQueryCriteria.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this WSQueryCriteria.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the payGroupIds value for this WSQueryCriteria.
     * 
     * @return payGroupIds
     */
    public java.lang.String[] getPayGroupIds() {
        return payGroupIds;
    }


    /**
     * Sets the payGroupIds value for this WSQueryCriteria.
     * 
     * @param payGroupIds
     */
    public void setPayGroupIds(java.lang.String[] payGroupIds) {
        this.payGroupIds = payGroupIds;
    }


    /**
     * Gets the payGroupNames value for this WSQueryCriteria.
     * 
     * @return payGroupNames
     */
    public java.lang.String[] getPayGroupNames() {
        return payGroupNames;
    }


    /**
     * Sets the payGroupNames value for this WSQueryCriteria.
     * 
     * @param payGroupNames
     */
    public void setPayGroupNames(java.lang.String[] payGroupNames) {
        this.payGroupNames = payGroupNames;
    }


    /**
     * Gets the queryPeriod value for this WSQueryCriteria.
     * 
     * @return queryPeriod
     */
    public java.lang.String getQueryPeriod() {
        return queryPeriod;
    }


    /**
     * Sets the queryPeriod value for this WSQueryCriteria.
     * 
     * @param queryPeriod
     */
    public void setQueryPeriod(java.lang.String queryPeriod) {
        this.queryPeriod = queryPeriod;
    }


    /**
     * Gets the retrieveCalcGroupFlag value for this WSQueryCriteria.
     * 
     * @return retrieveCalcGroupFlag
     */
    public java.lang.String getRetrieveCalcGroupFlag() {
        return retrieveCalcGroupFlag;
    }


    /**
     * Sets the retrieveCalcGroupFlag value for this WSQueryCriteria.
     * 
     * @param retrieveCalcGroupFlag
     */
    public void setRetrieveCalcGroupFlag(java.lang.String retrieveCalcGroupFlag) {
        this.retrieveCalcGroupFlag = retrieveCalcGroupFlag;
    }


    /**
     * Gets the retrieveDepartmentFlag value for this WSQueryCriteria.
     * 
     * @return retrieveDepartmentFlag
     */
    public java.lang.String getRetrieveDepartmentFlag() {
        return retrieveDepartmentFlag;
    }


    /**
     * Sets the retrieveDepartmentFlag value for this WSQueryCriteria.
     * 
     * @param retrieveDepartmentFlag
     */
    public void setRetrieveDepartmentFlag(java.lang.String retrieveDepartmentFlag) {
        this.retrieveDepartmentFlag = retrieveDepartmentFlag;
    }


    /**
     * Gets the retrieveDocketFlag value for this WSQueryCriteria.
     * 
     * @return retrieveDocketFlag
     */
    public java.lang.String getRetrieveDocketFlag() {
        return retrieveDocketFlag;
    }


    /**
     * Sets the retrieveDocketFlag value for this WSQueryCriteria.
     * 
     * @param retrieveDocketFlag
     */
    public void setRetrieveDocketFlag(java.lang.String retrieveDocketFlag) {
        this.retrieveDocketFlag = retrieveDocketFlag;
    }


    /**
     * Gets the retrieveEmployeeScheduleFlag value for this WSQueryCriteria.
     * 
     * @return retrieveEmployeeScheduleFlag
     */
    public java.lang.String getRetrieveEmployeeScheduleFlag() {
        return retrieveEmployeeScheduleFlag;
    }


    /**
     * Sets the retrieveEmployeeScheduleFlag value for this WSQueryCriteria.
     * 
     * @param retrieveEmployeeScheduleFlag
     */
    public void setRetrieveEmployeeScheduleFlag(java.lang.String retrieveEmployeeScheduleFlag) {
        this.retrieveEmployeeScheduleFlag = retrieveEmployeeScheduleFlag;
    }


    /**
     * Gets the retrieveEmployeesFlag value for this WSQueryCriteria.
     * 
     * @return retrieveEmployeesFlag
     */
    public java.lang.String getRetrieveEmployeesFlag() {
        return retrieveEmployeesFlag;
    }


    /**
     * Sets the retrieveEmployeesFlag value for this WSQueryCriteria.
     * 
     * @param retrieveEmployeesFlag
     */
    public void setRetrieveEmployeesFlag(java.lang.String retrieveEmployeesFlag) {
        this.retrieveEmployeesFlag = retrieveEmployeesFlag;
    }


    /**
     * Gets the retrieveHourTypeFlag value for this WSQueryCriteria.
     * 
     * @return retrieveHourTypeFlag
     */
    public java.lang.String getRetrieveHourTypeFlag() {
        return retrieveHourTypeFlag;
    }


    /**
     * Sets the retrieveHourTypeFlag value for this WSQueryCriteria.
     * 
     * @param retrieveHourTypeFlag
     */
    public void setRetrieveHourTypeFlag(java.lang.String retrieveHourTypeFlag) {
        this.retrieveHourTypeFlag = retrieveHourTypeFlag;
    }


    /**
     * Gets the retrieveJobFlag value for this WSQueryCriteria.
     * 
     * @return retrieveJobFlag
     */
    public java.lang.String getRetrieveJobFlag() {
        return retrieveJobFlag;
    }


    /**
     * Sets the retrieveJobFlag value for this WSQueryCriteria.
     * 
     * @param retrieveJobFlag
     */
    public void setRetrieveJobFlag(java.lang.String retrieveJobFlag) {
        this.retrieveJobFlag = retrieveJobFlag;
    }


    /**
     * Gets the retrieveOverrideTypeFlag value for this WSQueryCriteria.
     * 
     * @return retrieveOverrideTypeFlag
     */
    public java.lang.String getRetrieveOverrideTypeFlag() {
        return retrieveOverrideTypeFlag;
    }


    /**
     * Sets the retrieveOverrideTypeFlag value for this WSQueryCriteria.
     * 
     * @param retrieveOverrideTypeFlag
     */
    public void setRetrieveOverrideTypeFlag(java.lang.String retrieveOverrideTypeFlag) {
        this.retrieveOverrideTypeFlag = retrieveOverrideTypeFlag;
    }


    /**
     * Gets the retrieveOverridesFlag value for this WSQueryCriteria.
     * 
     * @return retrieveOverridesFlag
     */
    public java.lang.String getRetrieveOverridesFlag() {
        return retrieveOverridesFlag;
    }


    /**
     * Sets the retrieveOverridesFlag value for this WSQueryCriteria.
     * 
     * @param retrieveOverridesFlag
     */
    public void setRetrieveOverridesFlag(java.lang.String retrieveOverridesFlag) {
        this.retrieveOverridesFlag = retrieveOverridesFlag;
    }


    /**
     * Gets the retrievePayGroupFlag value for this WSQueryCriteria.
     * 
     * @return retrievePayGroupFlag
     */
    public java.lang.String getRetrievePayGroupFlag() {
        return retrievePayGroupFlag;
    }


    /**
     * Sets the retrievePayGroupFlag value for this WSQueryCriteria.
     * 
     * @param retrievePayGroupFlag
     */
    public void setRetrievePayGroupFlag(java.lang.String retrievePayGroupFlag) {
        this.retrievePayGroupFlag = retrievePayGroupFlag;
    }


    /**
     * Gets the retrieveProjectFlag value for this WSQueryCriteria.
     * 
     * @return retrieveProjectFlag
     */
    public java.lang.String getRetrieveProjectFlag() {
        return retrieveProjectFlag;
    }


    /**
     * Sets the retrieveProjectFlag value for this WSQueryCriteria.
     * 
     * @param retrieveProjectFlag
     */
    public void setRetrieveProjectFlag(java.lang.String retrieveProjectFlag) {
        this.retrieveProjectFlag = retrieveProjectFlag;
    }


    /**
     * Gets the retrieveShiftFlag value for this WSQueryCriteria.
     * 
     * @return retrieveShiftFlag
     */
    public java.lang.String getRetrieveShiftFlag() {
        return retrieveShiftFlag;
    }


    /**
     * Sets the retrieveShiftFlag value for this WSQueryCriteria.
     * 
     * @param retrieveShiftFlag
     */
    public void setRetrieveShiftFlag(java.lang.String retrieveShiftFlag) {
        this.retrieveShiftFlag = retrieveShiftFlag;
    }


    /**
     * Gets the retrieveShiftPatternFlag value for this WSQueryCriteria.
     * 
     * @return retrieveShiftPatternFlag
     */
    public java.lang.String getRetrieveShiftPatternFlag() {
        return retrieveShiftPatternFlag;
    }


    /**
     * Sets the retrieveShiftPatternFlag value for this WSQueryCriteria.
     * 
     * @param retrieveShiftPatternFlag
     */
    public void setRetrieveShiftPatternFlag(java.lang.String retrieveShiftPatternFlag) {
        this.retrieveShiftPatternFlag = retrieveShiftPatternFlag;
    }


    /**
     * Gets the retrieveTimeCodeFlag value for this WSQueryCriteria.
     * 
     * @return retrieveTimeCodeFlag
     */
    public java.lang.String getRetrieveTimeCodeFlag() {
        return retrieveTimeCodeFlag;
    }


    /**
     * Sets the retrieveTimeCodeFlag value for this WSQueryCriteria.
     * 
     * @param retrieveTimeCodeFlag
     */
    public void setRetrieveTimeCodeFlag(java.lang.String retrieveTimeCodeFlag) {
        this.retrieveTimeCodeFlag = retrieveTimeCodeFlag;
    }


    /**
     * Gets the retrieveWorkDetailsFlag value for this WSQueryCriteria.
     * 
     * @return retrieveWorkDetailsFlag
     */
    public java.lang.String getRetrieveWorkDetailsFlag() {
        return retrieveWorkDetailsFlag;
    }


    /**
     * Sets the retrieveWorkDetailsFlag value for this WSQueryCriteria.
     * 
     * @param retrieveWorkDetailsFlag
     */
    public void setRetrieveWorkDetailsFlag(java.lang.String retrieveWorkDetailsFlag) {
        this.retrieveWorkDetailsFlag = retrieveWorkDetailsFlag;
    }


    /**
     * Gets the retrieveWorkSummaryFlag value for this WSQueryCriteria.
     * 
     * @return retrieveWorkSummaryFlag
     */
    public java.lang.String getRetrieveWorkSummaryFlag() {
        return retrieveWorkSummaryFlag;
    }


    /**
     * Sets the retrieveWorkSummaryFlag value for this WSQueryCriteria.
     * 
     * @param retrieveWorkSummaryFlag
     */
    public void setRetrieveWorkSummaryFlag(java.lang.String retrieveWorkSummaryFlag) {
        this.retrieveWorkSummaryFlag = retrieveWorkSummaryFlag;
    }


    /**
     * Gets the startDate value for this WSQueryCriteria.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this WSQueryCriteria.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the teamIds value for this WSQueryCriteria.
     * 
     * @return teamIds
     */
    public java.lang.String[] getTeamIds() {
        return teamIds;
    }


    /**
     * Sets the teamIds value for this WSQueryCriteria.
     * 
     * @param teamIds
     */
    public void setTeamIds(java.lang.String[] teamIds) {
        this.teamIds = teamIds;
    }


    /**
     * Gets the teamNames value for this WSQueryCriteria.
     * 
     * @return teamNames
     */
    public java.lang.String[] getTeamNames() {
        return teamNames;
    }


    /**
     * Sets the teamNames value for this WSQueryCriteria.
     * 
     * @param teamNames
     */
    public void setTeamNames(java.lang.String[] teamNames) {
        this.teamNames = teamNames;
    }


    /**
     * Gets the unProcessedClkInWrkSumary value for this WSQueryCriteria.
     * 
     * @return unProcessedClkInWrkSumary
     */
    public boolean isUnProcessedClkInWrkSumary() {
        return unProcessedClkInWrkSumary;
    }


    /**
     * Sets the unProcessedClkInWrkSumary value for this WSQueryCriteria.
     * 
     * @param unProcessedClkInWrkSumary
     */
    public void setUnProcessedClkInWrkSumary(boolean unProcessedClkInWrkSumary) {
        this.unProcessedClkInWrkSumary = unProcessedClkInWrkSumary;
    }


    /**
     * Gets the useCurrentUserInRetrieval value for this WSQueryCriteria.
     * 
     * @return useCurrentUserInRetrieval
     */
    public boolean isUseCurrentUserInRetrieval() {
        return useCurrentUserInRetrieval;
    }


    /**
     * Sets the useCurrentUserInRetrieval value for this WSQueryCriteria.
     * 
     * @param useCurrentUserInRetrieval
     */
    public void setUseCurrentUserInRetrieval(boolean useCurrentUserInRetrieval) {
        this.useCurrentUserInRetrieval = useCurrentUserInRetrieval;
    }


    /**
     * Gets the viewDate value for this WSQueryCriteria.
     * 
     * @return viewDate
     */
    public java.util.Calendar getViewDate() {
        return viewDate;
    }


    /**
     * Sets the viewDate value for this WSQueryCriteria.
     * 
     * @param viewDate
     */
    public void setViewDate(java.util.Calendar viewDate) {
        this.viewDate = viewDate;
    }


    /**
     * Gets the applyOverride value for this WSQueryCriteria.
     * 
     * @return applyOverride
     */
    public boolean isApplyOverride() {
        return applyOverride;
    }


    /**
     * Sets the applyOverride value for this WSQueryCriteria.
     * 
     * @param applyOverride
     */
    public void setApplyOverride(boolean applyOverride) {
        this.applyOverride = applyOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WSQueryCriteria)) return false;
        WSQueryCriteria other = (WSQueryCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationType==null && other.getAuthorizationType()==null) || 
             (this.authorizationType!=null &&
              this.authorizationType.equals(other.getAuthorizationType()))) &&
            ((this.calcGroupIds==null && other.getCalcGroupIds()==null) || 
             (this.calcGroupIds!=null &&
              java.util.Arrays.equals(this.calcGroupIds, other.getCalcGroupIds()))) &&
            ((this.calcGroupNames==null && other.getCalcGroupNames()==null) || 
             (this.calcGroupNames!=null &&
              java.util.Arrays.equals(this.calcGroupNames, other.getCalcGroupNames()))) &&
            ((this.empFirstName==null && other.getEmpFirstName()==null) || 
             (this.empFirstName!=null &&
              this.empFirstName.equals(other.getEmpFirstName()))) &&
            ((this.empIds==null && other.getEmpIds()==null) || 
             (this.empIds!=null &&
              java.util.Arrays.equals(this.empIds, other.getEmpIds()))) &&
            ((this.empLastName==null && other.getEmpLastName()==null) || 
             (this.empLastName!=null &&
              this.empLastName.equals(other.getEmpLastName()))) &&
            ((this.empName==null && other.getEmpName()==null) || 
             (this.empName!=null &&
              this.empName.equals(other.getEmpName()))) &&
            ((this.empNames==null && other.getEmpNames()==null) || 
             (this.empNames!=null &&
              java.util.Arrays.equals(this.empNames, other.getEmpNames()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.highEmpId==null && other.getHighEmpId()==null) || 
             (this.highEmpId!=null &&
              this.highEmpId.equals(other.getHighEmpId()))) &&
            ((this.includeSubTeams==null && other.getIncludeSubTeams()==null) || 
             (this.includeSubTeams!=null &&
              this.includeSubTeams.equals(other.getIncludeSubTeams()))) &&
            ((this.lowEmpId==null && other.getLowEmpId()==null) || 
             (this.lowEmpId!=null &&
              this.lowEmpId.equals(other.getLowEmpId()))) &&
            ((this.overrideStatus==null && other.getOverrideStatus()==null) || 
             (this.overrideStatus!=null &&
              java.util.Arrays.equals(this.overrideStatus, other.getOverrideStatus()))) &&
            ((this.overrideTypeIds==null && other.getOverrideTypeIds()==null) || 
             (this.overrideTypeIds!=null &&
              java.util.Arrays.equals(this.overrideTypeIds, other.getOverrideTypeIds()))) &&
            this.pageNo == other.getPageNo() &&
            this.pageSize == other.getPageSize() &&
            ((this.payGroupIds==null && other.getPayGroupIds()==null) || 
             (this.payGroupIds!=null &&
              java.util.Arrays.equals(this.payGroupIds, other.getPayGroupIds()))) &&
            ((this.payGroupNames==null && other.getPayGroupNames()==null) || 
             (this.payGroupNames!=null &&
              java.util.Arrays.equals(this.payGroupNames, other.getPayGroupNames()))) &&
            ((this.queryPeriod==null && other.getQueryPeriod()==null) || 
             (this.queryPeriod!=null &&
              this.queryPeriod.equals(other.getQueryPeriod()))) &&
            ((this.retrieveCalcGroupFlag==null && other.getRetrieveCalcGroupFlag()==null) || 
             (this.retrieveCalcGroupFlag!=null &&
              this.retrieveCalcGroupFlag.equals(other.getRetrieveCalcGroupFlag()))) &&
            ((this.retrieveDepartmentFlag==null && other.getRetrieveDepartmentFlag()==null) || 
             (this.retrieveDepartmentFlag!=null &&
              this.retrieveDepartmentFlag.equals(other.getRetrieveDepartmentFlag()))) &&
            ((this.retrieveDocketFlag==null && other.getRetrieveDocketFlag()==null) || 
             (this.retrieveDocketFlag!=null &&
              this.retrieveDocketFlag.equals(other.getRetrieveDocketFlag()))) &&
            ((this.retrieveEmployeeScheduleFlag==null && other.getRetrieveEmployeeScheduleFlag()==null) || 
             (this.retrieveEmployeeScheduleFlag!=null &&
              this.retrieveEmployeeScheduleFlag.equals(other.getRetrieveEmployeeScheduleFlag()))) &&
            ((this.retrieveEmployeesFlag==null && other.getRetrieveEmployeesFlag()==null) || 
             (this.retrieveEmployeesFlag!=null &&
              this.retrieveEmployeesFlag.equals(other.getRetrieveEmployeesFlag()))) &&
            ((this.retrieveHourTypeFlag==null && other.getRetrieveHourTypeFlag()==null) || 
             (this.retrieveHourTypeFlag!=null &&
              this.retrieveHourTypeFlag.equals(other.getRetrieveHourTypeFlag()))) &&
            ((this.retrieveJobFlag==null && other.getRetrieveJobFlag()==null) || 
             (this.retrieveJobFlag!=null &&
              this.retrieveJobFlag.equals(other.getRetrieveJobFlag()))) &&
            ((this.retrieveOverrideTypeFlag==null && other.getRetrieveOverrideTypeFlag()==null) || 
             (this.retrieveOverrideTypeFlag!=null &&
              this.retrieveOverrideTypeFlag.equals(other.getRetrieveOverrideTypeFlag()))) &&
            ((this.retrieveOverridesFlag==null && other.getRetrieveOverridesFlag()==null) || 
             (this.retrieveOverridesFlag!=null &&
              this.retrieveOverridesFlag.equals(other.getRetrieveOverridesFlag()))) &&
            ((this.retrievePayGroupFlag==null && other.getRetrievePayGroupFlag()==null) || 
             (this.retrievePayGroupFlag!=null &&
              this.retrievePayGroupFlag.equals(other.getRetrievePayGroupFlag()))) &&
            ((this.retrieveProjectFlag==null && other.getRetrieveProjectFlag()==null) || 
             (this.retrieveProjectFlag!=null &&
              this.retrieveProjectFlag.equals(other.getRetrieveProjectFlag()))) &&
            ((this.retrieveShiftFlag==null && other.getRetrieveShiftFlag()==null) || 
             (this.retrieveShiftFlag!=null &&
              this.retrieveShiftFlag.equals(other.getRetrieveShiftFlag()))) &&
            ((this.retrieveShiftPatternFlag==null && other.getRetrieveShiftPatternFlag()==null) || 
             (this.retrieveShiftPatternFlag!=null &&
              this.retrieveShiftPatternFlag.equals(other.getRetrieveShiftPatternFlag()))) &&
            ((this.retrieveTimeCodeFlag==null && other.getRetrieveTimeCodeFlag()==null) || 
             (this.retrieveTimeCodeFlag!=null &&
              this.retrieveTimeCodeFlag.equals(other.getRetrieveTimeCodeFlag()))) &&
            ((this.retrieveWorkDetailsFlag==null && other.getRetrieveWorkDetailsFlag()==null) || 
             (this.retrieveWorkDetailsFlag!=null &&
              this.retrieveWorkDetailsFlag.equals(other.getRetrieveWorkDetailsFlag()))) &&
            ((this.retrieveWorkSummaryFlag==null && other.getRetrieveWorkSummaryFlag()==null) || 
             (this.retrieveWorkSummaryFlag!=null &&
              this.retrieveWorkSummaryFlag.equals(other.getRetrieveWorkSummaryFlag()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.teamIds==null && other.getTeamIds()==null) || 
             (this.teamIds!=null &&
              java.util.Arrays.equals(this.teamIds, other.getTeamIds()))) &&
            ((this.teamNames==null && other.getTeamNames()==null) || 
             (this.teamNames!=null &&
              java.util.Arrays.equals(this.teamNames, other.getTeamNames()))) &&
            this.unProcessedClkInWrkSumary == other.isUnProcessedClkInWrkSumary() &&
            this.useCurrentUserInRetrieval == other.isUseCurrentUserInRetrieval() &&
            ((this.viewDate==null && other.getViewDate()==null) || 
             (this.viewDate!=null &&
              this.viewDate.equals(other.getViewDate()))) &&
            this.applyOverride == other.isApplyOverride();
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
        if (getAuthorizationType() != null) {
            _hashCode += getAuthorizationType().hashCode();
        }
        if (getCalcGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalcGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalcGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalcGroupNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalcGroupNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalcGroupNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpFirstName() != null) {
            _hashCode += getEmpFirstName().hashCode();
        }
        if (getEmpIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpLastName() != null) {
            _hashCode += getEmpLastName().hashCode();
        }
        if (getEmpName() != null) {
            _hashCode += getEmpName().hashCode();
        }
        if (getEmpNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmpNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmpNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getHighEmpId() != null) {
            _hashCode += getHighEmpId().hashCode();
        }
        if (getIncludeSubTeams() != null) {
            _hashCode += getIncludeSubTeams().hashCode();
        }
        if (getLowEmpId() != null) {
            _hashCode += getLowEmpId().hashCode();
        }
        if (getOverrideStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverrideStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverrideStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideTypeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverrideTypeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverrideTypeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPageNo();
        _hashCode += getPageSize();
        if (getPayGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayGroupIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayGroupNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayGroupNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayGroupNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryPeriod() != null) {
            _hashCode += getQueryPeriod().hashCode();
        }
        if (getRetrieveCalcGroupFlag() != null) {
            _hashCode += getRetrieveCalcGroupFlag().hashCode();
        }
        if (getRetrieveDepartmentFlag() != null) {
            _hashCode += getRetrieveDepartmentFlag().hashCode();
        }
        if (getRetrieveDocketFlag() != null) {
            _hashCode += getRetrieveDocketFlag().hashCode();
        }
        if (getRetrieveEmployeeScheduleFlag() != null) {
            _hashCode += getRetrieveEmployeeScheduleFlag().hashCode();
        }
        if (getRetrieveEmployeesFlag() != null) {
            _hashCode += getRetrieveEmployeesFlag().hashCode();
        }
        if (getRetrieveHourTypeFlag() != null) {
            _hashCode += getRetrieveHourTypeFlag().hashCode();
        }
        if (getRetrieveJobFlag() != null) {
            _hashCode += getRetrieveJobFlag().hashCode();
        }
        if (getRetrieveOverrideTypeFlag() != null) {
            _hashCode += getRetrieveOverrideTypeFlag().hashCode();
        }
        if (getRetrieveOverridesFlag() != null) {
            _hashCode += getRetrieveOverridesFlag().hashCode();
        }
        if (getRetrievePayGroupFlag() != null) {
            _hashCode += getRetrievePayGroupFlag().hashCode();
        }
        if (getRetrieveProjectFlag() != null) {
            _hashCode += getRetrieveProjectFlag().hashCode();
        }
        if (getRetrieveShiftFlag() != null) {
            _hashCode += getRetrieveShiftFlag().hashCode();
        }
        if (getRetrieveShiftPatternFlag() != null) {
            _hashCode += getRetrieveShiftPatternFlag().hashCode();
        }
        if (getRetrieveTimeCodeFlag() != null) {
            _hashCode += getRetrieveTimeCodeFlag().hashCode();
        }
        if (getRetrieveWorkDetailsFlag() != null) {
            _hashCode += getRetrieveWorkDetailsFlag().hashCode();
        }
        if (getRetrieveWorkSummaryFlag() != null) {
            _hashCode += getRetrieveWorkSummaryFlag().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTeamNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTeamNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTeamNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isUnProcessedClkInWrkSumary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseCurrentUserInRetrieval() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getViewDate() != null) {
            _hashCode += getViewDate().hashCode();
        }
        _hashCode += (isApplyOverride() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WSQueryCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSQueryCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calcGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calcGroupNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calcGroupNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "empNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highEmpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highEmpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSubTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeSubTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lowEmpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lowEmpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideTypeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideTypeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payGroupNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payGroupNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queryPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveCalcGroupFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveCalcGroupFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveDepartmentFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveDepartmentFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveDocketFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveDocketFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveEmployeeScheduleFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveEmployeeScheduleFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveEmployeesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveEmployeesFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveHourTypeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveHourTypeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveJobFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveJobFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveOverrideTypeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveOverrideTypeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveOverridesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveOverridesFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrievePayGroupFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrievePayGroupFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveProjectFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveProjectFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveShiftFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveShiftFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveShiftPatternFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveShiftPatternFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveTimeCodeFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveTimeCodeFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveWorkDetailsFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveWorkDetailsFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrieveWorkSummaryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrieveWorkSummaryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamNames");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teamNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unProcessedClkInWrkSumary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unProcessedClkInWrkSumary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCurrentUserInRetrieval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useCurrentUserInRetrieval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applyOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
