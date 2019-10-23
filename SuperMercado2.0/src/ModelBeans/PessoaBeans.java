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
   
    private String Telefone;
    private String pesquisa;
    
    public PessoaBeans(int codigo, int numero, String nome, String tipo,String telefone){
        this.Codigo = codigo;
        this.Nome = nome;
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
