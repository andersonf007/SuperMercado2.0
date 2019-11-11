/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.BuscarPessoas;
import View.CadPessoa;

/**
 *
 * @author anderson
 */
public class PessoaController {
    
    static BuscarPessoas pessoa;
    static CadPessoa cadPessoa;
    
    public static void openBuscarPessoa(){
        if(pessoa == null)
            pessoa = new BuscarPessoas();
        
        pessoa.setVisible(true);
    }
    
    public static void abreCadPessoa(){
        if(cadPessoa == null)
            cadPessoa = new CadPessoa();
        
        cadPessoa.setVisible(true);
    }
    
}
