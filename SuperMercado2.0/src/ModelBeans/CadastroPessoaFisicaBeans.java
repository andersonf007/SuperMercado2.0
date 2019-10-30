/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author anderson
 */
public abstract class CadastroPessoaFisicaBeans {

    public abstract void cadastrar(PessoaFisicaBeans object);
    
    public abstract void editar(PessoaFisicaBeans object);
    
    public abstract PessoaFisicaBeans buscar(PessoaFisicaBeans object);
    
    public abstract int quantidade();    
}
