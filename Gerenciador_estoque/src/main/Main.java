package main;

import Model.Conexao_db;
import Model.Produto;

public class Main {
	public static void main(String []args) {
		Conexao_db c = new Conexao_db("localhost","matheus","240902","TESTE");
	}
}
