package model;

import java.sql.SQLException;
import model.Product;

public interface InterfaceProductDAO {
	public void Cadastrar(Conexao_db conexao,Product produto) throws SQLException;
	
	public void Deletar(Conexao_db conexao, Product produto) throws SQLException;
	
	public void Atualizar(Conexao_db conexao, Product produto) throws SQLException;
}
