/**
 * WorkbrainTimeAndAttendanceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.workbrain.webservices.ta;

public class WorkbrainTimeAndAttendanceSoapBindingStub extends org.apache.axis.client.Stub implements com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[7];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSQueryCriteria"), com.workbrain.webservices.ta.WSQueryCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeAndAttendanceData"));
        oper.setReturnClass(com.workbrain.webservices.ta.WSTimeAndAttendanceData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "executeQueryReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelOverride");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOf_xsd_long"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeOverride");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "overrides"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeAndAttendanceData"), com.workbrain.webservices.ta.WSTimeAndAttendanceData.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPageQueryData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeAndAttendanceData"));
        oper.setReturnClass(com.workbrain.webservices.ta.WSTimeAndAttendanceData.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getPageQueryDataReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doClock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "clocks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSClockPending"), com.workbrain.webservices.ta.WSClockPending[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "batchSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLatestClock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "empId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock"));
        oper.setReturnClass(com.workbrain.webservices.ta.WSClock.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLatestClockReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLatestClockWithFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "empId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "lookBackHours"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "includeUnProcessedClks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "acceptClks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSClock"), com.workbrain.webservices.ta.WSClock[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rejectClks"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSClock"), com.workbrain.webservices.ta.WSClock[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mustMeetAllAccept"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mustMeetAllReject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock"));
        oper.setReturnClass(com.workbrain.webservices.ta.WSClock.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLatestClockWithFilterReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "fault"),
                      "com.workbrain.webservices.exception.WSApplicationException",
                      new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException"), 
                      true
                     ));
        _operations[6] = oper;

    }

    public WorkbrainTimeAndAttendanceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public WorkbrainTimeAndAttendanceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public WorkbrainTimeAndAttendanceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://exception.webservices.workbrain.com", "WSApplicationException");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.exception.WSApplicationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOf_xsd_long");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSAlternateHolidayOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSAlternateHolidayOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSAlternateHolidayOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSCalcGroup");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSCalcGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSCalcGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSClock");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSClock[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSClockPending");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSClockPending[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClockPending");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSDepartment");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSDepartment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDepartment");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSDocket");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSDocket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDocket");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSElapsedTimeOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSElapsedTimeOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSElapsedTimeOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployee");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployee[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployee");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeBalanceOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeBalanceOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalanceOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeDefaultLaborOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeDefaultLaborOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeHolidayOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeHolidayOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeHolidayOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeSchedule");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeSchedule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeSchedule");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeScheduleBreak");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeScheduleBreak[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSEmployeeScheduleOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeScheduleOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSHourType");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSHourType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSHourType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSJob");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSJob");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSLTAOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSLTAOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSLTAOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSNameValue");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSNameValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSNameValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSOverrideType");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSOverrideType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverrideType");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSPayGroup");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSPayGroup[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSPayGroup");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSProject");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSProject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSProject");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSShift");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSShift[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShift");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSShiftPattern");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSShiftPattern[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShiftPattern");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSTimeCode");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSTimeCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeCode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSWorkDetail");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetail");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSWorkDetailOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkDetailOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetailOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSWorkPremiumOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkPremiumOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkPremiumOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSWorkSummary");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummary");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "ArrayOfWSWorkSummaryOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkSummaryOverride[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummaryOverride");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSAlternateHolidayOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSAlternateHolidayOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSCalcGroup");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSCalcGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClock");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSClock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSClockPending");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSClockPending.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDepartment");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSDepartment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSDocket");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSDocket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSElapsedTimeOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSElapsedTimeOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployee");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalance");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeBalance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeBalanceOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeBalanceOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeDefaultLabor");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeDefaultLabor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeDefaultLaborOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeHolidayOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeHolidayOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeSchedule");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeSchedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleBreak");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeScheduleBreak.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSEmployeeScheduleOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSEmployeeScheduleOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSHoliday");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSHoliday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSHourType");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSHourType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSJob");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSLTAOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSLTAOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSNameValue");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSNameValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSOverrideType");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSOverrideType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSPayGroup");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSPayGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSProject");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSProject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSQueryCriteria");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSQueryCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShift");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSShift.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSShiftPattern");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSShiftPattern.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeAndAttendanceData");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSTimeAndAttendanceData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSTimeCode");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSTimeCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetail");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkDetailOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkDetailOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkPremiumOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkPremiumOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummary");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "WSWorkSummaryOverride");
            cachedSerQNames.add(qName);
            cls = com.workbrain.webservices.ta.WSWorkSummaryOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.workbrain.webservices.ta.WSTimeAndAttendanceData executeQuery(com.workbrain.webservices.ta.WSQueryCriteria criteria) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "executeQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.workbrain.webservices.ta.WSTimeAndAttendanceData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.workbrain.webservices.ta.WSTimeAndAttendanceData) org.apache.axis.utils.JavaUtils.convert(_resp, com.workbrain.webservices.ta.WSTimeAndAttendanceData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void cancelOverride(long[] ids) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "cancelOverride"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ids});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void executeOverride(com.workbrain.webservices.ta.WSTimeAndAttendanceData overrides) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "executeOverride"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {overrides});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.workbrain.webservices.ta.WSTimeAndAttendanceData getPageQueryData(java.lang.String queryId, int pageNo) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "getPageQueryData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryId, new java.lang.Integer(pageNo)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.workbrain.webservices.ta.WSTimeAndAttendanceData) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.workbrain.webservices.ta.WSTimeAndAttendanceData) org.apache.axis.utils.JavaUtils.convert(_resp, com.workbrain.webservices.ta.WSTimeAndAttendanceData.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void doClock(com.workbrain.webservices.ta.WSClockPending[] clocks, int batchSize) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "doClock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {clocks, new java.lang.Integer(batchSize)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.workbrain.webservices.ta.WSClock getLatestClock(java.lang.String empId, java.util.Calendar date) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "getLatestClock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {empId, date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.workbrain.webservices.ta.WSClock) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.workbrain.webservices.ta.WSClock) org.apache.axis.utils.JavaUtils.convert(_resp, com.workbrain.webservices.ta.WSClock.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.workbrain.webservices.ta.WSClock getLatestClockWithFilter(java.lang.String empId, java.util.Calendar date, int lookBackHours, boolean includeUnProcessedClks, com.workbrain.webservices.ta.WSClock[] acceptClks, com.workbrain.webservices.ta.WSClock[] rejectClks, boolean mustMeetAllAccept, boolean mustMeetAllReject) throws java.rmi.RemoteException, com.workbrain.webservices.exception.WSApplicationException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ta.webservices.workbrain.com", "getLatestClockWithFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {empId, date, new java.lang.Integer(lookBackHours), new java.lang.Boolean(includeUnProcessedClks), acceptClks, rejectClks, new java.lang.Boolean(mustMeetAllAccept), new java.lang.Boolean(mustMeetAllReject)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.workbrain.webservices.ta.WSClock) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.workbrain.webservices.ta.WSClock) org.apache.axis.utils.JavaUtils.convert(_resp, com.workbrain.webservices.ta.WSClock.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.workbrain.webservices.exception.WSApplicationException) {
              throw (com.workbrain.webservices.exception.WSApplicationException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
