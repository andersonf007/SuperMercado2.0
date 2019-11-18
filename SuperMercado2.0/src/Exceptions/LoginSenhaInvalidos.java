package Exceptions;

public class LoginSenhaInvalidos extends ValidacaoException {
    public LoginSenhaInvalidos(){
        super("Login ou Senha invalidos");
    }
}
