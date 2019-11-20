package Negocio.Exceptions;

public class UsuarioNaoAdmException extends ValidacaoException {
    public UsuarioNaoAdmException(){
        super("Usuario não possui permisso de administrador");
    }
}
