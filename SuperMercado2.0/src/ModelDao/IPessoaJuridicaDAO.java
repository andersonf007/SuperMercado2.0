package ModelDao;

import ModelBeans.PessoaJuridicaBeans;

import java.util.ArrayList;

public interface IPessoaJuridicaDAO {
    public void cadastrar(PessoaJuridicaBeans object);

    public void editar(PessoaJuridicaBeans object);

    public ArrayList<PessoaJuridicaBeans> buscar();

    public int ConfereQuantidadeDeRegistros();
}
