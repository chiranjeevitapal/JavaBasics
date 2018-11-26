<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWorkbrainTimeAndAttendanceProxyid" scope="session" class="com.workbrain.webservices.ta.WorkbrainTimeAndAttendanceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWorkbrainTimeAndAttendanceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWorkbrainTimeAndAttendanceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleWorkbrainTimeAndAttendanceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.workbrain.webservices.ta.WorkbrainTimeAndAttendance_PortType getWorkbrainTimeAndAttendance_PortType10mtemp = sampleWorkbrainTimeAndAttendanceProxyid.getWorkbrainTimeAndAttendance_PortType();
if(getWorkbrainTimeAndAttendance_PortType10mtemp == null){
%>
<%=getWorkbrainTimeAndAttendance_PortType10mtemp %>
<%
}else{
        if(getWorkbrainTimeAndAttendance_PortType10mtemp!= null){
        String tempreturnp11 = getWorkbrainTimeAndAttendance_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String empName_2id=  request.getParameter("empName82");
            java.lang.String empName_2idTemp = null;
        if(!empName_2id.equals("")){
         empName_2idTemp  = empName_2id;
        }
        String retrievePayGroupFlag_3id=  request.getParameter("retrievePayGroupFlag84");
            java.lang.String retrievePayGroupFlag_3idTemp = null;
        if(!retrievePayGroupFlag_3id.equals("")){
         retrievePayGroupFlag_3idTemp  = retrievePayGroupFlag_3id;
        }
        String retrieveDepartmentFlag_4id=  request.getParameter("retrieveDepartmentFlag86");
            java.lang.String retrieveDepartmentFlag_4idTemp = null;
        if(!retrieveDepartmentFlag_4id.equals("")){
         retrieveDepartmentFlag_4idTemp  = retrieveDepartmentFlag_4id;
        }
        String retrieveDocketFlag_5id=  request.getParameter("retrieveDocketFlag88");
            java.lang.String retrieveDocketFlag_5idTemp = null;
        if(!retrieveDocketFlag_5id.equals("")){
         retrieveDocketFlag_5idTemp  = retrieveDocketFlag_5id;
        }
        String lowEmpId_6id=  request.getParameter("lowEmpId90");
            java.lang.String lowEmpId_6idTemp = null;
        if(!lowEmpId_6id.equals("")){
         lowEmpId_6idTemp  = lowEmpId_6id;
        }
        String startDate_7id=  request.getParameter("startDate92");
            java.util.Calendar startDate_7idTemp = null;
        if(!startDate_7id.equals("")){
        java.text.DateFormat dateFormatstartDate92 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempstartDate92  = dateFormatstartDate92.parse(startDate_7id);
         startDate_7idTemp = new java.util.GregorianCalendar();
        startDate_7idTemp.setTime(dateTempstartDate92);
        }
        String retrieveWorkSummaryFlag_8id=  request.getParameter("retrieveWorkSummaryFlag94");
            java.lang.String retrieveWorkSummaryFlag_8idTemp = null;
        if(!retrieveWorkSummaryFlag_8id.equals("")){
         retrieveWorkSummaryFlag_8idTemp  = retrieveWorkSummaryFlag_8id;
        }
        String pageNo_9id=  request.getParameter("pageNo96");
        int pageNo_9idTemp  = Integer.parseInt(pageNo_9id);
        String retrieveJobFlag_10id=  request.getParameter("retrieveJobFlag98");
            java.lang.String retrieveJobFlag_10idTemp = null;
        if(!retrieveJobFlag_10id.equals("")){
         retrieveJobFlag_10idTemp  = retrieveJobFlag_10id;
        }
        String retrieveProjectFlag_11id=  request.getParameter("retrieveProjectFlag100");
            java.lang.String retrieveProjectFlag_11idTemp = null;
        if(!retrieveProjectFlag_11id.equals("")){
         retrieveProjectFlag_11idTemp  = retrieveProjectFlag_11id;
        }
        String useCurrentUserInRetrieval_12id=  request.getParameter("useCurrentUserInRetrieval102");
        boolean useCurrentUserInRetrieval_12idTemp  = Boolean.valueOf(useCurrentUserInRetrieval_12id).booleanValue();
        String empFirstName_13id=  request.getParameter("empFirstName104");
            java.lang.String empFirstName_13idTemp = null;
        if(!empFirstName_13id.equals("")){
         empFirstName_13idTemp  = empFirstName_13id;
        }
        String empLastName_14id=  request.getParameter("empLastName106");
            java.lang.String empLastName_14idTemp = null;
        if(!empLastName_14id.equals("")){
         empLastName_14idTemp  = empLastName_14id;
        }
        String retrieveShiftPatternFlag_15id=  request.getParameter("retrieveShiftPatternFlag108");
            java.lang.String retrieveShiftPatternFlag_15idTemp = null;
        if(!retrieveShiftPatternFlag_15id.equals("")){
         retrieveShiftPatternFlag_15idTemp  = retrieveShiftPatternFlag_15id;
        }
        String endDate_16id=  request.getParameter("endDate110");
            java.util.Calendar endDate_16idTemp = null;
        if(!endDate_16id.equals("")){
        java.text.DateFormat dateFormatendDate110 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempendDate110  = dateFormatendDate110.parse(endDate_16id);
         endDate_16idTemp = new java.util.GregorianCalendar();
        endDate_16idTemp.setTime(dateTempendDate110);
        }
        String highEmpId_17id=  request.getParameter("highEmpId112");
            java.lang.String highEmpId_17idTemp = null;
        if(!highEmpId_17id.equals("")){
         highEmpId_17idTemp  = highEmpId_17id;
        }
        String retrieveHourTypeFlag_18id=  request.getParameter("retrieveHourTypeFlag114");
            java.lang.String retrieveHourTypeFlag_18idTemp = null;
        if(!retrieveHourTypeFlag_18id.equals("")){
         retrieveHourTypeFlag_18idTemp  = retrieveHourTypeFlag_18id;
        }
        String retrieveEmployeeScheduleFlag_19id=  request.getParameter("retrieveEmployeeScheduleFlag116");
            java.lang.String retrieveEmployeeScheduleFlag_19idTemp = null;
        if(!retrieveEmployeeScheduleFlag_19id.equals("")){
         retrieveEmployeeScheduleFlag_19idTemp  = retrieveEmployeeScheduleFlag_19id;
        }
        String retrieveTimeCodeFlag_20id=  request.getParameter("retrieveTimeCodeFlag118");
            java.lang.String retrieveTimeCodeFlag_20idTemp = null;
        if(!retrieveTimeCodeFlag_20id.equals("")){
         retrieveTimeCodeFlag_20idTemp  = retrieveTimeCodeFlag_20id;
        }
        String pageSize_21id=  request.getParameter("pageSize120");
        int pageSize_21idTemp  = Integer.parseInt(pageSize_21id);
        String applyOverride_22id=  request.getParameter("applyOverride122");
        boolean applyOverride_22idTemp  = Boolean.valueOf(applyOverride_22id).booleanValue();
        String retrieveEmployeesFlag_23id=  request.getParameter("retrieveEmployeesFlag124");
            java.lang.String retrieveEmployeesFlag_23idTemp = null;
        if(!retrieveEmployeesFlag_23id.equals("")){
         retrieveEmployeesFlag_23idTemp  = retrieveEmployeesFlag_23id;
        }
        String retrieveCalcGroupFlag_24id=  request.getParameter("retrieveCalcGroupFlag126");
            java.lang.String retrieveCalcGroupFlag_24idTemp = null;
        if(!retrieveCalcGroupFlag_24id.equals("")){
         retrieveCalcGroupFlag_24idTemp  = retrieveCalcGroupFlag_24id;
        }
        String retrieveShiftFlag_25id=  request.getParameter("retrieveShiftFlag128");
            java.lang.String retrieveShiftFlag_25idTemp = null;
        if(!retrieveShiftFlag_25id.equals("")){
         retrieveShiftFlag_25idTemp  = retrieveShiftFlag_25id;
        }
        String retrieveOverrideTypeFlag_26id=  request.getParameter("retrieveOverrideTypeFlag130");
            java.lang.String retrieveOverrideTypeFlag_26idTemp = null;
        if(!retrieveOverrideTypeFlag_26id.equals("")){
         retrieveOverrideTypeFlag_26idTemp  = retrieveOverrideTypeFlag_26id;
        }
        String unProcessedClkInWrkSumary_27id=  request.getParameter("unProcessedClkInWrkSumary132");
        boolean unProcessedClkInWrkSumary_27idTemp  = Boolean.valueOf(unProcessedClkInWrkSumary_27id).booleanValue();
        String includeSubTeams_28id=  request.getParameter("includeSubTeams134");
            java.lang.String includeSubTeams_28idTemp = null;
        if(!includeSubTeams_28id.equals("")){
         includeSubTeams_28idTemp  = includeSubTeams_28id;
        }
        String viewDate_29id=  request.getParameter("viewDate136");
            java.util.Calendar viewDate_29idTemp = null;
        if(!viewDate_29id.equals("")){
        java.text.DateFormat dateFormatviewDate136 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempviewDate136  = dateFormatviewDate136.parse(viewDate_29id);
         viewDate_29idTemp = new java.util.GregorianCalendar();
        viewDate_29idTemp.setTime(dateTempviewDate136);
        }
        String authorizationType_30id=  request.getParameter("authorizationType138");
            java.lang.String authorizationType_30idTemp = null;
        if(!authorizationType_30id.equals("")){
         authorizationType_30idTemp  = authorizationType_30id;
        }
        String queryPeriod_31id=  request.getParameter("queryPeriod140");
            java.lang.String queryPeriod_31idTemp = null;
        if(!queryPeriod_31id.equals("")){
         queryPeriod_31idTemp  = queryPeriod_31id;
        }
        String retrieveWorkDetailsFlag_32id=  request.getParameter("retrieveWorkDetailsFlag142");
            java.lang.String retrieveWorkDetailsFlag_32idTemp = null;
        if(!retrieveWorkDetailsFlag_32id.equals("")){
         retrieveWorkDetailsFlag_32idTemp  = retrieveWorkDetailsFlag_32id;
        }
        String retrieveOverridesFlag_33id=  request.getParameter("retrieveOverridesFlag144");
            java.lang.String retrieveOverridesFlag_33idTemp = null;
        if(!retrieveOverridesFlag_33id.equals("")){
         retrieveOverridesFlag_33idTemp  = retrieveOverridesFlag_33id;
        }
        %>
        <jsp:useBean id="com1workbrain1webservices1ta1WSQueryCriteria_1id" scope="session" class="com.workbrain.webservices.ta.WSQueryCriteria" />
        <%
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setEmpName(empName_2idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrievePayGroupFlag(retrievePayGroupFlag_3idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveDepartmentFlag(retrieveDepartmentFlag_4idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveDocketFlag(retrieveDocketFlag_5idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setLowEmpId(lowEmpId_6idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setStartDate(startDate_7idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveWorkSummaryFlag(retrieveWorkSummaryFlag_8idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setPageNo(pageNo_9idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveJobFlag(retrieveJobFlag_10idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveProjectFlag(retrieveProjectFlag_11idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setUseCurrentUserInRetrieval(useCurrentUserInRetrieval_12idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setEmpFirstName(empFirstName_13idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setEmpLastName(empLastName_14idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveShiftPatternFlag(retrieveShiftPatternFlag_15idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setEndDate(endDate_16idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setHighEmpId(highEmpId_17idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveHourTypeFlag(retrieveHourTypeFlag_18idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveEmployeeScheduleFlag(retrieveEmployeeScheduleFlag_19idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveTimeCodeFlag(retrieveTimeCodeFlag_20idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setPageSize(pageSize_21idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setApplyOverride(applyOverride_22idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveEmployeesFlag(retrieveEmployeesFlag_23idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveCalcGroupFlag(retrieveCalcGroupFlag_24idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveShiftFlag(retrieveShiftFlag_25idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveOverrideTypeFlag(retrieveOverrideTypeFlag_26idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setUnProcessedClkInWrkSumary(unProcessedClkInWrkSumary_27idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setIncludeSubTeams(includeSubTeams_28idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setViewDate(viewDate_29idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setAuthorizationType(authorizationType_30idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setQueryPeriod(queryPeriod_31idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveWorkDetailsFlag(retrieveWorkDetailsFlag_32idTemp);
        com1workbrain1webservices1ta1WSQueryCriteria_1id.setRetrieveOverridesFlag(retrieveOverridesFlag_33idTemp);
        com.workbrain.webservices.ta.WSTimeAndAttendanceData executeQuery13mtemp = sampleWorkbrainTimeAndAttendanceProxyid.executeQuery(com1workbrain1webservices1ta1WSQueryCriteria_1id);
if(executeQuery13mtemp == null){
%>
<%=executeQuery13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">departmentList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSDepartment[] typedepartmentList16 = executeQuery13mtemp.getDepartmentList();
        String tempdepartmentList16 = null;
        if(typedepartmentList16 != null){
        java.util.List listdepartmentList16= java.util.Arrays.asList(typedepartmentList16);
        tempdepartmentList16 = listdepartmentList16.toString();
        }
        %>
        <%=tempdepartmentList16%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workDetailOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSWorkDetailOverride[] typeworkDetailOverrideList18 = executeQuery13mtemp.getWorkDetailOverrideList();
        String tempworkDetailOverrideList18 = null;
        if(typeworkDetailOverrideList18 != null){
        java.util.List listworkDetailOverrideList18= java.util.Arrays.asList(typeworkDetailOverrideList18);
        tempworkDetailOverrideList18 = listworkDetailOverrideList18.toString();
        }
        %>
        <%=tempworkDetailOverrideList18%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workPremiumOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSWorkPremiumOverride[] typeworkPremiumOverrideList20 = executeQuery13mtemp.getWorkPremiumOverrideList();
        String tempworkPremiumOverrideList20 = null;
        if(typeworkPremiumOverrideList20 != null){
        java.util.List listworkPremiumOverrideList20= java.util.Arrays.asList(typeworkPremiumOverrideList20);
        tempworkPremiumOverrideList20 = listworkPremiumOverrideList20.toString();
        }
        %>
        <%=tempworkPremiumOverrideList20%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workDetailList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSWorkDetail[] typeworkDetailList22 = executeQuery13mtemp.getWorkDetailList();
        String tempworkDetailList22 = null;
        if(typeworkDetailList22 != null){
        java.util.List listworkDetailList22= java.util.Arrays.asList(typeworkDetailList22);
        tempworkDetailList22 = listworkDetailList22.toString();
        }
        %>
        <%=tempworkDetailList22%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">timeCodeList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSTimeCode[] typetimeCodeList24 = executeQuery13mtemp.getTimeCodeList();
        String temptimeCodeList24 = null;
        if(typetimeCodeList24 != null){
        java.util.List listtimeCodeList24= java.util.Arrays.asList(typetimeCodeList24);
        temptimeCodeList24 = listtimeCodeList24.toString();
        }
        %>
        <%=temptimeCodeList24%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">projectList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSProject[] typeprojectList26 = executeQuery13mtemp.getProjectList();
        String tempprojectList26 = null;
        if(typeprojectList26 != null){
        java.util.List listprojectList26= java.util.Arrays.asList(typeprojectList26);
        tempprojectList26 = listprojectList26.toString();
        }
        %>
        <%=tempprojectList26%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">alternateOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSAlternateHolidayOverride[] typealternateOverrideList28 = executeQuery13mtemp.getAlternateOverrideList();
        String tempalternateOverrideList28 = null;
        if(typealternateOverrideList28 != null){
        java.util.List listalternateOverrideList28= java.util.Arrays.asList(typealternateOverrideList28);
        tempalternateOverrideList28 = listalternateOverrideList28.toString();
        }
        %>
        <%=tempalternateOverrideList28%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">elapsedTimeOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSElapsedTimeOverride[] typeelapsedTimeOverrideList30 = executeQuery13mtemp.getElapsedTimeOverrideList();
        String tempelapsedTimeOverrideList30 = null;
        if(typeelapsedTimeOverrideList30 != null){
        java.util.List listelapsedTimeOverrideList30= java.util.Arrays.asList(typeelapsedTimeOverrideList30);
        tempelapsedTimeOverrideList30 = listelapsedTimeOverrideList30.toString();
        }
        %>
        <%=tempelapsedTimeOverrideList30%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">overrideTypeList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSOverrideType[] typeoverrideTypeList32 = executeQuery13mtemp.getOverrideTypeList();
        String tempoverrideTypeList32 = null;
        if(typeoverrideTypeList32 != null){
        java.util.List listoverrideTypeList32= java.util.Arrays.asList(typeoverrideTypeList32);
        tempoverrideTypeList32 = listoverrideTypeList32.toString();
        }
        %>
        <%=tempoverrideTypeList32%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">jobList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSJob[] typejobList34 = executeQuery13mtemp.getJobList();
        String tempjobList34 = null;
        if(typejobList34 != null){
        java.util.List listjobList34= java.util.Arrays.asList(typejobList34);
        tempjobList34 = listjobList34.toString();
        }
        %>
        <%=tempjobList34%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">calculateRecs:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
%>
<%=executeQuery13mtemp.isCalculateRecs()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ltaOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSLTAOverride[] typeltaOverrideList38 = executeQuery13mtemp.getLtaOverrideList();
        String templtaOverrideList38 = null;
        if(typeltaOverrideList38 != null){
        java.util.List listltaOverrideList38= java.util.Arrays.asList(typeltaOverrideList38);
        templtaOverrideList38 = listltaOverrideList38.toString();
        }
        %>
        <%=templtaOverrideList38%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workSummaryOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSWorkSummaryOverride[] typeworkSummaryOverrideList40 = executeQuery13mtemp.getWorkSummaryOverrideList();
        String tempworkSummaryOverrideList40 = null;
        if(typeworkSummaryOverrideList40 != null){
        java.util.List listworkSummaryOverrideList40= java.util.Arrays.asList(typeworkSummaryOverrideList40);
        tempworkSummaryOverrideList40 = listworkSummaryOverrideList40.toString();
        }
        %>
        <%=tempworkSummaryOverrideList40%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">shiftPatternList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSShiftPattern[] typeshiftPatternList42 = executeQuery13mtemp.getShiftPatternList();
        String tempshiftPatternList42 = null;
        if(typeshiftPatternList42 != null){
        java.util.List listshiftPatternList42= java.util.Arrays.asList(typeshiftPatternList42);
        tempshiftPatternList42 = listshiftPatternList42.toString();
        }
        %>
        <%=tempshiftPatternList42%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeBalanceOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] typeemployeeBalanceOverrideList44 = executeQuery13mtemp.getEmployeeBalanceOverrideList();
        String tempemployeeBalanceOverrideList44 = null;
        if(typeemployeeBalanceOverrideList44 != null){
        java.util.List listemployeeBalanceOverrideList44= java.util.Arrays.asList(typeemployeeBalanceOverrideList44);
        tempemployeeBalanceOverrideList44 = listemployeeBalanceOverrideList44.toString();
        }
        %>
        <%=tempemployeeBalanceOverrideList44%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeDefaultLaborOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] typeemployeeDefaultLaborOverrideList46 = executeQuery13mtemp.getEmployeeDefaultLaborOverrideList();
        String tempemployeeDefaultLaborOverrideList46 = null;
        if(typeemployeeDefaultLaborOverrideList46 != null){
        java.util.List listemployeeDefaultLaborOverrideList46= java.util.Arrays.asList(typeemployeeDefaultLaborOverrideList46);
        tempemployeeDefaultLaborOverrideList46 = listemployeeDefaultLaborOverrideList46.toString();
        }
        %>
        <%=tempemployeeDefaultLaborOverrideList46%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">overrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSOverride[] typeoverrideList48 = executeQuery13mtemp.getOverrideList();
        String tempoverrideList48 = null;
        if(typeoverrideList48 != null){
        java.util.List listoverrideList48= java.util.Arrays.asList(typeoverrideList48);
        tempoverrideList48 = listoverrideList48.toString();
        }
        %>
        <%=tempoverrideList48%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">holidayOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] typeholidayOverrideList50 = executeQuery13mtemp.getHolidayOverrideList();
        String tempholidayOverrideList50 = null;
        if(typeholidayOverrideList50 != null){
        java.util.List listholidayOverrideList50= java.util.Arrays.asList(typeholidayOverrideList50);
        tempholidayOverrideList50 = listholidayOverrideList50.toString();
        }
        %>
        <%=tempholidayOverrideList50%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeOverride[] typeemployeeOverrideList52 = executeQuery13mtemp.getEmployeeOverrideList();
        String tempemployeeOverrideList52 = null;
        if(typeemployeeOverrideList52 != null){
        java.util.List listemployeeOverrideList52= java.util.Arrays.asList(typeemployeeOverrideList52);
        tempemployeeOverrideList52 = listemployeeOverrideList52.toString();
        }
        %>
        <%=tempemployeeOverrideList52%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">queryId:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
java.lang.String typequeryId54 = executeQuery13mtemp.getQueryId();
        String tempResultqueryId54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typequeryId54));
        %>
        <%= tempResultqueryId54 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">shiftList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSShift[] typeshiftList56 = executeQuery13mtemp.getShiftList();
        String tempshiftList56 = null;
        if(typeshiftList56 != null){
        java.util.List listshiftList56= java.util.Arrays.asList(typeshiftList56);
        tempshiftList56 = listshiftList56.toString();
        }
        %>
        <%=tempshiftList56%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workSummaryList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSWorkSummary[] typeworkSummaryList58 = executeQuery13mtemp.getWorkSummaryList();
        String tempworkSummaryList58 = null;
        if(typeworkSummaryList58 != null){
        java.util.List listworkSummaryList58= java.util.Arrays.asList(typeworkSummaryList58);
        tempworkSummaryList58 = listworkSummaryList58.toString();
        }
        %>
        <%=tempworkSummaryList58%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">hourTypeList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSHourType[] typehourTypeList60 = executeQuery13mtemp.getHourTypeList();
        String temphourTypeList60 = null;
        if(typehourTypeList60 != null){
        java.util.List listhourTypeList60= java.util.Arrays.asList(typehourTypeList60);
        temphourTypeList60 = listhourTypeList60.toString();
        }
        %>
        <%=temphourTypeList60%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currentPage:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
%>
<%=executeQuery13mtemp.getCurrentPage()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">docketList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSDocket[] typedocketList64 = executeQuery13mtemp.getDocketList();
        String tempdocketList64 = null;
        if(typedocketList64 != null){
        java.util.List listdocketList64= java.util.Arrays.asList(typedocketList64);
        tempdocketList64 = listdocketList64.toString();
        }
        %>
        <%=tempdocketList64%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployee[] typeemployeeList66 = executeQuery13mtemp.getEmployeeList();
        String tempemployeeList66 = null;
        if(typeemployeeList66 != null){
        java.util.List listemployeeList66= java.util.Arrays.asList(typeemployeeList66);
        tempemployeeList66 = listemployeeList66.toString();
        }
        %>
        <%=tempemployeeList66%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payGroupList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSPayGroup[] typepayGroupList68 = executeQuery13mtemp.getPayGroupList();
        String temppayGroupList68 = null;
        if(typepayGroupList68 != null){
        java.util.List listpayGroupList68= java.util.Arrays.asList(typepayGroupList68);
        temppayGroupList68 = listpayGroupList68.toString();
        }
        %>
        <%=temppayGroupList68%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeScheduleOverrideList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] typeemployeeScheduleOverrideList70 = executeQuery13mtemp.getEmployeeScheduleOverrideList();
        String tempemployeeScheduleOverrideList70 = null;
        if(typeemployeeScheduleOverrideList70 != null){
        java.util.List listemployeeScheduleOverrideList70= java.util.Arrays.asList(typeemployeeScheduleOverrideList70);
        tempemployeeScheduleOverrideList70 = listemployeeScheduleOverrideList70.toString();
        }
        %>
        <%=tempemployeeScheduleOverrideList70%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeScheduleList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSEmployeeSchedule[] typeemployeeScheduleList72 = executeQuery13mtemp.getEmployeeScheduleList();
        String tempemployeeScheduleList72 = null;
        if(typeemployeeScheduleList72 != null){
        java.util.List listemployeeScheduleList72= java.util.Arrays.asList(typeemployeeScheduleList72);
        tempemployeeScheduleList72 = listemployeeScheduleList72.toString();
        }
        %>
        <%=tempemployeeScheduleList72%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
%>
<%=executeQuery13mtemp.getTotalPages()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">calcGroupList:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
com.workbrain.webservices.ta.WSCalcGroup[] typecalcGroupList76 = executeQuery13mtemp.getCalcGroupList();
        String tempcalcGroupList76 = null;
        if(typecalcGroupList76 != null){
        java.util.List listcalcGroupList76= java.util.Arrays.asList(typecalcGroupList76);
        tempcalcGroupList76 = listcalcGroupList76.toString();
        }
        %>
        <%=tempcalcGroupList76%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createDefaultRecord:</TD>
<TD>
<%
if(executeQuery13mtemp != null){
%>
<%=executeQuery13mtemp.isCreateDefaultRecord()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 146:
        gotMethod = true;
        String calculateRecs_35id=  request.getParameter("calculateRecs151");
        boolean calculateRecs_35idTemp  = Boolean.valueOf(calculateRecs_35id).booleanValue();
        String queryId_36id=  request.getParameter("queryId153");
            java.lang.String queryId_36idTemp = null;
        if(!queryId_36id.equals("")){
         queryId_36idTemp  = queryId_36id;
        }
        String currentPage_37id=  request.getParameter("currentPage155");
        int currentPage_37idTemp  = Integer.parseInt(currentPage_37id);
        String totalPages_38id=  request.getParameter("totalPages157");
        int totalPages_38idTemp  = Integer.parseInt(totalPages_38id);
        String createDefaultRecord_39id=  request.getParameter("createDefaultRecord159");
        boolean createDefaultRecord_39idTemp  = Boolean.valueOf(createDefaultRecord_39id).booleanValue();
        %>
        <jsp:useBean id="com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id" scope="session" class="com.workbrain.webservices.ta.WSTimeAndAttendanceData" />
        <%
        com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id.setCalculateRecs(calculateRecs_35idTemp);
        com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id.setQueryId(queryId_36idTemp);
        com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id.setCurrentPage(currentPage_37idTemp);
        com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id.setTotalPages(totalPages_38idTemp);
        com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id.setCreateDefaultRecord(createDefaultRecord_39idTemp);
        sampleWorkbrainTimeAndAttendanceProxyid.executeOverride(com1workbrain1webservices1ta1WSTimeAndAttendanceData_34id);
break;
case 161:
        gotMethod = true;
        String queryId_40id=  request.getParameter("queryId228");
            java.lang.String queryId_40idTemp = null;
        if(!queryId_40id.equals("")){
         queryId_40idTemp  = queryId_40id;
        }
        String pageNo_41id=  request.getParameter("pageNo230");
        int pageNo_41idTemp  = Integer.parseInt(pageNo_41id);
        com.workbrain.webservices.ta.WSTimeAndAttendanceData getPageQueryData161mtemp = sampleWorkbrainTimeAndAttendanceProxyid.getPageQueryData(queryId_40idTemp,pageNo_41idTemp);
if(getPageQueryData161mtemp == null){
%>
<%=getPageQueryData161mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">departmentList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSDepartment[] typedepartmentList164 = getPageQueryData161mtemp.getDepartmentList();
        String tempdepartmentList164 = null;
        if(typedepartmentList164 != null){
        java.util.List listdepartmentList164= java.util.Arrays.asList(typedepartmentList164);
        tempdepartmentList164 = listdepartmentList164.toString();
        }
        %>
        <%=tempdepartmentList164%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workDetailOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSWorkDetailOverride[] typeworkDetailOverrideList166 = getPageQueryData161mtemp.getWorkDetailOverrideList();
        String tempworkDetailOverrideList166 = null;
        if(typeworkDetailOverrideList166 != null){
        java.util.List listworkDetailOverrideList166= java.util.Arrays.asList(typeworkDetailOverrideList166);
        tempworkDetailOverrideList166 = listworkDetailOverrideList166.toString();
        }
        %>
        <%=tempworkDetailOverrideList166%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workPremiumOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSWorkPremiumOverride[] typeworkPremiumOverrideList168 = getPageQueryData161mtemp.getWorkPremiumOverrideList();
        String tempworkPremiumOverrideList168 = null;
        if(typeworkPremiumOverrideList168 != null){
        java.util.List listworkPremiumOverrideList168= java.util.Arrays.asList(typeworkPremiumOverrideList168);
        tempworkPremiumOverrideList168 = listworkPremiumOverrideList168.toString();
        }
        %>
        <%=tempworkPremiumOverrideList168%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workDetailList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSWorkDetail[] typeworkDetailList170 = getPageQueryData161mtemp.getWorkDetailList();
        String tempworkDetailList170 = null;
        if(typeworkDetailList170 != null){
        java.util.List listworkDetailList170= java.util.Arrays.asList(typeworkDetailList170);
        tempworkDetailList170 = listworkDetailList170.toString();
        }
        %>
        <%=tempworkDetailList170%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">timeCodeList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSTimeCode[] typetimeCodeList172 = getPageQueryData161mtemp.getTimeCodeList();
        String temptimeCodeList172 = null;
        if(typetimeCodeList172 != null){
        java.util.List listtimeCodeList172= java.util.Arrays.asList(typetimeCodeList172);
        temptimeCodeList172 = listtimeCodeList172.toString();
        }
        %>
        <%=temptimeCodeList172%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">projectList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSProject[] typeprojectList174 = getPageQueryData161mtemp.getProjectList();
        String tempprojectList174 = null;
        if(typeprojectList174 != null){
        java.util.List listprojectList174= java.util.Arrays.asList(typeprojectList174);
        tempprojectList174 = listprojectList174.toString();
        }
        %>
        <%=tempprojectList174%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">alternateOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSAlternateHolidayOverride[] typealternateOverrideList176 = getPageQueryData161mtemp.getAlternateOverrideList();
        String tempalternateOverrideList176 = null;
        if(typealternateOverrideList176 != null){
        java.util.List listalternateOverrideList176= java.util.Arrays.asList(typealternateOverrideList176);
        tempalternateOverrideList176 = listalternateOverrideList176.toString();
        }
        %>
        <%=tempalternateOverrideList176%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">elapsedTimeOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSElapsedTimeOverride[] typeelapsedTimeOverrideList178 = getPageQueryData161mtemp.getElapsedTimeOverrideList();
        String tempelapsedTimeOverrideList178 = null;
        if(typeelapsedTimeOverrideList178 != null){
        java.util.List listelapsedTimeOverrideList178= java.util.Arrays.asList(typeelapsedTimeOverrideList178);
        tempelapsedTimeOverrideList178 = listelapsedTimeOverrideList178.toString();
        }
        %>
        <%=tempelapsedTimeOverrideList178%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">overrideTypeList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSOverrideType[] typeoverrideTypeList180 = getPageQueryData161mtemp.getOverrideTypeList();
        String tempoverrideTypeList180 = null;
        if(typeoverrideTypeList180 != null){
        java.util.List listoverrideTypeList180= java.util.Arrays.asList(typeoverrideTypeList180);
        tempoverrideTypeList180 = listoverrideTypeList180.toString();
        }
        %>
        <%=tempoverrideTypeList180%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">jobList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSJob[] typejobList182 = getPageQueryData161mtemp.getJobList();
        String tempjobList182 = null;
        if(typejobList182 != null){
        java.util.List listjobList182= java.util.Arrays.asList(typejobList182);
        tempjobList182 = listjobList182.toString();
        }
        %>
        <%=tempjobList182%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">calculateRecs:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
%>
<%=getPageQueryData161mtemp.isCalculateRecs()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ltaOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSLTAOverride[] typeltaOverrideList186 = getPageQueryData161mtemp.getLtaOverrideList();
        String templtaOverrideList186 = null;
        if(typeltaOverrideList186 != null){
        java.util.List listltaOverrideList186= java.util.Arrays.asList(typeltaOverrideList186);
        templtaOverrideList186 = listltaOverrideList186.toString();
        }
        %>
        <%=templtaOverrideList186%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workSummaryOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSWorkSummaryOverride[] typeworkSummaryOverrideList188 = getPageQueryData161mtemp.getWorkSummaryOverrideList();
        String tempworkSummaryOverrideList188 = null;
        if(typeworkSummaryOverrideList188 != null){
        java.util.List listworkSummaryOverrideList188= java.util.Arrays.asList(typeworkSummaryOverrideList188);
        tempworkSummaryOverrideList188 = listworkSummaryOverrideList188.toString();
        }
        %>
        <%=tempworkSummaryOverrideList188%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">shiftPatternList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSShiftPattern[] typeshiftPatternList190 = getPageQueryData161mtemp.getShiftPatternList();
        String tempshiftPatternList190 = null;
        if(typeshiftPatternList190 != null){
        java.util.List listshiftPatternList190= java.util.Arrays.asList(typeshiftPatternList190);
        tempshiftPatternList190 = listshiftPatternList190.toString();
        }
        %>
        <%=tempshiftPatternList190%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeBalanceOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeBalanceOverride[] typeemployeeBalanceOverrideList192 = getPageQueryData161mtemp.getEmployeeBalanceOverrideList();
        String tempemployeeBalanceOverrideList192 = null;
        if(typeemployeeBalanceOverrideList192 != null){
        java.util.List listemployeeBalanceOverrideList192= java.util.Arrays.asList(typeemployeeBalanceOverrideList192);
        tempemployeeBalanceOverrideList192 = listemployeeBalanceOverrideList192.toString();
        }
        %>
        <%=tempemployeeBalanceOverrideList192%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeDefaultLaborOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeDefaultLaborOverride[] typeemployeeDefaultLaborOverrideList194 = getPageQueryData161mtemp.getEmployeeDefaultLaborOverrideList();
        String tempemployeeDefaultLaborOverrideList194 = null;
        if(typeemployeeDefaultLaborOverrideList194 != null){
        java.util.List listemployeeDefaultLaborOverrideList194= java.util.Arrays.asList(typeemployeeDefaultLaborOverrideList194);
        tempemployeeDefaultLaborOverrideList194 = listemployeeDefaultLaborOverrideList194.toString();
        }
        %>
        <%=tempemployeeDefaultLaborOverrideList194%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">overrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSOverride[] typeoverrideList196 = getPageQueryData161mtemp.getOverrideList();
        String tempoverrideList196 = null;
        if(typeoverrideList196 != null){
        java.util.List listoverrideList196= java.util.Arrays.asList(typeoverrideList196);
        tempoverrideList196 = listoverrideList196.toString();
        }
        %>
        <%=tempoverrideList196%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">holidayOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeHolidayOverride[] typeholidayOverrideList198 = getPageQueryData161mtemp.getHolidayOverrideList();
        String tempholidayOverrideList198 = null;
        if(typeholidayOverrideList198 != null){
        java.util.List listholidayOverrideList198= java.util.Arrays.asList(typeholidayOverrideList198);
        tempholidayOverrideList198 = listholidayOverrideList198.toString();
        }
        %>
        <%=tempholidayOverrideList198%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeOverride[] typeemployeeOverrideList200 = getPageQueryData161mtemp.getEmployeeOverrideList();
        String tempemployeeOverrideList200 = null;
        if(typeemployeeOverrideList200 != null){
        java.util.List listemployeeOverrideList200= java.util.Arrays.asList(typeemployeeOverrideList200);
        tempemployeeOverrideList200 = listemployeeOverrideList200.toString();
        }
        %>
        <%=tempemployeeOverrideList200%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">queryId:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
java.lang.String typequeryId202 = getPageQueryData161mtemp.getQueryId();
        String tempResultqueryId202 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typequeryId202));
        %>
        <%= tempResultqueryId202 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">shiftList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSShift[] typeshiftList204 = getPageQueryData161mtemp.getShiftList();
        String tempshiftList204 = null;
        if(typeshiftList204 != null){
        java.util.List listshiftList204= java.util.Arrays.asList(typeshiftList204);
        tempshiftList204 = listshiftList204.toString();
        }
        %>
        <%=tempshiftList204%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">workSummaryList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSWorkSummary[] typeworkSummaryList206 = getPageQueryData161mtemp.getWorkSummaryList();
        String tempworkSummaryList206 = null;
        if(typeworkSummaryList206 != null){
        java.util.List listworkSummaryList206= java.util.Arrays.asList(typeworkSummaryList206);
        tempworkSummaryList206 = listworkSummaryList206.toString();
        }
        %>
        <%=tempworkSummaryList206%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">hourTypeList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSHourType[] typehourTypeList208 = getPageQueryData161mtemp.getHourTypeList();
        String temphourTypeList208 = null;
        if(typehourTypeList208 != null){
        java.util.List listhourTypeList208= java.util.Arrays.asList(typehourTypeList208);
        temphourTypeList208 = listhourTypeList208.toString();
        }
        %>
        <%=temphourTypeList208%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currentPage:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
%>
<%=getPageQueryData161mtemp.getCurrentPage()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">docketList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSDocket[] typedocketList212 = getPageQueryData161mtemp.getDocketList();
        String tempdocketList212 = null;
        if(typedocketList212 != null){
        java.util.List listdocketList212= java.util.Arrays.asList(typedocketList212);
        tempdocketList212 = listdocketList212.toString();
        }
        %>
        <%=tempdocketList212%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployee[] typeemployeeList214 = getPageQueryData161mtemp.getEmployeeList();
        String tempemployeeList214 = null;
        if(typeemployeeList214 != null){
        java.util.List listemployeeList214= java.util.Arrays.asList(typeemployeeList214);
        tempemployeeList214 = listemployeeList214.toString();
        }
        %>
        <%=tempemployeeList214%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">payGroupList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSPayGroup[] typepayGroupList216 = getPageQueryData161mtemp.getPayGroupList();
        String temppayGroupList216 = null;
        if(typepayGroupList216 != null){
        java.util.List listpayGroupList216= java.util.Arrays.asList(typepayGroupList216);
        temppayGroupList216 = listpayGroupList216.toString();
        }
        %>
        <%=temppayGroupList216%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeScheduleOverrideList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeScheduleOverride[] typeemployeeScheduleOverrideList218 = getPageQueryData161mtemp.getEmployeeScheduleOverrideList();
        String tempemployeeScheduleOverrideList218 = null;
        if(typeemployeeScheduleOverrideList218 != null){
        java.util.List listemployeeScheduleOverrideList218= java.util.Arrays.asList(typeemployeeScheduleOverrideList218);
        tempemployeeScheduleOverrideList218 = listemployeeScheduleOverrideList218.toString();
        }
        %>
        <%=tempemployeeScheduleOverrideList218%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">employeeScheduleList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSEmployeeSchedule[] typeemployeeScheduleList220 = getPageQueryData161mtemp.getEmployeeScheduleList();
        String tempemployeeScheduleList220 = null;
        if(typeemployeeScheduleList220 != null){
        java.util.List listemployeeScheduleList220= java.util.Arrays.asList(typeemployeeScheduleList220);
        tempemployeeScheduleList220 = listemployeeScheduleList220.toString();
        }
        %>
        <%=tempemployeeScheduleList220%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
%>
<%=getPageQueryData161mtemp.getTotalPages()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">calcGroupList:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
com.workbrain.webservices.ta.WSCalcGroup[] typecalcGroupList224 = getPageQueryData161mtemp.getCalcGroupList();
        String tempcalcGroupList224 = null;
        if(typecalcGroupList224 != null){
        java.util.List listcalcGroupList224= java.util.Arrays.asList(typecalcGroupList224);
        tempcalcGroupList224 = listcalcGroupList224.toString();
        }
        %>
        <%=tempcalcGroupList224%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createDefaultRecord:</TD>
<TD>
<%
if(getPageQueryData161mtemp != null){
%>
<%=getPageQueryData161mtemp.isCreateDefaultRecord()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 232:
        gotMethod = true;
        String empId_42id=  request.getParameter("empId245");
            java.lang.String empId_42idTemp = null;
        if(!empId_42id.equals("")){
         empId_42idTemp  = empId_42id;
        }
        String date_43id=  request.getParameter("date247");
            java.util.Calendar date_43idTemp = null;
        if(!date_43id.equals("")){
        java.text.DateFormat dateFormatdate247 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdate247  = dateFormatdate247.parse(date_43id);
         date_43idTemp = new java.util.GregorianCalendar();
        date_43idTemp.setTime(dateTempdate247);
        }
        com.workbrain.webservices.ta.WSClock getLatestClock232mtemp = sampleWorkbrainTimeAndAttendanceProxyid.getLatestClock(empId_42idTemp,date_43idTemp);
if(getLatestClock232mtemp == null){
%>
<%=getLatestClock232mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">manual:</TD>
<TD>
<%
if(getLatestClock232mtemp != null){
java.lang.String typemanual235 = getLatestClock232mtemp.getManual();
        String tempResultmanual235 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemanual235));
        %>
        <%= tempResultmanual235 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">type:</TD>
<TD>
<%
if(getLatestClock232mtemp != null){
java.lang.String typetype237 = getLatestClock232mtemp.getType();
        String tempResulttype237 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetype237));
        %>
        <%= tempResulttype237 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">clockData:</TD>
<TD>
<%
if(getLatestClock232mtemp != null){
java.lang.String typeclockData239 = getLatestClock232mtemp.getClockData();
        String tempResultclockData239 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclockData239));
        %>
        <%= tempResultclockData239 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">clockTime:</TD>
<TD>
<%
if(getLatestClock232mtemp != null){
java.util.Calendar typeclockTime241 = getLatestClock232mtemp.getClockTime();
        java.text.DateFormat dateFormatclockTime241 = java.text.DateFormat.getDateInstance();
        java.util.Date dateclockTime241 = typeclockTime241.getTime();
        String tempResultclockTime241 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatclockTime241.format(dateclockTime241));
        %>
        <%= tempResultclockTime241 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">changed:</TD>
<TD>
<%
if(getLatestClock232mtemp != null){
java.lang.String typechanged243 = getLatestClock232mtemp.getChanged();
        String tempResultchanged243 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typechanged243));
        %>
        <%= tempResultchanged243 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>