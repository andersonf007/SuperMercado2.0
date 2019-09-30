package ModelDao;
import ModelBeans.ProdutoBeans;

import java.util.ArrayList;

public class ProdutoDAO {
    private ArrayList<ProdutoBeans> Produtos = new ArrayList<ProdutoBeans>();

    /*ProdutoDAO() {
        Produtos = new ArrayList<ProdutoBeans>();
    }*/

    public void adicionarProduto(ProdutoBeans produto) {
        boolean existe = false;
        for(int j = 0;j <= Produtos.size();j++){
            if(Produtos.size() == 0){
               continue;
            }else if(Produtos.get(j).equals(produto)){
                existe = true;
            }
        }
        if(!existe){
            Produtos.add(produto);
            System.out.println("Produto adicionado com sucesso");
        }else {
            System.out.println("O produto não pode ser adicionado");
        }

    }
    public void excluirProduto(ProdutoBeans produto){
        boolean existe = false;
        for (int j = 0; j <= Produtos.size();j++){
            if(Produtos.get(j).equals(produto)){
                existe = true;
            }
        }
        if(existe){
            Produtos.remove(produto);
            System.out.println("Produto excluido com sucesso");
        }else{
            System.out.println("O produto não pode ser excluido");
        }
    }

    public ProdutoBeans procurarProdutoId(Double id) {
        for (int i = 0; i <= Produtos.size(); i++) {
            if (Produtos.get(i).getId() == id) {
                return Produtos.get(i);
            }
        }
        return null;
    }

    public ProdutoBeans procurarProdutoNome(String nome) {
        for (int i = 0; i <= Produtos.size(); i++) {
            if (Produtos.get(i).getNome().equals(nome)) {
                return Produtos.get(i);
            }
        }
        return null;
    }
}