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
public abstract class CadastroProdutosVenda {
    
    public abstract void cadastrar(ProdutosVendaBeans object);
    
    public abstract ArrayList<ProdutosVendaBeans> buscar();
    
}