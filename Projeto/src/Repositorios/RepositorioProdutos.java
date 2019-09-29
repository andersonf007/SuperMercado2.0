package Repositorios;
import ModelBeans.Produto;

import java.util.ArrayList;

public class RepositorioProdutos {
    private ArrayList<Produto> Produtos;

    RepositorioProdutos() {
        Produtos = new ArrayList<Produto>();
    }

    void adicionarProduto(Produto produto) {
        boolean existe = false;
        for(int j = 0;j <= Produtos.size();j++){
            if(Produtos.get(j).equals(produto)){
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
    void excluirProduto(Produto produto){
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

    Produto procurarProdutoId(Double id) {
        for (int i = 0; i <= Produtos.size(); i++) {
            if (Produtos.get(i).getId() == id) {
                return Produtos.get(i);
            }
        }
        return null;
    }

    Produto procurarProdutoNome(String nome) {
        for (int i = 0; i <= Produtos.size(); i++) {
            if (Produtos.get(i).getNome().equals(nome)) {
                return Produtos.get(i);
            }
        }
        return null;
    }
}
