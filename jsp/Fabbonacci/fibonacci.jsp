<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int num=Integer.parseInt(request.getParameter("no1"));
out.print("<h3>Fibonacci Series till " + num + " terms: </h3>");

int i, firstTerm = 0, secondTerm = 1;
for (i = 1; i <= num; ++i) 
{ 
	
out.println(firstTerm + ", ");

	 
  int nextTerm = firstTerm + secondTerm;
  firstTerm = secondTerm;
  secondTerm = nextTerm;
}
%>
<a href="UI.html" target="blank">Go back to UI page</a>

</body>
</html>
