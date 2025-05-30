package Model;

import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoDAO implements InterfaceProductDAO{
	
	@Override
	public void Cadastrar(Conexao_db conexao,Produto produto) throws SQLException {
		try {
			conexao.iniciarConexao();
			conexao.getConn().setAutoCommit(false); // Cancela confirmação automática
			String query = "INSERT INTO PRODUTO (nome_produto,data_validade,marca,quantidade,peso_produto, unidade_medida_peso, valor)"
					+ "VALUES(?,?,?,?,?,?,?)";
			
			Statement state = conexao.getConn().prepareStatement(query); //Cria o statement 
			state.executeUpdate(query);
			conexao.getConn().commit();
			conexao.getConn().close();
		}catch(SQLException e) {
			conexao.getConn().rollback();
			System.out.println("Algum erro aconteceu!");
			System.out.print("Erro: " + e.getMessage());
		}
	}
	
	public void Deletar(Conexao_db conexao, Produto produto) throws SQLException{
		try {
			conexao.iniciarConexao();
			conexao.getConn().setAutoCommit(false);
			String query = "";
			
			Statement state = conexao.getConn().prepareStatement(query);
			state.executeUpdate(query);
			conexao.getConn().commit();
			conexao.getConn().close();
		}catch(SQLException e) {
			conexao.getConn().rollback();
			System.out.println("Algum erro aconteceu!");
			System.out.print("Erro: " + e.getMessage());
		}
	}
	
	public void Atualizar(Conexao_db conexao, Produto produto) throws SQLException{
		try {
			conexao.iniciarConexao();
			conexao.getConn().setAutoCommit(false);
			String query = "";
			Statement state = conexao.getConn().prepareStatement(query);
	
			state.executeUpdate(query);
			conexao.getConn().commit();
			conexao.getConn().close();
		}catch(SQLException e) {
			conexao.getConn().rollback();
			System.out.println("Algum erro aconteceu!");
			System.out.print("Erro: " + e.getMessage());
		}
	}
}
