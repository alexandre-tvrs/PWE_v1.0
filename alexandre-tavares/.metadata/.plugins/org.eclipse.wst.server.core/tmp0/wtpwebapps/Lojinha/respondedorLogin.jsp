<%@page import="model.Usuario"%>
<%@page import="model.LoginModel"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBQuery"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	
	//LoginModel login = new LoginModel();
	
	Usuario usuario = new Usuario(email, senha, "");
	
	//String resposta = login.login(email, senha);
	
	String resposta = "Usuário não encontrado";
	
	if (usuario.checkLogin()){
		resposta = "Login Bem Sucedido!";
	}else{
		resposta = "Burrão fio!";
	}
	
	out.print(resposta);

%>
