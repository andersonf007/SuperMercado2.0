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
public abstract class CadastroVenda {
    
    public abstract void cadastrar(VendaBeans object);
    
    public abstract ArrayList<VendaBeans> buscar();
    
    public abstract int confereQuantidadeDeVendasRegistradas();

}
