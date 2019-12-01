package Negocio;

import ModelBeans.CadastroEndereco;
import ModelBeans.EnderecoBeans;
import ModelDao.IEnderecoDAO;
import Negocio.Exceptions.*;

import java.util.ArrayList;

public class EnderecoNegocio extends CadastroEndereco {
    private String[] UF = {"PE","AL","PB","RN","CE","PI","MA","RN","SE","BA","TO","PA","AP","RR","AM","RO","AC","MT","GO","DF","MS","MG","ES","RJ","SP","PR","SC","RS"};
    private IEnderecoDAO DAO;

    public EnderecoNegocio(IEnderecoDAO DAO){
        this.DAO = DAO;
    }

    @Override
    public void cadastrarEndereco(EnderecoBeans endereco) throws ValidacaoException {
        boolean cadastro = false;
        for (String s : UF) {
            if (endereco.getUf().equals(s)) {
                cadastro = true;
                break;
            }
        }
        if(cadastro){
            if(!endereco.getCep().matches("[0-9]{8}")){
                throw new CepInvalidoException();
            }
            if(!endereco.getNumero().matches("[a-zA-Z0-9]+")){
                throw new NumeroInvalidoException();
            }
            if(!endereco.getCidade().matches("^([a-zA-Zà-üÀ-Ü0-9]|-|_|\\s)+$")){
                throw new CidadeInvalidoException();
            }
            if(!endereco.getBairro().matches("^([a-zA-Zà-üÀ-Ü0-9]|-|_|\\s)+$")){
                throw new BairroInvalidoException();
            }
            DAO.cadastrar(endereco);
        }else {
            throw new UFInvalidoException();
        }
    }

    @Override
    public void editarEndereco(EnderecoBeans endereco) throws ValidacaoException{
        boolean cadastro = false;
        for (String s : UF) {
            if (endereco.getUf().equals(s)) {
                cadastro = true;
                break;
            }
        }
        if(cadastro){
            if(!endereco.getCep().matches("[0-9]{8}")){
                throw new CepInvalidoException();
            }
           if(!endereco.getNumero().matches("[a-zA-Z0-9]+")){
              throw new NumeroInvalidoException();
            }
            if(!endereco.getCidade().matches("^([a-zA-Zà-üÀ-Ü0-9]|-|_|\\s)+$")){
                throw new CidadeInvalidoException();
            }
            if(!endereco.getBairro().matches("^([a-zA-Zà-üÀ-Ü0-9]|-|_|\\s)+$")){
                throw new BairroInvalidoException();
            }
            DAO.editar(endereco);
        }else {
            throw new UFInvalidoException();
        }
    }
}
