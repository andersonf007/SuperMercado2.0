/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.CadPessoa;

/**
 *
 * @author anderson
 */
public class CadPessoaController {
    static CadPessoa cadPessoa;
    
    public static void abreCadastro(){
        if(cadPessoa == null) cadPessoa = new CadPessoa();
        
        cadPessoa.setVisible(true);
    }
}
