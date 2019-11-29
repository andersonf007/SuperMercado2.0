/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import View.Estoque;
/**
 *
 * @author anderson
 */
public class EstoqueController {
    
    private Estoque estoque;
    
    public void abrirEstoque(){
        if(estoque == null) estoque = new Estoque();               
        
        estoque.setVisible(true);

    }
    
}
