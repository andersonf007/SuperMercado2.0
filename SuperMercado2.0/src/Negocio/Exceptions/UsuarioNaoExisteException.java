package Negocio.Exceptions;

public class UsuarioNaoExisteException extends ValidacaoException {
    public UsuarioNaoExisteException(){
        super("Usuario não Existe");
    }
}
