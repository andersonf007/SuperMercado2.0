/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import Negocio.Exceptions.LoginRepetidoException;
import Negocio.Exceptions.NomeInvalidoException;
import Negocio.Exceptions.SenhaInvalidaException;
import Negocio.Exceptions.ValidacaoException;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public abstract class CadastroUsuarioBeans {

    
   public abstract void cadastrar(UsuarioBeans Usuario) throws LoginRepetidoException,NomeInvalidoException,SenhaInvalidaException;
    
    public abstract void editar(UsuarioBeans object);
    
    public abstract boolean validadorUsuario(UsuarioBeans usuario) throws ValidacaoException;

    public abstract boolean validarDuplicidade(UsuarioBeans usuario) throws ValidacaoException;

    public abstract boolean validarLogin(String login, String senha) throws ValidacaoException;

    public abstract boolean ValidarAdm(String login, String senha) throws  ValidacaoException;
}
