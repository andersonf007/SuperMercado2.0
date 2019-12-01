package Negocio;

import ModelBeans.CadastroProdutos;
import ModelBeans.ProdutoBeans;
import ModelDao.IProduto;
import Negocio.Exceptions.ProdutoDuplicadoException;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

public class ProdutoNegocio extends CadastroProdutos {
    private IProduto DAO;
    private ArrayList<ProdutoBeans> ListProdutosBeans;

    public ProdutoNegocio(IProduto DAO){
        this.DAO = DAO;
        ListProdutosBeans = DAO.busca();
    }

    public void cadastrarProduto(ProdutoBeans produto) throws ValidacaoException {
        for(int i = 0; i < ListProdutosBeans.size();i++){
             if(produto.getNome().equals(ListProdutosBeans.indexOf(i))){
                 throw new ProdutoDuplicadoException();
             }
        }
        DAO.cadastrar(produto);
    }

    public void editarProduto(ProdutoBeans produto) throws ValidacaoException{
        for(int i = 0; i < ListProdutosBeans.size();i++){
            if(produto.getNome().equals(ListProdutosBeans.indexOf(i))){
                throw new ProdutoDuplicadoException();
            }
        }
        DAO.editar(produto);
    }
}
