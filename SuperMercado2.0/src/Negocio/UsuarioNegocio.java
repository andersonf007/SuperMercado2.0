package Negocio;

import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.UsuarioBeans;
import Negocio.Exceptions.*;
import ModelDao.IUsuarioDAO;
import Negocio.Exceptions.ValidacaoException;
import java.util.ArrayList;

public class UsuarioNegocio extends CadastroUsuarioBeans {

    private ArrayList<UsuarioBeans> ListUsuarioBeans;
    private IUsuarioDAO DAO;


    //public UsuarioNegocio(){
    public UsuarioNegocio(IUsuarioDAO DAO){
        this.DAO = DAO;
        ListUsuarioBeans = DAO.busca(); 
    }

    @Override
    public void CadastrarUsuario(UsuarioBeans usuario) throws ValidacaoException {
        //ListUsuarioBeans = DAO.busca();        
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) { // Verifica se existe um usuario com o mesmo login
            if (listUsuarioBean.getLogin().equals(usuario.getLogin())) {
                throw new LoginRepetidoException();
            }
        }
        if(!usuario.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")){ // Verifica se o nome possui caracteres especiais
            throw  new NomeInvalidoException();
        }

        if(!usuario.getSenha().matches("[a-zA-Z0-9]+")){ // So permite letras e numeros
            throw new SenhaInvalidaException();
        }
        DAO.cadastrar(usuario);
    }

    @Override
    public void EditarUsuario(UsuarioBeans usuario) throws ValidacaoException{
        //ListUsuarioBeans = DAO.busca();


            if (!usuario.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")) { // Verifica se o nome possui caracteres especiais
                throw new NomeInvalidoException();
            }

            if (!usuario.getSenha().matches("[a-zA-Z0-9]+")) { // So permite letras e numeros
                throw new SenhaInvalidaException();
            }
            DAO.editar(usuario);
    }


    @Override
    public boolean validarLogin(String login, String senha) throws ValidacaoException{
        //ListUsuarioBeans = DAO.busca();
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
        //ListUsuarioBeans = DAO.busca();
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
