/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author anderson
 */
public class ProdutoBeans {

    private String Nome;
    private double Id;
    private String Tipo;
    private double Estoque;
    private int Quantidade;
    private double ValorCusto;
    private double ValorVenda;
    private String pesquisar;

    public ProdutoBeans(String nome,double id, String tipo, double estoque,int quantidade, double valorCusto, double valorVenda) {
        Nome = nome;
        Id  = id;
        Tipo = tipo;
        Estoque = estoque;
        ValorCusto = valorCusto;
        ValorVenda = valorVenda;
        Quantidade = quantidade;
    }
    
    public ProdutoBeans(){};
    
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

    public double getEstoque() {
        return Estoque;
    }

    public void setEstoque(double estoque) {
        Estoque = estoque;
    }

    public double getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(double valorCusto) {
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

    /**
     * @return the pesquisar
     */
    public String getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }
 
}
