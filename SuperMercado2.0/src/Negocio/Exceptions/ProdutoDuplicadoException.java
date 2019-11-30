package Negocio.Exceptions;

public class ProdutoDuplicadoException extends ValidacaoException {
    public ProdutoDuplicadoException(){
        super("Produto Duplicado");
    }
}
