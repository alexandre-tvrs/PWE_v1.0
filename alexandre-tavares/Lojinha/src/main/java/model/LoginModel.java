package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;

public class LoginModel {

	DBQuery db = new DBQuery();
	
	public String login(String email, String senha) {
		
		ResultSet rs = db.query("SELECT * from usuarios WHERE email = '" + email + "'");
		
		String resposta = "Usuário não encontrado";
		
		try {
			while(rs.next()){
				if(!senha.equals(rs.getString(3))){
					resposta = "Senha incorreta";
				}
				else{
					resposta = "Login bem sucedido";
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return resposta;
	}
	
}
