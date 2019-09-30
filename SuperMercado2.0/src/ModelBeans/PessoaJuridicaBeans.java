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

    public PessoaJuridicaBeans(String cnpj, String ie, int codigo, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone) {
        super(codigo, numero, nome, tipo, cep, logradouro, cidade, bairro, uf, telefone);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
}
