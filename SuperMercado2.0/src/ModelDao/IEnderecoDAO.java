package ModelDao;

import ModelBeans.EnderecoBeans;

import java.util.ArrayList;

public interface IEnderecoDAO {
    
    public void cadastrar(EnderecoBeans object);

    public void editar(EnderecoBeans object);

    public ArrayList<EnderecoBeans> busca();

    public int ConfereQuantidadeRegistros();
}
