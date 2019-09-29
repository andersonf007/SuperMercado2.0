package Repositorios;
import ModelBeans.ClienteFisico;
import java.util.ArrayList;
public class RepositorioClienteFisico {
    private ArrayList<ClienteFisico> ClientesFisico;

    RepositorioClienteFisico(){
        ClientesFisico = new ArrayList<ClienteFisico>();
    }

    public void adicionarClienteFisico(ClienteFisico clienteFisico){
        boolean existe = false;
        for(int j = 0; j <= ClientesFisico.size();j++){
            if(ClientesFisico.get(j).equals(clienteFisico)){ // Verifica se já existe o cliente
                existe = true;
            }
        }
        if(!existe){
            ClientesFisico.add(clienteFisico);
            System.out.println("Cliente adicionado com sucesso");
        }else {
            System.out.println("Erro ao adicionar o cliente");
        }
    }

    public void excluirClienteFisico(ClienteFisico clienteFisico){
        boolean existe = false;
        for(int j = 0; j <= ClientesFisico.size();j++){
            if(ClientesFisico.get(j).equals(clienteFisico)){
                existe = true;
            }
        }
        if(existe){
            ClientesFisico.remove(clienteFisico);
            System.out.println("Cliente Removido com sucesso");
        }else {
            System.out.println("O cliente não pode ser removido");
        }
    }

    public ClienteFisico buscarClienteFisicoCPF(String cpf){
        for(int i = 0; i <= ClientesFisico.size();i++){
            if(ClientesFisico.get(i).getCpf().equals(cpf)){
                return ClientesFisico.get(i);
            }
        }
        return null;
    }
    public ClienteFisico buscarClienteFisicoNome(String nome){
        for(int i = 0; i <= ClientesFisico.size();i++){
            if(ClientesFisico.get(i).getNome().equals(nome)){
                return ClientesFisico.get(i);
            }
        }
        return null;
    }

}
