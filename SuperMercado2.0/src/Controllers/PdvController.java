/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import ModelBeans.PessoaFisicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelBeans.ProdutoBeans;
import View.PDV;

/**
 *
 * @author anderson
 */
public class PdvController {
    private PDV pdv;
    
    public void abrePdv(){
        if(pdv == null) pdv = new PDV();
        
        pdv.setVisible(true);
    }
    
    public void RecebeInformacoesProduto(ProdutoBeans produtoBeans){
        pdv.receberProduto(produtoBeans);
    }    
    
    public void receberInformacoesPessoa(PessoaFisicaBeans pessoaFisicaBean,PessoaJuridicaBeans pessoaJuridicaBeans){
        pdv.receberPessoa(pessoaFisicaBean,pessoaJuridicaBeans);
    }
    
    public void receberConfirmacaoPagamento(String formaDePagamento,String AcrescimoDesconto,double valorAcrescimoDesconto){
       pdv.confirmacaoPagamento(formaDePagamento, AcrescimoDesconto, valorAcrescimoDesconto);
    }
}
