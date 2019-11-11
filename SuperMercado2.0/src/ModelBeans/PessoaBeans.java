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
    private int CodEndereco;
    private boolean ativo;

    public PessoaBeans(int Codigo, String Nome, String Telefone, int CodEndereco, boolean ativo) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.CodEndereco = CodEndereco;
        this.ativo = ativo;
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
     * @return the CodEndereco
     */
    public int getCodEndereco() {
        return CodEndereco;
    }

    /**
     * @param CodEndereco the CodEndereco to set
     */
    public void setCodEndereco(int CodEndereco) {
        this.CodEndereco = CodEndereco;
    }

    /**
     * @return the ativo
     */
    public boolean getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
