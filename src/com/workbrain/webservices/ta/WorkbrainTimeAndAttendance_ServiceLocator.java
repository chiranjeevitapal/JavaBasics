/**
 * WorkbrainTimeAndAttendance_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WorkbrainTimeAndAttendance_ServiceLocator extends org.apache.axis.client.Service implements com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_Service {

    public WorkbrainTimeAndAttendance_ServiceLocator() {
    }


    public WorkbrainTimeAndAttendance_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WorkbrainTimeAndAttendance_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkbrainTimeAndAttendance
    private java.lang.String WorkbrainTimeAndAttendance_address = "http://10.53.128.177:8090/axis/services/WorkbrainTimeAndAttendance";

    public java.lang.String getWorkbrainTimeAndAttendanceAddress() {
        return WorkbrainTimeAndAttendance_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkbrainTimeAndAttendanceWSDDServiceName = "WorkbrainTimeAndAttendance";

    public java.lang.String getWorkbrainTimeAndAttendanceWSDDServiceName() {
        return WorkbrainTimeAndAttendanceWSDDServiceName;
    }

    public void setWorkbrainTimeAndAttendanceWSDDServiceName(java.lang.String name) {
        WorkbrainTimeAndAttendanceWSDDServiceName = name;
    }

    public com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType getWorkbrainTimeAndAttendance() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkbrainTimeAndAttendance_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkbrainTimeAndAttendance(endpoint);
    }

    public com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType getWorkbrainTimeAndAttendance(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.workbrain.webservices.ta.WorkbrainTimeAndAttendanceSoapBindingStub _stub = new com.workbrain.webservices.ta.WorkbrainTimeAndAttendanceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkbrainTimeAndAttendanceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkbrainTimeAndAttendanceEndpointAddress(java.lang.String address) {
        WorkbrainTimeAndAttendance_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.workbrain.webservices.ta.WorkbrainTimeAndAttendanceSoapBindingStub _stub = new com.workbrain.webservices.ta.WorkbrainTimeAndAttendanceSoapBindingStub(new java.net.URL(WorkbrainTimeAndAttendance_address), this);
                _stub.setPortName(getWorkbrainTimeAndAttendanceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkbrainTimeAndAttendance".equals(inputPortName)) {
            return getWorkbrainTimeAndAttendance();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WorkbrainTimeAndAttendance");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WorkbrainTimeAndAttendance"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkbrainTimeAndAttendance".equals(portName)) {
            setWorkbrainTimeAndAttendanceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
