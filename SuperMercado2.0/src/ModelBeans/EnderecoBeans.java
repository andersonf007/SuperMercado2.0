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
public class EnderecoBeans {

    private int id;
    private String Cep;
    private String Logradouro;
    private String Cidade;
    private String Bairro;
    private String Uf;
    private String numero;
    
    public EnderecoBeans(int id,String Cep,String Logradouro,String Cidade,String Bairro,String Uf,String numero){
        this.id = id;
        this.Cep = Cep;
        this.Logradouro = Logradouro;
        this.Cidade = Cidade;
        this.Bairro = Bairro;
        this.Uf = Uf;
        this.numero = numero;
    }

    public EnderecoBeans() {}
    
    
    
    /**
     * @return the Cep
     */
    public String getCep() {
        return Cep;
    }

    /**
     * @param Cep the Cep to set
     */
    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Uf
     */
    public String getUf() {
        return Uf;
    }

    /**
     * @param Uf the Uf to set
     */
    public void setUf(String Uf) {
        this.Uf = Uf;
    }

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
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    
    
}
