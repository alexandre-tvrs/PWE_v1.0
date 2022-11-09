<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>SESSION PÚBLICA</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
  
  	$(document).ready(function() {
		$("#btnEnviar").click(function() {
			var frmData = $("#frmLogin").serialize();
			$("#msg").html("Enviou:" + frmData);
			$.ajax({
				url: "respondedorLogin.jsp",
				data: frmData,
				type: "POST",
				success: function( data ) {
					$("#msg").html( $("#msg").html()+"<br>Retornou:" + data);
				}
			});
		});
	});
  
  </script>
</head>
<body>

	<div class="container">
  <h2>AUTENTICAÇÃO</h2>
  <form  id="frmLogin">
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Digite seu  email" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="senha" placeholder="Digite sua senha:" name="senha">
    </div>
    <button type="button"  id="btnEnviar"class="btn btn-primary">Enviar</button>
    
  </form>
  <div id="msg"></div>
  
</div>

<%
	String SESSION_USER = (String) request.getParameter("usuario");
	
	if (SESSION_USER == null || SESSION_USER.isEmpty()){
		session.setAttribute("usuario", "");
	} else {
		session.setAttribute("usuario", SESSION_USER);
	}

%>
</body>
</html>