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
public abstract class CadastroPessoaFisicaBeans {

    public abstract void cadastrar(PessoaFisicaBeans object);
    
    public abstract void editar(PessoaFisicaBeans object);
    
    public abstract ArrayList<PessoaFisicaBeans> buscar();
    
    public abstract int confereQuantidadeDeRegistros();    
}
