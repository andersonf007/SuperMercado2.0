package ModelDao;
import ModelBeans.PessoaFisicaBeans;
import java.util.ArrayList;
public class PessoaFisicaDAO {
    private ArrayList<PessoaFisicaBeans> ClientesFisico = new ArrayList<PessoaFisicaBeans>();

    //PessoaFisicaDAO(){
    //    ClientesFisico = new ArrayList<PessoaFisicaBeans>();
    //}

    public void adicionarClienteFisico(PessoaFisicaBeans clienteFisico){
        boolean existe = false;
        for(int j = 0; j <= ClientesFisico.size();j++){
            if(ClientesFisico.size() == 0){
                continue;
            }else if(ClientesFisico.get(j).equals(clienteFisico)){ // Verifica se já existe o cliente
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

    public void excluirClienteFisico(PessoaFisicaBeans clienteFisico){
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

    public PessoaFisicaBeans buscarClienteFisicoCPF(String cpf){
        for(int i = 0; i <= ClientesFisico.size();i++){
            if(ClientesFisico.get(i).getCpf().equals(cpf)){
                return ClientesFisico.get(i);
            }
        }
        return null;
    }
    
    public PessoaFisicaBeans buscarClienteFisicoNome(String nome){
        for(int i = 0; i <= ClientesFisico.size();i++){
            if(ClientesFisico.get(i).getNome().equals(nome)){
                return ClientesFisico.get(i);
            }
        }
        return null;
    }

    public ArrayList<PessoaFisicaBeans> getClientesFisico() {
        return ClientesFisico;
    }
    
    public PessoaFisicaBeans buscarClienteFisicoCodigo(int codigo){
        for(int i = 0; i <= ClientesFisico.size();i++){
            if(ClientesFisico.get(i).getCodigo() == codigo){
                return ClientesFisico.get(i);
            }
        }
        return null;
    }

}
