package Negocio.Exceptions;

public class PessoaNaoExisteException extends ValidacaoException {
    public PessoaNaoExisteException(){
        super("Pessoa não Existe");
    }
}
