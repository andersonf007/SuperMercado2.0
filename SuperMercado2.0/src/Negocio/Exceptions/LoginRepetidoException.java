package Negocio.Exceptions;

import javax.swing.JOptionPane;

public class LoginRepetidoException extends ValidacaoException {
    public LoginRepetidoException(){
        super("Já existe usuario com o mesmo login");
    }
}
