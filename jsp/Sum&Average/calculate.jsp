<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculate Sum and Average</title>
</head>
<body bgcolor="pink">

<%
String no1=request.getParameter("number1");
int n1=Integer.parseInt(no1);
String no2=request.getParameter("number2");
int n2=Integer.parseInt(no2);
String no3=request.getParameter("number3");
int n3=Integer.parseInt(no3);

int sum=n1+n2+n3;
double avg=sum/3;

out.println("<h1> Sum is= "+sum+"</h1>");
out.println("<h1> Average is= "+avg+"</h1>");


%>

</body>
</html>
