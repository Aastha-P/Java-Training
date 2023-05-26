<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial</title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("no1"));
out.println("<h1>Enter number = "+num+"<h1>");

long res=1;
for(int i=1;i<=num;i++)
{
	res*=i;
}
out.println("<h1> Factorial of "+num+" = "+res+"</h1>");

%>
<a href="UI.html" target="blank">Go back to UI page.</a>
</body>
</html>
