package Negocio.Exceptions;

public class CidadeInvalidoException extends ValidacaoException {
    public CidadeInvalidoException(){
        super("Nome da Cidade é invalido");
    }
}
