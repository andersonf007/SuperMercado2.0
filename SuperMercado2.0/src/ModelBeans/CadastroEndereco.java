/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public abstract class CadastroEndereco {
    
    public abstract void cadastrar(EnderecoBeans object);
    
    public abstract void editar(EnderecoBeans object);
        
    public abstract ArrayList<EnderecoBeans> busca();
    
    public abstract int ConfereQuantidadeRegistros();   
    
}
