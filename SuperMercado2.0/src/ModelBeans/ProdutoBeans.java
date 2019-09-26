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

    private String descricao;
    private Double estoque;
    private Double ValorCusto;
    private Double ValorVenda;

    public ProdutoBeans(String descricao, Double estoque, Double ValorCusto, Double ValorVenda) {
        this.descricao = descricao;
        this.estoque = estoque;
        this.ValorCusto = ValorCusto;
        this.ValorVenda = ValorVenda;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the estoque
     */
    public Double getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the ValorCusto
     */
    public Double getValorCusto() {
        return ValorCusto;
    }

    /**
     * @param ValorCusto the ValorCusto to set
     */
    public void setValorCusto(Double ValorCusto) {
        this.ValorCusto = ValorCusto;
    }

    /**
     * @return the ValorVenda
     */
    public Double getValorVenda() {
        return ValorVenda;
    }

    /**
     * @param ValorVenda the ValorVenda to set
     */
    public void setValorVenda(Double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    
}
