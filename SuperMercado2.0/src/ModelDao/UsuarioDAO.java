package ModelDao;
import ModelBeans.UsuarioBeans;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    private ArrayList<ModelBeans.UsuarioBeans> Funcionarios;

    public UsuarioDAO(){
        Funcionarios = new ArrayList<ModelBeans.UsuarioBeans>();
    }

    public void adicionarUsuario( ModelBeans.UsuarioBeans funcionario){
        boolean existe = false;
        boolean adicionou = false;
        for(int j = 0; j <= Funcionarios.size();j++){  // Verifica se o funcionario já existe
            if(Funcionarios.size() == 0){
                continue;
            }else if(Funcionarios.get(j).equals(funcionario)){
                existe = true;
            }
        }
        if(!existe) {
            if (funcionario.isADM()) { // Verifica se o funcionário é um administrador
                Funcionarios.add(funcionario);
                adicionou = true;
            } else {
                for (int i = 0; i <= Funcionarios.size(); i++) { // caso não seja, verifica se existe pelo menos um administrador na lista de funcionarios
                    if (Funcionarios.get(i).isADM()) {
                        Funcionarios.add(funcionario); // Caso exista ele adiciona o funcionario normalmente
                        adicionou = true;
                    }
                }
            }
        }
        if(!adicionou){ // Caso contrario ele acusa um erro já que não é possível existir um funcionario sem um gerente/administrador 
            JOptionPane.showMessageDialog(null, "Não é possível adicionar o Funcionário");
        }else {
            JOptionPane.showMessageDialog(null, "Funcionário adicionado com sucesso");
        }
    }
    
    public void excluirFuncionario(ModelBeans.UsuarioBeans funcionario){
        boolean excluiu = false;
        boolean existe = false;
        for(int j = 0; j <= Funcionarios.size();j++){ // Verifica se o funcionário existe
            if(Funcionarios.get(j).equals(funcionario)){
                existe = true;
            }
        }
        if(existe) {
            if (funcionario.isADM()) { // verifica se o funcionário é um administrador
                for (int i = 0; i <= Funcionarios.size(); i++) {
                    if (Funcionarios.get(i).isADM() & !Funcionarios.get(i).equals(funcionario)) { // verifica se existe pelo menos outro funcionário administrador
                        Funcionarios.remove(funcionario);
                        excluiu = true;
                    }
                }
            } else {
                Funcionarios.remove(funcionario);
                excluiu = true;
            }
        }
        if(excluiu){
            System.out.println("Funcionário excluido com sucesso");
        }else {
            System.out.println("O Funcionário não pode ser excluido");
        }
    }

    public ModelBeans.UsuarioBeans buscarFuncionarioId(int Id){
        for(int i = 0; i <= Funcionarios.size();i++){
            if(Funcionarios.get(i).getId()== Id){
                return Funcionarios.get(i);
            }
        }
        return null;
    }
   
    public ModelBeans.UsuarioBeans buscarFuncionarioNome(String Nome){
        for(int i = 0; i <= Funcionarios.size();i++){
            if(Funcionarios.get(i).getNome().equals(Nome)){
                return Funcionarios.get(i);
            }
        }
        return null;
    }
    
    public ArrayList<ModelBeans.UsuarioBeans> getUsuarios() {
        return Funcionarios;
    }
     
    public ModelBeans.UsuarioBeans buscarFuncionarioLoginSenha(String login, String senha){
        for (int i = 0; i <= Funcionarios.size();i++){
            if(Funcionarios.get(i).getLogin().equals(login) && Funcionarios.get(i).getSenha().equals(senha)){
                return Funcionarios.get(i);
            }
        }
        return null;
    }
    
    public int quantidadeUsuarios(){
        if(Funcionarios.size() == 0){
            return 0;
        }else{
            return Funcionarios.size();
        }
        
    }
    
}
