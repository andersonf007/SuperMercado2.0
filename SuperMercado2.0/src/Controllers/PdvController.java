/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import ModelBeans.PessoaBeans;
import ModelBeans.ProdutoBeans;
import View.BuscarProdutos;
import View.PDV;

/**
 *
 * @author anderson
 */
public class PdvController {
    static PDV pdv;
    
    public static void abrePdv(){
        if(pdv == null) pdv = new PDV();
        
        pdv.setVisible(true);
    }
    
    public static void RecebeInformacoesProduto(ProdutoBeans produtoBeans){
        pdv.receberProduto(produtoBeans);
    }
    
    
    
    public static void receberInformacoesPessoa(PessoaBeans pessoaBeans){
        pdv.receberPessoa(pessoaBeans);
    }
}
