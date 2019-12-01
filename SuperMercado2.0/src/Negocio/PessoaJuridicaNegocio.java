package Negocio;

import ModelBeans.CadastroPessoaJuridicaBeans;
import ModelBeans.PessoaJuridicaBeans;
import ModelDao.IPessoaJuridicaDAO;
import Negocio.Exceptions.*;

import java.util.ArrayList;

public class PessoaJuridicaNegocio extends CadastroPessoaJuridicaBeans {
    
    private IPessoaJuridicaDAO DAO;
    private ArrayList<PessoaJuridicaBeans> ListPessoaJuridicaBeans;

    public PessoaJuridicaNegocio(IPessoaJuridicaDAO DAO){
        this.DAO = DAO;
        ListPessoaJuridicaBeans = DAO.buscar();
    }

    public void cadastrarPessoaJuridica(PessoaJuridicaBeans pessoaJuridica) throws ValidacaoException{
        //ListPessoaJuridicaBeans = DAO.buscar();
        for (PessoaJuridicaBeans listPessoaJuridicaBean : ListPessoaJuridicaBeans) {
            if (pessoaJuridica.getCnpj().equals(listPessoaJuridicaBean.getCnpj())){
                throw new PessoaDuplicadaException();
            }
        }
        if(!pessoaJuridica.getCnpj().matches("[0-9]{14}")){
            throw new CnpjInvalidoException();
        }
        if(!pessoaJuridica.getIe().matches("[0-9]{6,9}")){
            throw new IeInvalidoException();
        }
        if(!pessoaJuridica.getNome().matches("[a-zA-Z\\s]+")){
            throw new NomeInvalidoException();
        }
        DAO.cadastrar(pessoaJuridica);
    }

    public void editarPessoaJuridica(PessoaJuridicaBeans pessoaJuridica) throws ValidacaoException{
        //ListPessoaJuridicaBeans = DAO.buscar();
        for (PessoaJuridicaBeans listPessoaJuridicaBean : ListPessoaJuridicaBeans) {
            if (pessoaJuridica.getCnpj().equals(listPessoaJuridicaBean.getCnpj())){
                throw new PessoaDuplicadaException();
            }
        }
        if(!pessoaJuridica.getCnpj().matches("[0-9]{14}")){
            throw new CnpjInvalidoException();
        }
        if(!pessoaJuridica.getIe().matches("[0-9]{6,9}")){
            throw new IeInvalidoException();
        }
        if(!pessoaJuridica.getNome().matches("[a-zA-Z\\s]+")){
            throw new NomeInvalidoException();
        }
        DAO.editar(pessoaJuridica);
    }
}
