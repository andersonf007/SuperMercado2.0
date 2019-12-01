package ModelDao;
import ModelBeans.PessoaFisicaBeans;
import Negocio.Exceptions.ValidacaoException;

import java.util.ArrayList;

public interface IPessoaFisicaDAO {
    public void cadastrar(PessoaFisicaBeans object);

    public void editar(PessoaFisicaBeans object);

    public ArrayList<PessoaFisicaBeans> buscarTodosOsRegistros();

    public PessoaFisicaBeans buscarRegistroPorId(String cpf);

    public int confereQuantidadeDeRegistros();
}
