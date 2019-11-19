package Negocio.Exceptions;

public class LoginRepetidoException extends ValidacaoException {
    public LoginRepetidoException(){
        super("Já existe usuario com o mesmo login");
    }
}
