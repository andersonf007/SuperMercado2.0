package ModelDao;

import ModelBeans.ProdutosVendaBeans;

import java.util.ArrayList;

public interface IProdutosVendaDAO {
    public void cadastrar(ProdutosVendaBeans object);

    public ArrayList<ProdutosVendaBeans> buscar();
}
