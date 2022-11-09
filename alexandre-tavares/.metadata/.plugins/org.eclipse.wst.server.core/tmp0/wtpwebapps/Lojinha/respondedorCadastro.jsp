<%@page import="mail.SendMail"%>
<%@page import="model.Usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="database.DBQuery"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	
	String nome = request.getParameter("nome");
	nome = (nome == null)?"":nome;
	String email = request.getParameter("email");
	email = (email == null)?"":email;
	String nivel = request.getParameter("nivel");
	nivel = (nivel == null)?"":nivel;
	String endereco = request.getParameter("end");
	endereco = (endereco == null)?"":endereco;
	String cpf = request.getParameter("cpf");
	cpf = (cpf == null)?"":cpf;
	String bairro = request.getParameter("bairro");
	bairro = (bairro == null)?"":bairro;
	String cidade = request.getParameter("cidade");
	cidade = (cidade == null)?"":cidade;
	String uf = request.getParameter("uf");
	uf = (uf == null)?"":uf;
	String cep = request.getParameter("cep");
	cep = (cep == null)?"":cep;
	String telefone = request.getParameter("telefone");
	telefone = (telefone == null)?"":telefone;
	out.print(email + "<br>");
	
	int nivelU = Integer.parseInt(nivel);
	String where = "email = '" + email + "'";
		
	Usuario usuario = new Usuario( 0, email, "", nivelU,  nome,  cpf,  endereco,  bairro,  cidade,  uf,  cep,  telefone,  "",  "0") ;
	usuario.save();
	
	String senha = usuario.newPassword();
	String corpoEmail = "Segue sua senha : "+ senha + " //";
			
	ResultSet rs = usuario.select(where);
	if(rs.next()){
		out.print("Usuário criado com sucesso!");
		SendMail enviarEmail = new SendMail("smtp.mail.yahoo.com", "587", "dev.alexandre@yahoo.com", "jqsholcdbfenswqs", "TLS");
		enviarEmail.send("dev.alexandre@yahoo.com", email, "Envio da senha", corpoEmail);
	}else{
		out.print("ERRO!");
	}
		

%>
