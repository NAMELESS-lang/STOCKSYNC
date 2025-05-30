package Model;

import java.sql.SQLException;

public interface InterfaceProductDAO {
	public void Cadastrar(Conexao_db conexao,Produto produto) throws SQLException;
	
	public void Deletar(Conexao_db conexao, Produto produto) throws SQLException;
	
	public void Atualizar(Conexao_db conexao, Produto produto) throws SQLException;
}
