package ModelBeans;

public class Produto {
    private String Nome;
    private Double Id;
    private String Tipo;
    private Double Estoque;
    private int Quantidade;
    private Double ValorCusto;
    private Double ValorVenda;

    public Produto(String nome,Double id, String tipo, Double estoque,int quantidade, Double valorCusto, Double valorVenda) {
        Nome = nome;
        Id  = id;
        Tipo = tipo;
        Estoque = estoque;
        ValorCusto = valorCusto;
        ValorVenda = valorVenda;
        Quantidade = quantidade;
    }
    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public Double getEstoque() {
        return Estoque;
    }

    public void setEstoque(Double estoque) {
        Estoque = estoque;
    }

    public Double getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(Double valorCusto) {
        ValorCusto = valorCusto;
    }

    public Double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        ValorVenda = valorVenda;
    }

    public Double getId() {
        return Id;
    }

    public void setId(Double id) {
        Id = id;
    }
}
