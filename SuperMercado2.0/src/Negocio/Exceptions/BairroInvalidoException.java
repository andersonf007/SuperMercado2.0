package Negocio.Exceptions;

public class BairroInvalidoException extends ValidacaoException {
    public BairroInvalidoException(){
        super("Nome do Bairro é Invalido");
    }
}
