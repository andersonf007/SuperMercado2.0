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
    private Date dataNascimento;
    private String pesquisar;

    public PessoaFisicaBeans(String cpf, String rg, String sexo, Date dataNascimento, int codigo, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone) {
        super(codigo, numero, nome, tipo, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
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

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
