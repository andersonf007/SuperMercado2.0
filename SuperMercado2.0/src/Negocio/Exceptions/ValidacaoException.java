package Negocio.Exceptions;

public class ValidacaoException extends Exception {
    private String mensage;
    public ValidacaoException(String mensage){
        super(mensage);
        
        this.mensage = mensage;
    }

}
