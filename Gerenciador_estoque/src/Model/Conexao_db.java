package Model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conexao_db{
	private String endereco_servidor;
	private String name;
	private String password;
	private Connection conn;
	
	public Conexao_db(String nome_servidor,String name, String password, String banco_de_dados) {
		this.endereco_servidor = "jdbc:mysql://"+nome_servidor+"/"+banco_de_dados;
		this.name = name;
		this.password = password;
	}
	
	public void iniciarConexao() {
		try {
			Connection conexao = null;
			conexao = DriverManager.getConnection(endereco_servidor, name, password);
			if(conexao != null) {
				this.conn = conexao;
				System.out.println("Conexão bem-sucedida!");
			}
		}catch(SQLException e) {
			this.conn = null; 
			System.out.println("Conexão falhou!");
			System.out.println("Motivo: "+e.getMessage());
		}
	}
	
	public Connection getConn() {
		return this.conn;
	}
}
