package Controllers;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import ModelBeans.PessoaFisicaBeans;
import ModelDao.PessoaFisicaDAO;
public class ClienteFisicoController {
    private PessoaFisicaDAO repositorioClienteFisico;

     public ClienteFisicoController(){
        repositorioClienteFisico = new PessoaFisicaDAO();
    }

    public void AdicionarClienteFisico(String cpf, String rg, String sexo, Date dataNascimento,int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone){
        Random gerador = new Random();
        int codigo = gerador.nextInt();
        PessoaFisicaBeans clienteFisico = new PessoaFisicaBeans(cpf,rg,sexo,dataNascimento,codigo,numero,nome,tipo,cep,logradouro,cidade,bairro,uf,telefone);
        repositorioClienteFisico.adicionarClienteFisico(clienteFisico);
    }
    public void ExcluirClienteFisico(String cpf, String rg, String sexo, Date dataNascimento,int codigo,int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone){
        PessoaFisicaBeans clienteFisico = new PessoaFisicaBeans(cpf,rg,sexo,dataNascimento,codigo,numero,nome,tipo,cep,logradouro,cidade,bairro,uf,telefone);
        repositorioClienteFisico.excluirClienteFisico(clienteFisico);
    }

    public ArrayList<PessoaFisicaBeans> listarClientesFisico(){
         return repositorioClienteFisico.getClientesFisico();
    }

    public PessoaFisicaBeans buscarClienteFisicoCPF(String cpf){
         return repositorioClienteFisico.buscarClienteFisicoCPF(cpf);
    }

    public PessoaFisicaBeans buscarClienteFisicoNome(String nome){
         return repositorioClienteFisico.buscarClienteFisicoNome(nome);
    }

    public PessoaFisicaBeans buscarClienteFisicoCodigo(int codigo){
         return repositorioClienteFisico.buscarClienteFisicoCodigo(codigo);
    }
}
