package Negocio.Exceptions;

public class SenhaInvalidaException extends ValidacaoException {
    public SenhaInvalidaException(){
        super("Senha invalida");
    }
}
