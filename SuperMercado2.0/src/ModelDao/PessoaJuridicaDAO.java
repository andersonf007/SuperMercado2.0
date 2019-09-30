package ModelDao;
import ModelBeans.PessoaJuridicaBeans;
import java.util.ArrayList;

public class PessoaJuridicaDAO {
    private ArrayList<PessoaJuridicaBeans> ClientesJuridico = new ArrayList<PessoaJuridicaBeans>();
    
    /*PessoaJuridicaDAO(){
        ClientesJuridico = new ArrayList<PessoaJuridicaBeans>();
    }*/
    
    public void adicionarClienteJuridico(PessoaJuridicaBeans clienteJuridico){
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

    public void excluirClienteFisico(PessoaJuridicaBeans clienteJuridico){
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

    public PessoaJuridicaBeans buscarClienteJuridicoCNPJ(String cnpj){
        for(int i = 0; i <= ClientesJuridico.size();i++){
            if(ClientesJuridico.get(i).getCnpj().equals(cnpj)){
                return ClientesJuridico.get(i);
            }
        }
        return null;
    }
    public PessoaJuridicaBeans buscarClienteFisicoNome(String nome){
        for(int i = 0; i <= ClientesJuridico.size();i++){
            if(ClientesJuridico.get(i).getNome().equals(nome)){
                return ClientesJuridico.get(i);
            }
        }
        return null;
    }
}
