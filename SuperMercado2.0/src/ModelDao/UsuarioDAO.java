package ModelDao;
import ModelBeans.CadastroBeans;
import ModelBeans.UsuarioBeans;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO extends CadastroBeans{

    @Override
    public void cadastrar(Object object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("usuario.txt");
            PrintWriter pr = new PrintWriter(arquivo);
            Class classe = object.getClass();
            //pr.println(classe.);
            pr.close();
            arquivo.close();
            
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void editar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscar(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int quantidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
