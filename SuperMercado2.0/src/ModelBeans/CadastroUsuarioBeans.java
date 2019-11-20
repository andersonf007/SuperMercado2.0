/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import Exceptions.ValidacaoException;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public abstract class CadastroUsuarioBeans {
    
    public abstract void cadastrar(UsuarioBeans object);
    
    public abstract void editar(UsuarioBeans object);
    
    public abstract ArrayList<UsuarioBeans> busca();
    
    public abstract int confereQuantidadeDeUsuariosRegistrados();
    
    public abstract boolean validadorUsuario(UsuarioBeans usuario) throws ValidacaoException;
    
    public abstract boolean validarDuplicidade(UsuarioBeans usuario) throws ValidacaoException;
    
    public abstract boolean validarLogin(String login, String senha) throws ValidacaoException;
    
    public abstract boolean ValidarAdm(String login, String senha) throws ValidacaoException, ValidacaoException;
}
