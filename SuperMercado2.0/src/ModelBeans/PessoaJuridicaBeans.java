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
public class PessoaJuridicaBeans extends PessoaBeans {
    
    private String cnpj;
    private String ie;
                                                //retirado int codigo
    public PessoaJuridicaBeans(String cnpj, String ie, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone) {
               //retirado codigo
        super( numero, nome, tipo, cep, logradouro, cidade, bairro, uf, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
    }
    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the ie
     */
    public String getIe() {
        return ie;
    }

    /**
     * @param ie the ie to set
     */
    public void setIe(String ie) {
        this.ie = ie;
    }
    
    
}
