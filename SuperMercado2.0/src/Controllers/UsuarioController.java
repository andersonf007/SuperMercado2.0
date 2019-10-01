package Controllers;
import ModelDao.UsuarioDAO;
import java.util.ArrayList;
import java.util.Random;
import ModelBeans.UsuarioBeans;
public class UsuarioController {
    private UsuarioDAO repositorioUsuario;
    
    public UsuarioController(){
        this.repositorioUsuario = new UsuarioDAO();
    }

    public void CadastrarUsuario(String nome,String login, String senha){
        Random gerador = new Random();
        int id = gerador.nextInt();
        if(verificarLoginSenha(login,senha)){
            UsuarioBeans usuario = new UsuarioBeans(nome,id,login,senha);
            repositorioUsuario.adicionarUsuario(usuario);
        }else{
            System.out.println("Erro ao Cadastrar Usuario");
        }

    }

    public ArrayList<UsuarioBeans> listarUsuarios(){
        return repositorioUsuario.getUsuarios();
    }

    public UsuarioBeans buscarFuncionarioLoginSenha(String login, String senha){
        return repositorioUsuario.buscarFuncionarioLoginSenha(login,senha);
    }

    public UsuarioBeans buscarFuncionarioId(int id){
        return repositorioUsuario.buscarFuncionarioId(id);
    }

    public UsuarioBeans buscarFuncionarioNome(String nome){
        return repositorioUsuario.buscarFuncionarioNome(nome);
    }

    public void ExcluirUsuario(String nome, int id, String login, String senha){
        UsuarioBeans usuario = new UsuarioBeans(nome,id,login,senha);
        repositorioUsuario.excluirFuncionario(usuario);
    }


    private boolean verificarLoginSenha(String login,String senha){
        char caracteres[] = {'*',' ','-','/','(',')','#','&','%','$','?','|','/'};
        if(login.length() >= 11 || senha.length() >= 11){
            return false;
        }
        for(int i = 0; i <= login.length();i++){
            for(int j = 0;j <= caracteres.length;j++){
                if(login.charAt(i) == caracteres[j]){
                    return false;
                }
            }
        }
        for(int i = 0; i <= senha.length();i++){
            for(int j = 0;j <= caracteres.length;j++){
                if(senha.charAt(i) == caracteres[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
