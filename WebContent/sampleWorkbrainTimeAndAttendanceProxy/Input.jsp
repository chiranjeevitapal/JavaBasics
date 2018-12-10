<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>
</HEAD>
<BODY>
<H1>Inputs</H1>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 5:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">endpoint:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endpoint8" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 10:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 13:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">criteria:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="empName82" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrievePayGroupFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrievePayGroupFlag84" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveDepartmentFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveDepartmentFlag86" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveDocketFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveDocketFlag88" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lowEmpId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="lowEmpId90" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">startDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="startDate92" SIZE=20></TD>
<%
java.text.DateFormat dateFormatstartDate92 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampstartDate92  = new java.util.GregorianCalendar();
java.util.Date datestartDate92 = gcExampstartDate92.getTime();
String tempResultstartDate92 = dateFormatstartDate92.format(datestartDate92);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultstartDate92 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveWorkSummaryFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveWorkSummaryFlag94" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="pageNo96" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveJobFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveJobFlag98" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveProjectFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveProjectFlag100" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">useCurrentUserInRetrieval:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="useCurrentUserInRetrieval102" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empFirstName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="empFirstName104" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">empLastName:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="empLastName106" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveShiftPatternFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveShiftPatternFlag108" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">endDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endDate110" SIZE=20></TD>
<%
java.text.DateFormat dateFormatendDate110 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampendDate110  = new java.util.GregorianCalendar();
java.util.Date dateendDate110 = gcExampendDate110.getTime();
String tempResultendDate110 = dateFormatendDate110.format(dateendDate110);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultendDate110 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">highEmpId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="highEmpId112" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveHourTypeFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveHourTypeFlag114" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveEmployeeScheduleFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveEmployeeScheduleFlag116" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveTimeCodeFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveTimeCodeFlag118" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">pageSize:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="pageSize120" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">applyOverride:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="applyOverride122" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveEmployeesFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveEmployeesFlag124" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveCalcGroupFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveCalcGroupFlag126" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveShiftFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveShiftFlag128" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveOverrideTypeFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveOverrideTypeFlag130" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">unProcessedClkInWrkSumary:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="unProcessedClkInWrkSumary132" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">includeSubTeams:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="includeSubTeams134" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">viewDate:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="viewDate136" SIZE=20></TD>
<%
java.text.DateFormat dateFormatviewDate136 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampviewDate136  = new java.util.GregorianCalendar();
java.util.Date dateviewDate136 = gcExampviewDate136.getTime();
String tempResultviewDate136 = dateFormatviewDate136.format(dateviewDate136);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultviewDate136 %> </TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">authorizationType:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="authorizationType138" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">queryPeriod:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="queryPeriod140" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveWorkDetailsFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveWorkDetailsFlag142" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">retrieveOverridesFlag:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="retrieveOverridesFlag144" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 146:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">overrides:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">calculateRecs:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="calculateRecs151" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">queryId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="queryId153" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">currentPage:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="currentPage155" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPages:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="totalPages157" SIZE=20></TD>
</TR>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">createDefaultRecord:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="createDefaultRecord159" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 161:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">queryId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="queryId228" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">pageNo:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="pageNo230" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 232:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">empId:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="empId245" SIZE=20></TD>
</TR>
</TABLE>
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">date:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="date247" SIZE=20></TD>
<%
java.text.DateFormat dateFormatdate247 = java.text.DateFormat.getDateInstance();
java.util.GregorianCalendar gcExampdate247  = new java.util.GregorianCalendar();
java.util.Date datedate247 = gcExampdate247.getTime();
String tempResultdate247 = dateFormatdate247.format(datedate247);
%>
<TD ALIGN="left">
</TR>
<TR>
<TD> </TD>
<TD ALIGN="left"> eg. <%= tempResultdate247 %> </TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111111:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<TABLE>
<TR>
<TD COLSPAN="1" ALIGN="LEFT">URLString:</TD>
<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="url1111111111" SIZE=20></TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
case 1111111112:
valid = false;
%>
<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
<INPUT TYPE="HIDDEN" NAME="method" VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">
<BR>
<INPUT TYPE="SUBMIT" VALUE="Invoke">
<INPUT TYPE="RESET" VALUE="Clear">
</FORM>
<%
break;
}
if (valid) {
%>
Select a method to test.
<%
}
%>

</BODY>
</HTML>
