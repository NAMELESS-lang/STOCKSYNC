class Item{

    String nome_item;
    String data_validade;
    String marca;
    Integer quantidade;
    Float peso;
    String unidade_medida;
    Float valor;

    public Item(String nome_item,String data_validade, String marca, Integer quantidade,Float peso,String unidade_medida,Float valor){
        this.nome_item = nome_item;
        this.data_validade = data_validade;
        this.marca = marca;
        this.quantidade = quantidade;
        this.peso = peso;
        this.unidade_medida = unidade_medida;
        this.valor = valor;
    }
    
    public Item(String nome_item,String data_validade, String marca, Integer quantidade,Float peso,Float valor){
        this.nome_item = nome_item;
        this.data_validade = data_validade;
        this.marca = marca;
        this.quantidade = quantidade;
        this.peso = peso;
        this.unidade_medida = null;
        this.valor = valor;
    }
    // GETTER
    public String getnomeItem(){return this.nome_item;}
    public String getdataValidade(){return this.data_validade;}
    public String getMarca(){return this.marca;}
    public Integer getQuantidade(){return this.quantidade;}
    public Float getPeso(){return this.peso;}
    public String getunidadeMedida(){return this.unidade_medida;}
    public Float getValor(){return this.valor;}

    //SETTER
    public void setnomeItem(String nome_item){this.nome_item = nome_item;}
    public void setdataValidade(String data_validade){this.data_validade = data_validade;}
    public void setMarca(String marca){this.marca = marca;}
    public void setQuantidade(Integer quantidade){this.quantidade = quantidade;}
    public void setPeso(Float peso){this.peso = peso;}
    public void setunidadeMedida(String unidade_medida){this.unidade_medida = unidade_medida;}
    public void setValor(Float valor){this.valor = valor;}
}