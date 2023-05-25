<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Table</title>
</head>
<body bgcolor="sky blue">

<%
String no1=request.getParameter("number1");
int n1=Integer.parseInt(no1);

for(int i=1;i<=10;i++)
{
	out.println("<h1>"+n1+"*"+i+" = "+(n1*i)+"</h1>");
}


%>

</body>
</html>
