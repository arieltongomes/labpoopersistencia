package br.edu.uniateneu.aula08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	    private static final String URL = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
	    private static final String USUARIO  = "root";
	    private static final String SENHA  = "1234";
	    private static final String dbClass = "com.mysql.cj.jdbc.Driver";
		private static Connection instancia;

	    public static Connection obterConexao() throws ClassNotFoundException, SQLException {
	    	if (instancia == null||instancia.isClosed()) {
	    		Class.forName(dbClass);
				instancia = DriverManager.getConnection(URL, USUARIO, SENHA);
	    	}
			return instancia;
	    }
}
