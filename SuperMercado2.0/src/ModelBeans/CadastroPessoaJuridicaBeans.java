/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public abstract class CadastroPessoaJuridicaBeans {
    
    public abstract void cadastrarPessoaJuridica(PessoaJuridicaBeans object) throws ValidacaoException;
    
    public abstract void editarPessoaJuridica(PessoaJuridicaBeans object) throws ValidacaoException;

}
