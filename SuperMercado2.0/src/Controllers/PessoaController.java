/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.BuscarPessoas;

/**
 *
 * @author anderson
 */
public class PessoaController {
    
    static BuscarPessoas pessoa;
    
    public static void openBuscarPessoaFisica(){
        if(pessoa == null)
            pessoa = new BuscarPessoas();
        
        pessoa.setVisible(true);
    }
    
}
