  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;
import java.util.Date;

public class VendaBeans {
    
    private int numero;
    private Date dataVenda;
    private double valor;
    private int pesquisa;

    /**
     * @return the id_pessoa
     */
    public int getId_pessoa() {
        return numero;
    }

    /**
     * @param numero the id_pessoa to set
     */
    public void setId_pessoa(int numero) {
        this.numero = numero;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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
