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
public abstract class CadastroPessoaJuridicaBeans {
    
    public abstract void cadastrar(PessoaJuridicaBeans object);
    
    public abstract void editar(PessoaJuridicaBeans object);
    
    public abstract PessoaJuridicaBeans buscar(PessoaJuridicaBeans object);
    
    public abstract int quantidade();
}
