/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.FormaPagamento;

/**
 *
 * @author anderson
 */
public class FormaPagamentoController {
    
    private FormaPagamento formaPagamento;
    
    public void abrirFormaPagamento(){
        if(formaPagamento == null) formaPagamento = new FormaPagamento();
        
        formaPagamento.setVisible(true);
    }
    
    public void enviarInformacoesDoPdv(String valorTotal){
        formaPagamento.receberInformacoesPDV(valorTotal);
    }
    
    
}
