package ModelDao;
import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.UsuarioBeans;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class UsuarioDAO extends CadastroUsuarioBeans{
    
    ArrayList<UsuarioBeans> ListUsuarioBeans = new ArrayList<UsuarioBeans>();
    

    @Override
    public void cadastrar(UsuarioBeans object) {
        try {
            FileOutputStream arquivo = new FileOutputStream("usuario.txt",true);
            PrintWriter pr = new PrintWriter(arquivo);
            pr.println(object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm()+"#"+object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
        
    }

    @Override
    public void editar(UsuarioBeans object) {
         
        try {
            
            String linha, putData;
            File file = new File("usuario.txt");
            FileReader fr = new FileReader(file);
            try (BufferedReader br = new BufferedReader(fr)) {                
            //file.createNewFile();             
                //while( (linha=br.readLine()) != null ){ //***editted
                //**deleted**verify = br.readLine();**
                do{
                    linha = br.readLine();
                    //if (linha != null) {
                    //***edited
                    String[] palavras = linha.split("#");
                    if(Integer.parseInt(palavras[0]) == object.getId()){
                        FileWriter fw = new FileWriter(file);
                        try (BufferedWriter bw = new BufferedWriter(fw)) {
                            putData = linha.replace(linha,object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm()+"#"+object.getAtivo());
                            //bw.append(putData);
                            bw.write(putData);
                            bw.flush();
                            bw.close();
                        }
                    }
                    //linha = br.readLine();
                }while(linha != null);
                //}
                /*
                InputStream is = new FileInputStream("usuario.txt");
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                //BufferedWriter bw = new BufferedWriter(isr);
                String linha = br.readLine();
                while (linha != null) {
                String[] palavras = linha.split("#");
                if(Integer.parseInt(palavras[0]) == object.getId()){
                linha = linha.replace(linha, object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm()+"#"+object.getAtivo());
                //linha.write(linha + System.getProperty("line.separator"));
                }
                linha = br.readLine();
                }
                 */
                /*File arquivo = new File("usuario.txt");
                FileWriter writer = new FileWriter(arquivo);
                Scanner scanner = new Scanner((Readable) writer);
                while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                String[] palavras = linha.split("#");
                if(Integer.parseInt(palavras[0]) == object.getId()){
                linha = linha.replace(linha, object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm()+"#"+object.getAtivo());
                writer.write(linha + System.getProperty("line.separator"));
                }
                }*/
                /*
                FileInputStream arquivo = new FileInputStream("usuario.txt");
                InputStreamReader input = new InputStreamReader(arquivo);
                BufferedReader buffer = new BufferedReader(input);
                do{
                linha = buffer.readLine();
                if(linha != null){
                //UsuarioBeans usuarioBeans = new UsuarioBeans();
                String[] palavras = linha.split("#");
                if(Integer.parseInt(palavras[0]) == object.getId()){
                linha = linha.replace(linha,object.getId()+"#"+object.getNome()+"#"+object.getLogin()+"#"+object.getSenha()+"#"+object.getAdm()+"#"+object.getAtivo());
                }
                /*
                usuarioBeans.setId(Integer.parseInt(palavras[0]));
                usuarioBeans.setNome(palavras[1]);
                usuarioBeans.setLogin(palavras[2]);
                usuarioBeans.setSenha(palavras[3]);
                usuarioBeans.setAdm(Boolean.parseBoolean(palavras[4]));
                usuarioBeans.setAtivo(Boolean.parseBoolean(palavras[5]));
                ListUsuarioBeans.add(usuarioBeans);
                }
                }while(linha != null);
                 */
            }             
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
    }

    @Override
    public ArrayList<UsuarioBeans> busca() {
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
                        usuarioBeans.setAdm(Boolean.parseBoolean(palavras[4]));
                        usuarioBeans.setAtivo(Boolean.parseBoolean(palavras[5]));
                        ListUsuarioBeans.add(usuarioBeans);
                    }                    
            }while(linha != null);
                        
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não existe arquivo de usuario! " + ex);
        }
        return ListUsuarioBeans;
    }

    @Override
    public int confereQuantidadeDeUsuariosRegistrados() {
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
