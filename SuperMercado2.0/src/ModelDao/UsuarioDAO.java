package ModelDao;
import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.UsuarioBeans;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO extends CadastroUsuarioBeans{
    
    ArrayList<UsuarioBeans> ListUsuarioBeans = new ArrayList<UsuarioBeans>();
    

    @Override
    public void cadastrar(UsuarioBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("usuario.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm());
            pr.close();
            arquivo.close();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
        
    }

    @Override
    public void editar(UsuarioBeans object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<UsuarioBeans> buscar() {
            String linha;
        try {
            FileInputStream arquivo = new FileInputStream("usuario.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    UsuarioBeans usuarioBeans = new UsuarioBeans();
                    String[] palavras = linha.split("#");                    
                    usuarioBeans.setId(Integer.parseInt(palavras[0]));
                    usuarioBeans.setNome(palavras[1]);
                    usuarioBeans.setLogin(palavras[2]);
                    usuarioBeans.setSenha(palavras[3]);
                    usuarioBeans.setAdm(Boolean.getBoolean(palavras[4]));
                    ListUsuarioBeans.add(usuarioBeans);
                }
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListUsuarioBeans;
    }

    @Override
    public int quantidade() {
            String linha;
            int contador = 0;
        try {
            FileInputStream arquivo = new FileInputStream("usuario.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            
            do{
                linha = buffer.readLine();
                if(linha != null){
                    contador ++;
                }
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return contador;
    }
   
    public boolean validador(String senha){
        return true;
    }
}
