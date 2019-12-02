package ModelDao;

import ModelBeans.ProdutoBeans;

import java.util.ArrayList;

public interface IProdutoDAO {
    public void cadastrar(ProdutoBeans object);

    public void editar(ProdutoBeans object);

    public ArrayList<ProdutoBeans> busca();

    public int confereQuantidadeDeProdutosRegistrados();

    public void alterarEstoque(ProdutoBeans object);
}
