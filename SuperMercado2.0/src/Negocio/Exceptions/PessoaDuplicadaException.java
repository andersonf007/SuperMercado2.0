package Negocio.Exceptions;

public class PessoaDuplicadaException extends ValidacaoException {
    public PessoaDuplicadaException(){
        super("Pessoa Já Cadastrada");
    }
}
