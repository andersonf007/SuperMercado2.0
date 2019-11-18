package Exceptions;

public class UsuaroNaoAtivoException extends ValidacaoException{
    public UsuaroNaoAtivoException(){
        super("Usuario não encontra-se ativo");
    }
}
