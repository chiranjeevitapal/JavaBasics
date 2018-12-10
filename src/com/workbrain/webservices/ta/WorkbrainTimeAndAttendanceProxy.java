package com.workbrain.webservices.ta;

public class WorkbrainTimeAndAttendanceProxy implements com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType {
  private String _endpoint = null;
  private com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType workbrainTimeAndAttendance_PortType = null;
  
  public WorkbrainTimeAndAttendanceProxy() {
    _initWorkbrainTimeAndAttendanceProxy();
  }
  
  public WorkbrainTimeAndAttendanceProxy(String endpoint) {
    _endpoint = endpoint;
    _initWorkbrainTimeAndAttendanceProxy();
  }
  
  private void _initWorkbrainTimeAndAttendanceProxy() {
    try {
      workbrainTimeAndAttendance_PortType = (new com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_ServiceLocator()).getWorkbrainTimeAndAttendance();
      if (workbrainTimeAndAttendance_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)workbrainTimeAndAttendance_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)workbrainTimeAndAttendance_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (workbrainTimeAndAttendance_PortType != null)
      ((javax.xml.rpc.Stub)workbrainTimeAndAttendance_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType getWorkbrainTimeAndAttendance_PortType() {
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    return workbrainTimeAndAttendance_PortType;
  }
  
  public com.workbrain.webservices.ta.WSTimeAndAttendanceData executeQuery(com.workbrain.webservices.ta.WSQueryCriteria criteria) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    return workbrainTimeAndAttendance_PortType.executeQuery(criteria);
  }
  
  public void cancelOverride(long[] ids) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    workbrainTimeAndAttendance_PortType.cancelOverride(ids);
  }
  
  public void executeOverride(com.workbrain.webservices.ta.WSTimeAndAttendanceData overrides) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    workbrainTimeAndAttendance_PortType.executeOverride(overrides);
  }
  
  public com.workbrain.webservices.ta.WSTimeAndAttendanceData getPageQueryData(java.lang.String queryId, int pageNo) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    return workbrainTimeAndAttendance_PortType.getPageQueryData(queryId, pageNo);
  }
  
  public void doClock(com.workbrain.webservices.ta.WSClockPending[] clocks, int batchSize) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    workbrainTimeAndAttendance_PortType.doClock(clocks, batchSize);
  }
  
  public com.workbrain.webservices.ta.WSClock getLatestClock(java.lang.String empId, java.util.Calendar date) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    return workbrainTimeAndAttendance_PortType.getLatestClock(empId, date);
  }
  
  public com.workbrain.webservices.ta.WSClock getLatestClockWithFilter(java.lang.String empId, java.util.Calendar date, int lookBackHours, boolean includeUnProcessedClks, com.workbrain.webservices.ta.WSClock[] acceptClks, com.workbrain.webservices.ta.WSClock[] rejectClks, boolean mustMeetAllAccept, boolean mustMeetAllReject) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException{
    if (workbrainTimeAndAttendance_PortType == null)
      _initWorkbrainTimeAndAttendanceProxy();
    return workbrainTimeAndAttendance_PortType.getLatestClockWithFilter(empId, date, lookBackHours, includeUnProcessedClks, acceptClks, rejectClks, mustMeetAllAccept, mustMeetAllReject);
  }
  
  
}