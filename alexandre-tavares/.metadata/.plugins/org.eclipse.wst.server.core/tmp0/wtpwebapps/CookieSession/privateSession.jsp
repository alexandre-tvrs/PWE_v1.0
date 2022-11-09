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
	String SESSION_USER = (String) session.getAttribute("usuario");
	//out.print( SESSION_USER );
	
	if (SESSION_USER.equals("teste")){
		out.print("OK");
	} else {
		out.print("REDIRECIONANDO...");
	}

%>
</body>
</html>