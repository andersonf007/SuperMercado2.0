package ModelDao;
import Exceptions.*;
import ModelBeans.CadastroUsuarioBeans;
import ModelBeans.UsuarioBeans;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
            pr.println(object.getId()
                        +"#"+object.getNome()
                        +"#"+object.getLogin()
                        +"#"+object.getSenha()
                        +"#"+object.getAdm()
                        +"#"+object.getAtivo());
            pr.close();
            arquivo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ ex);
        }
        
    }

    @Override
    public void editar(UsuarioBeans object) {
       try {
        //lê o arquivo e edita a linha de interesse
        ArrayList<String> conteudoDoArquivo = new ArrayList<>();
        File file = new File("usuario.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        Object[] linhas = br.lines().toArray();
        for (Object l : linhas) {
            String linha = (String) l;
            String[] palavras = linha.split("#");
            if (Integer.parseInt(palavras[0]) == object.getId()) {
                linha = linha.replace(linha,object.getId() + "#" + object.getNome() + "#" + object.getLogin() + "#" + object.getSenha() + "#" + object.getAdm() + "#" + object.getAtivo());
            }
            conteudoDoArquivo.add(linha);
        }
        br.close();

        //reescreve o arquivo
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String linha: conteudoDoArquivo){
            bw.append(linha).append("\n");
        }
        bw.flush();
        bw.close();
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
        ex.printStackTrace();
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
   
    @Override 
    public boolean validadorUsuario(UsuarioBeans usuario) throws ValidacaoException{ 
        if(!usuario.getNome().matches("[a-zA-Z\\s]+")){ // Verifica se o nome possui caracteres especiais
            throw  new NomeInvalidoException();
        }

        if(!usuario.getSenha().matches("[a-zA-Z\\d]")){ // So permite letras e numeros
            throw new SenhaInvalidaException();
        }
        return true;
    }
    
    @Override
    public boolean validarDuplicidade(UsuarioBeans usuario) throws ValidacaoException{
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) { // Verifica se existe um usuario com o mesmo login
            if (listUsuarioBean.getLogin().equals(usuario.getLogin())) {
                throw new LoginRepetidoException();
            }
        }
        return true;
    }
    
    @Override
    public boolean validarLogin(String login, String senha) throws ValidacaoException{
        for (UsuarioBeans listUsuarioBean : ListUsuarioBeans) {
            if (listUsuarioBean.getLogin().equals(login) && listUsuarioBean.getSenha().equals(senha)) {
                if(listUsuarioBean.getAtivo()){
                    return true;
                }else{
                    throw new UsuaroNaoAtivoException();
                }
            }
        }
        throw new LoginSenhaInvalidos();
    }
}
