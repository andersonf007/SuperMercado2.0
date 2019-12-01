package Negocio.Exceptions;

public class ProdutoNaoExisteException extends ValidacaoException {
    public ProdutoNaoExisteException(){
        super("Produto não Existe");
    }
}
