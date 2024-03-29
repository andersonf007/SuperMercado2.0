package Negocio;

import ModelBeans.CadastroPessoaFisicaBeans;
import ModelBeans.PessoaFisicaBeans;
import ModelDao.IPessoaFisicaDAO;
import Negocio.Exceptions.*;
import java.util.ArrayList;

public class PessoaFisicaNegocio extends CadastroPessoaFisicaBeans {
   private IPessoaFisicaDAO DAO;
   private ArrayList<PessoaFisicaBeans> ListPessoaFisicaBeans;

   public PessoaFisicaNegocio(IPessoaFisicaDAO DAO){
       this.DAO = DAO;
       ListPessoaFisicaBeans = DAO.buscarTodosOsRegistros();

   }

   @Override
    public void cadastrarPessoaFisica(PessoaFisicaBeans pessoaFisica) throws ValidacaoException{ //Faz as verificações necessárias e envia os dados para o repositorio
        for (PessoaFisicaBeans listPessoaFisicaBean : ListPessoaFisicaBeans) {
            if (pessoaFisica.getCpf().equals(listPessoaFisicaBean.getCpf())){
                throw new PessoaDuplicadaException();
            }
        }
        if(!pessoaFisica.getCpf().matches("[0-9]{11}")){
            throw new CpfInvalidoException();
        }
        if(!pessoaFisica.getRg().matches("[0-9]{1,11}")){ //Verifica se o RG possui apenas numeros com até 11 caracteres
            throw new RgInvalidoException();
        }
        if(!pessoaFisica.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")){ // Verifica se o nome possui caracteres especiais
            throw  new NomeInvalidoException();
        }
        if(!pessoaFisica.getTelefone().matches("[0-9]{1,11}")){
            throw new TelefoneInvalidoExcepition();
        }
        DAO.cadastrar(pessoaFisica);
    }

   @Override
    public void editarPessoaFisica(PessoaFisicaBeans pessoaFisica) throws ValidacaoException{
        //ListPessoaFisicaBeans = DAO.buscarTodosOsRegistros();

            if(!pessoaFisica.getCpf().matches("[0-9]{11}")){
                throw new CpfInvalidoException();
            }
            if (!pessoaFisica.getRg().matches("[0-9]{1,11}")) {
                throw new RgInvalidoException();
            }
            if (!pessoaFisica.getNome().matches("^([a-zA-Zà-üÀ-Ü]|-|_|\\s)+$")) { // Verifica se o nome possui caracteres especiais
                throw new NomeInvalidoException();
            }
            if (!pessoaFisica.getTelefone().matches("[0-9]{1,11}")) {
                throw new TelefoneInvalidoExcepition();
            }
            DAO.editar(pessoaFisica);
        }
}
