package Negocio;

import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.UsuarioBeans;
import Negocio.Exceptions.*;
import ModelDao.UsuarioDAO;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

public class UsuarioNegocio extends CadastroUsuarioBeans {
    ArrayList<UsuarioBeans> ListUsuarioBeans;
    UsuarioDAO usuarioDAO;

    public UsuarioNegocio(){
        ListUsuarioBeans = new ArrayList<UsuarioBeans>();
        usuarioDAO = new UsuarioDAO();
    }

    public void cadastrar(UsuarioBeans Usuario){
        validarDuplicidade(Usuario);
        validadorUsuario(Usuario);
        usuarioDAO.cadastrar(Usuario);

    }

    @Override
    public boolean validadorUsuario(UsuarioBeans usuario) throws ValidacaoException {
        if(!usuario.getNome().matches("[a-zA-Z\\s]+")){ // Verifica se o nome possui caracteres especiais
            throw  new NomeInvalidoException();
        }

        if(!usuario.getSenha().matches("[a-zA-Z\\d]")){ // So permite letras e numeros
            throw new SenhaInvalidaException();
        }
        return true;
    }

    @Override
    public boolean validarDuplicidade(UsuarioBeans usuario) throws ValidacaoException{
        ListUsuarioBeans = usuarioDAO.busca();
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) { // Verifica se existe um usuario com o mesmo login
            if (listUsuarioBean.getLogin().equals(usuario.getLogin())) {
                throw new LoginRepetidoException();
            }
        }
        return true;
    }

    @Override
    public boolean validarLogin(String login, String senha) throws ValidacaoException{
        ListUsuarioBeans = usuarioDAO.busca();
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) {
            if (listUsuarioBean.getLogin().equals(login) && listUsuarioBean.getSenha().equals(senha)) {
                if(listUsuarioBean.getAtivo()){
                    return true;
                }else{
                    throw new UsuaroNaoAtivoException();
                }
            }
        }
        throw new LoginSenhaInvalidos();
    }

    @Override
    public boolean ValidarAdm(String login, String senha) throws ValidacaoException{
        ListUsuarioBeans = usuarioDAO.busca();
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) {
            if (listUsuarioBean.getLogin().equals(login) && listUsuarioBean.getSenha().equals(senha)) {
                if(listUsuarioBean.getAdm()){
                    return true;
                }else{
                    throw new UsuarioNaoAdmException();
                }
            }
        }
        throw new LoginSenhaInvalidos();
    }

}
