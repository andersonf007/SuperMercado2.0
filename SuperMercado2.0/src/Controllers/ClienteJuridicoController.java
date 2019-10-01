package Controllers;
import java.util.ArrayList;
import java.util.Random;
import ModelBeans.PessoaJuridicaBeans;
import ModelDao.PessoaJuridicaDAO;
public class ClienteJuridicoController {
    private PessoaJuridicaDAO repositorioClienteJuridico;
    public ClienteJuridicoController(){
        repositorioClienteJuridico = new PessoaJuridicaDAO();
    }
    public void AdicionarClienteJuridico(String cnpj, String ie, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone) {
        Random gerador = new Random();
        int codigo = gerador.nextInt();
        PessoaJuridicaBeans clienteJuridico = new PessoaJuridicaBeans(cnpj,ie,codigo,numero,nome,tipo,cep,logradouro,cidade,bairro,uf,telefone);
        repositorioClienteJuridico.adicionarClienteJuridico(clienteJuridico);
    }

    public void excluirClienteJuridico(String cnpj, String ie, int codigo, int numero, String nome, String tipo, String cep, String logradouro, String cidade, String bairro, String uf, String telefone){
        PessoaJuridicaBeans clienteJuridico = new PessoaJuridicaBeans(cnpj,ie,codigo,numero,nome,tipo,cep,logradouro,cidade,bairro,uf,telefone);
        repositorioClienteJuridico.excluirClienteFisico(clienteJuridico);
    }

    public ArrayList<PessoaJuridicaBeans> listarClientesJuridico(){
        return repositorioClienteJuridico.getClientesJuridico();
    }

    public PessoaJuridicaBeans buscarClienteJuridicoCodigo(int codigo){
        return repositorioClienteJuridico.buscarClienteFisicoCodigo(codigo);
    }

    public PessoaJuridicaBeans buscarClienteJuridicoNome(String nome){
        return repositorioClienteJuridico.buscarClienteFisicoNome(nome);
    }

    public PessoaJuridicaBeans buscarClienteJuridicoCnpj(String cnpj){
        return repositorioClienteJuridico.buscarClienteJuridicoCNPJ(cnpj);
    }
}
