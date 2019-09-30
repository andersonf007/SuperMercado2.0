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
public class PessoaBeans {
    
   private int Codigo;
    private String Nome;
    private String Cep;
    private String Logradouro;
    private String Cidade;
    private String Bairro;
    private String Uf;
    private String Telefone;
    private String pesquisa;
    
    public PessoaBeans(int codigo, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone){
        this.Codigo = codigo;
        this.Nome = nome;
        this.Cep = cep;
        this.Logradouro = logradouro;
        this.Cidade = cidade;
        this.Bairro = bairro;
        this.Uf = uf;
        this.Telefone = telefone;

    }
    
    public PessoaBeans(){};

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getUf() {
        return Uf;
    }

    public void setUf(String uf) {
        Uf = uf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
}
