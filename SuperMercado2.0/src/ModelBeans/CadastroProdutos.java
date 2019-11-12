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
public abstract class CadastroProdutos {
    
    public abstract void cadastrar(ProdutoBeans object);
    
    public abstract void editar(ProdutoBeans object);
    
    public abstract ArrayList<ProdutoBeans> busca();
    
    public abstract int confereQuantidadeDeProdutosRegistrados();
    
    public abstract boolean validarInformacoes(ProdutoBeans object);
}
