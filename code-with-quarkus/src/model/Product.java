package model;

public class Product{
	
		private String nome_item;
		private String data_validade;
		private String marca;
		private Integer quantidade;
		private Peso peso_produto;
		private Double valor;
	
	
		public Product(String nome_item, String data_validade, String marca, Integer quantidade, Peso peso_produto, Double valor) {
			this.nome_item = nome_item;
			this.data_validade = data_validade;
			this.marca = marca;
			this.quantidade = quantidade;
			this.peso_produto = peso_produto;
			this.valor = valor;
		}
		
		public Product(String nome_item, String marca, Integer quantidade, Peso peso_produto, Double valor) {
			this.nome_item = nome_item;
			this.marca = marca;
			this.quantidade = quantidade;
			this.peso_produto = peso_produto;
			this.valor = valor;
		}
		
		public void setnomeItem(String nome_item) { this.nome_item = nome_item; }
		public void setdataValidade(String data_validade) { this.data_validade = data_validade; }
		public void setMarca(String marca) { this.marca = marca; }
		public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
		public void setProduto(Peso peso_produto) { this.peso_produto = peso_produto; }
		public void setValor(Double valor) { this.valor = valor; }
		
		public String getnomeItem() { return this.nome_item;}
		public String getdataValidade() { return this.data_validade;}
		public String getMarca() { return this.marca;}
		public Integer getQuantidade() {return this.quantidade;}
		public Peso getPeso() { return this.peso_produto;}
		public Double getValor() { return this.valor;}
		
		public String getProdutoformatado(){
			String formatado = this.peso_produto.getvalorPeso().toString() + this.peso_produto.getMedida();
			return formatado;
		}
		
		public String getValorformatado() {
			String formatado = this.valor + "R$";
			return formatado;
		}
		
		
		class Peso{
			private Double valor_peso;
			private String medida;
			
			public Peso(Double valor_peso, String medida) {
				this.valor_peso = valor_peso;
				this.medida = medida;
			}
			
		public void setvalorPeso(Double valor_peso) {this.valor_peso = valor_peso;}
		public void setvalorMedida(String medida) { this.medida = medida;}
		
		public Double getvalorPeso() { return this.valor_peso;}
		public String getMedida() { return this.medida;}
		}
}
