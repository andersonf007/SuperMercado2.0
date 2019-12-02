/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ModelBeans.CadastroProdutosVenda;
import ModelBeans.ProdutosVendaBeans;
import Negocio.Exceptions.ValidacaoException;

/**
 *
 * @author anderson
 */
public class ProdutoVendaNegocio extends CadastroProdutosVenda {

    @Override
    public boolean validarCaracteresEspeciaisProduto(String codigo, String valor, String quantidade) {
        if (!codigo.matches("[0-9.]+")) {
            return false;
        }
        if (!valor.matches("[0-9.]+")) {
            return false;
        }
        if (!quantidade.matches("[0-9]")) {
            return false;
        }
        return true;

    }
}
