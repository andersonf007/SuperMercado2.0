package ModelDao;

import ModelBeans.ProdutoBeans;

import java.util.ArrayList;

public interface IProduto {
    public void cadastrar(ProdutoBeans object);

    public void editar(ProdutoBeans object);

    public ArrayList<ProdutoBeans> busca();

    public int confereQuantidadeDeProdutosRegistrados();

    public boolean validarDuplicidade(ProdutoBeans object);

    public void alterarEstoque(ProdutoBeans object);
}
