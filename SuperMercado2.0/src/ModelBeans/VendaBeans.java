
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

public class VendaBeans {
    
    private int id;
    private double valor;
    private int idCliente;
    private double valorDescontro;
    private double valorAcrescimo;

    public VendaBeans(int id, double valor, int idCliente, double valorDescontro, double valorAcrescimo) {
        this.id = id;
        this.valor = valor;
        this.idCliente = idCliente;
        this.valorDescontro = valorDescontro;
        this.valorAcrescimo = valorAcrescimo;
    }

    public VendaBeans() {}

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the valorDescontro
     */
    public double getValorDescontro() {
        return valorDescontro;
    }

    /**
     * @param valorDescontro the valorDescontro to set
     */
    public void setValorDescontro(double valorDescontro) {
        this.valorDescontro = valorDescontro;
    }

    /**
     * @return the valorAcrescimo
     */
    public double getValorAcrescimo() {
        return valorAcrescimo;
    }

    /**
     * @param valorAcrescimo the valorAcrescimo to set
     */
    public void setValorAcrescimo(double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    
}
