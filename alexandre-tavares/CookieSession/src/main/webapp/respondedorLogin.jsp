<%@page import="model.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	String email = request.getParameter("email");
	email = (email == null)?"":email;
	String senha = request.getParameter("senha");
	senha = (senha == null)?"":senha;
	
	//LoginModel login = new LoginModel();
	
	Usuario usuario = new Usuario(email, senha, "");
	
	//String resposta = login.login(email, senha);
	
	String resposta = "Usuário não encontrado";
	
	if (usuario.checkLogin()){
		session.setAttribute("usuario", email);
		response.sendRedirect("privateSession.jsp");
	}else{
		resposta = "Burrão fio!";
	}

%>
	
%>