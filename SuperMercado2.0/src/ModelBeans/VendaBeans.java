  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

public class VendaBeans {
    
    private int numero;
    private double valor;
    private int idProduto;

    public VendaBeans(int numero, double valor, int idProduto) {
        this.numero = numero;
        this.valor = valor;
        this.idProduto = idProduto;
    }

    public VendaBeans() {}
  
    /**
     * @return the numero
     */
    public int getNumedo() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the valor
     */
    public double getValorVenda() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValorVenda(double valor) {
        this.valor = valor;
    }

    /**
     * @return the pesquisa
     */
    public int getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(int pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
    
}
