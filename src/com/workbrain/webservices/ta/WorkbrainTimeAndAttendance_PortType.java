/**
 * WorkbrainTimeAndAttendance_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public interface WorkbrainTimeAndAttendance_PortType extends java.rmi.Remote {
    public com.workbrain.webservices.ta.WSTimeAndAttendanceData executeQuery(com.workbrain.webservices.ta.WSQueryCriteria criteria) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public void cancelOverride(long[] ids) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public void executeOverride(com.workbrain.webservices.ta.WSTimeAndAttendanceData overrides) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public com.workbrain.webservices.ta.WSTimeAndAttendanceData getPageQueryData(java.lang.String queryId, int pageNo) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public void doClock(com.workbrain.webservices.ta.WSClockPending[] clocks, int batchSize) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public com.workbrain.webservices.ta.WSClock getLatestClock(java.lang.String empId, java.util.Calendar date) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
    public com.workbrain.webservices.ta.WSClock getLatestClockWithFilter(java.lang.String empId, java.util.Calendar date, int lookBackHours, boolean includeUnProcessedClks, com.workbrain.webservices.ta.WSClock[] acceptClks, com.workbrain.webservices.ta.WSClock[] rejectClks, boolean mustMeetAllAccept, boolean mustMeetAllReject) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException;
}
