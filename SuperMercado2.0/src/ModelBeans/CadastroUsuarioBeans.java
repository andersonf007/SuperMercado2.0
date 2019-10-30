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
public abstract class CadastroUsuarioBeans {
    
    public abstract void cadastrar(UsuarioBeans object);
    
    public abstract void editar(UsuarioBeans object);
    
    public abstract UsuarioBeans buscar(UsuarioBeans object);
    
    public abstract int quantidade();
}
