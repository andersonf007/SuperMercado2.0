package Repositorios;
import ModelBeans.ClienteJuridico;
import java.util.ArrayList;

public class RepositorioClienteJuridico {
    private ArrayList<ClienteJuridico> ClientesJuridico;
    RepositorioClienteJuridico(){
        ClientesJuridico = new ArrayList<ClienteJuridico>();
    }
    public void adicionarClienteJuridico(ClienteJuridico clienteJuridico){
        boolean existe = false;
        for(int j = 0; j <= ClientesJuridico.size();j++){
            if(ClientesJuridico.get(j).equals(clienteJuridico)){ // Verifica se já existe o cliente
                existe = true;
            }
        }
        if(!existe){
            ClientesJuridico.add(clienteJuridico);
            System.out.println("Cliente adicionado com sucesso");
        }else {
            System.out.println("Erro ao adicionar o cliente");
        }
    }

    public void excluirClienteFisico(ClienteJuridico clienteJuridico){
        boolean existe = false;
        for(int j = 0; j <= ClientesJuridico.size();j++){
            if(ClientesJuridico.get(j).equals(clienteJuridico)){
                existe = true;
            }
        }
        if(existe){
            ClientesJuridico.remove(clienteJuridico);
            System.out.println("Cliente Removido com sucesso");
        }else {
            System.out.println("O cliente não pode ser removido");
        }
    }

    public ClienteJuridico buscarClienteJuridicoCNPJ(String cnpj){
        for(int i = 0; i <= ClientesJuridico.size();i++){
            if(ClientesJuridico.get(i).getCnpj().equals(cnpj)){
                return ClientesJuridico.get(i);
            }
        }
        return null;
    }
    public ClienteJuridico buscarClienteFisicoNome(String nome){
        for(int i = 0; i <= ClientesJuridico.size();i++){
            if(ClientesJuridico.get(i).getNome().equals(nome)){
                return ClientesJuridico.get(i);
            }
        }
        return null;
    }
}
