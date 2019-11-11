/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;

/**
 *
 * @author anderson
 */
public class PessoaFisicaBeans extends PessoaBeans{

    private String cpf;
    private String rg;
    private String sexo; 

    public PessoaFisicaBeans(String cpf, String rg, String sexo,  int Codigo, String Nome, String Telefone, int CodEndereco, boolean ativo) {
        super(Codigo, Nome, Telefone, CodEndereco, ativo);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }    
    
    public PessoaFisicaBeans(){};
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
