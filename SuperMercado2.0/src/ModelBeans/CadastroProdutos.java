package ModelBeans;


import Negocio.Exceptions.ValidacaoException;

public abstract class CadastroProdutos {
    
    public abstract void cadastrarProduto(ProdutoBeans object) throws ValidacaoException;
    
    public abstract void editarProduto(ProdutoBeans object) throws ValidacaoException;

}
