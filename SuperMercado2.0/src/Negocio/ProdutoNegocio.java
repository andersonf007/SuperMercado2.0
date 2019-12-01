package Negocio;

import ModelBeans.CadastroProdutos;
import ModelBeans.ProdutoBeans;
import ModelDao.IProdutoDAO;
import Negocio.Exceptions.NomeInvalidoException;
import Negocio.Exceptions.ProdutoDuplicadoException;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

public class ProdutoNegocio extends CadastroProdutos {
    private IProdutoDAO DAO;
    private ArrayList<ProdutoBeans> ListProdutosBeans;

    public ProdutoNegocio(IProdutoDAO DAO){
        this.DAO = DAO;
        ListProdutosBeans = DAO.busca();
    }
    // colocar validacoes par nao inserir letras em valor de custo, estoque e valor de venda
    public void cadastrarProduto(ProdutoBeans produto) throws ValidacaoException {
        for(int i = 0; i < ListProdutosBeans.size();i++){
             if(produto.getNome().equals(ListProdutosBeans.get(i).getNome())){
                 throw new ProdutoDuplicadoException();
             }
        }
        if(!produto.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")){
            throw new NomeInvalidoException();
        }
        DAO.cadastrar(produto);

    }
    // colocar validacoes par nao inserir letras em valor de custo, estoque e valor de venda
    public void editarProduto(ProdutoBeans produto) throws ValidacaoException{
        if(!produto.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")){
            throw new NomeInvalidoException();
        }
        DAO.editar(produto);
    }

    public boolean buscarId(int id){
        for (ProdutoBeans listProdutosBean : ListProdutosBeans) {
            if (listProdutosBean.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
